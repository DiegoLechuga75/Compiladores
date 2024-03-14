package AL.Diego.Lechuga;

public class Herramientas {
    public static boolean Signo(char c){
        boolean signo = false;
        if ((c == '+') || (c == '-')){
            signo = true;
        }
        return signo;
    }

    public static boolean Punto(char c){
        boolean punto = false;
        if (c == '.'){
            punto = true;
        }
        return punto;
    }

    public static boolean Exponencial(char c){
        boolean exp = false;
        if (c == 'e'){
            exp = true;
        }
        return exp;
    }

    public static boolean Numero(char c){
        boolean Numero = false;
        if (c >= 48 && c <= 57){
            Numero = true;
        }
        return Numero;
    }

    public static boolean FinCadena(char c){
        boolean fc = false;
        if (c == ';'){
            fc = true;
        }
        return fc;
    }
}
