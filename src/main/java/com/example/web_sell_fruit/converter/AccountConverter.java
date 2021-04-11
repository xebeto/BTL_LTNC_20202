package com.example.web_sell_fruit.converter;


import com.example.web_sell_fruit.dao.RoleDao;
import com.example.web_sell_fruit.entity.AccountEntity;
import com.example.web_sell_fruit.entity.RoleEntity;
import com.example.web_sell_fruit.models.AccountDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountConverter {

    private ModelMapper modelMapper;

    public AccountConverter() {
        modelMapper = new ModelMapper();
    }

    @Autowired
    private RoleDao roleDao;

    public AccountDTO toDTO(AccountEntity account) {
        if (account == null)
            return null;

        AccountDTO accountDTO = modelMapper.map(account, AccountDTO.class);

        List<String> roles = new ArrayList<>();

        for (RoleEntity role : account.getRoleuser()) {
            String roleString = role.getName();
            roles.add(roleString);
        }

        accountDTO.setRoleEntity(roles);

        return accountDTO;
    }

    public AccountEntity toEntity(AccountDTO accountDTO) {
        if (accountDTO == null)
            return null;

        AccountEntity account = modelMapper.map(accountDTO, AccountEntity.class);

        List<RoleEntity> roles = new ArrayList<>();

        for (String roleString : accountDTO.getRoleEntity()) {
            RoleEntity role = roleDao.getByName(roleString);
            roles.add(role);
        }

        account.setRoleuser(roles);

        return account;
    }
}
