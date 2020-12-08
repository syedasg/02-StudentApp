package university.StudentDetails;

import lombok.Data;
import org.springframework.stereotype.Component;
//@Data
@Component
public class Address {
    private String StreetName;
    private String AptNo;
    private String State;
    private String Country;
    private String Zipcode;
    public Address()
    {
        System.out.println("*******Address Constructor******");
    }
}
