package es.proves.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Empleados emp = new SecretarioEmpleado();
		// Empleados emp = new DirectorEmpleado();

	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Empleados jn = ctx.getBean("LosEmpleados", Empleados.class);
	
		System.out.println(jn.getTareas("soy un jefe"));
		System.out.println(jn.getInforme());
		

		// Inyeccion de dependencias por contructor
		Empleados mr = ctx.getBean("LosSecretarios", Empleados.class);
		System.out.println(mr.getTareas("soy un jefe"));
		System.out.println(mr.getInforme());

		// Inyeccion dependencias por setter
		
		SecretarioEmpleado mt = ctx.getBean("LosSecretarios", SecretarioEmpleado.class);
		System.out.println(mt.getTareas("soy un jefe"));
		System.out.println(mt.getInforme());
		System.out.println(mt.getEmail());
		System.out.println(mt.getNombreEmpresa());
		ctx.close();
	}

}
