package sorting_alg;

public class selection {
    public static void main(String[] args) {
        int[] intArray =  {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestNumber = intArray[0];
            int indexLargestNumber = 0;
            int i;
            for (i = 0; i < lastUnsortedIndex - 1; i++) {

                if (intArray[i] < intArray[i + 1]) {
                    indexLargestNumber = i + 1;
                }
//                System.out.print(intArray[i] + " ");
            }
            swap(intArray, i, indexLargestNumber);
            System.out.println(i + " " + indexLargestNumber);
//            System.out.println(largestNumber);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(" " + intArray[i] + " ");
        }

    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
