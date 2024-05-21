package learning;

public class SecondLargestNumberInArray {
    public void largestNumber(int []arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (i<j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
             
        }
    }
}
