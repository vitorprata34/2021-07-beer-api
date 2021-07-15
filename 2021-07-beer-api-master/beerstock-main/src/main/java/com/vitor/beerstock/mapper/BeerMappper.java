package com.gillian.beerstock.mapper;

import com.gillian.beerstock.dto.BeerDTO;
import com.gillian.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMappper {

    BeerMappper INSTANCE = Mappers.getMapper(BeerMappper.class);

    Beer toModel(BeerDTO beerDTO);
    BeerDTO toDTO(Beer beer);
}
