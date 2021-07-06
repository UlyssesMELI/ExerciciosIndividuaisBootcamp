package com.aula3.starwars.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula3.starwars.repository.CharacterRepository;
import com.aula3.starwars.entity.Character;

@Service
public class CharactersService {

	@Autowired
	CharacterRepository characterRepository;
	
	public List<Character> findInName(String nameQuery){
		List<Character> hasString = new ArrayList<>();
		
		for(Character c : characterRepository.getList()) {
			if(c.getName().toLowerCase().contains(nameQuery.toLowerCase())) {
				hasString.add(c);
			}
		}
		
		return hasString;
	}
	
}
