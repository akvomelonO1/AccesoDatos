/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Acceso_a_Ficheros.FujoDeCaracteres;

import java.io.*;

//CLASE PRINCIPAL CON EL MAIN
public class Writer 
{
    public static void main(String [] args)
    {
        //INSTANCIA DE LA CLASE DE ABAJO
        escribirFichero fichero = new escribirFichero();
        
        //LLAMAMOS AL METODO DE LA CLASE DE ABAJO CON LA INSTANCIA U OBJETO CREADO
        fichero.escribir();
        
    }

}
//CLASE SECUNDARIA CON UN METODO QUE NOS PERMITE ESCRIBIR
class escribirFichero
{
    public void escribir()
    {
        //VARIABLE DE TIPO STRING QUE ALMACENAREMOS CARACTER A CARACTER ENE LE FICHERO
        String frase= "Vamos a ver si escribe esta frase y algún numero 43234. ";
        
        try {
            FileWriter fichero2 = new FileWriter("J:\\JAVA\\AccesoDatos\\src\\Acceso_a_Ficheros\\FujoDeCaracteres\\fichero2.txt",true);//ARGUMETNO TRUE QUE NOS PERMITE EN EL CASO DE TENER EL ARCHIVO YA CREADO, ESCRIBIR A CONTINUACION DEL MISMO
            
            //RECORREMOS CON UN FOR HASTA LA DIMENSION DEL STRING E IMPIRMIMOS CARACTER A CARACTER EN EL FICHERO
            for (int i=0; i<frase.length(); i++)
            {
                fichero2.write(frase.charAt(i));//METODO CHARAT DE I
            }
            fichero2.close();
        }
        catch (IOException ex)
        {
            System.out.println("EXCEPCIÓN CAPTURADA POR EL CACTH");
        }
        
    }
}
