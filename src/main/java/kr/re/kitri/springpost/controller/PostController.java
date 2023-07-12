package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {   //HTTP 처리를 해야 함. Presentation layer

    @Autowired
    private PostService service;

//    @GetMapping("/posts")
//    public String viewAllPosts() {
//        return service.getAllPosts();
//    }

    @GetMapping("posts")    // R&R 레파지토리에 있는 칼럼에 데이터를 넣을때 기준? 이라고 하는것 같았음. 자기 롤이 있는거 roll & resposibility, CSR(Controller, Service, Repository)
    public List<Post> viewAllPosts(){   // restAPI에서 json type으로 뿌려줘야 함. java object는 json과 구조가 동일(=패러다임이 동일). ∴ 자동으로 바꾸어줌(spring mvc에 내장되어 있음), Jackson 라이브러리, Json parser
        return service.getAllPosts();   //chrome Json Viewer 설치하면 더 보기 좋게 바꿔줌~ PostMan을 통해 api test client 사용 가능
    }

    @GetMapping("/posts/{postId}")  //url의 경로를 변수로 쓰겠다
    public Post viewPostById(@PathVariable int postId) {
        return service.getPostById(postId);
    }

//    @PostMapping("/posts")  //post 방식은 get 방식과 다르게 body를 쓸 수 있다. << param으로 등록
//    public Post registPost(Post post) {
//        return service.setPost(post);
//    }

    @PostMapping("/posts")
    public Post registPost(@RequestBody Post post){
        System.out.println(post);   //차후 logging으로 변경 필요
        return service.setPost(post);
    }

    @DeleteMapping("/posts/{postId}")
    public void removePost(@PathVariable int postId){
        service.removePost(postId);
    }

    /*@PutMapping("/posts")
    public String modifyPost(){
        return service.modifyPost();
    }*/

}
