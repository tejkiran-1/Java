package Hyperskill;

import java.util.Arrays;

public class arrayToString {
    public static void main(String [] args){
        int[] num = {1,2,3,4,5};

        String str = Arrays.toString(num);
        System.out.println(str);

        int[] numbers1 = { 1, 2, 5, 8 };
        int[] numbers2 = { 1, 2, 5 };
        int[] numbers3 = { 1, 2, 5, 8 };

        System.out.println(Arrays.equals(numbers1, numbers2)); // it prints "false"
        System.out.println(Arrays.equals(numbers1, numbers3)); // it prints "true"

        int size = 10;
char[] characters = new char[size];

// It takes an array, start index, end index (exclusive) and the value for filling the array
Arrays.fill(characters, 0, size / 2, 'A'); 
Arrays.fill(characters, size / 2, size, 'B');

System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]
    }
}