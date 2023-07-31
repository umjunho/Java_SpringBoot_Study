package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchParam {

    private String account;
    private String email;
    private int page;

    public SearchParam() {
        this.account = account;
        this.email = email;
        this.page = page;
    }

    // {"account" :"" , "email" :"" , "page":0}
}
