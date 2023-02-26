package org.example;


public class Main {
    public static void main(String[] args) {
        Integer [] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 };
        Utils.quickSort (intVector,0, intVector.length - 1,true);

        Double [] floatVector = { 19.1, 456.6, 23.45, 12.34, 11.11, 354.55, 78.45, 28.33, 45.99, 108.88 };
        Utils.quickSort (floatVector,0, floatVector.length - 1,true);

        String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        //Utils.quickSort (strVector,0, floatVector.length - 1,true);

        for(int i=0;i< intVector.length - 1;i++){
            System.out.println(intVector[i]);
        }

        System.out.println("");
        for(int i=0;i< floatVector.length - 1;i++){
            System.out.println(floatVector[i]);
        }
    }
}