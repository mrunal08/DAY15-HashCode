package com.hashcodedemo;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setEmail("mrunalg96@gmail.com");
        p1.setId(9);
        p1.setName("mrunal");

        Person p2 = new Person();
        p2.setEmail("mrlg96@gmail.com");
        p2.setId(8);
        p2.setName("rucjl");

        //If you want to compare 2 objects using equal method then object hashcode must be same;
        //if two object have same

        Employee emp = new Employee();
        //we cant compare person and employee here as they are diffrent


        //primitive data type=int,boolean
        //non-primimitive- Objects,String

        String name="rucha";
        System.out.println(name.hashCode());

       String name1= "rucha";
        System.out.println(name.hashCode());

        if(name.equals(name1)){
            System.out.println("true");
        }

        if(name==name1){
            System.out.println("true");
        }


        //memory index allocation is done using modulus
        //eg if having 10 memory in hashtable from 0 to 9
        //then number 567 will be given in 7th memory block
        //ie index for 567%10=7 so it will go n 7th index
        //if 20 index then modulus 20
        //eg 122%20=2;
        //all depends on number of index we have in hashtable

    }

}



//**Notes**
/*
in Array we know size of array so we initialse it but in Arraylist we dont know size
Arraylist used when we dont know size of array we will need in code

 */