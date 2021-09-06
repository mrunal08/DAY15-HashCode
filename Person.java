package com.hashcodedemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {

    int id;
    String name;
    String email;
    String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() &&
                getName().equals(person.getName()) &&
                getEmail().equals(person.getEmail()) &&
                getAddress().equals(person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getAddress());
    }

    public static class UC2 {
        public static void main(String[] args){
            String str = "To be or not to be";
            String [] stringArray = str.split(" ");  //adentifying what separated it
            System.out.println(Arrays.toString(stringArray));

            Map<String,Integer> map = new HashMap<String,Integer>();

            for(String word : stringArray){
                Integer number = map.get(word);         //map will iterate through each word.
                //System.out.println(word);
                if(number == null){
                    number = 1;                     //Initally everyindex will have null is nothing os we givr it 1 occurance is 1 time that word is present in that index
                }
                else{
                    number += 1;                    //later onjust keep adding 1 to it.
                }
                map.put(word,number);
                System.out.println(word);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+ "  "+entry.getValue());
            }
        }
    }
}
