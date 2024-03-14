package AL.Diego.Lechuga;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lexico app = new Lexico();
        app.setToken("diego");
        try {
            int verifica = app.inicio();
            if (verifica == 1){
                System.out.println("Valido");
            } else {
                System.out.println("No valido");
            }
        } catch (Exception e) {
            System.out.println("No valido ---> Caracter invalido");
        }
    }
}