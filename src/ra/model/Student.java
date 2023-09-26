package ra.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private  final String REGEX_PHONE = "^0[0-9]{9,10}$";
    private  Long studentId;
    private String studentName;
    private Date birthDay;
    private String address;
    private  boolean gender;
    private  String phone;

    public Student() {
    }

    public Student(Long studentId, String studentName, Date birthDay, String address, boolean gender, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public String getREGEX_PHONE() {
        return REGEX_PHONE;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        // giả sử người dùng nhập theo định dạng dd/MM/yyyy
        do {
            System.out.println("Nhập ngày sinh");
            String dateString = sc.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                this.birthDay = simpleDateFormat.parse(dateString);
                break;
            } catch (ParseException e) {
                System.out.println("định dạng không ddungs");
            }
        }while (true);

    }
    public void displayData(){

    }
}
