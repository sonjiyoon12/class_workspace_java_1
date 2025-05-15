package ch03;

import java.sql.*;

public class JDBCExample4 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pwd = "asd1234";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // try {} catch() {}
        // try() {} catch() {};
        // open JDK
        try (
                Connection conn = DriverManager.getConnection(url, user, pwd);
                PreparedStatement pstmt2 = conn.prepareStatement("select * from tb_student ");
                ResultSet rs2 = pstmt2.executeQuery()
        ) {
            System.out.println("데이터베이스 연결 성공");
            while (rs2.next()) {
                String name = rs2.getString("name");
                int age = rs2.getInt("age");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
