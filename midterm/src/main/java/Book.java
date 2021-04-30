import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
    private int bookid;
    private String title;
    private String description;

    public Book(){}

    public Book(int bookid, String title, String description) {
        this.bookid = bookid;
        this.title = title;
        this.description = description;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
