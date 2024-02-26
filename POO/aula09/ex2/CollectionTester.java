package aula09.ex2;

import java.util.*;

public class CollectionTester {
    public static void main(String[] args) {
        int DIM = 5000;
        Collection<Integer> col = new ArrayList<>();
        Collection<Integer> cal = new LinkedList<>();
        Collection<Integer> cel = new HashSet<>();
        Collection<Integer> cil = new TreeSet<>();
        System.out.printf("%s%9s%10s\n", "Collection", "1000", "5000");
        System.out.println("\nArrayList");
        checkPerformance(col, DIM);
        System.out.println("\nLinkedList");
        checkPerformance(cal,DIM);
        System.out.println("\nHashSet");
        checkPerformance(cel,DIM);
        System.out.println("\nTreeSet");
        checkPerformance(cil,DIM);

    }

    private static void checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop,delta, delta1000,delta5000;

// Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<1000; i++ ){
            col.add( i );
        }
        Collection<Integer> col2 = col;
        col.clear();
        stop = System.nanoTime(); // clock snapshot after
        delta1000 = (stop-start)/1e6; // convert to milliseconds

        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ){
            col.add( i );
        }
        stop = System.nanoTime(); // clock snapshot after
        delta5000 = (stop-start)/1e6; // convert to milliseconds

        System.out.printf("%s%15.1f%10.1f\n","add", delta1000, delta5000);
// Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<1000; i++ ) {
            int n = (int) (Math.random()*1000);
            if (!col.contains(n))
                System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta1000 = (stop-start)/1e6; // convert to milliseconds


        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!col.contains(n))
                System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta5000 = (stop-start)/1e6; // convert to milliseconds


        System.out.printf("%s%12.1f%10.1f\n","search", delta1000, delta5000);
// Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator2 = col2.iterator();
        while (iterator2.hasNext()) {
            iterator2.next();
            iterator2.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta1000 = (stop-start)/1e6; // convert nanoseconds to milliseconds


        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta5000 = (stop-start)/1e6; // convert nanoseconds to milliseconds
        System.out.printf("%s%12.1f%13.4f\n","remove", delta1000, delta5000);

    }

}