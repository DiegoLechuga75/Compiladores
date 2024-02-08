package ParesEImpares;

public class Pares1 {
    public static void main(String[] args) {

        String palabra = "0010000111";
        int indice = 0;
        int estado = 0;
        int columna = 0;
        boolean error = false;

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
                        estado = 0;
                    } else if (c == '0') {
                        estado = 1;
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
            if (estado == 0){
                System.out.println("Sintaxis Valida");
            } else {
                System.out.println("Invalido, los unos deben ser un número par");
            }
        }
    }
}
