package Datos;

public class Persona {

		private String nombre;
		private String apellido;
		private int dni;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getDni() {
			return dni;
		}
		public int setDni(int dni) {
			return this.dni = dni;
		}
		
		public Persona() {
			super();
		}
		public void Persona(String nombre, String apellido, int dni) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			System.out.println("La Nombre Del Persona es: " +nombre+"\n"
					+ "y la Appelido es: "+apellido+"\n"
							+ "y el DNI es: "+dni);
		}
//		@Override
//		public String toString() {
//			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
//		}
//		
}
