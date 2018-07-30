package edu.advanced.quiz01;

public class MemoryStack {

    public static void fillMemoryStack(int call) {
        if (call == 0) {
            return;
        }
        System.out.println(call);
        fillMemoryStack(++call);
        System.out.println("Getting out");
    }

    public static void main(String[] args) {
        try {
            fillMemoryStack(1);
        } catch (StackOverflowError e) {
            System.out.println("NO MORE MEMORY ON STACK.");
            // e.printStackTrace();
        }
    }

}
