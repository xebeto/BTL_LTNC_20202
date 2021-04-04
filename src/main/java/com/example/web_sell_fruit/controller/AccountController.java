package com.example.web_sell_fruit.controller;


import jdk.dynalink.beans.StaticClass;
import org.springframework.stereotype.Controller;
import com.example.web_sell_fruit.models.Account;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("Account")
public class AccountController {
    static ArrayList<Account> accounts=new ArrayList<>();


}
