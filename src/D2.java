import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class D2 {

    public static String part2(List<String> inputList){
        //List<String> inputList = new ArrayList<>();

        String finalword = "";

        for (int i =0; i< inputList.size()-1; i++){
            for(int j=i+1; j<inputList.size(); j++){
                for (int z=0; z<inputList.get(i).length(); z++){
                    if(inputList.get(i).charAt(z) == inputList.get(j).charAt(z)){
                        finalword += inputList.get(i).charAt(z);
                    }
                }
                if(inputList.get(i).length() == finalword.length()+1){
                    return finalword;
                }else{
                    finalword="";
                }
            }
        }
        return null;
    }

    public static int part1(List<String> inputList){
        int score2 = 0;
        int score3 = 0;

        for(int i=0; i<inputList.size(); i++){
            HashMap<Character, Integer> hmap = new HashMap<>();
            for(int j=0; j<inputList.get(i).length(); j++){
                if (hmap.keySet().contains(inputList.get(i).charAt(j))){
                    hmap.put(inputList.get(i).charAt(j), hmap.get(inputList.get(i).charAt(j)) +1);
                }else{
                    hmap.put(inputList.get(i).charAt(j), 1);
                }
            }
            if(hmap.values().contains(2)){
                score2 += 1;
            }if (hmap.values().contains(3)){
                score3 +=1;
            }
        }
        return score2*score3;
    }

    public static List<String> loadInputData() throws IOException{
        Scanner scanner = new Scanner(new File("inputData/inputD2.in"));
        scanner.useDelimiter("\n");
        List<String> inputList = new ArrayList<>();

        while (scanner.hasNext()) {
            String input = scanner.next();
            inputList.add(input);
        }
        return inputList;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(part1(loadInputData()));
        System.out.println(part2(loadInputData()));
    }
}
