package com.car.repoistory;

import com.car.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface UserRepository extends JpaRepository<UsersEntity,String> {
    UsersEntity findByfullName(String name);
}
