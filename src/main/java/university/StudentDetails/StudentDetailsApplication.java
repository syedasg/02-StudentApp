package university.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan
@Configuration
public class StudentDetailsApplication {
	//static ConfigurableApplicationContext context=SpringApplication.run(StudentDetailsApplication.class, args);
	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(StudentDetailsApplication.class, args);

		System.out.println("Main");

		Student s2=context.getBean("student",Student.class);

		System.out.println("@component scan Values	"+s2.getRollNo()+"		"+s2.getStudentName()+"		"+s2.getAddress());


	   //Student s1=context.getBean("studentBean",Student.class);
		//System.out.println("@Bean Annotation Values	 "+s1.getRollNo()+"		"+s1.getStudentName()+"		"+s1.getAddress());






	}

	@Bean
	public Address AddressBean(){
		System.out.print("From Bean Annotation");
		return new Address();
	}

	@Bean
	//@Autowired
	public Student studentBean(){
		System.out.print("From Bean Annotation");
//		Student s11=new Student();
//		s11.setRollNo("1");
//		s11.setStudentName("asg");
//
		return new Student();

	}



}



/*For @Componentscan first all component object got created if there is a dependency  then IOC will check if
depency object is available and @autowired annotation available on both constructor and setter then both got
injected constructor--->setter.
IF the dependency class contain both Reference type and primitive type then primitive type usually get injected
@Value annotation on setter() as constructor doesnt support @Value annotation.

Conclusion: For Primitive Type (@Component)
@value
Setters()

For Reference Type:  (@Component)
@Autowired
Constructor()

@Autoowired
@Setters()

 */

/*
For @Bean Annotation
Spring IOC will create objects, if there are dependecies then Dependency Class contains two constructor
and if we are creating object using no arg constructor and @autowire is on parametrised constructor it will not
get injected in order to do injection we need Setter() @Autowired.


Constructor1();(Executed)

@Autowired
Constructor2();(Not Executed)

@Autowired
Setter();(Executed)

 */