
import java.sql.*;

public class DBConnect {
    public static void main(String[] args) throws ClassNotFoundException {

        String host = "jdbc:mysql://localhost:3307/melomane_records";
        String userName = "root";
        String userPassword = "root";


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(host, userName, userPassword);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Utilisateur");
            while(resultSet.next())
                System.out.println(resultSet.getInt("id")+ " " + resultSet.getString("Nom_Utilisateu")+
                        " "+ resultSet.getString("mot_de_passe")+ " "+ resultSet.getString("email"));
            statement.close();
            con.close();
        } catch (SQLException e) {
           System.out.println(e);
        }


    }
}
