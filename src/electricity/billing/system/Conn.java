package electricity.billing.system;

import java.sql.*;

/**
 *
 * @author Yashu
 */
public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///electricity", "root", "BaBoy@1109");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
