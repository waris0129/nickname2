package com.nickname.entity;

import lombok.Data;

@Data
public class NickName implements Comparable<NickName>{

    private Long id;
    private String nickName;

    @Override
    public int compareTo(NickName o) {
        if(this.getId()>o.getId())
            return -1;
        if(this.getId()<o.getId())
            return 1;


        return 0;
    }
}
