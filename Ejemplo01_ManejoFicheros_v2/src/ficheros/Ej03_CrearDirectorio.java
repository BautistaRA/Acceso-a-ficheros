package ficheros;

import java.io.File;
import java.io.File;
import java.io.IOException;

public class Ej03_CrearDirectorio {

    public static void main(String[] args) {
        File d = new File(".\\src\\Ficheros\\Prueba"); //directorio que creo a partir del actual

        d.mkdir();//CREAR DIRECTORIO
        System.out.println("Directorio creado");

    }
}
