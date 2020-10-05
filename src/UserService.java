import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    public  User findByLoginAndPassword(String login, String pass) {
        Connection connection = ConnectionFactory.getInstance();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM USERS WHERE LOGIN = ? and PASS = ?");
            statement.setString(1,login);
            statement.setString(2,pass);
            ResultSet rs = statement.executeQuery();
            if  (rs.next()) {
                return new User (
                        rs.getLong("id"),
                        rs.getString("login"),
                        rs.getString("pass"),
                        rs.getString("name")
                        );
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("SWW",e);
        }    finally {
                closeConnection(connection);
            }
        }
        private void closeConnection (Connection connection){
        try{
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
