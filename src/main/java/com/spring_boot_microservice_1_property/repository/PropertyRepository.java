package com.spring_boot_microservice_1_property.repository;

import com.spring_boot_microservice_1_property.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,Long> {


}
