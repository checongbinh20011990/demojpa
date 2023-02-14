package com.cybersoft.demojpa.repository;

import com.cybersoft.demojpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

    List<Users> findByEmailAndPassword(String email, String password);

    /**
     * @Query: Đây là câu query viết bằng JQL câu query này sẽ tương tác với class Entity
     */
    @Query("select a from users as a")
    List<Users> getAllUser();

    @Query(value = "select u from users u join roles r on u.roles.id = r.id where u.email = ?1 and r.name = ?2")
    List<Users> getUserByEmailAndRoleName(String email, String roleName);
}
