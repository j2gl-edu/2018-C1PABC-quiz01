package edu.advanced.quiz01;

public class MemoryStack {

    public static void fillingStack(int call) {
        if (call == 5) {
            return;
        }
        System.out.println(call);
        fillingStack(++call);
        System.out.println("Getting out");
    }

    public static void main(String[] args) {
        try {
            fillingStack(1);
        } catch (StackOverflowError e) {
            System.out.println("NO MORE MEMORY ON STACK.");
            e.printStackTrace();
        }
    }

}
