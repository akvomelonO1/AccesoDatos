package ejemplosClaseFile;
import java.io.*;
public class VerInfoFichero 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Mostrar informaci�n sobre el fichero: ");
		
		//EN EL OBJETO f DE LA CLASE FILE GUARDAMOS LA RUTA Y EL ARCHIVO.JAVA EN CUESTI�N, SI NO PONEMOS RUTA Y PONESMOS UN . NOS COGE LA RUTA EN LA QUE ESTAMOS TRABAJANDO
		File f= new File("J:\\2� DAM\\Acceso a Datos\\ApuntesClaseFile.txt");
		
		if(f.exists())
		{
			System.out.println("El nombre del archivo es: " +f.getName());//M�TODO DE LA CLASE FILE (SIMPLEMENTE HAY QUE LLAMARLOS) QUE DEVUELVE EL NOMBRE DEL ARCHIVO
			System.out.println("La ruta: " +f.getPath()); // M�TODO DE LA CLASE FILE QUE DEVUELVE LA RUTA
			System.out.println("El tama�o: " +f.length()); //M�TODO  DE LA CLASE FILE QUE DEVUELVE EL TAMA�O DEL ARCHIVO
			
		}
		else
		{
			System.out.println("Archivo no encontrado.");
		}
	}

}
