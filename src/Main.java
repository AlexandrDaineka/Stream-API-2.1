import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> tryList = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++){
            Integer currentInt = intList.get(i);
            if (currentInt % 2 == 0 && currentInt > 0) {
                tryList.add(currentInt);
            }
        }
        Collections.sort(tryList);
        for (Integer i : tryList){
            System.out.print(" " + i);
        }

    }
}
