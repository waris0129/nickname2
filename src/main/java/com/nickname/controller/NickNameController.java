package com.nickname.controller;

import com.nickname.entity.NickName;
import com.nickname.service.NickNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class NickNameController {

    @Autowired
    NickNameService nickNameService;

    @GetMapping("")
    public String getName(Model model){

        NickName nickName = new NickName();

        List<NickName>nickNames = nickNameService.getNamesAndIds();

        model.addAttribute("nickname",nickName);
        model.addAttribute("nickNames",nickNames);

        return "welcome";
    }

    @PostMapping("")
    public String postName(@ModelAttribute ("company") NickName nickName, Model model){

        nickNameService.saveName(nickName);

        return "redirect:/";
    }


}
