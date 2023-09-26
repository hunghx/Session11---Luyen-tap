package ra.run;

import ra.model.Student;
import ra.service.StudentService;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SchoolManager {
    private static final StudentService studentService = new StudentService();

    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.inputData();
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(newStudent.getBirthDay()));
        while(true){
        if(!studentService.checkExistByPhone(newStudent.getPhone())){
            break;
        }else {
            System.out.println("đã tồn tại vui lòng nhập lại");
            newStudent.setStudentName(new Scanner(System.in).nextLine());
        }
        }
    }
}
