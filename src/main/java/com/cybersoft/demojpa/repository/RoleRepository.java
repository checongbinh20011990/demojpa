package com.cybersoft.demojpa.repository;

import com.cybersoft.demojpa.dto.RoleDTO;
import com.cybersoft.demojpa.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Tham số thứ nhất trong JpaRepository<Tên_Entity,Kiểu_dữ_liệu_khóa_chính>
//@Component, @Service, @Repository, @Bean thường được khai báo ở @Configuration :
//sẽ được lưu trữ lên Container dùng chung ( IOC )
@Repository
public interface RoleRepository extends JpaRepository<Roles,Integer> {
    List<Roles> findByName(String name);
}

//Tạo một user controller
/**
 * Thêm một user
 * Lấy user theo email và password
 *
 */
