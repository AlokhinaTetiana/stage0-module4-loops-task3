package school.mjc.stage0.loops.task3;

import static java.lang.Math.pow;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result=0;
        for(int i=1; i<=lengthOfLastNumber; i++){
            for(int j=0; j<i; j++){
                result+=9*pow(10,j);
            }
        }
        System.out.println(result);
    }
}
