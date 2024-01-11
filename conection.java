package Bank;

import java.sql.*;


public class conection {
    Connection connection;
    Statement statement;
    public conection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem" , "root" , "W@2915djkq#");
            statement = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}