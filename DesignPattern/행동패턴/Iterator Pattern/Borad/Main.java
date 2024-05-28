import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.게시판 생성
        Board board=new Board();

        //2. 게시판에 게시글 포스팅
        board.addPost("디자인 패턴 강의 리뷰", LocalDate.of(2024,5,10));
        board.addPost("게임 하실 분",LocalDate.of(2024,5,2));
        board.addPost("질문 있습니다",LocalDate.of(2024,6,5));

        //게시글 발행 순서대로 조회
        print(board.getListPostIterator());
        print(board.getDatePostIterator());

        //게시글 날짜별로 조회
    }
    public static void print(Iterator<Post> iterator){
       Iterator<Post> itr= iterator;
       while(itr.hasNext()){
           Post post=itr.next();
           System.out.println(post.title+" / ["+post.date+"]");
       }
    }
}
