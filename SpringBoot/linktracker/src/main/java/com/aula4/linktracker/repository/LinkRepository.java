package com.aula4.linktracker.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.aula4.linktracker.dto.LinkDTO;

@Repository
public class LinkRepository {

	private Map<Long, LinkDTO> dict = new HashMap<Long, LinkDTO>(); 
	
	
	public long addLink(LinkDTO l) {
		long id = dict.size() + 1;
		dict.put(id, l);
		return id;
	}
	
	
	public Map <Long,LinkDTO> getMap(){
		return dict;
	}
	
	public LinkDTO getLink(Long id) {
		return dict.get(id);
		
	}
	
}
