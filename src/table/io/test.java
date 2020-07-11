package table.io;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        var myNumbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 12.0));
        var myAggregator = CommonAggregations.getCommonAggregations();
        var mySum = myAggregator.Sum(myNumbers);
        System.out.println("MySum is: " + mySum);
    }
}
