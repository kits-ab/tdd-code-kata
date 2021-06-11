import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Crunch {

    public static String crunchFootball() throws IOException {
        return findMax("src/main/resources/data/Fotboll_1996.dat", "GM", "IM", "Namn");
//        Scanner scanner = new Scanner(new File("src/main/resources/data/Fotboll_1996.dat"), StandardCharsets.UTF_8);
//        scanner.useDelimiter("\n");
//
//        int diff = -1;
//        String team = "GAIS";
//        scanner.next();
//        while (scanner.hasNext()){
//            String s = scanner.next();
//            String[] strings = s.split("\\s+");
//            if (Math.abs(Integer.parseInt(strings[6]) - Integer.parseInt(strings[7])) > diff) {
//                team = strings[1];
//                diff = Integer.parseInt(strings[6]) - Integer.parseInt(strings[7]);
//            }
//            System.out.println();
//        }
//        return team;
    }

    public static String crunchWeather() throws IOException {
        return findMax("src/main/resources/data/Mars_2021.dat", "MaxTmp", "MinTmp", "Dag");
//        Scanner scanner = new Scanner(new File("src/main/resources/data/Mars_2021.dat"), StandardCharsets.UTF_8);
//        scanner.useDelimiter("\n");
//
//        scanner.next();
//        String day = "";
//        double diff = -0.5D;
//        while (scanner.hasNext()){
//            String s = scanner.next();
//            String[] strings = s.split("\\s+");
//            if (Math.abs(Double.parseDouble(strings[2]) - Double.parseDouble(strings[3])) > diff) {
//                day = strings[0];
//                diff = Math.abs(Double.parseDouble(strings[2]) - Double.parseDouble(strings[3]));
//            }
//            System.out.println();
//        }
//        return day;
    }

    public static String findMax(String fileName, String val1, String val2, String resultingCol) throws IOException {
        Scanner scanner = new Scanner(new File(fileName), StandardCharsets.UTF_8);
        scanner.useDelimiter("\n");

        String columnNamesString = scanner.next();
        String [] columnNames = columnNamesString.split("\\s+");
        int col1 = 0, col2 =0;
        int resultCol = 0;
        for (int i = 0; i < columnNames.length; i++) {
            if (columnNames[i].equals(val1)) {
                col1 = i;
            }
            if (columnNames[i].equals(val2)) {
                col2 = i;
            }
            if (columnNames[i].equals(resultingCol)) {
                resultCol = i;
            }
        }
        double diff = -1;
        String result = "";
        while (scanner.hasNext()){
            String s = scanner.next();
            String[] strings = s.split("\\s+");
            if (Math.abs(Double.parseDouble(strings[col1]) - Double.parseDouble(strings[col2])) > diff) {
                result = strings[resultCol];
                diff = Math.abs(Double.parseDouble(strings[col1]) - Double.parseDouble(strings[col2]));
            }
            System.out.println();
        }
        return result;

    }
}
