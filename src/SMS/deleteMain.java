// Demonstration Of ArrayList

package SMS;

import java.util.ArrayList;
import java.util.List;

public class deleteMain {
    public static void main(String[] args) {

//        object containing multiple numbers
//        array is a container of multiple numbers but the count of array should be defined
//        To avoid that, we use ArrayList

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers);
    }
}
