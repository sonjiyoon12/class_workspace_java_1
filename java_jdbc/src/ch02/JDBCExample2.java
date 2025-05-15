package ch02;

import java.sql.*;

public class JDBCExample2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("MySQL 데이터베이스에 연결되었습니다.");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from tb_grade");

            while (rs.next()) {
                String grade = rs.getNString("grade");
                int score = rs.getInt("score");
                System.out.print("grade : " + grade + "\t");
                System.out.print("score : " + score + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("자원 해제 중 오류 발생 : " + e.getMessage());
            }
        }
    }
}
