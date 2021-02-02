import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    String userName = "root";
    String passWord = "enis";
    String dbURL = "jdbc:mysql://localhost:3306/aile?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbURL, userName, passWord);

    }

    public void showErrorMessages(SQLException exception){
        System.out.println("Error      : " + exception.getMessage());
        System.out.println("Error Code : " + exception.getErrorCode());
    }


}
