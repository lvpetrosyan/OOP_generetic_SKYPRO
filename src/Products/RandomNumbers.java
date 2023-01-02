package Products;

import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        Set<Integer> numberSet=new HashSet<>();
        generateRandom(numberSet);
        System.out.println("20 чисел: "+numberSet);
        List<Integer> numberList= new ArrayList<>();
        getNumber(numberSet,numberList);
        System.out.println("четные числа "+numberList);

    }
    public static void generateRandom(Set<Integer> numberSet){
        Random random= new Random();
        int i=0;
        while (i<20){
            numberSet.add(random.nextInt(1000));
            i++;
        }
    }
    public static void getNumber( Set<Integer> numberSet, List<Integer> numberList){
        for (Integer integer : numberSet) {
            if(integer%2==0){
                numberList.add(integer);
            }
        }
    }
}
