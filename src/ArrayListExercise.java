import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Intel");
        list.add("Amd");
        list.add("Nvidia");

        System.out.println(list);
        System.out.println(list.set(1, "AMD"));
        System.out.println(list.get(2));
        System.out.println(list.indexOf("AMD"));
        System.out.println(list.contains("Intel"));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.size());


    }
}
