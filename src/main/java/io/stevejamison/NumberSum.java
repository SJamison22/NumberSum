package io.stevejamison;

import java.util.Scanner;

/**
 * Created by stevejaminson on 5/18/16.
 */
public class NumberSum {

    public int promptUser(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int number = sc.nextInt();
        return number;
    }

    public int addNumbers(int num){
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum += i;
        }
        return sum;
    }
}
