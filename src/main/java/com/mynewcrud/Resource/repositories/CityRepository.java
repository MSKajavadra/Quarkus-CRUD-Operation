package com.mynewcrud.Resource.repositories;


import com.mynewcrud.Resource.entities.City;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CityRepository implements PanacheRepository<City> {
	
}
