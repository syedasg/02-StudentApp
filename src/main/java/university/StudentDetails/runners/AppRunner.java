package university.StudentDetails.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("APP Runner");
    }
}
