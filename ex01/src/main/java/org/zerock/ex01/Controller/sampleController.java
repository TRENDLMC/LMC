package org.zerock.ex01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class sampleController {

    @ResponseBody
    @GetMapping("/hello")
    public String[] hello(){
        return new String[]{"Hello","World"};
    }
}
