package ficheros;

import java.io.File;

public class Ej01_Informacion_Propiedades_Fichero {

    public static void main(String[] args) {
        System.out.println("Información del fichero:");
        File f = new File(".\\src\\ficheros"); // ruta donde está el fichero
        if (f.exists()) {
            System.out.println("Nombre del fichero  : " + f.getName()); // nombre del fichero
            System.out.println("Ruta                : " + f.getPath()); // ruta relativa del fichero
            System.out.println("Ruta absoluta       : " + f.getAbsolutePath()); // ruta absoluta del fichero
            System.out.println("Se puede escribir   : " + f.canRead()); // devuelve true si se puede leer y false en caso contrario
            System.out.println("Se puede leer       : " + f.canWrite()); // devuelve true si se puede escribir y false en caso contrario
            System.out.println("Tamaño              : " + f.length()); //tamaño del fichero
            System.out.println("Es un directorio    : " + f.isDirectory());
            System.out.println("Es un fichero       : " + f.isFile());
        }
    }
}
