package university.StudentDetails.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String StudentName;
    private String rollNo;
    //@Autowired
    @Qualifier("homeAddress")
    private Address address;

    public Student()
    {
        System.out.println("*******Student Constructor******");
    }


    //@Autowired
    public Student(Address address)
    {
        this.address=address;
        System.out.println("*******Student Address Constructor******");
    }



    public String getRollNo() {
        return rollNo;
    }
    @Value( "${student.rollno}" )
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }


    public String getStudentName() {
        return StudentName;
    }
    @Value( "${student.name}" )
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }





    public Address getAddress() {
        return address;
    }
    @Autowired
    @Qualifier("officeAddress")
    public void setAddress(Address address) {
        this.address = address;
    }
}
