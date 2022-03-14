package com.gourmap.controller.read;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class ReadController {

    @RequestMapping("/read")
    public String main() {
        return "read/main";
    }
}
