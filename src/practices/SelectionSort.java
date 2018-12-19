package practices;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = {4, 7, 9, 1, 3, 15, 16};
        System.out.println("Numbers before sorting");
        for (int a = 0; a < numbers.length; a++) {
            System.out.println(numbers[a]);
        }
        for (int a = 0; a < numbers.length; a++){
           int minIndex = a;
           for(int b = a+1; b< numbers.length; b++){
               if(numbers[b] < numbers[minIndex]){
                   minIndex = b;
               }
           }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[a];
            numbers[a] = temp;
        }
        System.out.println("Numbers after sorting");
        for (int c = 0; c < numbers.length; c++){
            System.out.println(numbers[c]);
        }
    }
}
