package Galya;

import java.util.*;

public class Main {
    private static final List<String> NAME = List.of(
            "Иван",
            "Игорь",
            "Женя",
            "Леня",
            "Лена",
            "Катя",
            "Маша"
    );
    private static final Random RANDOM = new Random();
    private static final int MAX = 5;


    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        addQueue(queue1);
        addQueue(queue2);
        System.out.println(" 1 ochered " + queue1);
        System.out.println("2 ochered " + queue2);
        add("Вова",queue1,queue2);
        System.out.println(" 1 ochered " + queue1);
        System.out.println("2 ochered " + queue2);
        remove(queue1,queue2);
        System.out.println(" 1 ochered " + queue1);
        System.out.println("2 ochered " + queue2);
    }

    public static void addQueue(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAME.get(RANDOM.nextInt(NAME.size())));
        }
    }

    public static void add(String name, Queue<String> queue1, Queue<String> queue2) {
         if (queue1.size()==MAX&&queue2.size()==MAX){
            System.out.println("Позать галю!");
        }
        if (queue1.size() < queue2.size() && queue1.size() != MAX) {
            queue1.add(name);
        } else if (queue2.size() > queue1.size() && queue2.size() != MAX) {
            queue2.add(name);
        }
    }
    public static void remove(Queue<String> queue1, Queue<String> queue2){
        if (RANDOM.nextBoolean()){
            queue1.poll();
        }
        else {
            queue2.poll();
        }
    }
}
