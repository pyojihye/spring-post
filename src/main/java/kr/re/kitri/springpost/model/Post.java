package kr.re.kitri.springpost.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //getter setter tosting 만들어줌
@AllArgsConstructor //constructor 만들어줌
public class Post {
    private long postId;
    private String title;
    private String body;
    private int likes;
}
