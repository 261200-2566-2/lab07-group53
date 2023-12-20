import java.util.Arrays;
import java.util.Set;

public class Lab07 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Set1 add 3 : " + set1.add(3));
        System.out.println("Set1 add 5 : " + set1.add(5));
        System.out.println("Set2 add 6 : " + set2.add(6));
        System.out.println("Set2 add 9 : " + set2.add(9));
        System.out.println("Set2 add 1 : " + set2.add(1));
        System.out.println("Set2 add 1 : " + set2.add(1));
        System.out.println("Set1 add 1 : " + set1.add(1));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Size Set1 = " + set1.size() + " : "+ Arrays.toString(set1.toArray()));
        System.out.println("Size Set2 = " + set2.size() + " : "+ Arrays.toString(set2.toArray()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Add set2 to set1 : " + set1.addAll(set2));
        System.out.println("Size Set1 = " + set1.size() + " : "+ Arrays.toString(set1.toArray()));
        System.out.println("Size Set2 = " + set2.size() + " : "+ Arrays.toString(set2.toArray()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Contains 5 : " + set1.contains(5));
        System.out.println("Contains 10 : " + set1.contains(10));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Remove 5 : " + set1.remove(5));
        System.out.println("Remove 10 : " + set1.remove(10));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Size of set1 = " + set1.size());
        System.out.println("Elements in the set1 : " + Arrays.toString(set1.toArray()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        set1.clear();
        System.out.println("Clearing to set1!!");
        System.out.println("Size of the set1 : " + set1.size());
        System.out.println("Is the set empty? " + set1.isEmpty());
        System.out.println("Size Set1 = " + set1.size() + " : "+ Arrays.toString(set1.toArray()));
        System.out.println("Size Set2 = " + set2.size() + " : "+ Arrays.toString(set2.toArray()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}