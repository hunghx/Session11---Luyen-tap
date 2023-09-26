package ra.service;

import ra.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentService implements IGenericService<Student,Long>{
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student> findALl() {
        return students;
    }

    @Override
    public Student findById(Long id) {
        for (Student  s:students) {
            if(Objects.equals(s.getStudentId(), id)){
                return s;
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        if(findById(student.getStudentId()) == null){
            // thêm mới
            students.add(student);
        }else {
            students.set(students.indexOf(findById(student.getStudentId())),student);
        }
    }

    @Override
    public void delete(Long id) {
        students.remove(findById(id));
    }

    public boolean checkExistByPhone(String phone){
        for (Student  s:students) {
            if(s.getPhone().equals(phone)){
                return true;
            }
        }
        return false;
    }
}
