package com.car.repoistory;

import com.car.entity.MaintenanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainteanceRepository extends JpaRepository<MaintenanceEntity,String> {
}
