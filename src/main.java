import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList1 = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++){
            if(intList.get(i) % 2 == 0 && intList.get(i) > 0){
                intList1.add(intList.get(i));
            }
        }
        Collections.sort(intList1);
        System.out.println(intList1 + " Без Stream");
//        for (int i = 0; i < intList1.size(); i++) {
//            System.out.println(intList1.get(i));
//        }
    }
}
