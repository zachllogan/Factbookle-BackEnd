package com.zach.factbookle.controller;

import com.zach.factbookle.entity.Country;
import com.zach.factbookle.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Country")
public class CountryController {
    @Autowired
    CountryService countryService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
    Country getCountry(@PathVariable String name) {
        return countryService.getCountryByName(name);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/all")
    List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }
}
