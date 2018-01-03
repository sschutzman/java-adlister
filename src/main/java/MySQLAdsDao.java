import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection = null;

    public MySQLAdsDao() {
        Config config = new Config();
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error in getting Database");
        }

    }

    @Override
    public List<Ad> all() throws SQLException {
        ResultSet rs;
        try {
            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM items");
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error in retriving database")

        }
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}