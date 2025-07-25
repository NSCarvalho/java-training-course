package pt.nmc.repos;

import pt.nmc.model.Student;

import java.sql.*;
import java.util.*;

public class Postresql implements StudentRepo {

    private final static String ADD_STUDENT_QUERY = "INSERT INTO students (first_name, last_name, email) VALUES (?, ?, ?)";
    private final static String FIND_STUDENT_BY_FIRST_NAME_QUERY = "select * from students where first_name like ?";
    private final static String FIND_STUDENT_BY_ID_QUERY = "select * from students where id = ?";
    private final static String FIND_ALL_STUDENTS_QUERY = "select * from students";
    private final static String DELETE_ALL_STUDENTS_QUERY = "truncate students";
    private final static String DELETE_STUDENT_BY_ID_QUERY = "delete from students where id = ?";
    private final static String UPDATE_STUDENT_BY_ID_QUERY = "update students set first_name = ?, last_name = ?, email = ? where id = ?";
    private final static String CONNECTION_TO_DATABASE = "jdbc:postgresql://ep-broad-dawn-ab8dxfhn-pooler.eu-west-2.aws.neon.tech/neondb?user=neondb_owner&password=npg_wzFLi9lKqy0d&sslmode=require&channelBinding=require";


    private static List<Student> executeQuery(PreparedStatement preparedStatement) {
        try (
                ResultSet resultSet = preparedStatement.executeQuery()) {

            List<Student> studentList = new ArrayList<>(100);

            while (resultSet.next()) {
                studentList.add(
                        Student.builder()
                                .id(resultSet
                                        .getObject("id", UUID.class))
                                .firstName(resultSet
                                        .getString("first_name"))
                                .lastName(resultSet
                                        .getString("last_name"))
                                .email(resultSet
                                        .getString("email"))
                                .build());
            }
            return studentList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Optional<Student> getFirstStudent(List<Student> resultList) {
        if (resultList.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(resultList.get(0));
        }
    }

    @Override
    public int save(Student student) {

        try (
                Connection connection = DriverManager.getConnection(CONNECTION_TO_DATABASE);
                PreparedStatement preparedStatement = connection.prepareStatement(ADD_STUDENT_QUERY)
        ) {
            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setString(3, student.getEmail());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(Student student) {
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_TO_DATABASE);
                PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_BY_ID_QUERY)
        ) {
            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setObject(4, student.getId());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(UUID uuid) {
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_TO_DATABASE);
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_BY_ID_QUERY)
        ) {
            preparedStatement.setObject(1, uuid);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> findAll() {
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_TO_DATABASE);
                PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_STUDENTS_QUERY)
        ) {

            return executeQuery(preparedStatement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> findByFirstName(String firstName) {
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_TO_DATABASE);
                PreparedStatement preparedStatement = connection.prepareStatement(FIND_STUDENT_BY_FIRST_NAME_QUERY)
        ) {
            preparedStatement.setString(1, "%" + firstName + "%");

            return executeQuery(preparedStatement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Student> findById(UUID uuid) {
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_TO_DATABASE);
                PreparedStatement preparedStatement = connection.prepareStatement(FIND_STUDENT_BY_ID_QUERY)
        ) {
            preparedStatement.setObject(1, uuid);

            var resultList = executeQuery(preparedStatement);
            return getFirstStudent(resultList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
