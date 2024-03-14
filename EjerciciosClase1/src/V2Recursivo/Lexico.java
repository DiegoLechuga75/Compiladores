package V2Recursivo;

import javax.swing.*;

public class Lexico {
        private int indice = 0;
        private String cadena = "";
        private final int error = -1;
        private final int aceptado = 1;

        private char siguienteCaracter () {
            char caracter = ' ';
            if (indice<cadena.length()){
                caracter = cadena.charAt(indice);
                indice++;
            }
            return caracter;
        }
        private int estado_A () {
            char c = siguienteCaracter();
            switch (c) {
                case 'a' -> {
                    return estado_B();
                }
                case 'b' -> {
                    return estado_C();
                }
                default -> {
                    return error;
                }
            }
        }

    private int estado_B () {
        char c = siguienteCaracter();
        switch (c) {
            case 'a' -> {
                return estado_B();
            }
            case 'b' -> {
                return estado_D();
            }
            default -> {
                return error;
            }
        }
    }

    private int estado_C () {
        char c = siguienteCaracter();
        switch (c) {
            case 'a' -> {
                return estado_B();
            }
            case 'b' -> {
                return estado_C();
            }
            default -> {
                return error;
            }
        }
    }

    private int estado_D () {
        char c = siguienteCaracter();
        switch (c) {
            case 'a' -> {
                return estado_B();
            }
            case 'b' -> {
                return estado_E();
            }
            default -> {
                return error;
            }
        }
    }

    private int estado_E () {
        char c = siguienteCaracter();
        switch (c) {
            case 'a' -> {
                return estado_B();
            }
            case 'b' -> {
                return estado_C();
            }
            case ' ' -> {
                return aceptado;
            }
            default -> {
                return error;
            }
        }
    }

    public static void main(String[] args) {
        Lexico app = new Lexico();
        app.cadena = JOptionPane.showInputDialog("Escribe una cadena");
        int valor = app.estado_A();
        if (valor == app.aceptado){
            JOptionPane.showMessageDialog(null, "Cadena Aceptada");
        } else {
            JOptionPane.showMessageDialog(null, "Cadena Invalida");
        }
    }

}
