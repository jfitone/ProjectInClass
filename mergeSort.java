package com.company;

public class mergeSort {
    int [] array; // our array, but instead it will be our file.
    int [] tempArray; // temporary array to store values.
    int length; // we will need to utilize length of array.

    public static void main(String[] args) {
        int[] arrayToSort = {7, 11, 99, -1, 0, 45, 2}; // So here is where were gonna want to put the file stored as an array. It'll sort it-
        // from there. The median should be 'left' + 'right' / 2 or 'middle' if i did it right. Hypothetically if its
        //an even array of numbers we should be able to do middle + (middle +1) / 2 to get the median.
        // for array with same contents but with doubles:
        double dubArray[] = new double[arrayToSort.length];
        for(int i = 0; i<arrayToSort.length; i++){
            dubArray[i] = arrayToSort[i];
        }
        mergeSort ar = new mergeSort();
        ar.sort(arrayToSort);
        for(int i:arrayToSort){ //prints the elements
            System.out.println(i);
            System.out.println(" ");
        }

    }
    public void sort(int[] arrayToSort){
        this.array = arrayToSort;
        this.length = arrayToSort.length;
        this.tempArray = new int[length];
        mergeSort(0, length-1);

    }
    public void mergeSort(int left, int right){
        if(left < right){ // if the left side is greater than the right that means the array is sorted.
            int middle = (left + right)/2;
            mergeSort(left, middle);
            mergeSort(middle, right);
            merge(left, middle, right);
        }

    }
    public void merge(int left, int middle, int right){
        for(int i = left; i <= right; i++){
            tempArray[i] = array[i]; //copies the array into temporary array.
        }
        int i = left;
        int j = middle + 1;
        int k = left;
        while(i <= middle && j <= right){
            if(tempArray[i] <= tempArray[j]){ // has elements unsorted, compares them and puts in the right order in our original array
                array[k] = tempArray[i];
                i++;
            }
            else{
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k] = tempArray[i];
            i++;
            k++;

        }

    }
}
