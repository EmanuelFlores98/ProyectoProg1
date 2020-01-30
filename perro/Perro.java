package perro;

public class Perro{
String raza;
String nombre;
String tamaño;
int edad;

public Perro(){

}

public Perro (String raza, String nombre, String tamaño, int edad){
this.raza = raza;
this.nombre = nombre;
this.tamaño = tamaño;
this.edad = edad;
}

public void mostrardatos(){
System.out.println(" La raza del perro es: " + raza);
System.out.println(" El nombre del perro es: " + nombre);
System.out.println(" El tamaño del perro es: " + tamaño);
System.out.println(" La edad del perro es: " + edad);
}

public static void main (String [] args){
Perro pe = new Perro();
pe.raza = "Bulldog";
pe.nombre = "Rex";
pe.tamaño = "Mediano";
pe.edad = 6;
pe.mostrardatos();

Perro perrito = new Perro("Poodle", "Duke", "Pequeño", 8);
perrito.mostrardatos();
}
}