package demos;

import java.util.Arrays;
import java.util.List;

public class SortingAlgorithms {

    public static void main(String [] args){

        int [] numberList = {33,56,183,2,14,87,90,115,24,15,18,133,105,85,86,70,73,45,5,7,27};
        String output = "{ ";

        System.out.println("Unsorted Array");
        for(int val : numberList){

            output += val+", ";
        }
        System.out.println(output+"}");

        selectionSort(numberList);

        System.out.println("Sorted Array");
        output = "{ ";
        for(int val : numberList){

            output += val+", ";
        }
        System.out.println(output+"}");
    }


    private static void selectionSort(int [] list){

       int pos;

        for(int i = 0 ; i < list.length-1; i++){

            pos = i;
            for(int j  = i+1; j < list.length; j++ ){

                if(list[pos] > list[j]){
                    pos = j;
                }
            }

            if(list[i] > list[pos]){

                swap(list,i, pos);
            }
        }
    }

    private static void insertionSort(int [] list){

        int pos;

        for(int i = 1 ; i < list.length; i++){

            pos = i;

            while(pos > 0 && list[pos] < list[pos-1]){

                swap(list, pos, pos-1);
                pos -= 1;
            }
        }
    }

    private static  void swap(int [] list, int posOne, int posTwo){

        int temp;

        temp = list[posOne];

        list[posOne] = list[posTwo];
        list[posTwo] = temp;
    }
}
