package cm.clava_meum.club_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubManagerController {

    @RequestMapping("/")
    public String index (){
        return "<h1>Hello World</h1>";
    }
}
