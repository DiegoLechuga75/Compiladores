package ParesEImpares;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<String>();
        String palabra;
        int indice;
        int zeroState;
        int oneState;
        int columna = 0;
        boolean error;
        try {
            File myObj = new File(System.getProperty("user.dir") + File.separator + "EjerciciosClase1/src/ParesEImpares/fuente.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                palabras.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocurrió un error, el archivo no fue encontrado.");
            e.printStackTrace();
        }

        int numPalabra;
        boolean zeroCase;
        boolean oneCase;

        for (numPalabra = 0 ; numPalabra < palabras.size() ; numPalabra++){

            palabra = palabras.get(numPalabra);
            indice = 0;
            zeroState = 0;
            oneState = 0;
            zeroCase = false;
            oneCase = false;
            error = false;

            if (numPalabra != 0){
                columna++;
            }

            while (indice < palabra.length()){

                char c = palabra.charAt(indice);

                //Switch case para Impares de ceros

                switch (zeroState) {
                    case 0 -> {
                        if (c == '1') {
                            zeroState = 0;
                        } else if (c == '0') {
                            zeroState = 1;
                        } else {
                            error = true;
                        }
                    }
                    case 1 -> {
                        if (c == '1') {
                            zeroState = 1;
                        } else if (c == '0') {
                            zeroState = 0;
                        } else {
                            error = true;
                        }
                    }
                }

                //Switch case para Pares de unos

                switch (oneState) {
                    case 0:
                        if (c == '1') {
                            oneState = 1;
                        } else if (c == '0') {
                            oneState = 0;
                        } else {
                            error = true;
                        }
                        break;
                    case 1:
                        if (c == '1') {
                            oneState = 0;
                        } else if (c == '0') {
                            oneState = 1;
                        } else {
                            error = true;
                        }
                        break;
                }

                indice++;
                columna++;

            }
            //Condicional impares de ceros
            if (error){
                System.out.println("Caracter invalido en la columna: " + columna);
            } else {
                if (zeroState == 1){
                    System.out.println("Sintaxis Valida para impares de 0");
                    zeroCase = true;
                } else {
                    System.out.println("Invalido, los ceros deben ser un número impar");
                }
            }

            //Condicional pares de uno
            if (error){
                System.out.println("Caracter invalido en la columna: " + columna);
            } else {
                if (oneState == 0){
                    System.out.println("Sintaxis Valida para pares de uno");
                    oneCase = true;
                } else {
                    System.out.println("Invalido, los unos deben ser un número par");
                }
            }

            //Condicional ambos
            if (oneCase && zeroCase) {
                System.out.println("La sintaxis descrita es valida para ambos casos");
            }

            System.out.println("-----------------------------------------------------");
        }
    }
}
