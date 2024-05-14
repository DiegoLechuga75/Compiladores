package fes.aragon.compilador;

import java.net.URISyntaxException;

public class Main {

    private String path;

    public Main(){
    }

    public String getPath() throws URISyntaxException{
        path = this.getClass().getResource("/fes/aragon/compilador/fuente.txt").toURI().getPath();
        return path;
    }

    public static void main(String[] args) {
        try {
            Main app = new Main();
            app.run();
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }

    private void run(){
        System.out.println(path);
    }
}
