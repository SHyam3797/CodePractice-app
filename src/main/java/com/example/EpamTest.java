package com.example;

import com.example.demo.Employee;

import java.util.Arrays;

/**
 * @author shyam CH
 */
public class EpamTest {

    public static void main(String[] args) {


        int ar1[] = {1, 5, 10, 20, 40, 80};

        int ar2[] = {5, 6, 7, 20, 30, 40, 50, 80};

        int ar3[] = {3, 4, 15, 20, 30, 40, 50, 60, 77, 80};

        int ar4[] = {3, 4, 15, 20, 30, 40, 50, 60, 77, 78, 79, 80};

        int ar5[] = {3, 4, 15, 20, 30, 40, 50, 60, 64, 65, 69, 77, 78, 79, 80};

new EpamTest().getDuplicates(ar1,ar2);
    }

    private void getDuplicates(int[] intArray1,int[] intArray2) {

        int[] duplicates = new int[10];
        for(int i =0;i<intArray1.length;i++){
            for(int j=0;j<intArray2.length;j++){
                if(intArray2[j]==intArray1[i]){
                    duplicates[j]=intArray2[j];
                    
                }

            }
        }

        Arrays.stream(duplicates).forEach(System.out::println);

    }
}
