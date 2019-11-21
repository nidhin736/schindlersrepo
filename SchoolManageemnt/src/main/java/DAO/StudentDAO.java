package DAO;

import java.util.ArrayList;

import model.Student;

public interface StudentDAO {
	public ArrayList<Student> getAllStudent();
	public Student getStudentById(Integer id);
	public int createStudent(Student student);
	public int  deleteStudent(Integer id);
	public int updateStudent(Student student);

}
