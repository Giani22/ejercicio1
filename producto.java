package supermercado;

public class producto {
	
	String nombre;
	int precio;

	public producto (String nombre,int precio ) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		

	
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
