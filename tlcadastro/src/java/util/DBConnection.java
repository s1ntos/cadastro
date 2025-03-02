package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/nome-bancodedados"; //coloque o nome do seu banco de dados
    private static final String USER = "root";
    private static final String PASSWORD = "senha"; //digite a senha do seu banco de dados

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
