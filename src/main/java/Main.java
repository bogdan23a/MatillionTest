import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException{

        System.out.println("Choose exercise (1/2):");

        Scanner scanner = new Scanner(System.in);
        int path = 0;
        try {

            path = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e){

            System.err.println(e.getMessage());
        }

        if(path == 1){

            System.out.println("TEST 1\n\nProvide 2 strings to compare\nFirst String:");
            String first = scanner.nextLine();

            System.out.println("Second String:");
            String second = scanner.nextLine();

            if(first.length() == second.length())
                System.out.println(compare(first, second));
            else
                System.out.println("Provide strings with the same length!");
        }
        else if(path == 2){

            System.out.println("TEST 2\n\nProvide the department:");
            String department = scanner.nextLine();

            System.out.println("Provide the pay type:");
            String payType = scanner.nextLine();

            System.out.println("Provide the education level:");
            String educationLevel = scanner.nextLine();

            query(department, payType, educationLevel);
        }
        else
            System.out.println("Not a valid input!");
    }

    public static int compare(String first, String second){

        int[] frequency = new int[256];


        for(int i = 0; i < first.length(); i++)
            frequency[first.charAt(i)]++;
        for(int i = 0; i < first.length(); i++)
            frequency[second.charAt(i)]--;


        int numberOfDifs = 0;
        for(int i = 0; i < 256; i++)
            if(frequency[i] > 0)
            numberOfDifs += frequency[i];

        return numberOfDifs;
    }

    public static void query(String department, String payType,
                             String educationLevel) throws SQLException {

        MysqlDataSource source = new MysqlDataSource();
        source.setUser("technical_test");
        source.setPassword("HopefullyProspectiveDevsDontBreakMe");
        source.setServerName("mysql-technical-test.cq5i4y35n9gg.eu-west-1.rds.amazonaws.com");
        source.setDatabaseName("foodmart");

        Connection conn = null;
        Statement statement = null;
        ResultSet result = null;

        try {

            conn = source.getConnection();
            statement = conn.createStatement();

            String query =  "SELECT * FROM " +

                            "(SELECT * FROM employee " +
                            "WHERE education_level=\'" + educationLevel +
                            "\') AS r1 " +

                            "INNER JOIN " +

                            "(SELECT department_id FROM department " +
                            "WHERE department_description=\'" + department +
                            "\') AS r2 " +

                            "ON r1.department_id = r2.department_id " +

                            "INNER JOIN " +

                            "(SELECT position_id FROM position " +
                            "WHERE pay_type=\'" + payType + "\') AS r3 " +

                            "ON r1.position_id = r3.position_id";

            result = statement.executeQuery(query);
            while(result.next())
                System.out.println(result.getString("full_name"));

        } catch (Exception e) {

            System.err.println(e.getMessage());
        } finally {

            result.close();
            statement.close();
            conn.close();
        }
    }
}
