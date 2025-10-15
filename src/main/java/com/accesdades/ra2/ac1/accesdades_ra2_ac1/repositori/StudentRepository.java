package com.accesdades.ra2.ac1.accesdades_ra2_ac1.repositori;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.accesdades.ra2.ac1.accesdades_ra2_ac1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final class StudentRowMapper implements RowMapper<Student>{
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
            Student student = new Student();
            student.setId(rs.getLong("id"));
            student.setNom(rs.getString("nom"));
            student.setCognom(rs.getString("cognom"));
            student.setAge(rs.getInt("age"));
            student.setCicle(rs.getString("cicle"));
            student.setAnyo(rs.getInt("anyo"));
           return student;
        }
    }
    public List<Student> findAll(){
        String sql = "Select * from students";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }
    public int save(int id, String nom, String cognom, int age, String cicle, int anyo){
        String sql = "insert into students (id, nom, cognom, age, cicle, anyo) VALUES (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, id, nom, cognom, age, cicle, anyo);
    }
}
