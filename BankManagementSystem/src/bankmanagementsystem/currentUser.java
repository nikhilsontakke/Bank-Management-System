/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;
import java.sql.*;

/**
 *
 * @author nikhil
 */
public class currentUser {
    private
            String name;
            String dateOfBirth;
            String ifscCode;
            String accountNumber;
            String aadharNumber;
            String gender;
            String address;
            String mobileNumber;
            String panNumber;
            String username;
            String password;
           
    public currentUser(String username1){
        try{
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","bmsmanager","bmspassword")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from userdetails where username = '"+username1+"';");
                rs.next();
                name = rs.getString("name");
                dateOfBirth = rs.getString("dob");
                ifscCode = rs.getString("ifsc");
                accountNumber = rs.getString("accno");
                aadharNumber = rs.getString("addno");
                gender = rs.getString("gen");
                address = rs.getString("address");
                mobileNumber = rs.getString("mono");
                panNumber = rs.getString("panno");
                username = rs.getString("username");
                password = rs.getString("password");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
    
    public String getName(){
        return name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getIfscCode(){
        return ifscCode;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAadharNumber(){
        return accountNumber;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getPanNumber(){
        return panNumber;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    
}
