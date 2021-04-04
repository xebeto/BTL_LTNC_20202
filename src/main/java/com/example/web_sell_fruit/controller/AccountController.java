package com.example.web_sell_fruit.controller;


import org.springframework.stereotype.Controller;
import com.example.web_sell_fruit.models.AccountDTO;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("Account")
public class AccountController {
    static ArrayList<AccountDTO> accounts=new ArrayList<>();


}
