package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "roleuser")
public class RoleEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="roleuser")
    private List<AccountEntity> account;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AccountEntity> getAccount() {
        return account;
    }

    public void setAccount(List<AccountEntity> account) {
        this.account = account;
    }
}
