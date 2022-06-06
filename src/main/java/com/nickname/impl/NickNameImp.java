package com.nickname.impl;

import com.nickname.entity.NickName;
import com.nickname.service.NickNameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NickNameImp implements NickNameService{

    long i =0;
    List<NickName> nickNames= null;

    public NickNameImp(List<NickName> nickNames) {
        NickName nickName1 = new NickName();
        nickName1.setId(1l);
        nickName1.setNickName("Jerry");
        NickName nickName2 = new NickName();
        nickName2.setId(2l);
        nickName2.setNickName("Marry");
        NickName nickName3 = new NickName();
        nickName3.setId(3l);
        nickName3.setNickName("Kerry");

        this.nickNames = nickNames;
        nickNames.add(nickName1);
        nickNames.add(nickName2);
        nickNames.add(nickName3);
    }

    @Override
    public List<NickName> getNamesAndIds() {
        return nickNames;
    }

    @Override
    public void saveName(NickName nickName) {
        i = nickNames.size()+1l;
        nickName.setId(i);
        nickNames.add(nickName);
    }
}
