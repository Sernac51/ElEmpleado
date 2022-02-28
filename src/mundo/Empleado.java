package mundo;

public class Empleado 
{
	//-----------------------------------------------------
	// Atributos
	//-----------------------------------------------------
	private String nombre;
	private int cedula;
	private String direccion;
	private double salarioBase;
	private double porcentajeRetencion;

	
	//-----------------------------------------------------
	// Constructor
	//-----------------------------------------------------
	
	public Empleado(String pNombre, int pCedula, String pDireccion, double pSalarioBase, double pPorcentajeRetencion)
	{
		nombre = pNombre;
		cedula = pCedula;
		direccion = pDireccion;
		salarioBase = pSalarioBase;
		porcentajeRetencion = pPorcentajeRetencion;		
	}
	
	//-----------------------------------------------------
	// Métodos de acceso 
	//-----------------------------------------------------

	public double calcularDescuento( )
	{
		return salarioBase * porcentajeRetencion / 100;
		
	}
	public double calcularSalarioPorPagar( )
	{
		return salarioBase - calcularDescuento( );
	}
	
	// get xD
	
	public String getNombre( )
	{
		return nombre;
	}
	public int getCedula( )
	{
		return cedula;
	}
	public String getDireccion( )
	{
		return direccion;
	}
	public double getSalarioBase( )
	{
		return salarioBase;
	}
	public double getPorcentajeRetencion( )
	{
		return porcentajeRetencion;
	}
	
	// set :)
	
	public void setNombre(String pNombre)
	{
		nombre = pNombre;
	}
	
	public void setCedula(int pCedula)
	{
		cedula = pCedula;
	}
	public void setDireccion(String pDireccion)
	{
		direccion = pDireccion;
	}
	public void setSalarioBase(double pSalarioBase)
	{
		salarioBase = pSalarioBase;
	}
	public void setPorcentajeRetencion(int pPorcentajeRetencion)
	{
		porcentajeRetencion = pPorcentajeRetencion;
	}

	
}
