package diego.lechuga;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int columns;
        int rows;
        String setting;

        List<String> tokens = new ArrayList<String>();
        List<String> settings = new ArrayList<String>();

        try {
            File myObj = new File(System.getProperty("user.dir") + File.separator + "Configurable/src/diego/lechuga/config.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                settings.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Configuracion de Lexico

        //Configuracion filas

        setting = settings.get(0);
        rows = Integer.parseInt(String.valueOf(setting.charAt(0)));

        //Configuracion columnas

        setting = settings.get(0);
        columns = Integer.parseInt(String.valueOf(setting.charAt(2))) + 1;

        //Configuracion lenguaje

        setting = settings.get(1);
        String[] languageString = setting.split("\\s+");
        String aux = "";
        for (String aux2:languageString){
            aux += aux2;
        }
        char[] languageArr = aux.toCharArray();

        //Declaracion y llenado de arreglo de configuracion

        int[][] matrix = new int[rows][columns];
        int rowsIndex = 0;
        for (int i = 2; i < settings.size(); i++){
            int columnsIndex = 0;
            setting = settings.get(i);
            String[] stateString = setting.split("\\s+");
            for (int position = 0 ; position < stateString.length; position++) {
                matrix[rowsIndex][columnsIndex] = Integer.parseInt(stateString[position]);
                columnsIndex++;
            }
            rowsIndex++;
        }

        Lexico app = new Lexico(matrix, languageArr);

        try {
            File myObj = new File(System.getProperty("user.dir") + File.separator + "Configurable/src/diego/lechuga/fuente.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                tokens.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < tokens.size(); i++) {
            app.setToken(tokens.get(i));
            try {
                int verifica = app.inicio();
                if (verifica == 1) {
                    System.out.println("Valido");
                } else {
                    System.out.println("No valido");
                }
            } catch (Exception e) {
                System.out.println("No valido ---> Caracter invalido");
            }
        }
    }
}
