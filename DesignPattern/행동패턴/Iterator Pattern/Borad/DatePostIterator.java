import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DatePostIterator implements Iterator<Post> {
    private Iterator<Post> itr;

    public DatePostIterator(List<Post> posts){
        Collections.sort(posts,(p1,p2)->p1.date.compareTo(p2.date));
        this.itr=posts.iterator();
    }
    @Override
    public boolean hasNext() {
        return this.itr.hasNext();
    }

    @Override
    public Post next() {
        return this.itr.next();
    }
}
