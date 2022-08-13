package baris.kaplan;

import java.util.HashMap;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
         hashMap();

    }
        public static void hashMap(){
            HashMap<Integer,String>myMap = new HashMap<Integer,String>();
            if(myMap==null){
                System.out.println("HashMap is null !!! \n");
                throw new NullPointerException();
            }
            myMap.put(1322,"Ali");
            myMap.put(2332, "Ahmet");
            myMap.put(3442, "Mehmet");
            myMap.put(1322,"Ali");







            Set keySet = myMap.keySet();

            if(keySet==null){
                System.out.println("KeySet is null !!!");
                throw new NullPointerException();
            }
            Set entrySet = myMap.entrySet();
            if(entrySet==null){
                System.out.println("EntrySet is null !!!");
                throw new NullPointerException();
            }





            int j = 0;
            for(Iterator iterator = keySet.iterator(); iterator.hasNext();){
                int keyValue = (Integer) iterator.next();
                System.out.println("Value "+j+": "+myMap.get(keyValue)+"");
                j++;
            }

            System.out.println();

            int i=0;
            for(Iterator iterator = keySet.iterator(); iterator.hasNext();){
                int key = (Integer) iterator.next();
                System.out.println("Key "+i+": "+key+"");
                i++;
            }



            System.out.println();

            System.out.println("Keys : " + myMap.keySet());
            System.out.println("Values : " + myMap.values());
            System.out.println();
            System.out.println(myMap.isEmpty());
            System.out.println(myMap.containsKey(1322));
            System.out.println(myMap.containsKey(1333));




        }
    }

