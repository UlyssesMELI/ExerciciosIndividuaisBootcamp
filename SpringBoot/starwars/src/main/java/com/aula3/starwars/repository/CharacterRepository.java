package com.aula3.starwars.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aula3.starwars.entity.Character;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class CharacterRepository {

	private static final File FILE = new File("starwars.json");
	
	@Autowired
	private ObjectMapper mapper;
	
	public List<Character> getList(){
		List<Character> map = new ArrayList<Character>();
		try {
			FileInputStream is = new FileInputStream(FILE);
			TypeReference<List<Character>> typeReference = new TypeReference<List<Character>>() {};
			map = mapper.readValue(is, typeReference);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return map;
	}
	
}
