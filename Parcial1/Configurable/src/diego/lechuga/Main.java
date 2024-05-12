package diego.lechuga;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
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

        Settings mySetting = new Settings(settings);

        Lexico app = new Lexico(mySetting.GenerateMatrix(), mySetting.GenerateLanguage());

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
