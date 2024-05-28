import java.util.Iterator;
import java.util.List;

public class ListPostIterator implements Iterator<Post> {
    private Iterator<Post> itr;

    public ListPostIterator(List<Post> posts){
        this.itr=posts.iterator();
    }
    @Override
    public boolean hasNext() {
        return this.itr.hasNext(); //자바 내부 이터레이터에 위임
    }

    @Override
    public Post next() {
        return this.itr.next(); //자바 내부 이터레이터에 위임
    }
}
