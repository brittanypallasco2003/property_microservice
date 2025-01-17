package com.spring_boot_microservice_1_property.service;

import com.spring_boot_microservice_1_property.model.Property;
import com.spring_boot_microservice_1_property.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService{

    private final PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository){
        this.propertyRepository=propertyRepository;
    }

    @Override
    public Property saveProperty(Property property){
        property.setCreationDate(LocalDateTime.now());
        return propertyRepository.save(property);

    }

    @Override
    public void deleteProperty(Long propertyId){
        propertyRepository.deleteById(propertyId);
    }

    @Override
    public List<Property> findAllProperties(){
        return propertyRepository.findAll();
    }

}
