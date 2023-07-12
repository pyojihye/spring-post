package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.model.Todo;
import kr.re.kitri.springpost.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> getAllTodos(){
        return repository.selectAllTodos();
    }

    public Todo getTodos(int id){
        return repository.selectTodos(id);
    }

    public Todo InsertTodos(){
        return repository.insertTodos();
    }

    public String completeTodos(int id){
        return repository.doneTodos(id);
    }

    public String removeTodos(int id){
        return repository.deleteTodos(id);
    }

    public String findTodos(){
        return repository.searchTodoList();
    }
}
