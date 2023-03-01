package com.example.akkar2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.akkar2.entities.Rating;
import com.example.akkar2.services.IRatingService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class RatingController {
	IRatingService iRatingService;
	
	@PostMapping("/addRating/{idR}/{idU}")
	public Rating rateRealEstate(@PathVariable Long idR,@RequestBody Rating rating,@PathVariable Integer idU) {
		return iRatingService.rateRealEstate(idR, rating, idU);
		
	}
	@GetMapping("/nbrRating/{id}")
	public int nbrRationParRealEs(@PathVariable Long id) {
		return iRatingService.nbrRationParRealEs(id);
	}
	
	

}
