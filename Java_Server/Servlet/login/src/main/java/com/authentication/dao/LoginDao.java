package com.authentication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/testdb";
    String username="root";
    String password="Sujal@64";
    public LoginDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public boolean checkCredentials(String uname,String pswd){
        String sql="select * from login where username=? and password=?";
        try {
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1, uname);
            st.setString(2, pswd);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
}
