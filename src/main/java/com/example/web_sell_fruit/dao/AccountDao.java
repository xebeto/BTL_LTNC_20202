package com.example.web_sell_fruit.dao;

import com.example.web_sell_fruit.entity.AccountEntity;

import java.util.List;

public interface AccountDao {

    public List<AccountEntity> getList();

    public AccountEntity getById(int id);

    public AccountEntity getByUsername(String username);

    public AccountEntity getByEmail(String email);

    public AccountEntity getByUsernameOrEmail(String username, String email);

    public AccountEntity getByUsernameAndActive(String username, boolean active);

    public void addOrUpdate(AccountEntity account);

    public void delete(int id);
}
