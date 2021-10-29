package dao;

import entity.Student;

import java.util.List;

/**
 * @author san vui
 * @create 27/10/2021 - 1:11 PM
 * @sanvankhanh@gmail.com
 */
public interface StudentDao {
    boolean update(Student student);
    boolean insert(List<Student> studentList);
    boolean delete(int id);
}
