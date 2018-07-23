package edu.advanced.quiz01;

public class HeapMemory {

    private String color;
    private Integer myIneger;
    private Float myFlaot;
    private HeapMemory next;

    public HeapMemory(String color, Integer myIneger, Float myFlaot) {
        this.color = color;
        this.myIneger = myIneger;
        this.myFlaot = myFlaot;
    }

    public void setNext(HeapMemory next) {
        this.next = next;
    }

    public static void fillMemory() {
        String color = "12345";
        Integer i = 123;
        Float f = 123.4f;

        HeapMemory h = null;
        while (true) {
            if (h == null) {
                h = new HeapMemory(color, i, f);
            }
            HeapMemory current = new HeapMemory(color, i, f);
            current.setNext(h);
            h = current;
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
