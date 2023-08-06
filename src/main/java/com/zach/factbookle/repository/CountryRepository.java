package com.zach.factbookle.repository;

import com.zach.factbookle.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    public Country findByCountry(String name);
}
