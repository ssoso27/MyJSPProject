package day10;

import java.util.List;

public class Test105 {
    public static void main(String[] args) throws Exception {
        BangMyungDAO.addGul("끝이 보이니?23");
        List<BangMyungVO> ls = BangMyungDAO.findAll();

        for(BangMyungVO vo: ls) {
            System.out.println(vo);
        }
    }
}
