package com.nickname.controller;

import com.nickname.entity.NickName;
import com.nickname.service.NickNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/welcome")
public class NickNameApi {

    @Autowired
    private NickNameService nickNameService;

    @PostMapping("api/post/{name}")
    public List<NickName> postNickName(@PathVariable("name") String name){

        NickName nickName = new NickName();
        nickName.setNickName(name);
        nickNameService.saveName(nickName);

        return nickNameService.getNamesAndIds();
    }


    @GetMapping("api/names")
    public List<NickName> postNickName(){
        return nickNameService.getNamesAndIds();
    }


}
