package kr.re.kitri.springpost.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    public String selectAllPosts(){
        return "전체 글 목록입니다.";
    }

}
