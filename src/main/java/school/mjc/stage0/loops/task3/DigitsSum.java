package school.mjc.stage0.loops.task3;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class DigitsSum {
    public void printDigitsSum(int t){
        int res=0;
        t=abs(t);
        String str= Integer.toString(t);
        for(int i=str.length()-1; i>=0;i--){
            int p=t/(int)pow(10,i);
            res+=p;
            t-=pow(10,i)*p;
        }
        System.out.println(res);
    }
}
