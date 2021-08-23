package ficheros;

import java.io.File;

public class Ej02_VerFicheros_y_Directorios_deUnaCarpeta {

    public static void main(String[] args) {
        System.out.println("Archivos que existen en el directorio:");
        File f = new File(".\\src\\ficheros");
        String[] archivos = f.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }
}
