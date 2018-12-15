package flujoDatos;

import java.io.*;
import java.io.IOException;

public class EscribirFicheroAleatorio
{

	public static void main(String[] args) throws IOException
	{
		//OBJETO DE LA CLASE FILE PARA CREAR EL ARCHIVO
		File fichero = new File("J:\\2º DAM\\Acceso a Datos\\ClaseFile\\src\\flujoDatos\\ficheroAleatorio.txt");
		//CLASE QUE NOS PERMITE ACCEDER DE MANERA ALEATORIA AL FICHERO Y ABRIR DE LECTURA Y ESCRITURA (RW)
		RandomAccessFile file1 = new RandomAccessFile(fichero, "rw"); //Creates a random access file stream to read from, and optionally to write to, the file specified by the File argument
		
		String nombres[]= {"Laura","Juan","Pepe"};
		int departamento[]= {10,2,17};
		double salario[]= {3000,1800,4000};
		
		StringBuffer bufferNombres= null; //INICIALIZAMOS EL BUFFER EN EL QUE VAMOS A ALMACENAR LOS NOMBRES DEL ARRAY
		int n=nombres.length; // GUARDA LA LONGITUD DEL ARRAY NOMBRES EN LA VARIABLE N QUE LA EMPLEAREMOS EN EL FOR A ALA HORA DE GRABAR LA INFO EN EL FILE1 DE MANERA ALEATORIA
		for(int i=0;i<n;i++)
		{
			file1.writeInt(i+1);
			bufferNombres= new StringBuffer(nombres[i]);//CREAMOS UN BUFFER DE STRINGS QUE NOS ALMACENE LOS NOMBRES DEL ARRAY
			bufferNombres.setLength(10);// DETERMINA LA LONGITUD DEL BUFFER EN EL QUE ALMACENAMOS EL ARRAY DE NOMBRES
			file1.writeInt(departamento[i]);//ESCRIBE EL ARRAY DE DEPARTAMENTO EL NUMERO DE VECES QUE DETERMINE LA LONGITUD DEL PRIMER ARRAY(NOMBRES)
			file1.writeDouble(salario[i]);//ESCRIBE EL ARRAY DE SALARIO EL NUMERO DE VECES QUE DETERMINE LA LONGITUD DEL PRIMER ARRAY(NOMBRES)
						
		}
		
		System.out.println("La información se ha grabado correctamente.");
		file1.close();
	}

}


//AL CONSULTAR EL ARCHIVO TXT CREADO APARECEN UNA SERIE DE CARACTERES EXTRAÑOS COMO @ Y DEMÁS