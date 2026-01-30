package com.car.repoistory;

import com.car.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface UserRepository extends JpaRepository<UsersEntity,String> {
    UsersEntity findByfullName(String name);

    @Query("SELECT u FROM UsersEntity u WHERE u.email LIKE :email")
    List<UsersEntity> searchByEmail(@Param("email") String email);
}
