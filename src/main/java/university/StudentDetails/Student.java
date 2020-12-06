package university.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {

    private String StudentName;
    private String rollNo;
    private Address address;
    public String getRollNo() {
        return rollNo;
    }
    //String StudentName,String rollNo,
    public Student()
    {
        System.out.println("*******Student Constructor******");
    }

    public Student(String StudentName){
        this.StudentName=StudentName;
        // this.rollNo=rollNo;
        //this.address=address;
    }

    @Autowired
    public Student(Address address){
        //this.StudentName=StudentName;
       // this.rollNo=rollNo;
        System.out.println("from autowire student(Adress) constructor");
        this.address=address;
    }


    public String getStudentName() {
        return StudentName;
    }

    public Address getAddress() {
        return address;
    }

    @Value( "${student.rollno}" )
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    @Value( "${student.name}" )
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    //@Autowired
    public void setAddress(Address address) {
        System.out.println("From Autowired SetAdress()");
        this.address = address;
    }


}
