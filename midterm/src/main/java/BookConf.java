import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookConf {
    private Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/book", "postgres", "alibi");
        return connect;
    }

    public List<Book> getPosts() throws SQLException, ClassNotFoundException {
        List<Book> books = new ArrayList<>();

        Connection con = getConnection();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM book");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int bookid = rs.getInt("bookid");
            String title = rs.getString("title");
            String description = rs.getString("description");

            Book blog = new Book(bookid, title, description);
            books.add(blog);
        }

        rs.close();
        ps.close();
        con.close();

        return books;
    }

    public boolean CreateBook(Book book) {
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO blog (title, description) " +
                    "VALUES (?, ?, ?, ?)");

            ps.setString(1, book.getTitle());
            ps.setString(3, book.getDescription());

            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return false;
    }


}
