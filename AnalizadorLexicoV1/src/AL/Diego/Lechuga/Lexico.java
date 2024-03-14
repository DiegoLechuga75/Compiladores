package AL.Diego.Lechuga;

public class Lexico {
    private int indice = 0;
    private int error = -1;
    private int aceptar = 1;

    //Variables AFD

    private int entradas = 0;
    private int estado = 0;
    private int[][] matrix = {{2, 1, -1}, {1, 1, -1}, {2, 2, 1}};
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

    public int inicio() throws Exception {
        char c = ' ';
        do {
            c = siguienteCaracter();
            if (Herramientas.letra(c)) {
                entradas = 0;
            } else if (Herramientas.numero(c)) {
                entradas = 1;
            } else if (Herramientas.finCadena(c)) {
                entradas = 2;
            } else {
                error = 0;
            }
            if (error != 0){
                estado=matrix[estado][entradas];
            } else {
                throw new Exception("Palabra no valida");
            }
        } while (!Herramientas.finCadena(c));
        return estado;
    }
}
