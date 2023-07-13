package kr.re.kitri.springpost.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //getter setter tosting 만들어줌
@AllArgsConstructor //constructor 만들어줌
public class ErrorResponse {
    String errorMessage;
    String errorCode;
}
