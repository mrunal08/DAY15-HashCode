package com.hashcodedemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


    class Node{
        private int data;
        private Node next;

        public Node() {
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    class LinkedList{
        private Node start;
        private int size;


        public LinkedList() {
            size = 0;
            start = null;
        }

        public void insert(int value){
            Node n;
            n = new Node();
            n.setData(value);
            n.setNext(start);
            start=n;
            size++;
        }
        public boolean isEmpty(){
            if(start==null){
                return true;
            }
            else{
                return false;
            }
        }

        public void viewList(){
            Node t;
            if(isEmpty()){
                System.out.println("List is empty");
            }
            else{
                t=start;
                for(int i=1;i<=size;i++){
                    System.out.println(""+t.getData());  //now t will get data from next node
                    t = t.getNext();         //now in t giving refernce varibale of next node to continue this cycle;
                }
            }
        }
    }

public class UC2 {

    public static void main(String[] args){
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String [] stringArray = str.split(" ");  //identifying what separated it
        System.out.println(Arrays.toString(stringArray));

        Map<String,Integer> map = new HashMap<String,Integer>();

        for( String word : stringArray){
            Integer number = map.get(word);         //map will iterate through each word.
            //System.out.println(word);
            if(number == null){
                number = 1;                     //Initally everyindex will have null is nothing os we givr it 1 occurance is 1 time that word is present in that index
            }
            else{
                number += 1;                    //later onjust keep adding 1 to it.
            }
            map.put(word,number);
            System.out.println(word +":"+word.hashCode());

        }

        System.out.println("\n");
        System.out.println("Word occurrences are : ");

        for (Map.Entry<String, Integer> entry : map.entrySet()){

            LinkedList list = new LinkedList();
            String strKey = entry.getKey();
            list.insert(strKey.hashCode());

            System.out.println(entry.getKey()+ " : "+entry.getValue());
            System.out.println("HashCode : ");
            list.viewList();
            System.out.println("\n");
        }



    }
}
