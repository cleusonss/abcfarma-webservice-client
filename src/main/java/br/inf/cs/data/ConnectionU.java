package br.inf.cs.data;

import java.sql.*;

public class ConnectionU {

    public static String server;
    public static String port;
    public static String databasename;
    public static String user;
    public static String password;

    public static Connection connection;
    public static Statement statement;

    public static Boolean connect() {
        String connectionUrl = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + databasename + ";user="
                + user + ";password=" + password;
        ;

        try {
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();
            return true;
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
            if (e.getMessage().contains(
                    "The server selected protocol version TLS10 is not accepted by client preferences [TLS13, TLS12]")) {
                System.out.println(
                        "Acesse: https://asyncstream.com/tutorials/java-tlsv10-not-accepted-by-client-preferences/");
            }
        }

        return false;

    }

    public static void close(){
        try{
            if (!connection.isClosed()) {
                statement.close();
                connection.close();
            }
        }catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static ResultSet executeQuery(String query){
        try {
            return statement.executeQuery(query);
        }catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static Integer executeUpdate(String update){
        try {
            return statement.executeUpdate(update);
        }catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}
