package com.cbfacademy;

import java.util.*;

public LinkedList<Integer> useLinkedList() {
    LinkedList<Integer> list = new LinkedList<>();

    list.addFirst(4);

    list.add(5);
    list.add(6);
    list.add(8);
    list.add(2);
    list.add(9);

    list.addLast(2);

    list.add(2, 4);
    // TODO: create an empty linked list
    //  - add 4 as the first element of the list
    //  - then add 5, 6, 8, 2, 9 to the list
    //  - add another 2 as the last element of the list
    //  - add 4 as the 3rd element of the list

    //  - invoke the method element() on the list and print the result on the screen
    System.out.println("First element in the list (element())");
    //  - return the list
    return list;
    
}
