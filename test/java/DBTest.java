import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DBTest {
    DB db = new DB();

    @Test
    void insert() throws SQLException, ClassNotFoundException {
        assertEquals(db.insert(), 2);
    }

    @Test
    void join() throws SQLException, ClassNotFoundException {
        assertTrue(db.printRoomType());
    }
}

