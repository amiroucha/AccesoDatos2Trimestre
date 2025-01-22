package org.example.randomAcessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class numeroRand {
    //pedir numero al suaurio, que va a ser el numero de veces de numeros randm que vamos a mostrar del 1 al 100
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        try(RandomAccessFile raf = new RandomAccessFile("./Chaima.txt", "rw")){
            System.out.println("Introduce un numero");
            int numero = leer.nextInt();

            Random rand = new Random();
            for (int i=0; i<numero; i++){
                int numRand = rand.nextInt(0,101);
                raf.writeBytes("Contador "+i+" : numero random --> "+numRand+"\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
