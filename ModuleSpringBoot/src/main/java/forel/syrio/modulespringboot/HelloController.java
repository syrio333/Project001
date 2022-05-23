package forel.syrio.modulespringboot;

/*
    @author syrio
    @date 2022/5/23
    @time 15:52
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello1")
    public String hello1(){
        return "Hello SpringBoot!";
    }

    @Value("${name}")
    public String Name1st;
    @RequestMapping("/hello2")
    public String hello2(){
        return Name1st;
    }

    @Value("${person.name}")
    public String Name2nd;
    @RequestMapping("/hello3")
    public String hello3(){
        return Name2nd;
    }

    @Value("${address[0]}")
    public String address;
    @RequestMapping("/address")
    public String address(){
        return address;
    }

    @Value("${msg1}")
    public String msg1;
    @Value("${msg2}")
    public String msg2;
    @RequestMapping("/msg")
    public String msg(){
        System.out.println(msg1);
        System.out.println(msg2);
        return msg1 + "\n" + msg2;
    }

    @Autowired
    private Environment env;
    @RequestMapping("/env")
    public String env(){
        return env.getProperty("address[1]");
    }

    @Autowired
    private Person person;
    @RequestMapping("/person")
    public String person(){
        return person.toString();
    }

}
