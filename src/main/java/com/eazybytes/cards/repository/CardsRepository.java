package com.eazybytes.cards.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eazybytes.cards.model.Cards;

public interface CardsRepository extends CrudRepository<Cards, Long> {
	
	List<Cards> findByCustomerId(int customerId);

}
