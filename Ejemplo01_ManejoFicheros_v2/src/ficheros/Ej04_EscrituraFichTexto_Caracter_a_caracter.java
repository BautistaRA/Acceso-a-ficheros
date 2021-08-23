package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ej04_EscrituraFichTexto_Caracter_a_caracter {

    public static void main(String[] args) throws IOException {
        File fichero = new File(".\\src\\Ficheros\\Prueba\\FichTexto.txt"); //declaración del fichero y ruta donde se guarda        
        FileWriter fic = new FileWriter(fichero, true);             //flujo de salida       
        String cadena = "Ejemplo de escritura en un fichero de texto o txt";
        char[] cad = cadena.toCharArray(); //convierte la cadena en array de caracteres
        for (int i = 0; i < cad.length; i++) {
            fic.write(cad[i]);         //se va escribiendo un carácter
        }
        fic.append('.');           //añado al final un .
        
        fic.close();               //cerrar fichero 
    }
}
