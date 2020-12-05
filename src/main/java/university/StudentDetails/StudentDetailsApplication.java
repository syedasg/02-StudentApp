package university.StudentDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class StudentDetailsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(StudentDetailsApplication.class, args);

		System.out.println("Main");

		Student s2=context.getBean("student",Student.class);

		System.out.println("@component scan Values	"+s2.getRollNo()+"		"+s2.getStudentName());


		Student s1=context.getBean("studentBean",Student.class);
		System.out.println("@Bean Annotation Values	 "+s1.getRollNo()+"		"+s1.getStudentName());






	}

	@Bean
	public Student studentBean(){
		System.out.print("From Bean Annotation");
		Student s11=new Student();
		s11.setRollNo("1");
		s11.setStudentName("asg");
		return s11;

	}

	@Bean
	public Address AddressBean(){
		System.out.print("From Bean Annotation");
		return new Address();
	}

}
