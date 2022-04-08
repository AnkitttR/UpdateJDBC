/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;

import java.sql.*;
import java.io.*;

public class UpdateJDBC {
    public static void main(String[] args) {
        try{
        
        Connection con=ConnectionProvider.getConnection();
        
        String q ="update table1 set tName=? , tCity=? where tId=?";
        
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        
            System.out.println("Enter new name: ");
            String name=br.readLine(); // Put name at ? in line 17
            
            System.out.println("Enter new city name: ");
            String city=br.readLine(); // Put city at ? in line 17
            
            System.out.println("Enter the student id : ");
            int id=Integer.parseInt(br.readLine()); // Converting string from bufferedReader to integer
                
            PreparedStatement pstmt=con.prepareStatement(q);  // Passing the query
            
            pstmt.setString(1,name); //Setting the value in line 17
            pstmt.setString(2,city);
            pstmt.setInt(3,id);
            
            pstmt.executeUpdate(); //Firing the query
            
            System.out.println("done...........");
            
            con.close();
            
                
        }catch(Exception e){
        e.printStackTrace(); // Kya errors hain ye pata chalega
        
        }
        
    }
            
            
}
