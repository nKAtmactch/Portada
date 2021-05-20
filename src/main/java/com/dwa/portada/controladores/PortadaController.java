package com.dwa.portada.controladores;




import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PortadaController {
	
	
	
	@GetMapping(path = {"/portada","/"})
	public String index() {
		
		return "portada/portada";
	}
	
	

} 