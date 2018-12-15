
package Acceso_a_Ficheros.FujoDeCaracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;//importamos la libreria FileReader necesaria para leer.
import java.io.IOException;


/*LECTURA DE UN FICHERO ALMACENADO EN EL ESCRITORIO
  CONTIENE UNA SERIE DE CARCATERES (LETRAS) QUE 
  LEEREMOS CON LA CLASE CORRESPONDIENTE Y 
  POSTERIORMENTE REALIZAREMOS UN CASTING
  DE ENTERO A CHAR, PARA PODER LEER DICHOS CARACTERES*/

/*SI NO SEPARAMOS EL PRINCIPIO DEL FICHERO CON UN ESPACIO NO LO LEE CORRECTAMENTE
  POR ESO EL TXT TIENE UN ESPACIO JUSTO ANTES DE EMPEZAR A ESCRIBIR*/

//CREAMOS UNA CLASE PRINCIPAL DONDE METEREMOS EL MAIN Y LLAMAREMOS A LA CLASE
//SECUNDARIA CON SU CORRESPONDIENTE MÉTODO
public class Reader 
{    
    public static void main(String [] args)
    {
        leerFichero lectura = new leerFichero();
        
        lectura.leer();
    }

}


//CREAMOS UNA CLASE SECUNDARIA DONDE REALIZAREMOS EL ACCESO AL FICHERO EN 
//CUESTIÓN Y UTILIZAREMOS LOS DIFRENTES METODOS REQUERIDOS.

class leerFichero
{
    
    //creamos un método que nos permita leer el fichero
        void leer()
        {
            //puesto esta clase genera una excepción, debemos controlarla
            try 
            {
                //para leer el fichero, debemos utilizar la clase FileReader
                FileReader fichero1 = new FileReader("J:\\JAVA\\AccesoDatos\\src\\Acceso_a_Ficheros\\FujoDeCaracteres\\fichero1.txt");
                
                int c= fichero1.read();//almacenamos en una variable el contenido del fichero, de tipo entero ya que el final del fichero lo detcta
                //como si fuera un -1, si luego queremos leer la info de esa variable, debemos hacer un casting de esa variable convirtiendola a char
                
                while(c!= -1)//leemos hasta que c sea == a -1 que indicará que es el final del fichero
                {
                    c=fichero1.read();//leemos de nuevo c para saber si es == -1
                    char letra= (char) c;//hacemos el casting
                    System.out.print(letra);//imprimimos caracter a caracter
                }
               fichero1.close();//cerramos el flujo de datos abierto en el try, por ello no hace falta colocarlo en un finally, ya que solo se abriria e flujo dedatos al entrar en el try
            } 
            catch (FileNotFoundException ex) //la excepción es fileNotFoundException e indica que no se ha encontrado el fichero, corresponde a FileReader
            {
                System.out.println("El fichero no se ha encontrado.");
            }
            catch(IOException e)
            {
                System.out.print("Excepción controlada.");//SE COGE ESTA EXCEPCION EN AL EMPLEAR EL MÉTODO.READ()
            }
        }

}