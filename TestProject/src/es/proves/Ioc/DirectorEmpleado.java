package es.proves.Ioc;

public class DirectorEmpleado implements Empleados {

	
	
	private  CreacionInforme informeNuevo;
	
	// creació de contructor  para inyectar dependencias
	public DirectorEmpleado(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	@Override
	public String getTareas(String str) {
		// TODO Auto-generated method stub
		return str;
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado  por el director:"+ informeNuevo.getInforme();
	}

}
