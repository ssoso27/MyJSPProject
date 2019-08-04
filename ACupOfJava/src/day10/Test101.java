package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test101 {
    static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    static String user = "HR";
    static String pw = "hr";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection(url, user, pw);
        Statement stmt = conn.createStatement();

        String gul = "helloworld?";

        String sql = "INSERT INTO bangmyung_t VALUES ( seq_bangmyung.NEXTVAL, '" + gul + "', SYSDATE )";
        stmt.executeUpdate(sql);

        stmt.close();
        conn.close();
    }
}
