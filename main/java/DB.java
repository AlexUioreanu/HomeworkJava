import java.sql.*;

class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DB db = new DB();
//        db.executeCommand("DROP TABLE accomodation_fair_relation;");
//        db.executeCommand("DROP TABLE accomodation;");
//        db.executeCommand("DROP TABLE room_fair;");
//        db.executeCommand("CREATE DATABASE bookingApp");
//        db.executeCommand("CREATE SEQUENCE id_room_fair");
//        db.executeCommand("""
//                CREATE TABLE accomodation(
//                id int PRIMARY KEY NOT NULL DEFAULT nextval('id_accomodation'),
//                type VARCHAR(32),
//                bed_type VARCHAR(32),
//                guests int,
//                description VARCHAR(512)
//                );
//                """);
//        db.executeCommand("""
//                CREATE TABLE room_fair(
//                id int PRIMARY KEY NOT NULL DEFAULT nextval('id_room_fair'),
//                value DOUBLE PRECISION,
//                season VARCHAR(32)
//                );
//                """);
//        db.executeCommand("""
//                CREATE TABLE accomodation_fair_relation(
//                id int PRIMARY KEY NOT NULL DEFAULT nextval('id_accomodation_fair_relation'),
//                id_accomodation int,
//                id_room_fair int,
//                CONSTRAINT id_accomodation_constraint FOREIGN KEY(id_accomodation) REFERENCES accomodation(id),
//                CONSTRAINT id_room_fair_constraint FOREIGN KEY(id_room_fair) REFERENCES room_fair(id)
//                );
//                """);
//        db.insert();
    }
}

public class DB {

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        DriverManager.setLoginTimeout(60);

        String url = "jdbc:postgresql://localhost:5432/bookingapp";
        String user = "postgres";
        String pass = "1234";

        return DriverManager.getConnection(url, user, pass);
    }

    public int insert() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accomodation(type, bed_type, guests, description) VALUES ( ?, ?, ?, ?)");
        preparedStatement.setString(1, "Sample Room");
        preparedStatement.setString(2, "Sample Bed");
        preparedStatement.setInt(3, 2);
        preparedStatement.setString(4, "Sample Quality");
        preparedStatement.executeUpdate();

        PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO room_fair(value,season) VALUES (?, ?)");
        preparedStatement1.setDouble(1, 99.99);
        preparedStatement1.setString(2, "Sample Season");
        preparedStatement1.executeUpdate();

        return preparedStatement.executeUpdate() + preparedStatement1.executeUpdate();
    }

    public boolean printRoomType() throws ClassNotFoundException, SQLException {
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        connection = getConnection();
        preparedStatement = connection.prepareStatement("""
                SELECT accomodation.type, room_fair.value FROM accomodation_fair_relation
                                            INNER JOIN accomodation ON id_accomodation= accomodation.id
                                            INNER JOIN room_fair ON id_room_fair=room_fair.id GROUP BY accomodation.type, room_fair.value;     
                """.indent(1));
        resultSet = preparedStatement.executeQuery();
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columns = rsmd.getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i <= columns; i++) {
                String columnValue = resultSet.getString(i);
                System.out.println(rsmd.getColumnName(i) + " " + columnValue);
            }
        }

        boolean resultSetContainsData = false;
        if (resultSet.getMetaData() != null) {
            resultSetContainsData = true;
            preparedStatement.close();
        }
        preparedStatement.close();
        connection.close();

        return resultSetContainsData;
    }

    public void executeCommand(String sqlCommand) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlCommand);
        statement.close();
        connection.close();
    }
}

