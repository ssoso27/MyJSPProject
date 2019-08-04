package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Test102 {
    static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    static String user = "HR";
    static String pw = "hr";

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection(url, user, pw);
        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM bangmyung_t";
        ResultSet rs = stmt.executeQuery(sql);

        ArrayList<BangMyungVO> ls = new ArrayList<BangMyungVO>();
        while ( rs.next() ) {
            BangMyungVO vo = new BangMyungVO();

            vo.setNo( rs.getInt("no") );
            vo.setGul( rs.getString("gul") );
            vo.setTheTime( rs.getString("the_time") );

            System.out.println(vo.toString());
            ls.add( vo );
        }
        rs.close();

        stmt.close();
        conn.close();

        for( BangMyungVO vo : ls ) {
            System.out.println(vo.toString());
        }
    }
}
