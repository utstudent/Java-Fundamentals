package labs_examples.sql.sample;

import java.sql.*;
import java.util.ArrayList;

public class JDBC_Example_1 {
    public static void main(String[] args)  {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

             /* Other examples include:
                 Class.forname("oracle.jdbc.driver.oracledriver");
                 Class.forName("org.postgresql.Driver");
                 Class.forName("mongodb.jdbc.mongodriver"); */


            // configure the "connection string" (below) with the following format
            // -------------------------------------
            // jdbc:/mysql://H.O.S.T:<PORT>/DATABASE 
            // -------------------------------------
            // on our localhost we don't need the port ":3306", we will also 
            // add the login credentials and one or more other arguments 
            // within the connection String. Your username here is most 
            // likely "root", unless you have already created 
            // new database users. The default MySQL username is "root".


            // NOTE: depending on your version of MySQL, you may need to delete "&useSSL=false"
            // from the connection String below in order to connect to the database


            String connectionString = "jdbc:mysql://localhost:3306/?user=root&password=statefarm";


            // Example connection String to remote MySQL instance:
            // "jdbc:mysql://178.34.21.99:3306/codingnomads?user=root&password=3tr0ngP@33W0rd"



            // Setup the connection with the DB 
            connection = DriverManager.getConnection(connectionString);


            // Statements allow us to issue SQL queries to the database
            statement = connection.createStatement();
            // Execute the query on the Statement, getting a ResultSet in return
            resultSet = statement.executeQuery("select * from university.courses");


            // loop through the result set while there are more records.
            while (resultSet.next()) {
                // get the id, name and units fields from the result set and assign them to local variables
                int id = resultSet.getInt("id");
                String name = resultSet.getString("course_name");
                int units = resultSet.getInt("credits");


                // print out the result
                System.out.println("Course ID: " + id + " is " + name + " and has " + units + " credits");
            }

            System.out.println("Table: " + resultSet.getMetaData().getTableName(1));

            System.out.println("The columns in the table are: ");
            for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
                System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
            }

            System.out.println("-----------------------------------------------------------------------");

            ArrayList<Course> courses = mapResultSetToObjects(resultSet);
            for (Course c : courses){
                System.out.println(c.toString());
                System.out.println("hi");
            }


        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements.
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static ArrayList<Course> mapResultSetToObjects(ResultSet resultSet) throws SQLException {
        ArrayList<Course> retList = new ArrayList();
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Course c = new Course();
            c.setId(resultSet.getInt("id"));
            c.setName(resultSet.getString("name"));
            c.setUnits(resultSet.getInt("units"));
            retList.add(c);
        }
        return retList;
    }
}