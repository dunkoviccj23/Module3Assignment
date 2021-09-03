package edu.wctc.module3assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("pages")
@Controller
public class WoodController {
    @GetMapping("preparing-wood")
    public String viewPrepareWood() {
        return "pages/preparing-wood";
    }

    @GetMapping("wood-stain")
    public String viewWoodStain() {
        return "pages/wood-stain";
    }

    @GetMapping(value = "clear-finish")
    public String viewClearFinish() {
        return "pages/clear-finish";
    }
}
