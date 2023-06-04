public class sort_bubble {

    public static void main(String[] args) {
        int[] intArray =  {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
//        int unsortedPartitionIndex = num.length - 1;
//
//        while (unsortedPartitionIndex > 0) {
//            int indexTracker = 1;
//
//            for (int i = 0; i < unsortedPartitionIndex; i++) {
//                int firstValue = num[indexTracker];
//                int prevValue = num[i];
//
//                if (prevValue > firstValue) {
//                    num[i] = num[indexTracker];
//                    num[indexTracker] = prevValue;
//                };
//                indexTracker++;
//            }
//
//            System.out.println();
//
//            unsortedPartitionIndex--;
//        }
//
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
