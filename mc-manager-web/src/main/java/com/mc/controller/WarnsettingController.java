package com.mc.controller;

import com.mc.pojo.Warnsetting;
import com.mc.service.WarnsettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
public class WarnsettingController {
    @Autowired
    private WarnsettingService warnsettingService;
    @RequestMapping("/warnsetting")
    public String getWarnsetting(Model model){
        List<Warnsetting> list=warnsettingService.findWarnsettingAll();
        model.addAttribute("warnList",list);
        System.out.println(list);
        return "warnsetting";
    }
    @RequestMapping("/delete/{id}")
    public List<Warnsetting> deleteWarnsetting(long id){
        List<Warnsetting> result=warnsettingService.deleteWarnsettingById(id);
        return result;
    }
}