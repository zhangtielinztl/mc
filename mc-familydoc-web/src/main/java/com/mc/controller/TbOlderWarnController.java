package com.mc.controller;

import com.mc.pojo.TbOlderWarn;
import com.mc.service.TbOlderWarnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TbOlderWarnController {
    @Autowired
    private TbOlderWarnService tbOlderWarnService;
    @RequestMapping("/widgets")
    @ResponseBody
    public TbOlderWarn showTbOlder(String olderName, Model model){
        TbOlderWarn tbOlder = tbOlderWarnService.showTbOlder(olderName);
        model.addAttribute("tbOlder",tbOlder);
        System.out.println(tbOlder);
       return tbOlder;
    }
}
