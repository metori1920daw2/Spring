package es.proves.Ioc;

public class SecretarioEmpleado implements Empleados {

	
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	@Override
	public String getTareas(String str) {
		// TODO Auto-generated method stub
		return str;
	}



	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado  por el secretario:"+ informeNuevo.getInforme();
	}
	
	public void setInformeNuevo(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private  CreacionInforme informeNuevo;
	
	private String Email; 
	private String nombreEmpresa;
}
