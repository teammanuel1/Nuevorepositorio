/**
 * 
 * Clase que representa una persona
 * @version 1.0
 * @author Manuel Rios, Alejandro Basso y Alejandro Chaves
 *
 */
public class Persona {
	int edad;
	double altura;
	String nombre;
	/**
	 * Metodo encargado de crear la clase persona con edad, nombre y altura como parametros determinados
	 * @param edad edad de la persona
	 * @param nombre nombre de la persona
	 * @param altura altura de la persona
	 */
	
	public Persona(int edad, String nombre, double altura) {
		this.edad = edad;
		this.altura = altura;
		this.nombre = nombre;
	}
	/**
	 *  Metodo para obtener la información de la edad
	 * @return edad de la persona
	 */

	public int getEdad() {
		return edad;
	}
	/**
	 * Metodo para introducir la información de la edad
	 * @param edad edad de la persona
	 */

	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Metodo para obtener la información de la altura
	 * @return altura de la persona
	 */
	
	public double getAltura() {
		return altura;
	}
	/**
	 * Metodo para introducir la información de la altura como un double
	 * @param altura altuda de la persona
	 */

	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * Metodo para obtener la información del nombre de la persona
	 * @return nombre de la persona
	 */

	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo para introducir la información del nombre
	 * @param nombre de la persona
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	/**
	 * Metodo que devuelve un string con la informacion de la persona
	 * @return devuelve edad, altura y nombre de la persona
	 */
	public String toString() {
		return "Persona [Edad=" + edad + ", Altura=" + altura + ", Nombre=" + nombre + "]";
	}

	
	
}


