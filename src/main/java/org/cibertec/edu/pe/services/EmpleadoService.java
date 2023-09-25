package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadoService;
import org.cibertec.edu.pe.interfaces.IEmpleado;
import org.cibertec.edu.pe.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService implements IEmpleadoService{
	
	@Autowired
	private IEmpleado obj;

	@Override
	public List<Empleado> ListadoEmpleado() {
		
		return obj.findAll();
	}

	@Override
	public int AgregarEmpleado(Empleado e) {
	
		int res = 0;
		
		Empleado objE = obj.save(e);
		
		if(!objE.equals(null)) res = 1;
		
		return res;
	}

}
