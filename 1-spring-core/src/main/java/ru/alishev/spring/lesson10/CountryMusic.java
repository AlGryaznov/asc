package ru.alishev.spring.lesson10;

import org.springframework.stereotype.Component;

//@Component("someCountryMusic")
public class CountryMusic implements Music {
    @Override
    public String getSong() {
        return "What I Want";
    }
}
