/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;

/**
 *
 * @author Avinash
 */
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
                
                
        
            
            
        }catch(Exception e){
        e.printStackTrace(); // Kya errors hain ye pata chalega
        
        }
        
    }
            
            
}
