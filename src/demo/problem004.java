package demo;

public class problem004 {
    public static void main(String[] args){
        int [] arr ={10,20,30,40};
        int min = 100;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element =");
        System.out.println(min);
    }
}
