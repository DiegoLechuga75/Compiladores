package ParesEImpares;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpresionParcial {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<String>();
        String palabra;
        int indice;
        int estado;
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
            System.out.println("An error occurred.");
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
                    case 0:
                        if (c == '1') {
                            estado = 1;
                        } else if (c == '0') {
                            estado = 0;
                        } else {
                            error = true;
                            indice = palabra.length();
                        }
                        break;
                    case 1:
                        if (c == '1') {
                            estado = 2;
                        } else if (c == '0') {
                            estado = 1;
                            indice = palabra.length();
                        } else {
                            error = true;
                            indice = palabra.length();
                        }
                        break;
                    case 2:
                        if (c == '1') {
                            estado = 2;
                        } else if (c == '0') {
                            estado = 2;
                        } else {
                            error = true;
                            indice = palabra.length();
                        }
                        break;
                }
                indice++;
                columna++;
            }
            if (error){
                System.out.println("Caracter invalido en la columna: " + columna);
            } else {
                if (estado == 2){
                    System.out.println("Sintaxis Valida");
                } else {
                    System.out.println("La expresión que debe seguir la sintaxis es (0 | 1)* 1 1 0*");
                }
            }
        }
    }
}
