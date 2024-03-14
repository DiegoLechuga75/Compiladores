package diego.lechuga;

public class Herramientas {
    public static boolean Letra(char c, char[] language){
        boolean letra = false;
        if (((c >= 97 && c <= 122) || (c >= 65 && c <= 90)) && new String(language).indexOf(c) == -1){
            letra = true;
        }
        return letra;
    }

    public static boolean Numero(char c, char[] language){
        boolean numero = false;
        if ((c >= 48 && c <= 57) && new String(language).indexOf(c) == -1){
            numero = true;
        }
        return numero;
    }

    public static boolean FinCadena(char c){
        boolean fc = false;
        if (c == 32){
            fc = true;
        }
        return fc;
    }

    public static boolean NotContainsInLanguage(char c, char[] language){
        boolean contains = false;
        if (new String(language).indexOf(c) == -1){
            contains = true;
        }
        return contains;
    }
}
