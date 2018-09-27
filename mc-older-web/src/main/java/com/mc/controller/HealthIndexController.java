package com.mc.controller;


import com.mc.pojo.TbHealthIndex;
import com.mc.service.HealthIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.SessionAttributes;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller

public class HealthIndexController {

    @Autowired
    private HealthIndexService healthIndexService;


    @RequestMapping("/healthindex")
    public String findTbHealthIndexAll(Model model){
        List<TbHealthIndex>  tbHealthIndex = healthIndexService.findTbHealthIndexAll();
        model.addAttribute("tbHealthIndex",tbHealthIndex);
        System.out.println(tbHealthIndex);
        return "healthindex";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "/add";
    }
    @RequestMapping("/add")
    public String addTbHealthIndex(TbHealthIndex healthIndex){
        healthIndexService.addTbHealthIndex(healthIndex);
        return "add";
    }
}
