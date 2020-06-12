package com.ecommerce.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.main.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
