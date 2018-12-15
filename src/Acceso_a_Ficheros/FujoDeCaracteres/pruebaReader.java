/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Acceso_a_Ficheros.FujoDeCaracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//CLASE PRINCIPAL DONDE VA EL MAIN
public class pruebaReader 
{
    public static void main(String []args)
    {
        //CREAMOS UNA INSTANCIA DE LA CLASE SECUNDARIA 
        pruebaLeerFichero prueba1 = new pruebaLeerFichero();
        
        //CON DICHA INSTANCIA LLAMAMOS AL MÉTODO DE ESA CLASE
        prueba1.pruebaleer();
        
    }
}

//CLASE SECUNDARIA DONDE METEMOS LOS MÉTODOS 
class pruebaLeerFichero
{
    //MÉTODO QUE NOS SIRVA PARA LEER 
    void pruebaleer()
    {
        try {
            //BUSCAMOS LA RUTA DEL FICHERO CON LA CLASE FILEREADER
            FileReader fichero1= new FileReader("J:\\JAVA\\AccesoDatos\\src\\Acceso_a_Ficheros\\FujoDeCaracteres\\fichero1.txt");
            
            //LEEMOS EL FICHERO1 CON EL MÉTODO read() QUE NOS LANZA UNA EXCEPCION LA CUAL CAPTURAMOS EN EL CATCH
            int c = fichero1.read();
            // ó int c= 0; ya que realmente leemos el fichero dos veces
            
            //LEEMOS CARACTER A CARACTER EL FICHERO HASTA EL FINAL DE ESTE QUE SE INDICA CON UN -1
            while(c != -1)
            {
                //SI COLOCAMOS EN ESTE ORDEN EL PRIMER CARACTER DEL DOCUMENTO SE LO COME
                /*
                    c= fichero1.read();
                    char letra= (char)c;
                    System.out.print(letra);
                */
                
                //EN CAMBIO SI LO COLOCAMOS DEL SIGUIENTE MODO, SALEN TODOS LOS CARACTERES
                char letra = (char) c; 
                System.out.print(letra);
                c = fichero1.read();
            }
            
            fichero1.close();//CERRAMOS EL FLUJO DE DATOS

        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("No se ha podido encontrar el Fichero en cuestión.");
            
        } 
        catch (IOException ex)
        {
            System.out.println("Excepción capturada al leer el fichero con el Método read");
        }
        
        
    }
    
}
