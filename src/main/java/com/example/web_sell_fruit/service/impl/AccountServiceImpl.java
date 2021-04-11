package com.example.web_sell_fruit.service.impl;


import com.example.web_sell_fruit.converter.AccountConverter;
import com.example.web_sell_fruit.dao.AccountDao;
import com.example.web_sell_fruit.entity.AccountEntity;
import com.example.web_sell_fruit.models.AccountDTO;
import com.example.web_sell_fruit.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private AccountConverter accountConverter;

    @Override
    public List<AccountDTO> getList() {
        List<AccountDTO> accountDTOs = new ArrayList<>();

        for (AccountEntity account : accountDao.getList()) {
            AccountDTO accountDTO = accountConverter.toDTO(account);
            accountDTOs.add(accountDTO);
        }

        return accountDTOs;
    }

    @Override
    public AccountDTO getById(int id) {
        AccountEntity account = accountDao.getById(id);
        AccountDTO accountDTO = accountConverter.toDTO(account);
        return accountDTO;
    }

    @Override
    public AccountDTO getByUsername(String username) {
        AccountEntity account = accountDao.getByUsername(username);
        if (account != null) {
            AccountDTO accountDTO = accountConverter.toDTO(account);
            return accountDTO;
        }
        return null;
    }

    @Override
    public AccountDTO getByEmail(String email) {
        AccountEntity account = accountDao.getByEmail(email);
        AccountDTO accountDTO = accountConverter.toDTO(account);
        return accountDTO;
    }

    @Override
    public AccountDTO getByUsernameOrEmail(String username, String email) {
        AccountEntity account = accountDao.getByUsernameOrEmail(username, email);
        AccountDTO accountDTO = accountConverter.toDTO(account);
        return accountDTO;
    }

    @Override
    public AccountDTO getByUsernameAndActive(String username, boolean active) {
        AccountEntity account = accountDao.getByUsernameAndActive(username, active);
        AccountDTO accountDTO = accountConverter.toDTO(account);
        return accountDTO;
    }


    @Override
    public void addOrUpdate(AccountDTO accountDTO) {
        AccountEntity account = accountConverter.toEntity(accountDTO);
        accountDao.addOrUpdate(account);
    }

    @Override
    public void delete(int id) {
        AccountEntity account = accountDao.getById(id);
        account.getRoleuser().clear();
        accountDao.addOrUpdate(account);

        accountDao.delete(id);
    }
}
