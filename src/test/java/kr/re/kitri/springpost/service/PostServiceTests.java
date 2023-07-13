package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostServiceTests {

    @Autowired
    private PostService service;

    //Service안에 있는 함수 각각 하나씩 다 있어야 함
    //스프링에서 빌드(소스 코드 변경시) 할때 Maven이 Test 안에 있는 모든 얘들 단위테스트 수행
    @Test
    public void testGetAllPosts(){
        List<Post> posts =  service.getAllPosts();

//      posts가 null이 아니면 성공
//        if(posts != null){

        /*posts.size가 0보다 크면 성공
        if(posts.size() > 0){
            //success
        }else{
            //fail
        }*/

        //결과가 null이 아니면 성공
        //Assertions.assertNotNull(posts);

        //결과가 True면 성공
        Assertions.assertTrue(posts.size()>0);
    }

    @Test
    public void testGetPostById(){
        Post posts =  service.getPostById(789);
        Assertions.assertNotNull(posts);
    }
}
