package flujoDatos;
import java.io.*;
public class LeerFichero
{
		
	public static void main(String[] args) throws IOException
	{
		//CREAMOS UN OBJETO DENOMINADO fichero DE LA CLASE FILE Y ESPECIFICAMOS SU RUTA Y NOMBRE 
		File fichero=new File("J:\\2� DAM\\Programaci�n de servicios y procesos\\acceso_a_datos\\src\\claseFile\\pruebaFichero.txt");
		//CREAMOS TAMBIEN UN OBJETO readFich DONDE ALMACENAREMOS LA INFO DE LECTURA DEL FICHERO DE LA CLASE FILEREADER 
		FileReader readFich = new FileReader(fichero);
		
		//DECLARAMOS UNA VARIABLE DE TIPO INT YA QUE EL M�TODO READ DEVUELVE UN VALOR DE TIPO NUM�RICO, POR ELLO, MIENTRAS SEA DISTINTO DE -1 QUE INDICA QUE EL FICHERO NO SE HA PODIDO LEER EJECUTA EL WHILE
		
		int i = readFich.read();
		while( i !=  -1)
		{
			System.out.println((char)i);//IMPRIME CAR�CTER A CAR�CTER EL CONTENIDO DEL FICHERO 
			readFich.close();
		}
		
	}

}
