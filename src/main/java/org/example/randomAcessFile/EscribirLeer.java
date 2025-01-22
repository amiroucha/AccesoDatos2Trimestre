package org.example.randomAcessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirLeer {
    public static void main(String[] args) {

        try(RandomAccessFile raf = new RandomAccessFile("./Chaima.txt", "rw")){
            raf.writeUTF("Hola esta es la 1 linea\n");
            raf.writeUTF("Hola esta es la 2 linea\n");
            raf.writeUTF("Hola esta es la 3 linea\n");

            raf.seek(0);

            System.out.println("Leido 1: " +raf.readUTF());
            System.out.println("Leido 2: "+raf.readUTF());
            System.out.println("Leido 3: "+raf.readUTF());



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
