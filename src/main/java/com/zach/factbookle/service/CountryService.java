package com.zach.factbookle.service;

import com.zach.factbookle.entity.Country;
import com.zach.factbookle.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repo;

    public Country getCountryByName(String name) { return repo.findByCountry(name); }

    public Country getCountryById(int id) { return repo.findById(id).get(); }

    public List<Country> getAllCountries() { return repo.findAll(); }
}
