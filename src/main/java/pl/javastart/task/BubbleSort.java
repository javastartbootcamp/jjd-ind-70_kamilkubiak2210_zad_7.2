package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {

        int arrayLength = inputArray.length;
        int numberOfComparisons = 0;
        boolean swapped;

        for (int i = 0; i < arrayLength - 1; i++) {
            swapped = false;

            for (int j = 0; j < arrayLength - i - 1; j++) {
                numberOfComparisons++;

                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
        return numberOfComparisons;
    }
}

