package com.zmltd.pending.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.zmltd.pending.entity.PhoneNumber;
import com.zmltd.pending.pojos.ReponsePojo;

public class dbService {

    // making a connection to the db
    public ReponsePojo database(String number) throws SQLException {

        Statement s = null;
        String url = "jdbc:oracle:thin:@172.18.2.13:1523:cpsora";

        ReponsePojo r = new ReponsePojo();

        try {

            Connection c = DriverManager.getConnection(url, "pinreset", "N0zTlp#S$w0rD");

            if (c != null) {
                s = c.createStatement();
                System.out.println("Connected to the db");

                String tableSQL = "DELETE FROM cpsmgt.cps_scy_credential t WHERE t.identity_id IN (SELECT d.identity_id FROM cpsmgt.CPS_SIM_DEVICE d WHERE d.msisdn IN '" + number + "')";
                int count = s.executeUpdate(tableSQL);
                if (count == 0) {
                    r.setMessage(" Not Found ");
                    r.setStatusCode(404);
                                    // System.out.println("Connected to the db");
                    return r;

                } else {
                    r.setMessage(" Request Succesful ");
                    r.setStatusCode(202);
                    return r;

                }

            }

            else

                System.out.println("Connected to db failed");
        }

        catch (SQLException e) {

            e.printStackTrace();
            System.out.println("From SQL");

        }

        return null;

    }
    public static void main(String[] args) throws SQLException {
    dbService db = new dbService();

   ReponsePojo t =  db.database("260950003935");
System.out.println((t.getStatusCode()));
    }

}
