package Negocio;


import java.util.LinkedList;

import Datos.Autoparte;
import IU.Interfaz;

public class Almacen{
	
	private int Stock;
	private int id_Parte;
	
	public static void main(String[] args) {
		Interfaz i1 = new Interfaz();
		i1.Login();
	}

	LinkedList<Autoparte> Producto = new LinkedList<Autoparte>();

	public boolean add(Autoparte autoparte) {
		char [] letras = autoparte.getNombreproducto().toCharArray();
		String categoria = autoparte.getCategoria();
		letras= categoria.toCharArray();
		String Id_prdocuto = autoparte.getId_producto();
		letras = Id_prdocuto.toCharArray();
		Producto.add(autoparte);
		return true;
	}
	
	public Autoparte buscar(String Id_producto) {
		Autoparte autoparte = new Autoparte();
		for (int i = 0; i < Producto.size(); i++) {
			System.out.println(Producto.get(i));
           autoparte=Producto.get(i);
           //System.out.println(alumno.getDni());
           //System.out.println("Dni ");
           //System.out.println(dni);
           String aux = autoparte.getId_producto();
  
           if(aux.equals(Id_producto)) {
        	   //System.out.println("Lo encontr�");
        	   return autoparte ;        	   
           }
		}
		String aux = "0";
		autoparte.setId_producto(aux);
		//System.out.println("no encontre");
		return autoparte ;
	}
	
	public boolean Borrar(Autoparte autoparte) {
		
		if(Producto.remove(autoparte)) {			
			return true; 
		}else {			
			return false;
		}
	}
	
	public boolean Editar(Autoparte autoparte){
		int index = IndexAutoparte(autoparte);
		Producto.set(index, autoparte);
		return true;
	}
	
	private int IndexAutoparte(Autoparte autoparte) {
		// TODO Auto-generated method stub (error en editar)
		return 0;
	}
	
	public int IndexAlumno(Autoparte autoparte){
		Autoparte aux2 = new Autoparte();
		for (int i = 0; i < Producto.size(); i++) {
			System.out.println(Producto.get(i));
           aux2=Producto.get(i);
           String aux = aux2.getId_producto();
           if(aux.equals(autoparte.getId_producto())) {
        	   return i ;   
           }
		}
		return 0;
	
	}
	
	public LinkedList<Autoparte> getautoparte() {
		return Producto;
	}

	public void setUsuarios(LinkedList<Autoparte> autoparte) {
		Producto = autoparte;
	}

	@Override
	public String toString()	{
		return "Listado [Productos=" + Producto + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
