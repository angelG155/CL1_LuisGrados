package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadoService;
import org.cibertec.edu.pe.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService obj;
	
	
	@GetMapping("/listar")
	public String Listar(Model m) {
		
		List<Empleado> list = obj.ListadoEmpleado();
		
		m.addAttribute("listaE", list);
		
		return "index";
		
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("Empleado", new Empleado());
		
		return "/agregar";
	}
	
	@GetMapping("/grabar")
	public String grabar(Empleado e, Model m) {
		obj.AgregarEmpleado(e);
		
		return "redirect:/listar";
	}

}
