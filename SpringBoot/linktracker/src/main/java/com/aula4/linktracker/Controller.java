package com.aula4.linktracker;

import java.net.URI;
import java.nio.file.AccessDeniedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.util.UriComponentsBuilder;

import com.aula4.linktracker.dto.LinkDTO;
import com.aula4.linktracker.exceptions.NotFoundException;
import com.aula4.linktracker.service.LinkService;

import exception.ForbiddenException;


@RestController
@RequestMapping("/link")
public class Controller {

	@Autowired
	LinkService linkService;
	
	@PostMapping("/create")
	public ResponseEntity<LinkDTO> createlink(@RequestBody LinkDTO newLink, UriComponentsBuilder uriBuilder) {
		long linkID = linkService.addLink(newLink);
		URI uri = uriBuilder.path("/link/{linkID}").buildAndExpand(linkID).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
	@GetMapping("/{linkID}")
	public RedirectView goTolink(@PathVariable long linkID) {
		LinkDTO dto = linkService.getLink(linkID);
		if(dto == null || !dto.getPassword().equals("")) {
			throw new NotFoundException();
		}
        return new RedirectView("/link/mascarado/"+dto.getStrLink());

	}
	
	@GetMapping("/mascarado/{linkPatern}")
	public String goToMasklink(@PathVariable String linkPatern) {
		LinkDTO dto = linkService.linkExist(linkPatern);
		if(dto==null || !dto.getPassword().equals("")) {
			throw new NotFoundException();
		}
		dto.addAccess();
		return "link mascarado";
	}
	
	@GetMapping("metrics/{linkID}")
	public LinkDTO metrics(@PathVariable long linkID) {
		LinkDTO dto = linkService.getLink(linkID);
		if(dto == null) {
			throw new NotFoundException();
		}
		return dto;

	}

	
	@PostMapping("password/{linkID}")
	public String goTolinkPassword(@PathVariable long linkID, @RequestBody String password) {
		LinkDTO dto = linkService.getLink(linkID);
		if (dto.getPassword().equals(password)) {
			throw new ForbiddenException();
		}
		if(dto == null) {
			throw new NotFoundException();
		}
        return "link secreto;
	}
}
