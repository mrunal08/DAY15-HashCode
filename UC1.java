package com.hashcodedemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UC1 {
    public static void main(String[] args){
        String str = "To be or not to be";
        String [] stringArray = str.split(" ");  //identifying what separated it
        System.out.println(Arrays.toString(stringArray));

        Map<String,Integer> map = new HashMap<String,Integer>();

        for(String word : stringArray){
            Integer number = map.get(word);         //map will iterate through each word.
            //System.out.println(word);
            if(number == null){
                number = 1;                     //Initially every index will have null is nothing os we give it 1 occurrence is 1 time that word is present in that index
            }
            else{
                number += 1;                    //later on just keep adding 1 to it.
            }
            map.put(word,number);
            System.out.println(word);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }
    }
}
