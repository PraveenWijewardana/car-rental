package com.car.repoistory;

import com.car.entity.BranchesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchersRepository extends JpaRepository<BranchesEntity, String> {
}
