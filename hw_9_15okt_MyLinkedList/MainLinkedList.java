package de.telran.hw_9_15okt_MyLinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        MyLinkedList lists = new MyLinkedList();
        System.out.println(" - pushToHead - ");
        lists.pushToHead(5);
        lists.pushToHead(3);
        lists.pushToHead(6);
        lists.print();

        System.out.println(" - removeFirst - ");
        lists.removeFirst();
        lists.print();

        System.out.println(" - pushToTail - ");
        lists.pushToTail(7);
        lists.print();

        System.out.println(" - removeLast - ");
        lists.removeLast();
        lists.print();

        System.out.println(" - pushToIndex - ");
        lists.pushToIndex(1, 10);
        lists.print();

        System.out.println(" - removeToIndex - ");
        lists.remove(2);
        lists.print();

        System.out.println(" - size - ");
        System.out.println("lists.size() = "+ lists.size());

        System.out.println(" - get(index) - ");
        lists.pushToHead(12);
        lists.pushToHead(14);
        lists.print();
        System.out.println("lists.get(3) = "+ lists.get(3));

    }


}
