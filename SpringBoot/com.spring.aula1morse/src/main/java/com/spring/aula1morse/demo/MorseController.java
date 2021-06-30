package com.spring.aula1morse.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MorseController {
	   
	
	@PostMapping(path="/morse")
	    public String tradutorMorse(String palavra ){
	     	
			int indexPalavra = 0;
			String aux_text = "";
			String text = "";
			palavra+= " ";
			
			while(indexPalavra<palavra.length()) {
				
				if(aux_text.equals(" ") && palavra.charAt(indexPalavra) == ' ') {
					text += " "; 
					aux_text = "";
				}
				else if(palavra.charAt(indexPalavra) == ' ' && !aux_text.trim().equals("")) {
					String mtrans = MorseEq.obtenerEquivalencias().get(aux_text);
					text += mtrans;
					aux_text = "";
				}
				else{
					aux_text = aux_text+palavra.charAt(indexPalavra);
				}
				
				indexPalavra++;
			}
			
	        return text;
	    }
	
}
