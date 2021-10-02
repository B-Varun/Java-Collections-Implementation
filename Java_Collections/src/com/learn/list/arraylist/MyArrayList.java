/*
ArrayList that will perform Operations on Integer Objects. 
*/

package com.learn.list.arraylist;

public class MyArrayList {
    private int size;           // Capacity of the arraylist
    private Object[] elements;  // Array to hold elements
    private int pointer = 0;    // Points to the locaion to insert elements

    public MyArrayList(){
        this.size = 10;
        this.elements = new Object[this.size];
    }

    public MyArrayList(int capacity){
        this.size = capacity;
        this.elements = new Object[this.size];
    }

    public void add(int val){
        if(pointer < size)
            elements[pointer++] = val;
        else{
            doubleSizeAndCopy();
            elements[pointer++] = val;
        }
    }

    private void doubleSizeAndCopy(){
        int new_size = size*2;
        Object[] new_array = new Object[new_size];

        // Copy all the elements to new array
        for(int i=0;i<pointer;i++)
            new_array[i] = elements[i];

        elements = new_array;
    }

    public int get(int index){
        if(index>=size || index < 0)
            throw new IndexOutOfBoundsException("index : "+index);
        return (Integer)elements[index];
    }

    public int size(){
        return pointer;
    }

    public int capacity(){
        return size;
    }

    public void remove(int val){
        Object[] new_array = new Object[pointer];

        for(int i=0;i<pointer;i++)
        {
            if((Integer)elements[i] != val)
                new_array[i] = elements[i];
            else
                continue;
        }
    }

    public boolean contains(int val){
        for(int i=0;i<pointer;i++){
            if((Integer)elements[i] == val)
            return true;
        }
        return false;
    }

    public void clear(){
        this.size = 10;
        elements = new Object[size];
    }

    public String toString(){
        String str = "[ ";
        for(int i=0;i<pointer;i++)
            str+=(elements[i].toString()+" ");
        str+="]";
        return str;
    }
}
