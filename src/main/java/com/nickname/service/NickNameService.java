package com.nickname.service;

import com.nickname.entity.NickName;

import java.util.List;


public interface NickNameService {

    List<NickName> getNamesAndIds();

    void saveName(NickName nickName);

}
