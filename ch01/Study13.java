// package ch01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
class Post {
    private Integer idx;
    private String title;
    private String content;
    private Integer userIdx;


}


public class Study13 {
    public static void main(String[] args) {
        new Post(1, "제목", "내용", 1);

        Post post = new Post();
        post.setIdx(1);
        post.setTitle("제목");
        post.setContent("내용");
        post.setUserIdx(1);

        // ---------------위와 아랫 내용 같음.------------------------------
        new Post(post.getIdx(), post.getContent(), post.getTitle(), post.getUserIdx());

        // 클래스 내부에 Builder 클래스를 만들고
        // 클래스의 필드명과 같은 set함수를 만들어 둔다.
        // 각각 set함수는 Builder를 리턴한다.
        // build 함수를 사용하면 객체가 생성된다.
        Post post2 = Post.builder()
        // 순서가 달라져도 상관없고, .~에 맞는 값을 넣어주기만 하면 된다.
            .idx(1)
            .title("제목")
            .content("내용")
            .userIdx(1)
            .build();


    }
}
