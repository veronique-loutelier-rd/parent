package com.renault.test.modtwo;

import com.renault.test.common.Misc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModTwoController {

    Misc misc = new Misc();

    @RequestMapping("/two")
    public String index() {
        return misc.message() + "Greetings from Spring Boot 2!";
    }
}
