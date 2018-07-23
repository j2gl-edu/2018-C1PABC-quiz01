package edu.advanced.quiz01;

/*
Se tiene la clase Nodo de la siguiente forma:

  public class Nodo {

    private String nombre;

    private Nodo siguiente;

    // Getters and Setters
  }


  Realice una función que imprima el campo "nombre" de forma recursiva
 */

public class NameList {

    public class Node {

        private String name;
        private Node next;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node initializeList(String name, int total) {
        Node root = null;
        Node previous = root;
        Node aux;
        int i = 0;
        while (i < total) {
            i++;
            aux = new Node();
            aux.setName(name + " " + i);
            if (previous == null) {
                root = aux;
            } else {
                previous.setNext(aux);
            }
            previous = aux;
        }
        return root;
    }

    private void displayTraditional(Node root) {
        Node actual = root;
        while (actual != null) {
            System.out.println(actual.getName());
            actual = actual.getNext();
        }
    }

    private void displayWithRecursion(Node currentNode) {
        if (currentNode == null) {
            return;
        } else {
            System.out.println(currentNode.getName());
            displayWithRecursion(currentNode.getNext());
        }
    }

    public static void main(String[] args) {
        NameList nameList = new NameList();
        Node root = nameList.initializeList("Michael Jackson", 10);

        System.out.println("Display Traditional:");
        nameList.displayTraditional(root);

        System.out.println();
        System.out.println("Display with Recursion:");
        nameList.displayWithRecursion(root);
    }

}
