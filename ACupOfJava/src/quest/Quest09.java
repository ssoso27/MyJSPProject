package quest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Quest09 extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String time = "";
        PrintWriter out = null;

        try {
            time = getSYSDATE();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            out = response.getWriter();

            String html = "<html>" +
                    "<body>" +
                    "<h1 style=\"color:red\"> MY CAT IS SUPER CAT!!!!!!! </h1>" +
                    "<span bgColor=\"#0d0d0d\"> " + time + " </span>"+
                    "</body>" +
                    "</html>";
            out.println(html);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }

    }

    private String getSYSDATE() throws SQLException {
        String url = "jdbc:oracle:thin:@127.0.0.1/XE";
        String user = "HR";
        String pw = "hr";

        String sql = "SELECT SYSDATE FROM DUAL";
        String time = "";

        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, pw);
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);
            if (rs.next()) time = rs.getString(1);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }

        return time;
    }
}
