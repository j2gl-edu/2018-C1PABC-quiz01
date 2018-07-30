package edu.advanced.quiz01;

public class HeapMemory {

    private String color;
    private Integer myInteger;
    private Float myFloat;
    private HeapMemory next;

    public HeapMemory(String color, Integer myInteger, Float myFloat) {
        this.color = color;
        this.myInteger = myInteger;
        this.myFloat = myFloat;
    }

    public void setNext(HeapMemory next) {
        this.next = next;
    }

    public void display() {
        System.out.println("color    : " + color); 
        System.out.println("myInteger: " + myInteger); 
        System.out.println("myFloat  : " + myFloat); 
        System.out.println("next     : " + next); 
    }

    public static void fillMemory() {
        String color = "12345";
        Integer i = 123;
        Float f = 123.4f;

        HeapMemory h = null;
        while (true) {
            HeapMemory current = new HeapMemory(color, i, f);
            if (h == null) {
                h = current;
            } else {
                current.setNext(h);
                h = current;    
            }
        }
    }

    public static void main(String[] args) {
        try {
            fillMemory();
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
