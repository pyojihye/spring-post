package kr.re.kitri.springpost.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.postgresql.util.PSQLException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
    @ExceptionHandler(value= TooManyResultsException.class)
    public ErrorResponse tooManyResultsException(TooManyResultsException e){
        log.error("TooManyResultsException 발생.."+e.getMessage());
        return new ErrorResponse("조회 결과가 너무 많습니다.","400");
//        return "TooManyResultsException";
    }

    @ExceptionHandler(value= PSQLException.class)
    public ErrorResponse pSQLException(PSQLException e){
        log.error("PSQLException 발생"+e.getMessage());
        return new ErrorResponse("데이터베이스 오류가 발생했습니다.","500");
    }

    @ExceptionHandler(value= BadSqlGrammarException.class)
    public ErrorResponse badSqlGrammarException(BadSqlGrammarException e){
        log.error("BadSqlGrammarException 발생"+e.getMessage());
        return new ErrorResponse("알 수 없는 오류가 발생했습니다.","500");
    }

}
