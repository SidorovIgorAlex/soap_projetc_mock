package spring.boot.xml.service;

import localhost._8080.springsoap.gen.Country;
import localhost._8080.springsoap.gen.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country country = new Country();
        country.setCapital("London");
        country.setName("UK");
        country.setPopulation(3000000);
        country.setCurrency(Currency.GBR);
        countries.put("UK", country);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
