package university.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {


    @Value("syed")
    private String StudentName;
    @Value("12345")
    private String rollNo;
    @Autowired
    private Address address;

    public String getRollNo() {
        return rollNo;
    }
    //String StudentName,String rollNo,
    //@Autowired
    public Student()
    {
        System.out.println("*******Student Constructor******");
    }

    public Student(String StudentName){
        this.StudentName=StudentName;
        // this.rollNo=rollNo;
        //this.address=address;
    }

   // @Autowired
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
    @Value("55555")
    //@Value( "${student.rollno}" )
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    //@Value( "${student.name}" )
    @Value("parvez")
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    //@Autowired
    public void setAddress(Address address) {
        System.out.println("From Autowired SetAdress()");
        this.address = address;
    }


}
