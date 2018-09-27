package com.mc.controller;

import com.mc.pojo.TbReply;
import com.mc.service.TbReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("tbReplies")
public class TbReplyController{
  @Autowired
  private TbReplyService tbReplyService;
  @RequestMapping("/tables")
  public String showAll(Model model)  {
    List<TbReply> tbReplies = tbReplyService.showAll();
    model.addAttribute("tbReplies",tbReplies);
    System.out.println(tbReplies);
    return "tables";
  }
  }

