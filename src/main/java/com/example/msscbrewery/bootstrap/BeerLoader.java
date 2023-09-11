package com.example.msscbrewery.bootstrap;

import com.example.msscbrewery.domain.Beer;
import com.example.msscbrewery.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {      // implementing CommandLineRunner enables to run every time the spring context starts

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(3340L)
                            .price(new BigDecimal("12.95"))
                            .build());

            beerRepository.save(Beer.builder()
                            .beerName("Galaxy Cat")
                            .beerStyle("Pale Ale")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(4440L)
                            .price(new BigDecimal("11.95"))
                            .build());
        }

        System.out.println("Loaded Beer: " + beerRepository.count());
    }
}
