package day09;

import java.sql.*;

public class Test101 {
    static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    static String user = "HR";
    static String pw = "hr";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection(url, user, pw);
        Statement stmt = conn.createStatement();

        String sql;
        sql = "SELECT SYSDATE FROM DUAL";

        ResultSet rs = stmt.executeQuery(sql);
        // 결과 레코드가 1개 뿐이므로, if로 판별
        if ( rs.next() ) {
            // rs.getString(필드명) 혹은 rs.getString(index)
            String l = rs.getString(1); // index : 1부터 시작
            System.out.println(l);
        }
        rs.close();

        stmt.close();
        conn.close();
    }
}
