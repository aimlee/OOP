
package com.company;
import java.util.Scanner;

public class Data {
        private double avg, max;
        private int value, sum;
        public int cnt = 0;
        Data()
        {
            avg = 0.0;
            max = 0;
            value = 0;
            cnt = 0;
            sum = 0;
        }
        public void addValue(int value)
        {
            this.value = value;
            if(value > max)
                max = value;
            ++cnt;
            sum += value;
            avg = sum / cnt;
        }
        public double getAvg()
        {
            if(cnt == 0)
                return 0;
            return avg;
        }
        public double getMax()
        {
            return max;
        }

    public static class Analyzer
    {
        public Scanner sc = new Scanner(System.in);

        Data d = new Data();
        boolean boo =true;
        public int input;
        Analyzer(){}
        public void Info()
        {
            String s = "Q";
            while(boo)
            {
                System.out.println("Enter a number: ");
                input = sc.nextInt();
                d.addValue(input);
                s = sc.next();
                if(s.equals("Q")){boo= false;}

            }
            System.out.println("Average = " + d.getAvg());
            System.out.println("\nMaximum = " + d.getMax());

        }

    }

}