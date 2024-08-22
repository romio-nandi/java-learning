package learning;

public class DuplicateValueOfAnArray {
    public void findTheDuplicateNumber(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        } 
    }

    public static void main(String[] args) {
        DuplicateValueOfAnArray obj=new DuplicateValueOfAnArray();
        int []arr={10,25,10,10,25,30,30};
        obj.findTheDuplicateNumber(arr);
    }
}
