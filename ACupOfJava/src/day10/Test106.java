package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test106 {
    static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    static String user = "HR";
    static String pw = "hr";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, pw);
            // JDBC의 AutoCommit 기능을 해제함. ( default : true )
            conn.setAutoCommit(false);
            stmt = conn.createStatement();

            String[] sqls = new String[4];
            sqls[0] = "INSERT INTO test_tx VALUES ( 55 )";
            sqls[1] = "INSERT INTO test_tx VALUES ( 66 )";
            sqls[2] = "INSERT INTO test_tx VALUES ( 77 )";
            sqls[3] = "INSERT INTO test_tx VALUES ( 88 )";

            for(String sql : sqls) {
                stmt.executeUpdate(sql);
            }

            // commit
            conn.commit();

        } catch (Exception e) {
            // LOG 를 비운다. (테이블에 반영 X)
            if ( conn != null ) conn.rollback();
            throw e;

        } finally {
            if( stmt != null ) stmt.close();
            if( conn != null ) conn.close();
        }

    }
}

