package com.patrick;
import java.util.*;
public class LakeManager {

    public static void main(String[] args) {
//        System.out.println("Lake Running Log");
        HashMap mapOfTimes = new HashMap();//Map of lakes (Strings) to lists of mapOfTimes.
        ArrayList <Lake> listOfLakes = new ArrayList<Lake>();

        Lake calhoun = new Lake("Calhoun");
        calhoun.addLakeTime(43.32);
        calhoun.addLakeTime(45.15);
        listOfLakes.add(calhoun);

        Lake harriet = new Lake("Harriet");
        harriet.addLakeTime(49.34);
        harriet.addLakeTime(44.43);
        harriet.addLakeTime(46.22);
        listOfLakes.add(harriet);

        Lake como = new Lake("Como");
        como.addLakeTime(32.11);
        como.addLakeTime(28.14);
        listOfLakes.add(como);


        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the name of the lake? ");
        String inputLake = scanner.next();//Lake Name.
        System.out.println("What was your running time? ");
        Double inputLakeTime = scanner.nextDouble();//Running time.
//incomplete
        boolean doesContainLake = mapOfTimes.containsKey(inputLake);
        if (!doesContainLake) {
            ArrayList listOfTimes = new ArrayList();
            listOfTimes.add(inputLakeTime);
            mapOfTimes.put(inputLake, listOfTimes);
        } else {
            List timesList = (List)mapOfTimes.get(inputLake);
            timesList.add(inputLakeTime);
        }

        for (Object o : mapOfTimes.keySet()) {
            String nameOfLake = (String) o;
            List lakeTimes = (List) mapOfTimes.get(nameOfLake);
//temp comment            Double lowestTime = getQuickestTime(lakeTimes);

//temp comment            System.out.println(nameOfLake +", " + lowestTime);
            //System.out.println(lowestTime);
        }
    }
/*    public static Double getQuickestTime(List lakeTimes){
        Double quickestTime = Double.POSITIVE_INFINITY;
        for (Object o : lakeTimes) {
            Double time = (Double) o;
            if (time < quickestTime)
                quickestTime = time;

        }
        return quickestTime;
//if time < quickestTime
    }*/
}
