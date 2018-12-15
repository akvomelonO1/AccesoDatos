package flujoDatos;
import java.io.*;

public class EscribirFichero
{

	public static void main(String[] args) throws IOException
	{
		
		//ABRIMOS UN OBJETO LLAMADO FICHERO, DE LA CLASE FILE EN LA RUTA ESPECIFICADA
		File fichero = new File("J:\\2� DAM\\Acceso a Datos\\FicheroEscritura.txt");
		
		//CREAMOS UN OBJETO LLAMADO fichEscrit DE LA CLASE FILEWRITER EN EL ARCHIVO fichero
		FileWriter fichEscrit =new FileWriter (fichero);//ABRIMOS EL FICHERO
		
		String cadena ="Prueba de escritura";//PROBAMOS A METERLE CONTENIDO DENTRO DEL FICHERO
		
		char [] cadChar= cadena.toCharArray();//CONVERTIMOS LA cadena INTRODUCIDA EN EL FICHERO, EN CARACTERES CON EL M�TODO TOCHARARRAY()
		
		//RECORREMOS LA CADENA CHAR A CHAR HASTA EL FINAL PARA ESCRIBIR EN EL fichEscrit, MEDIANTE EL M�TODO WRITE LA CADENA DE CARACTERES CREADA
		for(int i=0; i<cadChar.length;i++)
		{
			fichEscrit.write(cadChar[i]);//M�TODO WRITE PARA ESCRIBIR EN EL FICHERO
		}
		
		fichEscrit.append('*');//M�TODO PARA A�ADIR CONTENIDO AL FINAL DEL fichEscrit
		
		fichEscrit.close();//CERRAMOS EL FICHERO
		
	}

}


