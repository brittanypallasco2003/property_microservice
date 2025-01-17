package com.spring_boot_microservice_1_property.service;

import com.spring_boot_microservice_1_property.model.Property;

import java.util.List;

public interface PropertyService {
    public Property saveProperty(Property property);

    public void deleteProperty(Long propertyId);

    public List<Property> findAllProperties();
}
