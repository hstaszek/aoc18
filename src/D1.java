import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D1 {

    public static void main(String[] args) throws IOException {
        long score =0;

        Scanner scanner = new Scanner(new File("inputData/input.in"));
        scanner.useDelimiter("\n");

        List<Long> scorelist = new ArrayList<>();
        List<String> inputList = new ArrayList<>();

        scorelist.add(score);

        while(scanner.hasNext()) {
            String input = scanner.next();
            inputList.add(input);
        }

        for (int i=0; i<inputList.size(); i++){

            if(inputList.get(i).startsWith("+")){
                score += Long.parseLong(inputList.get(i));
                if(scorelist.contains(score)){
                    System.out.println(score);
                    break;
                }
                scorelist.add(score);
            }else{
                score += Long.parseLong(inputList.get(i));
                if(scorelist.contains(score)){
                    System.out.println(score);
                    break;
                }
                scorelist.add(score);
            }
            //System.out.println("Score: "+score);
            if(i==inputList.size()-1){
                i=-1;
            }
        }
    }
}
