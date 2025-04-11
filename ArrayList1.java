import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Swift");
        cars.add("Audi");
        cars.add("Thar");
        cars.add("BMW");

        System.out.println(cars);
        System.out.println();

        cars.add(1,"Maruti");
        cars.set(2,"Breeza");
        cars.remove(5);

        System.out.println("Size of the ArrayList: " + cars.size());
        for(String i : cars)
        {
            System.out.println(i);
        }


        Collections.sort(cars);
        System.out.println(cars);

        Collections.sort(cars,Collections.reverseOrder());
        System.out.println(cars);

    }
}
