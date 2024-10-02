package randomAlgs.realInterviewProblems;

import java.util.Arrays;

//Activison company problem code assessment
public class ParseCSV {

    public int solution(String S, String C) {
        String[] rows = S.split("\n");
        String[] headers = rows[0].split(";");

        int columnIndex = -1;
        for (int i = 0; i < headers.length; i++) {
            if (headers[i].equals(C)) {
                columnIndex = i;
                break;
            }
        }

        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i < rows.length; i++) {
            String[] fields = rows[i].split(";");
            int value = Integer.parseInt(fields[columnIndex]);
            if (value < minValue)
                minValue = value;
        }
        return minValue;
    }

    public static void main(String[] args) {
        ParseCSV parseCSV = new ParseCSV();
        String data = "Name;Age;Score\nAlice;30;85\nBob;25;90\nCharlie;35;70\nDavid;28;95";
        String columnHeader = "Score";
        int result = parseCSV.solution(data, columnHeader);
        System.out.println(result);

    }
}
