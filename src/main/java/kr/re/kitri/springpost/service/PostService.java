package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService { //서비스는 반드시 트랜잭션으로 처리되어야 함. 적당한 레파지토리의 함수를 호출해주는 역할을 함

    @Autowired
    private PostRepository repository;

//    public String getAllPosts(){
//        return repository.selectAllPosts();
//    }

    public List<Post> getAllPosts(){
        return repository.selectAllPosts();
    }

    public Post getPostById(int postId){
        return repository.selectPostById(postId);
    }

//    public Post setPost(Post post){
//        return repository.insertPost(post);
//    }

    @Transactional  //트랜잭션 처리를 위한 어노테이션
    public Post setPost(Post post){
        repository.insertPost(post);
        return post;
    }

    public void removePost(int postId){
        repository.deletePost(postId);
    }

    public void modifyPost(Post post){
        repository.updatePost(post);
    }

}
