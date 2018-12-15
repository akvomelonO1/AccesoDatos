package ejerciciosTema1;

import java.awt.Desktop;
import java.io.*;//IMPORTAMOS TODA LA LIBRERIA IO Y ASÍ NOS CUBRIMOS
import java.util.Scanner;

public class Binarios 
{
	/*4. Repite el ejercicio anterior para el caso de ficheros binarios (usar RandomAccessFile).*/

	public static void main(String[] args) throws IOException
	{
		//CREAMOS UN MENU CON OPCIONES Y EN FUNCIÓN DE LA OPCIÓN QUE ESCOJA QUE HAGA UN MÉTODO U OTRO
		
				int opcion;
				FicheroStream llamadas = new FicheroStream();//objeto para realizar llamadas al método opciones
				
				Scanner sc= new Scanner(System.in);
				
				
				llamadas.menuOpciones();
				System.out.println("\nIntroduzca una opción (pulse 0 para salir):");
				opcion=sc.nextInt();
				
				while(opcion != 0)
				{
					if(opcion==1)
					{
						crearFichero();
					}
					else if(opcion==2)
					{
						abrirFichero();
					}
					else if(opcion==3)
					{
						cerrarFichero();
					}
					else if(opcion==4)
					{
						leerFichero();
					}
					else if(opcion==5)
					{
						escribirFichero();
					}
				
					
					llamadas.menuOpciones();
					System.out.println("\n Introduzca de nuevo una opción (pulse 0 para salir):");
					opcion=sc.nextInt();
				}
				System.out.println("Fin del programa, hasta pronto.");
				return;
				
			}
			
		public static void menuOpciones()
		{
			System.out.println("INTERACCIÓN CON FICHEROS");
			System.out.println("");
			System.out.println("-Crear Fichero------(pulse 1) ");
			System.out.println("-Abrir Fichero------(pulse 2) ");
			System.out.println("-Cerrar Fichero-----(pulse 3) ");
			System.out.println("-Leer Fichero-------(pulse 4) ");
			System.out.println("-Escribir Fichero---(pulse 5) ");
		}


		//LOS THROWS SE PONEN EN CADA MÉTODO ??
		public static void crearFichero() throws IOException 
		{
			File fichero= new File("J:\\2º DAM\\Acceso a Datos\\ClaseFile\\src\\ejerciciosTema1\\ejercicio3.txt");
			RandomAccessFile file1 = new RandomAccessFile(fichero, "rw");
			try 
				{
					 //COMPROBAMOS SI EL FICHERO EXISTE O NO
					  if(fichero.exists())
					  {
						  System.out.println("YA EXITE EL FICHERO");
						  return;
					  }
					  
					//CREAMOS EL FICHERO EN LA RUTA ESPECIFICADA
					  if (fichero.createNewFile())
					  {
						  System.out.println("El fichero se ha creado correctamente");
					  }
					  else
					  {
						  System.out.println("No se ha podido crear el fichero");
					  }
					  
				}
			catch (IOException ioe)
				{
				  System.out.println("No se ha creado el fichero, debido a una excepcion referida en este método: ioe.printStackTrace();");
				}
			
			return;
		}
		
		public static void abrirFichero()throws IOException
		{
			File fichero= new File("J:\\2º DAM\\Acceso a Datos\\ClaseFile\\src\\ejerciciosTema1\\ejercicio3.txt");
			// IMPORTAMOS LA CLASE DESKTOP QUE JUNTO CON LA FILE NOS PERMITIRÁ ABRIR EL FICHERO MEDIANTE EL METODO GETDESKTOP Y OPEN
			Desktop abrirFichero = Desktop.getDesktop();
			try 
			{
				abrirFichero.open(fichero);
		    }
			catch (IOException e) 
			{
				System.out.println("Error abriendo el Fichero.");
		    }
		}
		
		public static void cerrarFichero() throws FileNotFoundException
		{
			
		    BufferedReader fichero = new BufferedReader (new FileReader("J:\\2º DAM\\Acceso a Datos\\ClaseFile\\src\\ejerciciosTema1\\ejercicio3.txt")); 
		    try
			{
		    	if( fichero != null )
		    	{   
		    		System.out.println("Se ha cerrado el fichero.");
		    		fichero.close();    
		        }               
				
			}
			catch(Exception e2)
			{
		            e2.printStackTrace();
			}
			
		}
		
		public static void leerFichero() throws FileNotFoundException
		{
			try {
						
				//CON LA CLASE BUFFEREDREADER LEEMOS EL ARCHIVO ENTERO EN LUGAR DE IR CARACTER A CARACTER CON EL FILEREADER
				//REALMENTE ALMACENAMOS EN EL BUFFER DE LEERFICH LA LECTURA CARACTER A CARACTER QUE HACE DESPUÉS DENTRO EL NEW FILEREADER
				BufferedReader fichero = new BufferedReader(new FileReader("J:\\2º DAM\\Acceso a Datos\\ClaseFile\\src\\ejerciciosTema1\\ejercicio3.txt"));
				String linea;
				//método que lee lineas de texto del fichero, 
				
					while( (linea = fichero.readLine()) != null)
					{
						System.out.println(linea);
					}
					fichero.close();
					
				}

				catch(FileNotFoundException fn)
				{
					System.out.println("No se encuentra el fichero.");
					
				}
				catch (IOException io)
				{
					System.out.println("Error de E/S");
				}
			
		}
		
		
		public static void escribirFichero() throws IOException
		{
			
			//ABRIMOS UN OBJETO (EN EL CUAL GUARDAMOS UN ARCHIVO TXT) LLAMADO FICHERO, DE LA CLASE FILE EN LA RUTA ESPECIFICADA
			File fichero= new File("J:\\2º DAM\\Acceso a Datos\\ClaseFile\\src\\ejerciciosTema1\\ejercicio3.txt");
			
			//CREAMOS UN OBJETO LLAMADO fichEscrit DE LA CLASE FILEWRITER EN EL ARCHIVO fichero, QUE NOS SIRVE PARA ABRIR EL FICHERO
			FileWriter fichEscrit =new FileWriter (fichero);//ABRIMOS EL FICHERO
			
			String cadena ="Prueba de escritura";//PROBAMOS A METERLE CONTENIDO DENTRO DEL FICHERO
			
			char [] cadChar= cadena.toCharArray();//CONVERTIMOS LA cadena INTRODUCIDA EN EL FICHERO, EN CARACTERES CON EL MÉTODO TOCHARARRAY()
			
			//RECORREMOS LA CADENA CHAR A CHAR HASTA EL FINAL PARA ESCRIBIR EN EL fichEscrit, MEDIANTE EL MÉTODO WRITE LA CADENA DE CARACTERES CREADA
			for(int i=0; i<cadChar.length;i++)
			{
				fichEscrit.write(cadChar[i]);//MÉTODO WRITE PARA ESCRIBIR EN EL FICHERO
			}
			
			fichEscrit.append('*');//MÉTODO PARA AÑADIR CONTENIDO AL FINAL DEL fichEscrit
			
			System.out.println("Se ha introducido correctamente la información en el fichero.");
			
			fichEscrit.close();//CERRAMOS EL FICHERO
					
		}
		
		
	
}
