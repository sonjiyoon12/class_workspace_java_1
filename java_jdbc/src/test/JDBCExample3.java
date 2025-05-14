package test;

import java.sql.*;

public class JDBCExample3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("MySQL 연결 성공");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from employees where gender = 'F'");

            while(rs.next()){
                int emp_no = rs.getInt("emp_no");
                String birth_date = rs.getString("birth_date");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String gender = rs.getString("gender");
                System.out.print("emp_no : " + emp_no + "\t");
                System.out.print("birth_date : " + birth_date + "\t");
                System.out.print("first_name : " + first_name + "\t");
                System.out.print("last_name : " + last_name + "\t");
                System.out.print("gender : " + gender + "\n");

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                rs.close();
                stmt.close();
                conn.close();
            }catch (SQLException e){
                System.out.println("자원 해제 중 오류 발생 : " + e.getMessage());
            }
        }
    }
}
