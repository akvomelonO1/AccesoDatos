package ejemplosClaseFile;
import java.io.*;
public class VerInfoFichero 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Mostrar información sobre el fichero: ");
		
		//EN EL OBJETO f DE LA CLASE FILE GUARDAMOS LA RUTA Y EL ARCHIVO.JAVA EN CUESTIÓN, SI NO PONEMOS RUTA Y PONESMOS UN . NOS COGE LA RUTA EN LA QUE ESTAMOS TRABAJANDO
		File f= new File("J:\\2º DAM\\Acceso a Datos\\ApuntesClaseFile.txt");
		
		if(f.exists())
		{
			System.out.println("El nombre del archivo es: " +f.getName());//MÉTODO DE LA CLASE FILE (SIMPLEMENTE HAY QUE LLAMARLOS) QUE DEVUELVE EL NOMBRE DEL ARCHIVO
			System.out.println("La ruta: " +f.getPath()); // MÉTODO DE LA CLASE FILE QUE DEVUELVE LA RUTA
			System.out.println("El tamaño: " +f.length()); //MÉTODO  DE LA CLASE FILE QUE DEVUELVE EL TAMAÑO DEL ARCHIVO
			
		}
		else
		{
			System.out.println("Archivo no encontrado.");
		}
	}

}
