package flujoDatos;

import java.io.*;

public class pruebaBorrar 
{

	
	public static void main(String[] args) throws IOException
	{
		//CREAMOS UN OBJETO DE LA CLASE FILE QUE NOS SERVIR� PARA ALMACENAR EL FICHERO QUE QUEREMOS LEER
		File fichero = new File ("J:\\2� DAM\\Acceso a Datos\\ClaseFile\\src\\flujoDatos\\pruebaBorrar.txt");
		
		FileReader fich = new FileReader (fichero);
		
		//DECLARAMOS UNA VARIABLE DE TIPO INT Y EMPLEAMOS EL M�TODO READ QUE LEE
		int i = fich.read();
		//PARA PODER MOSTRAR EL FICHERO HAY QUE LEER HASTA EL FINAL DEL FICHERO CON UN WHILE, PUESTO QUE EL FINAL DEL FICHERO SE IDENTIFICA CON UN -1
		while( i!= -1)
		{
			System.out.println((char)i); //LEE CAR�CTER A CAR�CTER EL FICHERO
			
		}
		fich.close();
	}

}
