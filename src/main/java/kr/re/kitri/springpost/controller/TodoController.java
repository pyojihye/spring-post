package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.model.Todo;
import kr.re.kitri.springpost.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j  //lombok의 log를 사용하기 위한 annotation
@RestController
public class TodoController {

    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoService service;

    @GetMapping("/todos")
    public List<Todo> viewAllTodos(){
        logger.trace("{test} trace");
        logger.debug("{test} debug");
        logger.info("{test} info");
        logger.warn("{test} warn ");
        logger.error("{test} error");
        log.debug("전체보기 요청 시작..");
        return service.getAllTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo viewTodos(@PathVariable int id){
        return service.getTodos(id);
    }

    @PostMapping("/todos")
    public Todo registerTodos(@RequestBody Todo todo){
        service.insertTodos(todo);
        return todo;
    }

//    @PutMapping("/todos/{id}")
//    public String doneTodos(@PathVariable int id){
//        return service.completeTodos(id);
//    }
//
//    @DeleteMapping("/todos/{id}")
//    public String removeTodos(@PathVariable int id){
//        return service.removeTodos(id);
//    }
//
//    @GetMapping("/todos/search/{id}")
//    public String searchTodos(@PathVariable String title, Boolean completed){
//        return service.findTodos();
//    }
}
