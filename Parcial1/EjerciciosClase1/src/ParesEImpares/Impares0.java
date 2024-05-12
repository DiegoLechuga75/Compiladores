package ParesEImpares;

import java.io.*;
import java.util.*;

public class Impares0 {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<String>();
        String palabra;
        int indice;
        int estado;
        int columna = 0;
        boolean error;
        try {
            File myObj = new File(System.getProperty("user.dir") + File.separator + "src/ParesEImpares/fuente.txt");
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

        for (numPalabra = 0 ; numPalabra < palabras.size() ; numPalabra++){

            palabra = palabras.get(numPalabra);
            indice = 0;
            estado = 0;
            error = false;

            if (numPalabra != 0){
                columna++;
            }

            while (indice < palabra.length()){

                char c = palabra.charAt(indice);

                switch (estado) {
                    case 0 -> {
                        if (c == '1') {
                            estado = 0;
                        } else if (c == '0') {
                            estado = 1;
                        } else {
                            error = true;
                            indice = palabra.length();
                        }
                    }
                    case 1 -> {
                        if (c == '1') {
                            estado = 1;
                        } else if (c == '0') {
                            estado = 0;
                        } else {
                            error = true;
                            indice = palabra.length();
                        }
                    }
                }
                indice++;
                columna++;
            }
            if (error){
                System.out.println("Caracter invalido en la columna: " + columna);
            } else {
                if (estado == 1){
                    System.out.println("Sintaxis Valida");
                } else {
                    System.out.println("Invalido, los ceros deben ser un número impar");
                }
            }
        }
    }
}
