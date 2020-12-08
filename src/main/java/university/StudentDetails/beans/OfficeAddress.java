package university.StudentDetails.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class OfficeAddress implements Address{

    public OfficeAddress()
    {
        System.out.println("*******Office Address Constructor******");
    }

    @Override
    public void print() {
        System.out.print("Office Address");
    }
}
