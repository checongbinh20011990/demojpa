package com.cybersoft.demojpa.service.imp;

import com.cybersoft.demojpa.dto.RoleDTO;

import java.util.List;
//obfucate
public interface RoleService {
    List<RoleDTO> getAllRole();
    List<RoleDTO> getRoleByName(String name);
}
