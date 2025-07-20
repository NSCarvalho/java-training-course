package collections;

import classes.school.Person;
import classes.school.Student;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {
        arrays();
        list();
        Set();
        queue();
        deque();


    }

    private static void deque() {
        System.out.println("\n########## Deque ##########");
        Deque<Integer> deque = new ArrayDeque<>(1);
        deque.push(1);
        deque.push(2);
        deque.push(3);

        System.out.println("Element: " + deque.pop());
        System.out.println("Element: " + deque.pop());
        System.out.println("Element: " + deque.pop());
    }

    private static void queue() {
        System.out.println("\n########## Queue ##########");
        Queue<String> queueAsArrayDeque = new ArrayDeque<>(1); //
        queueAsArrayDeque.add("Nuno");
        queueAsArrayDeque.offer("Simonton");
        queueAsArrayDeque.add("José");
        String headQueue = queueAsArrayDeque.poll();
        String headQueue2 = queueAsArrayDeque.peek();

        System.out.println("First Head removed: " + headQueue);
        System.out.println("Second Head removed: " + headQueue2);

        Queue<Person> queueAsLinkedList = new LinkedList<>();
        queueAsLinkedList.add(new Student(1));
    }

    private static void Set() {
        System.out.println("\n########## Set ##########");
        Set<String> dictionaryAsHashSet = new HashSet<>(); //
        Set<Integer> dictionaryAsTreeSet = new TreeSet<>();

        dictionaryAsHashSet.add("Alysson");
        dictionaryAsHashSet.add("Alysson");
        dictionaryAsHashSet.add("Debora");

        dictionaryAsHashSet.forEach( value -> value.toString());

        List<Integer> codes = new ArrayList<>();
        codes.add(1);
        codes.add(2);
        codes.add(4);
        codes.add(1);
        codes.add(6);

        System.out.println("Distinct codes:  " + dictionaryAsTreeSet.size());
        codes.forEach(code -> dictionaryAsTreeSet.add(code));
    }

    private static void list() {
        System.out.println("\n########## List ##########");
        List<String> namesAsArrayList = new ArrayList<>(1);
        List<String> namesAsLinkedList = new LinkedList<>();

        // ArrayList
        addNames(namesAsArrayList);
        printNames(namesAsArrayList);
        namesAsArrayList.remove("Brunna")   ;
        namesAsArrayList.clear();

        // Linked List
        addNames(namesAsLinkedList);
        printNames(namesAsLinkedList);
        namesAsLinkedList.clear();
    }

    private static void addNames(List<String> list) {
        list.add("António");
        list.add("Maria");
        list.add("Brunna");
        list.add("Carlos");
    }

    private static void printNames(List<String> list) {
        System.out.println("Students: ");
        list.forEach(elem -> System.out.println("Name: " + elem));
    }

    private static void arrays() {
        System.out.println("########## Arrays ##########");
        try {
            String[] names = new String[2];
            names[0] = "António";
            names[1] = "Maria";
            names[2] = "Brunna";
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
