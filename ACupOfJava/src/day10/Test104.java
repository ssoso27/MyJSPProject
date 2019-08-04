package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test104 {
    static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    static String user = "HR";
    static String pw = "hr";

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
            if (stmt != null) { stmt.close();   }
            if (conn != null) { conn.close();   }
        }

        return ls;
    }

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        List<BangMyungVO> ls = findAll();
        for(BangMyungVO vo : ls) System.out.println( vo.toString() );
    }
}
