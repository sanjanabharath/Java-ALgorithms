import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,4,1,7,2,5,6,};
        cycSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycSort(int[] arr){
        int index=0;
        while(index<arr.length){
            if(arr[index]!=index+1){
                swap(index, arr[index]-1, arr);
            }else{
                index++;
            }
        }
    }

    static void swap(int first,int second,int[] arr){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
