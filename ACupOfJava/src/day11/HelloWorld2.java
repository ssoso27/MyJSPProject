package day11;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloWorld2 extends HttpServlet {
    static String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    static String user = "HR";
    static String pw = "hr";

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String theTime = "";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(url, user, pw);
            Statement stmt = conn.createStatement();

            String sql = "SELECT SYSDATE FROM DUAL";

            ResultSet rs = stmt.executeQuery(sql);
            if ( rs.next() ) {
                theTime = rs.getString(1);
            }
            rs.close();

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("   <body>");
        out.println("HElloWorld time : " + theTime);
        out.println("   </body>");
        out.println("</html>");
        out.close();
    }
}

// javac -d C:\StudyHome\WEB-INF\classes -classpath ./../libs/servlet-api.jar day11/HelloWorld2.java
