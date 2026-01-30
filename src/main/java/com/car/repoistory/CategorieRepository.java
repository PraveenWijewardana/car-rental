package com.car.repoistory;

import com.car.entity.CategorieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<CategorieEntity, String> {
}
