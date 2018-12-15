package flujoDatos;

import java.io.*;


public class EscribirBytesFichero 
{

	public static void main(String[] args) throws IOException
	{
		try {
			//CON LA CLASE FILE CREAMOS EL FICHERO ficheroBytes.txt
			File fichero = new File("J:\2º DAM\\Acceso a Datos\\ClaseFile\\src\\flujoDatos\\ficheroBytes.dat");
			
			//LO CREAMOS DE SALIDA PARA PODER ESCRIBIR EN EL FICHERO
			//LO CREAMOS DE ENTRADA PARA PODER LEER EN EL FICHERO
			
			//ABRIMOS EL FLUJO DE SALIDA HACIA EL OBJETO fichero de la clase FILE
			FileOutputStream FileOut = new FileOutputStream(fichero);
			//ABRIMOS EL FLUJO DE ENTRADA HACIA EL OBJETO fichero de la clase FILE
			FileInputStream FileIn = new FileInputStream (fichero);
			
			
			
			int i;//VARIABLE PARA FOR Y WHILE Y RECORRER O LEYENDO O ESCRIBIENDO EL FICHERO
			
			//IMPRIME LOS VALORES DE I EN EL FLUJO DE SALIDA
			for ( i=1; i<100;i++)
			{
				FileOut.write(i);
			}
			FileOut.close();
		
			//LEE LOS VALORES CON EL FLUJO DE ENTRADA
			while( ( i=FileIn.read()) != -1)
			{
				System.out.println(i);
			}
			FileIn.close();
			
			
		}

		catch(FileNotFoundException e)
		{
			System.out.println("ERROR");
		}

	
	
	
	}

	
	
	
}
