package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test103 {
    static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    static String user = "HR";
    static String pw = "hr";

    public static void addGul(String gul) throws Exception {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(url, user, pw);
            stmt = conn.createStatement();

            String sql = "INSERT INTO bangmyung_t VALUES ( seq_bangmyung.NEXTVAL, '" + gul + "', SYSDATE )";
            stmt.executeUpdate(sql); // 예외 발생 가능성
        } catch (SQLException e) {
            // 잡은 Exception 을 던짐
            /// 던지는 건, finally (뒷처리) 이후.
            throw e;

        } finally {
            // try 문 이후에 발생
            if (stmt != null) { stmt.close(); }
            if (conn != null) { conn.close(); }
            System.out.println("All closed.");
        }

    }

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        addGul("YAP!!!!!!");
    }
}
