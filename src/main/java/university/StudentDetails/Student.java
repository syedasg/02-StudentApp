package university.StudentDetails;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Data
@Component
public class Student {

    private String StudentName;
    private String rollNo;
    private Address address;


    public Address getAddress() {
        return address;
    }

    @Autowired
    @Scope("prototype")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Student()
    {
        System.out.println("*******Student Constructor******");
    }








    @Value( "${student.rollno}" )
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getRollNo() {
        return rollNo;
    }

    @Value( "${student.name}" )
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentName() {
        return StudentName;
    }





}
