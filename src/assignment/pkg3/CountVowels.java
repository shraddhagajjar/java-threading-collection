/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author shraddha
 */
public class CountVowels {
    public static void main(String[] args) throws Exception {
        Scanner input1 = new Scanner(System.in);
        String filename = "C:\\Users\\shraddha\\Desktop\\M.S\\2nd sem\\Advance Java\\Assignment\\week5-assignment\\Assignment-3\\src\\assignment\\pkg3\\demo.txt";
        File file = new File(filename);
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        System.out.println("List of Vowels");
        char[] vowels={'a','e','i','o','u'};
        int total = 0;
        Set<Character> vowelsSet=new HashSet<Character>();
        for(int i = 0; i<vowels.length; i++){
            vowelsSet.add(vowels[i]);
        }
        System.out.println(vowelsSet);
        Scanner input = new Scanner(file);
        if (file.exists()) {
            int count = 0;    
            while (input.hasNext()) {
                String word = input.next();
                char[] w = word.toLowerCase().toCharArray();
                for(int i=0;i<w.length;i++)
                {
                    if(vowelsSet.contains(w[i]))
                    {
                        if (!map.containsKey(w[i])) {
                            map.put(w[i], 1);
                            count++;
                        } else {
                            int value = map.get(w[i]);
                            value++;
                            count++;
                            map.put(w[i], value);
                        }
                    }
                }
            }
            System.out.println("Total number of vowels"+count);
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry: entrySet)
                System.out.println(entry.getKey() + "\t" + entry.getValue());
        }   else {
      System.out.println("File NPU.txt is does not exist");
    }    
  }
}