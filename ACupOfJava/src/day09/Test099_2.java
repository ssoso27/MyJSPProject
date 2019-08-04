package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Test099_2 {
    static String url = "jdbc:mysql://127.0.0.1:3306/study?serverTimezone=UTC";
    static String user = "root";
    static String pw = "root1234";

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, pw);
        Statement stmt = conn.createStatement();

        String sql = "SELECT stId, name, addr from studentt";
        ResultSet rs = stmt.executeQuery(sql);

        while ( rs.next() ) {
            String stId = rs.getString("stId");
            String name = rs.getString("name");
            String addr = rs.getString("addr");
            System.out.println(stId + "\t" + name + "\t" + addr);
        }
        rs.close();

        stmt.close();
        conn.close();
    }
}
