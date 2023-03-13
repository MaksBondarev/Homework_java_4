// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

package Homework_4;

import java.util.*;

public class HW_1 {
    public static void main(String[] args) {

        LinkedList<String> linkedli = new LinkedList<String>();

        linkedli.add("which");
        linkedli.add("hand");
        linkedli.add("mother");
        System.out.print("Elements before reversing: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nElements after reversing: " + linkedli);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}
