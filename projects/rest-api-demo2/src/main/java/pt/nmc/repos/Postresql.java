package pt.nmc.repos;

import pt.nmc.model.Student;

import java.sql.*;
import java.util.Collections;
import java.util.Optional;

public class Postresql implements StudentRepo {

    private final static String ADD_STUDENT_QUERY = "INSERT INTO students (first_name, last_name, email) VALUES (?, ?, ?)";
    private final static String FIND_STUDENT_BY_FIRST_NAME_QUERY = "select * from students where first_name = ?";
    private final static String CONNECTION_TO_DATABASE = "jdbc:postgresql://ep-broad-dawn-ab8dxfhn-pooler.eu-west-2.aws.neon.tech/neondb?user=neondb_owner&password=npg_wzFLi9lKqy0d&sslmode=require&channelBinding=require";

    private static Optional<Student> executeQuery(PreparedStatement preparedStatement) {
        try (
                ResultSet resultSet = preparedStatement.executeQuery()) {
            if (!resultSet.next()) {
                return Optional.empty();
            }
            return Optional.of(
                    Student.builder()
                            .firstName(resultSet
                                    .getString("first_name"))
                            .lastName(resultSet
                                    .getString("last_name"))
                            .email(resultSet
                                    .getString("email"))
                            .build()
            );

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(Student student) {

        try (
                Connection connection = DriverManager.getConnection(CONNECTION_TO_DATABASE);
                PreparedStatement preparedStatement = connection.prepareStatement(ADD_STUDENT_QUERY)
        ) {
            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Student> findByFirstName(String firstName) {
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_TO_DATABASE);
                PreparedStatement preparedStatement = connection.prepareStatement(FIND_STUDENT_BY_FIRST_NAME_QUERY)
        ) {
            preparedStatement.setString(1, firstName);

            return executeQuery(preparedStatement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collections findAll() {
        return null;
    }
}
