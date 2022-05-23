package Datos;



public class Autoparte {

String Categoria;
String Id_producto;
String nombreproducto;




///CONSTRUCTOR

public Autoparte(String categoria, String id_producto, String nombreproducto) {
	super();
	this.Categoria = categoria;
	this.Id_producto = id_producto;
	this.nombreproducto = nombreproducto;
}


///getset

public Autoparte() {
	super();
}
public String getCategoria() {
	return Categoria;
}
public void setCategoria(String categoria) {
	Categoria = categoria;
}
public String getId_producto() {
	return Id_producto;
}
public void setId_producto(String id_producto) {
	Id_producto = id_producto;
}
public String getNombreproducto() {
	return nombreproducto;
}
public void setNombreproducto(String nombreproducto) {
	this.nombreproducto = nombreproducto;
}

@Override
public String toString() {
	return "Autopartes \nNombredelproducto: " + nombreproducto + "\nCategoria: " + Categoria + "\nId_producto: " + Id_producto
			+ "\n";
}

}
