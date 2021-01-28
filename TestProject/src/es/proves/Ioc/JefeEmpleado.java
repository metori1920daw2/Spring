package es.proves.Ioc;

public class JefeEmpleado implements Empleados {

	public String getTareas() {

		return "Yo soy un empleado jefe";
	}

	@Override
	public String getTareas(String str) {
		// TODO Auto-generated method stub
		return str;
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

}
