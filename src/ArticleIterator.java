import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArticleIterator implements Iterator<Article> {

    private List<Article> iterator;
    private int idx;

    public ArticleIterator(Article... args) {
        this.iterator = new ArrayList<Article>(Arrays.asList(args));
        this.idx = 0;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return this.idx < this.iterator.size() - 1;
    }

    @Override
    public Article next() {
        // TODO Auto-generated method stub
        if (this.hasNext()) {
            idx++;
        }
        return this.iterator.get(idx);
    }
    
}
