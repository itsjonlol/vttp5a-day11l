package sg.edu.nus.iss.vttp5a_day11l.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @ResponseBody
    @GetMapping("/log") //need to package
    public String home() {
        //output as console string
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is a severe/fatal message");
        logger.debug("This is trace message");
        logger.trace("This is a trace message");


        return "";


    }
    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public String homePage(){
        return "home";

    }
    //@RequestMapping(path = "/log", method = RequestMethod.GET) -> put ,update etc must use this
}
