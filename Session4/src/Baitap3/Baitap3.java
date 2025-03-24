package Baitap3;

import java.util.Arrays;
public class Baitap3 {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();
        int[] array = new int[100000];
        array[0] = 1;
        array[99999] = 100000;
        StringBuilder sb = new StringBuilder(Arrays.toString(array)).reverse();
        System.out.println(sb);
        time.stop();
        System.out.println(time.getElapsedTime());
    }
}
