package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping("/posts")
    public String viewAllPosts() {
        return service.getAllPosts();
    }

    /*@GetMapping("/posts/{id}")
    public String viewPostById() {
        return service.getPostById();
    }

    @PostMapping("/posts")
    public String registPost(String post) {
        return service.setPost(post);
    }

    @DeleteMapping("/posts/{id}")
    public void removePost(){
        return service.removePost();
    }

    @PutMapping("/posts")
    public String modifyPost(){
        return service.modifyPost();
    }*/

}
