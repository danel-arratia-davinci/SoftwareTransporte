package IU;

import java.util.Scanner;


import Datos.Autoparte;

import Negocio.Listado;

public class Interfaz {
	
	static Scanner entrada = new Scanner(System.in);
	
	static Listado legajo = new Listado();
	
	
	///METODOS
	public void Login() {
		
		SobreCarga();
		System.out.println("Bienvenido");
		imprimirMenu();
	}
	
	
	private void SobreCarga() {
		Autoparte autoparte = new Autoparte();
		autoparte.setNombreproducto("Rueda");
		autoparte.setId_producto("1");
		autoparte.setCategoria("coche");
		legajo.add(autoparte);
	}
	
	
	private void imprimirMenu() {
		System.out.println("Por favor escoja una de las siguientes opciones");
		System.out.println("Para acceder a la opción escriba el numero que corresponda");
		System.out.println("1.Ingresar Producto ");
		System.out.println("2.Ver Productos");
		System.out.println("3.Buscar Productos");
		System.out.println("4.Salir");
		
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1: Ingresar();
			break;
		case 2: verPerfiles();
			break;
		case 3: Buscar();
			break;
		case 4: Salir();
			break;
			default: System.out.println("Se eligio una opción incorrecta volver a intentar");
				break;
			}
	}
	
	
	
	private void Ingresar() {
		System.out.println("Ingrese nombre de Autoparte");		
		System.out.println("Debe ser un nombre de minimo 3 letras y maximo 60");
		Autoparte autoparte = new Autoparte();
		autoparte.setNombreproducto(entrada.next());
		System.out.println("Ingrese Categoria");
		System.out.println("Debe ser una categoria de minimo 3 letras y maximo 60");
		autoparte.setCategoria(entrada.next());
		System.out.println("Ingrese el Id de Autoparte: ");
		autoparte.setId_producto(entrada.next());
		 if(legajo.add(autoparte)== true) {
			 System.out.println("Se agrego correctamente la Autoparte");
		 }else {
			 System.out.println("no se pudo agregar correctamente");
				System.out.println("si deseas agregar nuevamente una Autoparte ");
				System.out.println("seleccionar opcion 1");	
		 }
		 imprimirMenu();
		 
	}
	
	private void Buscar() {
		System.out.println("Ingrese Id del producto a buscar");
		String Id_producto = entrada.next();
		Autoparte autoparte = new Autoparte();
		autoparte = legajo.buscar(Id_producto); 
		if(autoparte.getId_producto() == "0" ) {
			System.out.println("el producto no se encontro");
		}else {
			System.out.println("El Producto es");
			System.out.println(autoparte);
			menuAlter(autoparte);
		}
		 imprimirMenu();
	}
	private void menuAlter(Autoparte autoparte) {

		System.out.println("1.Borrar producto ");
		System.out.println("2.Editar producto");
		System.out.println("3.Menu principal");
		
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1: Borrar(autoparte);
			break;
		case 2: Editar(autoparte);
			break;
		case 3: imprimirMenu();
			break;
			default: System.out.println("Se eligio una opción incorrecta volver a intentar");
				break;
			}
	}
	
	
	private void Borrar(Autoparte autoparte) {
		System.out.println("Esta seguro de querer borrar a "+ autoparte+ "?");
		System.out.println("si esta seguro presione 1");
		int aux = entrada.nextInt();
		if(aux ==1) {
			if(legajo.Borrar(autoparte)) {
				System.out.println("se borro exitosamente");
			}
		}else {
			imprimirMenu();
		}
	}
	
	private void Editar(Autoparte autoparte) {
		System.out.println("Ingrese el nombre del producto");		
		System.out.println("Debe ser un nombre de minimo 3 letras y maximo 60");
		autoparte.setNombreproducto(entrada.next());
		System.out.println("Ingrese la categoria");
		System.out.println("Debe ser un apellido de minimo 3 letras y maximo 60");
		autoparte.setCategoria(entrada.next());
		if(legajo.Editar(autoparte)) {
			System.out.println("El Producto se pudo editar correctamente");
		}else {
			System.out.println("no se pudo editar el Producto");
		}
		
		 imprimirMenu();
	}
	
	private void verPerfiles() {
		System.out.println(legajo);
		imprimirMenu();
		
	}
	
	
	
	private void Salir() {
		System.out.println("El programa finalizo");
		System.exit(0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
