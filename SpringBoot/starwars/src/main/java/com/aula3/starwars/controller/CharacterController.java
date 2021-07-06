package com.aula3.starwars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aula3.starwars.services.CharactersService;
import com.aula3.starwars.entity.Character;

@RestController
public class CharacterController {

	
	@Autowired
	CharactersService charactersService;
	
	
	@GetMapping("/character/{name}")
	public List<Character> getCharacter(@PathVariable String name){
		return charactersService.findInName(name);
	}
	
}
