package DSA;

import java.util.*;

public class Merged_array {
	public static void main(String[]args) {
	int arr1[] = {40,130,250,390,500};
    int arr2[] = {30,60,70,90,110,300,600,700};
    int res[] = new int[arr1.length + arr2.length];

    int i = 0 ; // arr
    int j = 0 ; // brr
    int k = 0; // res
    while(i < arr1.length   && j < arr2.length  ){
        if(arr1[i] < arr2[j]){
            res[k] = arr1[i];
            i++;
        }else{
            res[k] = arr2[j];
            j++;
        }
        k++;
    }

    if(i < arr1.length){
        while (j< arr1.length){
            res[k] = arr1[i];
            i++;
            k++;
        }
    }
    if(j<arr2.length){
        while (j< arr2.length){
            res[k] = arr2[j];
            j++;
            k++;
        }
    }

    for(int ele : res){
        System.out.print(ele +" ");
    }

}
}


