package diego.lechuga;

public class Lexico {
    private int indice = 0;
    private int error = -1;
    private int aceptar = 1;

    //Variables AFD

    private int entradas = 0;
    private int estado = 0;
    private int[][] matrix;
    private char[] language;
    private String token;

    public Lexico(int[][]matrix, char[]language) {
        this.matrix = matrix;
        this.language = language;
    }

    private void restartApp(){
        this.indice = 0;
        this.entradas = 0;
        this.estado = 0;
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
        restartApp();
        char c = ' ';
        do {
            c = siguienteCaracter();
            for (int i = 0; i < language.length; i++){
                if (c == language[i]){
                    entradas = i;
                    i = language.length;
                } else if (Herramientas.Letra(c, language)) {
                    entradas = new String(language).indexOf('L');
                    i = language.length;
                } else if (Herramientas.Numero(c, language)) {
                    entradas = new String(language).indexOf('D');
                    i = language.length;
                } else if (Herramientas.FinCadena(c)) {
                    entradas = matrix[estado].length - 1;
                    i = language.length;
                } else if (Herramientas.NotContainsInLanguage(c, language)){
                    error = 0;
                }
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
