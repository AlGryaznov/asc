package ru.alishev.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.alishev.spring.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    //private static int PEOPLE_COUNT = 10;
    //    private List<Person> people;
//    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
//    private static final String USERNAME = "postgres";
//    private static final String PASSWORD = "postgres";


    @Autowired
    private JdbcTemplate jdbcTemplate;

    //private static Connection connection;

//    {
////        people = new ArrayList<>();
////        people.add(new Person(++PEOPLE_COUNT, "Alex", 24, "alex@mail.ru"));
////        people.add(new Person(++PEOPLE_COUNT, "Tom",  52, "tom@mail.ru"));
////        people.add(new Person(++PEOPLE_COUNT, "Bob", 34, "bob@mail.ru"));
//
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//    }

    public List<Person> index() {
//        return people;

//        List<Person> persons = new ArrayList<>();
//
//        try {
//            Statement statement = connection.createStatement();
//            String SQL = "SELECT * FROM person";
//            ResultSet resultSet = statement.executeQuery(SQL);
//
//            while (resultSet.next()) {
//                Person person = new Person();
//                person.setId(resultSet.getInt("id"));
//                person.setName(resultSet.getString("name"));
//                person.setAge(resultSet.getInt("age"));
//                person.setEmail(resultSet.getString("email"));
//                persons.add(person);
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//        return persons;

        return jdbcTemplate.query("SELECT * FROM Person", new PersonMapper());
    }

    public Person show(int id) {
//        return people.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
//        Person person = null;
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM person WHERE id = ?");
//            preparedStatement.setInt(1, id);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            resultSet.next();
//            person = new Person();
//            person.setId(resultSet.getInt("id"));
//            person.setName(resultSet.getString("name"));
//            person.setAge(resultSet.getInt("age"));
//            person.setEmail(resultSet.getString("email"));
//
//            return person;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return person;

        return jdbcTemplate.query("SELECT * FROM person WHERE id = ?", new Object[] {id}, new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny().orElse(null);
    }

    public void save(Person person) {
//        person.setId(++PEOPLE_COUNT);
//        people.add(person);

//        try {
//            Statement statement = connection.createStatement();
//            String SQL = "INSERT INTO Person VALUES(" + ++PEOPLE_COUNT + ",'" + person.getName() + "'," + person.getAge() + ",'" + person.getEmail() + "')" ;
//            statement.executeUpdate(SQL);
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }


//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO person VALUES (?, ?, ?, ?)");
//            preparedStatement.setInt(1, ++PEOPLE_COUNT);
//            preparedStatement.setString(2, person.getName());
//            preparedStatement.setInt(3, person.getAge());
//            preparedStatement.setString(4, person.getEmail());
//
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

        jdbcTemplate.update("INSERT INTO person VALUES (?, ?, ?, ?)",
                person.getId(), person.getName(), person.getAge(), person.getEmail());
    }

    public void update(int id, Person person) {
//        var personToUpdated = show(id);
//
//        personToUpdated.setName(person.getName());
//        personToUpdated.setAge(person.getAge());
//        personToUpdated.setEmail(person.getEmail());

//        try {
//
//            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Person SET name=?, age=?, email=? WHERE id =?");
//
//            preparedStatement.setString(1, person.getName());
//            preparedStatement.setInt(2, person.getAge());
//            preparedStatement.setString(3, person.getEmail());
//            preparedStatement.setInt(4, id);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        jdbcTemplate.update("UPDATE person SET name=?, age=?, email=? WHERE id =?",
                person.getName(), person.getAge(), person.getEmail(), person.getId());
    }

    public void delete(int id) {
        //        people.removeIf(p -> p.getId() == id);
//        try {
//
//            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Person WHERE id =?");
//
//            preparedStatement.setInt(1, id);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        jdbcTemplate.update("DELETE FROM person WHERE id =?",
                id);
    }
}
