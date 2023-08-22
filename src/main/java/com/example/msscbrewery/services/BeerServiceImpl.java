package com.example.msscbrewery.services;

import com.example.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo - implement update beer method which gets beerObject via beerId from database and updates the existing beerObject with new beerObject
    }

    @Override
    public void deleteById(UUID beerId) {
        // todo - implement delete functionality
        log.info("Deleting beer...");
        System.out.println("Delete beer");
    }
}
