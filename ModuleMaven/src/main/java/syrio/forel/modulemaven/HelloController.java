package syrio.forel.modulemaven;

/*
    @author syrio
    @date 2022/5/22
    @time 12:45
*/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot!";
    }

}
