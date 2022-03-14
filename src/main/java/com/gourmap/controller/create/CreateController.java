package com.gourmap.controller.create;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class CreateController {

    @RequestMapping("/create")
    public String main() {
        return "create/main";
    }
}
