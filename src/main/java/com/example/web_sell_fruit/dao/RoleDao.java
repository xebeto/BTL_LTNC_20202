package com.example.web_sell_fruit.dao;

import com.example.web_sell_fruit.entity.RoleEntity;

import java.util.List;

public interface RoleDao {

    public List<RoleEntity> getList();

    public RoleEntity getById(int id);

    public RoleEntity getByName(String name);

    public void addOrUpDate(RoleEntity role);

    public void delete(int id);
}
