/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingrailwaylastest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author hashi
 */
public class Database {

    private static final String username = "root";
    private static final String pass = "12345";
    public static String name ;
    public static int id ;
    public static int balance ;

    public static String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setName(String name) {
        Database.name = name;
    }

    public static void setId(int id) {
        Database.id = id;
    }

    public static void setBalance(int balance) {
        Database.balance = balance;
    }
    
    
     public static void connectDatabase(String selectId) throws SQLException{
         
           try {
          String url = "jdbc:mysql://localhost:3306/?user=root&password=12345";    
        Connection connection;
       connection = DriverManager.getConnection(url);
        String sql =("select * from adydbase.adydb where id = " + selectId);
       PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();        
        while(resultSet.next()){
      setName(resultSet.getString("name"));
      setBalance(resultSet.getInt("balance"));
      setId(resultSet.getInt("id"));
        }   
        } catch (SQLException ex) {
            System.out.println(false);
        }
     }}
        



        
   
        
        



