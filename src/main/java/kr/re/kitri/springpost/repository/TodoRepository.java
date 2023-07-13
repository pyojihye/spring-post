package kr.re.kitri.springpost.repository;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
//public class TodoRepository {
//
//    public List<Todo> selectAllTodos(){
//        List<Todo> todos = new ArrayList<>();
//        todos.add(new Todo(1,"강의듣기",true));
//        todos.add(new Todo(2,"운동하기",false));
//        todos.add(new Todo(3,"집가기",false));
//        return todos;
//    }
//
//    public Todo selectTodos(int id){
//        return new Todo(id,"밥먹기",false);
//    }
//
//    public Todo insertTodos(){
//        return new Todo(5,"잠자기",false);
//    }
//
//    public String doneTodos(int id){
//        return id+"가 완료되었습니다";
//    }
//
//    public String deleteTodos(int id){
//        return id+"가 삭제 되었습니다";
//    }
//
//    public String searchTodoList(){
//        return "값을 검색 중입니다..";
//    }
//
//}
@Mapper
public interface TodoRepository {
    List<Todo> selectAllTodos();

    Todo selectTodos(int id);

    void insertTodos(Todo todo);
}