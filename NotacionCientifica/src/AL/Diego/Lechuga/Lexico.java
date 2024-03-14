package AL.Diego.Lechuga;

public class Lexico {
    private int indice = 0;
    private int error = -1;
    private int aceptar = 1;

    //Variables AFD

    private int entradas = 0;
    private int estado = 0;
    private int[][] matrix = {{1, 7, 7, 7, -1}, {1, 7, 2, 4, 1}, {3, 7, 7, 7, -1}, {3, 7, 7, 4, 1}, {6, 5, 7, 7, -1}, {6, 7, 7, 7, -1}, {6, 7, 7, 7, 1}, {7, 7, 7, 7, -1}};
    private String token;

    public Lexico() {
    }

    public void setToken(String token) {
        this.token = token;
    }

    private char siguienteCaracter() {
        char c = ' ';
        if (indice < token.length()) {
            c = token.charAt(indice);
            indice++;
        }
        return c;
    }

    private void restartApp(){
        this.indice = 0;
        this.entradas = 0;
        this.estado = 0;
    }

    public int inicio() throws Exception {
        restartApp();
        char c = ' ';
        do {
            c = siguienteCaracter();
            if (Herramientas.Numero(c)) {
                entradas = 0;
            } else if (Herramientas.Signo(c)) {
                entradas = 1;
            } else if (Herramientas.Punto(c)) {
                entradas = 2;
            } else if (Herramientas.Exponencial(c)) {
                entradas = 3;
            } else if (Herramientas.FinCadena(c)) {
                entradas = 4;
            } else {
                error = 0;
            }
            if (error != 0){
                estado=matrix[estado][entradas];
            } else {
                throw new Exception("Palabra no valida");
            }
        } while (!Herramientas.FinCadena(c));
        return estado;
    }
}
