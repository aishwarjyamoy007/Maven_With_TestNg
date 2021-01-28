package com.company;
import com.relevantcodes.extentreports.LogStatus;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DatabaseConnectionClass extends DriverSetup {
    public static void createNewDatabase(String fileName) {

        String url = Constants.jdbcUrl + fileName;


        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();

                System.out.println(Constants.jdbcSuccessMessage);
                logger.info(Constants.jdbcSuccessMessage);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            logger.info(Constants.jdbcFailureMessage);
        }
    }
    public static void createNewTable(String field,String value) {
        // SQLite connection string

        PreparedStatement ps=null;
        // SQL statement for creating a new table

        String tableInsertQuery="INSERT INTO COGNIZANT_INDEX(field,value) VALUES('"+field+"','"+value+"')";


        try (Connection conn = DriverManager.getConnection(Constants.tableUrl);
             Statement stmt = conn.createStatement()) {
            stmt.execute(Constants.tableCreationQuery);
            System.out.println(Constants.tableCreationSuccessMessage);
            logger.info(Constants.tableCreationSuccessMessage);
            //stmt.executeQuery(query1);
            int x1 = stmt.executeUpdate(tableInsertQuery);
            if (x1 > 0) {
                System.out.println(Constants.rowSuccessfullyAddedMessage);
                logger.info(Constants.rowSuccessfullyAddedMessage);
                test.log(LogStatus.PASS,Constants.rowSuccessfullyAddedMessage);
            }
            else {
                System.out.println(Constants.rowAdditionFailureMessage);
                logger.info(Constants.rowAdditionFailureMessage);
                test.log(LogStatus.FAIL,Constants.rowAdditionFailureMessage);
            }
            System.out.println(Constants.querySuccessfullyExecutedMessage);
            logger.info(Constants.querySuccessfullyExecutedMessage);

            ps=conn.prepareStatement(Constants.selectQuery);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){

                String id  = rs.getString(1);

                String first = rs.getString(2);

                //Display values
                System.out.print("ID: " + id);

                System.out.print(", NAME: " + first);
                System.out.print("\n");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
