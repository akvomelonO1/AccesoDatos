package ejemplosClaseFile;
import java.io.*;//HAY QUE IMPORTAR LA LIBRERIA     SIEMPRE      IMPORTAMOS TODA LA LIBRERÍA IO
public class VerDirectorio 
{

	public static void main(String[] args) 
	{
		System.out.println("Ficheros del directorio actual: ");
		
		//CREAMOS UN OBJETO DE LA CLASE FILE LLAMADO f E INDICAMOS LA RUTA ACTUAL EN LA QUE SE ENCUENTRA CON UN .
		File f= new File("."); //con el punto hacemos referencia a la ruta actual del directorio en el que se encuentra el archivo
		
		//ALMACENAMOS LA INFO DEL OBJETO f EN UN ARRAY DE STRINGS LLAMADO archivos 
		String[] archivos =f.list(); 		//¿Qué hace exactamente el list(), imagino que listar el contenido?
		//mostramos la ruta del directorio en forma de lista uno debajo del otro
		
		//FOR QUE RECORRE DESDE i HASTA LA LONGITUD DEL ARRAY, DETERMINADA POR achivos, E IMPRIMIMOS LA INFO ALMACENADA EN archvios EL NUMERO DE VECES QUE INDIQUE i (archivos[i])
		for(int i=0; i<archivos.length;i++)
		{
			
			System.out.println(archivos[i]);
		}
	}

}
