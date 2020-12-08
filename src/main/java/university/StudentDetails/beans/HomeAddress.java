package university.StudentDetails.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HomeAddress implements Address{

    public HomeAddress()
    {
        System.out.println("*******Home Address Constructor******");
    }

    @Override
    public void print() {
        System.out.print("Home Address");
    }
}
