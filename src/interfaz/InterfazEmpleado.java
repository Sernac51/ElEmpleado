package interfaz;

import mundo.Empleado;

public class InterfazEmpleado {

	public static void main(String[] args) 
	{
		Empleado empleado1; 
		
		empleado1 = new Empleado( "Laura Maldonado", 1110446617, "Manzana F casa 78 fuentes del salado", 5000000.0, 4.0);
		
		System.out.println(empleado1.getNombre( ));
	}

}
