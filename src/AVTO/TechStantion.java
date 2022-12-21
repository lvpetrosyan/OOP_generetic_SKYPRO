package AVTO;

import java.util.LinkedList;
import java.util.Queue;

public class TechStantion {
   private Queue <Transport> avtoQueue = new LinkedList<>();

   public void addTechStation(Transport  avto){
       avtoQueue.add(avto);
   }
   public void goTechInspection(){
       if (!avtoQueue.isEmpty()){
          Transport avto= avtoQueue.poll();
           System.out.println("Машина починена!");
       }
   }
}
