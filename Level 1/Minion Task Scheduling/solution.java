import java.util.*;

public class scheduling {
   
   public static void main(String[] args) {
      int[] list1 = solution(new int[]{1, 2, 3}, 0);
      int[] list2 = solution(new int[]{1, 2, 2, 3, 3, 3, 4, 5, 5}, 1);
      int[] list3 = solution(new int[]{1, 2, 3}, 6);
      printArray(list1);
      printArray(list2);
      printArray(list3);
   }
   
   private static void printArray(int[] data) {
      System.out.print("[");
      for (int i = 0; i < data.length; i++) {
         System.out.print(data[i] + " ");
      }
      System.out.println("]");
   }   
   
   
   // solution.java
   
   // Will remove the values from the array that have a greater number of occurences in the array than the given value "num", 
   // returning a new array with these values removed. 
   public static int[] solution(int[] data, int num) {
      int i = 0;
      while(i < data.length) {
         if (count(data, data[i]) > num) {
            data = removeValue(data, data[i]);
         } else {
            i++;   
         }
      }
      return data;
   }
   
   // Pre: Given an array of integers and a value "num" of type integer,
   // Post: Returns an integer that represents the amount of occurences
   // the given "num" was found in the array.
   public static int count(int[] data, int num) {
      int count = 0;
      for (int i = 0; i < data.length; i++) {
         if (data[i] == num) {
            count++;
         }
      }
      return count;
   }
   
   // Will return a new array that maintains the same order and content of the original given array, except any value that matches the given "num" will be removed.
   public static int[] removeValue(int[] data, int num) {
      int newSize = data.length - count(data, num);
      int[] newArray = new int[newSize];
      int current = 0;
      for (int i = 0; i < data.length; i++) {
         if (data[i] != num) {
            newArray[current] = data[i];
            current++;
         }
      }
      return newArray;
   }
}



//Alternate solution using HashMap

public static int[] solution(int[] data, int n){
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < data.length; i++){
            if(!map.containsKey(data[i])){
                map.put(data[i], 1);
            }else{
                map.put(data[i], map.get(data[i]) + 1);
            }
        }
        
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i < data.length; i++){
            if(map.get(data[i]) > n){
                continue;
            }else{
                output.add(data[i]);
            }
        }
        
        // System.out.println(output);
        int[] result = new int[output.size()];
        
        for(int i = 0; i < output.size(); i++){
            result[i] = output.get(i);
        }
        
        return result;
}
