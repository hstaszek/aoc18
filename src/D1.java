import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D1 {

    public static List<String> loadInputData() throws IOException {
        Scanner scanner = new Scanner(new File("inputData/inputD1.in"));
        scanner.useDelimiter("\n");
        List<String> inputList = new ArrayList<>();

        while (scanner.hasNext()) {
            String input = scanner.next();
            inputList.add(input);
        }
        return inputList;
    }

    public static int part1(List<String> inputList){
        int score =0;
        for(String s : inputList){
            score += Integer.parseInt(s);
        }
        return score;
    }

    public static int part2(List<String> inputList){
        int score = 0;
        List<Integer> scorelist = new ArrayList<>();
        scorelist.add(score);
        while(true){
            for (String s : inputList){
                score += Integer.parseInt(s);
                if(scorelist.contains(score)){
                    return score;
                }
                scorelist.add(score);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(part1(loadInputData()));
        System.out.println(part2(loadInputData()));
    }
}
