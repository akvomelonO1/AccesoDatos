package flujoDatos;
import java.io.*;

public class LeerFicheroBuffer 
{

	public static void main(String[] args) throws IOException
	{
		try {
			BufferedReader fichero = new BufferedReader (new FileReader("J:\\2º DAM\\Acceso a Datos\\ApuntesClaseFile.txt"));
			String linea;
			
				while( (linea = fichero.readLine()) != null )
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

}
