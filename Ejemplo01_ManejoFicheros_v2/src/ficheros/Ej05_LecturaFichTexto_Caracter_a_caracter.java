package ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej05_LecturaFichTexto_Caracter_a_caracter {

    private static int i;

    public static void main(String[] args) throws IOException {
        File fichero = new File(".\\src\\Ficheros\\Prueba\\FichTexto.txt");   //declarar del fichero de texto
        FileReader fic = new FileReader(fichero);               //crear el flujo de entrada   
        char b[] = new char[150];
        while ((i = fic.read(b)) != -1) //Lectura caracter a carácter hasta llegar al fin
        {
            System.out.println(b);
        }
        fic.close();                          //cerrar fichero   
    }
}
