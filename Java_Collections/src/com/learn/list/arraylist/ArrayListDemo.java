package com.learn.list.arraylist;

public class ArrayListDemo {
    
   public static void main(String[] args) {
       System.out.println("ArrayList Implementation");

       MyArrayList arrayList = new MyArrayList();
       arrayList.add(1);
       arrayList.add(2);
       arrayList.add(3);
       arrayList.add(10);
       System.out.println(arrayList);
   }
}
