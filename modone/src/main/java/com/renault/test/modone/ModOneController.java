package com.renault.test.modone;

import com.renault.test.common.Misc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModOneController {

    Misc misc = new Misc();

    @RequestMapping("/one")
    public String index() {
        return misc.message() + "Greetings from Spring Boot 1!";
    }
}
