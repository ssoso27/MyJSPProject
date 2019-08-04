package day10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BangMyungDAO {
    static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    static String user = "HR";
    static String pw = "hr";

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }

    public static void addGul(String gul) throws Exception {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(url, user, pw);
            stmt = conn.createStatement();

            String sql = "INSERT INTO bangmyung_t VALUES ( seq_bangmyung.NEXTVAL, '" + gul + "', SYSDATE )";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            throw e;

        } finally {
            if (stmt != null) { stmt.close(); }
            if (conn != null) { conn.close(); }
            System.out.println("All closed.");
        }

    }

    public static List<BangMyungVO> findAll() throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<BangMyungVO> ls;
        try {
            conn = DriverManager.getConnection(url, user, pw);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM bangmyung_t";
            rs = stmt.executeQuery(sql);

            ls = new ArrayList<BangMyungVO>();
            while ( rs.next() ) {
                BangMyungVO vo = new BangMyungVO();

                vo.setNo( rs.getInt("no") );
                vo.setGul( rs.getString("gul") );
                vo.setTheTime( rs.getString("the_time") );

                ls.add( vo );
            }
        } finally {
            if (rs != null) { rs.close(); }
            if (stmt != null) { stmt.close(); }
            if (conn != null) { conn.close(); }
            System.out.println("All closed.");
        }

        return ls;
    }
}
