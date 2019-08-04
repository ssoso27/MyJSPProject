package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test099 {
    static String url = "jdbc:mysql://127.0.0.1:3306/study?serverTimezone=UTC";
    static String user = "root";
    static String pw = "root1234";

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, pw);
        Statement stmt = conn.createStatement();

        String sql;
        sql = "INSERT INTO studentt VALUES ('10107', '또오치', '쌍문동')";
        sql = "DELETE FROM studentt WHERE stId='10107'";
        sql = "UPDATE studentt SET addr='이도동' WHERE stId='10101'";

        int result = stmt.executeUpdate(sql);
        System.out.println("rows : " + result);

        stmt.close();
        conn.close();
    }
}
