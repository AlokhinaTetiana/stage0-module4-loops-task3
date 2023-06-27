package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int i1=0;
        System.out.println(i1);
        int i2=1;
        System.out.println(i2);
        for(int i=3; i<=lastFibonacci; i++){
            int m=i1+i2;
            i1=i2;
            i2=m;
            System.out.println(m);
        }
    }
}
