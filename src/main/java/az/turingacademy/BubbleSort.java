package az.turingacademy;

public class BubbleSort {  
    public static void main (String[] args){

        int[] arr={2,1,4,3};
        for (int i = 0; i<arr.length; i++) {
            for (int j =i+1; j < arr.length ; j++) {
                if (arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }

        }
    }

}
