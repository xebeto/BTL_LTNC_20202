package com.example.web_sell_fruit.converter;


import com.example.web_sell_fruit.entity.RoleEntity;
import com.example.web_sell_fruit.models.RoleDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    private ModelMapper modelMapper;

    public RoleConverter() {
        modelMapper = new ModelMapper();
    }

    public RoleDTO toDTO(RoleEntity role) {
        RoleDTO roleDTO = modelMapper.map(role, RoleDTO.class);

        return roleDTO;
    }

    public RoleEntity toEntity(RoleDTO roleDTO) {
        RoleEntity role = modelMapper.map(roleDTO, RoleEntity.class);

        return role;
    }
}
