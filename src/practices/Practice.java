package practices;

public class Practice {
    public static void main(String[] args) {

        int [] array = {8,2,9,1,6};
        System.out.println("Before sorting");
        for(int a=0; a<array.length; a++ )
        {
            System.out.println(array[a]);
        }

        for(int x=0; x<array.length;x++){
            int minIndex = x;
            for(int y=x+1; x<array.length; y++){
                if(array[y]< array[minIndex]){
                    minIndex=y;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[x];
            array[x] = temp;


        }

    }


}
