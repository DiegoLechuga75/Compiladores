package diego.lechuga;

import java.util.ArrayList;
import java.util.List;

public class Settings {
    int columns;
    int rows;
    String setting;
    List<String> settings;
    char [] languageArr;

    public Settings (List<String> settings) {
        this.settings = settings;
        SetRows();
        SetColumns();
    }

    private void SetRows () {
        setting = settings.get(0);
        this.rows = Integer.parseInt(String.valueOf(setting.charAt(0)));
    }

    private void SetColumns () {
        setting = settings.get(0);
        this.columns = Integer.parseInt(String.valueOf(setting.charAt(2))) + 1;
    }

    public char[] GenerateLanguage () {
        setting = settings.get(1);
        String[] languageString = setting.split("\\s+");
        String aux = "";
        for (String aux2:languageString){
            aux += aux2;
        }
        return languageArr = aux.toCharArray();
    }

    public int[][] GenerateMatrix () {
        int[][] matrix = new int[rows][columns];
        int rowsIndex = 0;
        for (int i = 2; i < settings.size(); i++){
            int columnsIndex = 0;
            setting = settings.get(i);
            String[] stateString = setting.split("\\s+");
            for (int position = 0 ; position < stateString.length; position++) {
                matrix[rowsIndex][columnsIndex] = Integer.parseInt(stateString[position]);
                columnsIndex++;
            }
            rowsIndex++;
        }
        return matrix;
    }

}
