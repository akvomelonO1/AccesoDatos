/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repaso;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Random1 
{

    static Scanner sc = new Scanner(System.in);
    static RandomAccessFile fichero = null;

    public static void main(String[] args) 
    {
        String palabra;
        try 
        {
            //se abre el fichero para lectura y escritura
            fichero = new RandomAccessFile("J:\\JAVA\\AccesoDatos\\src\\repaso\\ejer1.txt", "rw");
            mostrarFichero(); //muestra el contenido original del fichero
            
            System.out.print("Introduce un número entero para añadir al final del fichero: ");
            palabra = sc.nextLine(); //se lee el entero a añadir en el fichero
            
            fichero.seek(fichero.length()); //nos situamos al final del fichero
            
            fichero.writeChars(palabra);//se escribe el entero
            
            mostrarFichero();//muestra el contenido del fichero después de añadir el número

        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        } 
        finally 
        {
            try 
            {
                if (fichero != null)
                {
                    fichero.close();
                }
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void mostrarFichero() throws IOException 
    {
        String n=" ";
        int pepe;
        try
        {
            fichero.seek(0); //Nos coloca en la linea que queramos empezar a leer/escribir en el fichero
            while(!n.equals(""))//!=
            {
                
                
                System.out.println(n);  //se muestra en pantalla
                n = fichero.readLine();  //se lee  un entero del fichero

            }
        } 
        catch (EOFException e) 
        {
            System.out.println("Fin de fichero" + fichero.readChar());
        } 
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (NullPointerException e)
        {
            
        }
    }
}