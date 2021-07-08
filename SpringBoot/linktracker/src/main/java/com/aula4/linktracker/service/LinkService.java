package com.aula4.linktracker.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula4.linktracker.dto.LinkDTO;
import com.aula4.linktracker.repository.LinkRepository;

@Service
public class LinkService {

	@Autowired
	LinkRepository linkRepository;
	
	public long addLink(LinkDTO ldto) {
		return linkRepository.addLink(ldto);
	}
	
	public LinkDTO getLink(long id) {
		return linkRepository.getLink(id);
	}
	
	public LinkDTO linkExist(String linkValue){
		Map<Long, LinkDTO> dict = linkRepository.getMap();

		for (var entry : dict.entrySet()) {	
		    if(entry.getValue().getStrLink().equals(linkValue)) {
		    	return entry.getValue();
		    }
		    
		}
		return null;
	}
	
}
