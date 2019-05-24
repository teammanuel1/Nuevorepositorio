
public class Persona {
	int edad;
	double altura;
	String nombre;
	
	public Persona(int edad, String nombre, double altura) {
		this.edad = edad;
		this.altura = altura;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + "]";
	}

	
	
}


