package university.StudentDetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String StudentName;
    private String rollNo;
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



    public Student()
    {
        System.out.println("*******Student Constructor******");
    }
}
