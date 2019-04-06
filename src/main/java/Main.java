import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException{

        System.out.println("Choose exercise (1/2):");

        Scanner scanner = new Scanner(System.in);
        int path = scanner.nextInt();
        scanner.nextLine();

        if(scanner.nextInt() == 1){

            System.out.println("TEST 1\n\nProvide 2 strings to compare\nFirst String:");
            String first = scanner.nextLine();

            System.out.println("Second String:\n");
            String second = scanner.nextLine();

            if(first.length() == second.length())
                System.out.println(compare(first, second));
            else
                System.out.println("Provide strings with the same length!");
        }
        else if(scanner.nextInt() == 2){

            System.out.println("TEST 2\n\nProvide the department:\n");
            String department = scanner.nextLine();

            System.out.println("Provide the pay type:\n");
            String payType = scanner.nextLine();

            System.out.println("Provide the education level:\n");
            String educationLevel = scanner.nextLine();

            query(department, payType, educationLevel);
        }
        else
            System.out.println("Not a valid input!");
    }

    public static int compare(String first, String second){

        int numberOfDifs = 0;

        for(int i = 0; i < first.length(); i++)
            if(first.charAt(i) != second.charAt(i))
                numberOfDifs++;

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

        try {

            conn = source.getConnection();
            System.out.println(department + "\n" + payType +
                               "\n" + educationLevel);
        } catch (Exception e) {

            System.err.println(e.getMessage());
        } finally {

            conn.close();
        }
    }
}
