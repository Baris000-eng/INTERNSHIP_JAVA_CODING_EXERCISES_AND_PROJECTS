package baris.kaplan;
import java.util.*;
import java.io.*;

public class NumberOfOccurrences
{
    public static void main(String[] args) throws FileNotFoundException {
        int i=0;
        String path = "/Users/barissss/eclipse-workspace/JIG-G2-2022/src/baris.kaplan/lorem.txt";
        Scanner sc = new Scanner(new File(path)).useDelimiter("[^a-zA-Z]+");
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        while(sc.hasNext()) { //read the file
            String w = sc.next();
            System.out.print("Word "+i+": "+w+"\n");
            i++;
            if(!hashMap.containsKey(w)){ //if the hashmap does not contain the word
                hashMap.put(w,1); //set the counter of word to 1.
            } else { //if the hashmap contains the word
                hashMap.put(w,hashMap.get(w)+1);
            }

        }

        System.out.println();
        Set set = hashMap.entrySet();
        List<Map.Entry<String, Integer>> l = new ArrayList<Map.Entry<String,Integer>>(set); //convert set to ArrayList
        Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {  //sorting in descending order of number of occurences of each word in the inputted txt file
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });

        int s = hashMap.size();
        i = 0;
        for(i=0;i<s;i++){
            System.out.println(l.get(i).getKey() + " : " + l.get(i).getValue()+" times"); //display words and their occurrences
        }

    }
}