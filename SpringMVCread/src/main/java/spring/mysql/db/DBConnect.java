package spring.mysql.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//mysql
public class DBConnect {
   
   static final String MYSQL_URL="jdbc:mysql://@localhost:3306/world";
   String driver = "com.mysql.cj.jdbc.Driver";
   
    public DBConnect() {
        try {
            Class.forName(driver);
            System.out.println("mysql ����̹� ����"); //������ ������ �޼���
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("mysql ����̹� ����"); //���н� ������ �޼���
        }
    }
   
   
   //Connection
    public Connection getConnection() {
        Connection conn=null;

        try {
            conn=DriverManager.getConnection(MYSQL_URL, "root", "1234");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("mysql ���� ���� : url,����,��й�ȣ Ȯ��!"+e.getMessage());
        }

        return conn;
    }

   
    //close �޼���..�� 4��
    public void dbClose(ResultSet rs,Statement stmt,Connection conn)
    {
        try {
            if(rs!=null)rs.close();
            if(stmt!=null)stmt.close();
            if(conn!=null)conn.close();
        }   catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void dbClose(Statement stmt,Connection conn)
    {
        try {
            if(stmt!=null)stmt.close();
            if(conn!=null)conn.close();
        }   catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void dbClose(ResultSet rs,PreparedStatement pstmt,Connection conn) {
       
        try {
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
        }   catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void dbClose(PreparedStatement pstmt,Connection conn)
    {
        try {
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();

        }   catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}