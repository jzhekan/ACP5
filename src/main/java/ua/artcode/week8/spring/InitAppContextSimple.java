package ua.artcode.week8.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.artcode.week8.ioc.IService;

import java.util.Date;

/**
 * Created by serhii on 16.03.15.
 */
public class InitAppContextSimple {

    public static void main(String[] args) {


        String configLocation = "week8/app-context.xml";
        //String configLocation = "classpath:week8/app-context.xml";
        ApplicationContext app =
                new ClassPathXmlApplicationContext(configLocation);

        IService service = (IService) app.getBean("serviceB");
        System.out.println(service.format(new Date()));

    }
}
