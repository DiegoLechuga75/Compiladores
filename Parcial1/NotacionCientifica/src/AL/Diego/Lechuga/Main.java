package AL.Diego.Lechuga;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> tokens = new ArrayList<String>();

        Lexico app = new Lexico();

        try {
            File myObj = new File(System.getProperty("user.dir") + File.separator + "NotacionCientifica/src/AL/Diego/Lechuga/fuente.txt");
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
