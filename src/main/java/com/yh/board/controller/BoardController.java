package com.yh.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("/index.do")
    public String index() {
        return "Index";
    }

    @GetMapping("/board.do")
    public String boardForm(Model model) {
    
        model.addAttribute("username", "용휘");
        return "Board";
    }

}
