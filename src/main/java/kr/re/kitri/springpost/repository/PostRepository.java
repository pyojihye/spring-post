package kr.re.kitri.springpost.repository;

import kr.re.kitri.springpost.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Mapper
public interface PostRepository {   //반드시 DB를 바라보아야 함.

//    public String selectAllPosts(){
//        return "전체 글 목록입니다.";   //실제론 디비의 값을 가져옴
//    }

   /* public List<Post> selectAllPosts(){

        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1,"첫글","올립니다",2));
        posts.add(new Post(2,"두번째 글","강의를 듣고 있습니다",15));
        posts.add(new Post(3,"세번째 글","저만 추운가요?",23));

        return posts;
    }

    public Post selectPostById(int postId){

        return new Post(postId, "테스트","테스트합니다~",0);
    }

//    public Post insertPost(Post post){
//        return post;
//    }

    public Post insertPost(Post post){
        //DB에서 insert 수행
        return post;
    }

    public String deletePost(int postId){
        return "삭제 되었습니다";
    }*/

    List<Post> selectAllPosts();

    Post selectPostById(int postId);

    void insertPost(Post post);

    void deletePost(int postId);


}
