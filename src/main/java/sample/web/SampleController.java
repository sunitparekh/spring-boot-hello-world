package sample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@EnableAutoConfiguration
public class SampleController {

    Logger logger = Logger.getLogger(SampleController.class.getName());

    @Autowired
    private Environment env;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        logger.info("Serving request from " + env.getProperty("HOSTNAME"));
        return "Hello World! " + env.getProperty("HOSTNAME");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}