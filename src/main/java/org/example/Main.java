package org.example;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
       File FicheroNombre = new File("./Chaima.txt");
         if(!FicheroNombre.exists()){
            try {
                if (FicheroNombre.createNewFile()) {
                    System.out.println("fichero creado correctamente");
                } else {
                    System.out.println("No se ha podido crear el fichero");

                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Ya existe el fichero");
        }

        //creo la carpeta
        //con rename tambien se puede hacer
        File carpeta1 = new File("./Carpeta_1");
        carpeta1.mkdir();
        try {
            //muevo el fichero del directorio raiz a la carpeta recien creafa
            Files.move(Paths.get(FicheroNombre.getAbsolutePath()),
                    Paths.get(carpeta1.getAbsolutePath()+"\\Chaima.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ec) {
            System.out.println("Error al mover "+ec.getMessage());
        }   */

        //buscar de forma recursiva el fichero por su nombre
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero a buscar");
        String fichero = leer.nextLine();
       BuscarFichero(fichero);

    }
    //recurvidad en cola, ver q es
    public static void BuscarFichero(String fichero){
        //buscar el fichero dentrp de cada
    }


}