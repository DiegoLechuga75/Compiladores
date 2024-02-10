package ParesEImpares;

public class Pares1 {
    public static void main(String[] args) {

        String sentencia = "000011100 0010001";
        String palabra;
        String[] palabras = sentencia.split("\\s+");
        int indice;
        int estado;
        int columna = 0;
        boolean error;

        int numPalabra;

        for (numPalabra = 0 ; numPalabra < palabras.length ; numPalabra++){

            palabra = palabras[numPalabra];
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
}
