/***
 * Copyright 2021 Cleuson Santos <cleusonss@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ***/

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
