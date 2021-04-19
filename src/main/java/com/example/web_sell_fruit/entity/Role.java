package com.example.web_sell_fruit.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "role")
public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<Account> accounts;

}
