package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Table -> Class
class StudentVO {
    // field -> property
    private String stId = null;
    private String name = null;
    private String addr = null;

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return this.stId + "\t" + this.name + "\t" + this.addr;
    }
}

public class Test100 {
    static String url = "jdbc:mysql://127.0.0.1:3306/study?serverTimezone=UTC";
    static String user = "root";
    static String pw = "root1234";

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, pw);
        Statement stmt = conn.createStatement();

        String sql = "SELECT stId, name, addr from studentt";
        ResultSet rs = stmt.executeQuery(sql);

        // 데이터 단순 쌓기 -> ArrayList 가 빠르다!
        List<StudentVO> rl = new ArrayList<StudentVO>();
        while ( rs.next() ) {
            StudentVO vo = new StudentVO();

            vo.setStId( rs.getString("stId") );
            vo.setName( rs.getString("name") );
            vo.setAddr( rs.getString("addr") );

            rl.add(vo);
        }
        rs.close();

        stmt.close();
        conn.close();

        for ( StudentVO vo : rl ) {
            System.out.println(vo.toString());
        }
    }
}
