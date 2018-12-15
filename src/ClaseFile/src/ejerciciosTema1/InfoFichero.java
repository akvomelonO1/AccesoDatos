package ejerciciosTema1;

//IMPORTAMOS AMBAS LIBRERIAS COMPLETAS CON EL *
import java.io.*;
import java.util.*;

public class InfoFichero
{
	/*1.Crea una clase en JAVA llamada InfoFichero que contenga un método llamado verInfo (nombre_fichero)
	  	y que permita ver la siguiente información del fichero pasado por parámetro:
			Nombre
		    Ruta
			Permisos
	 */
	
	//VARIABLES EJERCICIO 1
	static String nombre;
	static String ruta;
	static boolean permisoLectura ,permisoEscritura, permisoEjecucion;
	
	//VARIABLES DEL EJERCICIO 2
	static String nuevoNombre;
	
	public static void main(String[] args) throws IOException
	{
		
		//CREAMOS UN OBJETO DE ESTA CLASE PARA ALMACENAR EN ÉL LA INFO DEL MÉTODO VERINFO
		InfoFichero fichero1= new InfoFichero();
		//CREAMOS UN OBJETO NUEVO DE ESTA CLASE PARA EL EJERCICIO 2
		InfoFichero fichero2= new InfoFichero();
		
		
		System.out.println("La información del fichero es la siguiente: ");
		
		//LLAMAMOS AL MÉTODO DEL EJERCICIO 1 CON LOS OBJETOS CREADOS DE LA CLASE
		System.out.println("EJERCICIO 1:");
		fichero1.verInfo(null, null, true,true,true);
		System.out.println("\nEl nombre del Fichero es: "+nombre); 
		System.out.println("\nLa ruta del fichero es: "+ruta);
		System.out.println("\nLos permisos del fichero son : \n");
		System.out.println("\t -De lectura: " +permisoLectura );
		System.out.println("\t -De escritura: " +permisoEscritura);
		System.out.println("\t -De ejecución: "+ permisoEjecucion);
		
		//LAMAMOS AL METODO DEL EJERCICIO 2  CON LOS OBJETOS CREADOS DE LA CLASE
		System.out.println("EJERCICIO 2:");
		fichero2.renombrar(nuevoNombre);
	}
	
	//EJERCICIO 1
	public void verInfo(String nombre, String ruta, boolean permisoLectura, boolean permisoEscritura, boolean permisoEjecucion)
	{
		//CREAMOS UN OBJETO DE LA CLASE FILE CON EL QUE BUSCAR LA INFO DEL FICHERO Y EL FICHERO EN SÍ
		File fichero = new File("J:\\2º DAM\\Acceso a Datos\\ClaseFile\\src\\ejerciciosTema1.txt");
		
		if(fichero.exists())//MÉTODO EXISTS QUE DETERMINA SI EXISTE O NO EL FICHERO QUE BUSCAMOS
		{

			//GUARDAMOS EN CADA VARIABLE DEL METODO LA INFO DE CADA MÉTODO INTERNO
			nombre=fichero.getName();
			ruta=fichero.getPath();
			permisoLectura=fichero.canRead();
			permisoEscritura=fichero.canWrite();
			permisoEjecucion=fichero.canExecute();
			
			//IGUALAMOS LA INFO DE LA VARIABLE DEL METODO A LAS VARIABLES DE CLASE
			this.nombre=nombre;
			this.ruta=ruta;
			this.permisoEjecucion=permisoEjecucion;
			this.permisoEscritura=permisoEscritura;
			this.permisoLectura=permisoLectura;
			//subraya en amarillo laas variables de clase para acceder a ellas poniendo el nombre de la clase en lugar del this. debido a que son static, pero no afecta al funcionamiento el cambiarlo o no 

		}
		else
		{
			System.out.println("Error, el fichero no existe.");
		}
		
	}//FIN EJERCICIO 1
	
	//EJERCICIO 2
	/*
	 * 2.	En la clase del ejercicio anterior crea otro método que se llame renombrar(nombre_fichero) que permita renombrar el fichero pasado por parámetro.
	 */
	public void renombrar(String nuevoNombre)
	{
		//CREAMOS UN OBJETO DE LA CLASE SCANNER LLAMADO SC QUE USAREMOS PARA LLAMAR A METODOS Y DEMÁS PROPIOS DE SU CLASE
		Scanner sc= new Scanner(System.in);
		
		//CREAMOS UN OBJETO DE LA CLASE FILE PARA EL NOMBREORIGINAL 
		File fichero1 = new File("J:\\2º DAM\\Acceso a Datos\\ClaseFile\\src\\ejerciciosTema1.txt");
		if(fichero1.exists())
		{
			System.out.println("Introduzca el nuevo nombre: ");
			nuevoNombre=sc.nextLine();
			
			//CREAMOS UN SEGUNDO OBJETO DE FILE DONDE ALMACENAR EL NUEVONOMBRE
			File fichero2 =new File(nuevoNombre);
			if(fichero1.renameTo(fichero2))
			{
				System.out.println("Se ha cambiado el nombre del fichero original ("+fichero1.getName()+") por un nuevo nombre :"+nuevoNombre);
			}
			else
			{
				System.out.println("No se ha podido cambiar el nombre.");
			}
		}
		else
		{
			System.out.println("El fichero no existe.");
		}
		
	}
	

}
