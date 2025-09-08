package com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.DAO;

import com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.Model.Enum.Gender;
import com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.Model.User;
import com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.Utils.ConnectDB;
import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class UserDAO {
    public UserDAO () {

    }

    public void insertNewUser (User user) {
        String sql = "insert into users (first_name, last_name, email, password, birthday, gender) VALUES(?,?,?,?,?,?)";
        try (Connection conn = ConnectDB.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setString(5, user.getBirthday());
            statement.setString(6, user.getGender().toString());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<User> getUserList () {
        String sql = "select * from users";
        Set<User> userSet = new HashSet<>();
        try (Connection conn = ConnectDB.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setBirthday(rs.getString("birthday"));
                user.setGender(Gender.valueOf(rs.getString("gender")));

                userSet.add(user);
            }
            return userSet;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
