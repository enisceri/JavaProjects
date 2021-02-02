import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            deleteDB();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }


    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        Statement statement = null;
        ResultSet resultSet;
        ArrayList<AileDB> uyeler = new ArrayList<AileDB>();

        try {
            connection = helper.getConnection();

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM ceri");

            while (resultSet.next()) {
                uyeler.add(new AileDB(resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("lastName"),
                        resultSet.getString("age"),
                        resultSet.getString("student"),
                        resultSet.getString("worker")));


            }


        } catch (SQLException exception) {
            helper.showErrorMessages(exception);

        } finally {
            connection.close();
        }
    }

    public static void insertFromDB() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;

        ResultSet resultSet;

        try {
            /*
            1. Baglantiyi ac.
            2. Statement yaz.
            3. Baglantiyi ve Statement'i kapat.
             */
            connection = helper.getConnection(); // 1.Baglanti acildi.
            String sql = "INSERT INTO ceri(NAME,LASTNAME,AGE,STUDENT,WORKER) " +
                    "VALUES(?,?, ?, ?, ?)";

            //2. Statement yazildi. INSERT INTO
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Lebron");
            statement.setString(2,"James");
            statement.setInt(3, 30);
            statement.setString(4,"H");
            statement.setString(5,"E");

            int result = statement.executeUpdate(); // n rows affected (n = 1,2,...)
                                       // Etkilenen satir sayisini dondurur.

            // statement.executeUpdate(); ifadesi ile aslinda tablodaki guncellemeyi yapmis olur.
            // Bu ifadenin 2 kez yazilmasi islemin 2 kez eklenmesine neden olur.


            System.out.println("Kayit veri tabanina eklendi. " + result + " rows affected.");



        } catch (SQLException exception) {
            helper.showErrorMessages(exception);

        } finally {
            statement.close();

            connection.close();
        }


    }


    public static void updateDB() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;

        ResultSet resultSet;

        try {
            /*
            1. Baglantiyi ac.
            2. Statement yaz.
            3. Baglantiyi ve Statement'i kapat.
             */
            connection = helper.getConnection(); // 1.Baglanti acildi.
            String sql = "UPDATE ceri SET NAME = 'Guncellenmis İsim', WORKER = 'H' where id = ?";

            //2. Statement yazildi. INSERT INTO
            statement = connection.prepareStatement(sql);
            statement.setInt(1,13);//1. soru isaretinin degeri 13. ID'dir.


            int result = statement.executeUpdate(); // n rows affected (n = 1,2,...)
            // Etkilenen satir sayisini dondurur.

            // statement.executeUpdate(); ifadesi ile aslinda tablodaki guncellemeyi yapmis olur.
            // Bu ifadenin 2 kez yazilmasi islemin 2 kez eklenmesine neden olur.


            System.out.println("Kayit guncellendi. " + result + " rows affected.");



        } catch (SQLException exception) {
            helper.showErrorMessages(exception);

        } finally {
            statement.close();

            connection.close();
        }


    }


    public static void deleteDB() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;

        ResultSet resultSet;

        try {
            /*
            1. Baglantiyi ac.
            2. Statement yaz.
            3. Baglantiyi ve Statement'i kapat.
             */
            connection = helper.getConnection(); // 1.Baglanti acildi.
            String sql = "DELETE FROM ceri WHERE ID = ?";

            //2. Statement yazildi. INSERT INTO
            statement = connection.prepareStatement(sql);
            statement.setInt(1,13);//1. soru isaretinin degeri 13. ID'dir.


            int result = statement.executeUpdate(); // n rows affected (n = 1,2,...)
            // Etkilenen satir sayisini dondurur.

            // statement.executeUpdate(); ifadesi ile aslinda tablodaki guncellemeyi yapmis olur.
            // Bu ifadenin 2 kez yazilmasi islemin 2 kez eklenmesine neden olur.


            System.out.println("Kayit silindi. " + result + " rows affected.");



        } catch (SQLException exception) {
            helper.showErrorMessages(exception);

        } finally {
            statement.close();

            connection.close();
        }


    }


}
