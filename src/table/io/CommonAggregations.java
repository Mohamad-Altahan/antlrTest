package table.io;

import java.util.List;

public final class CommonAggregations {
    public double Sum(List<Double> numbers){
        return numbers.
                stream().
                mapToDouble(Double::doubleValue)
                .sum();
    }

    private static volatile CommonAggregations myCommonAggregator;

    private CommonAggregations(){
        if (myCommonAggregator != null) {
            throw new IllegalStateException("CommonAggregations object is already created!");
        }
    }

    public static CommonAggregations getCommonAggregations() {
        if(myCommonAggregator == null){
            synchronized(CommonAggregations.class) {
                if (myCommonAggregator == null) {
                    myCommonAggregator = new CommonAggregations();
                }
            }
        }
        return myCommonAggregator;
    }
}
