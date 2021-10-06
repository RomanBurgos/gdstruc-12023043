package com.romanburgos;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = new int[20];

        numbers[0] = 90;
        numbers[1] = 65;
        numbers[2] = 15;
        numbers[3] = 50;
        numbers[4] = 105;
        numbers[5] = 90;
        numbers[6] = 65;
        numbers[7] = 15;
        numbers[3] = 50;
        numbers[4] = 105;

        int index =-1;

        for(int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 50)
            {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
