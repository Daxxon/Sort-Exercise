import java.util.Arrays;

public class Sort {

  public static void main(String[] args) {
    timeSortOfLength(1000);
    timeSortOfLength(100);
  }

  private static void timeSortOfLength(int length) {
    System.out.println("\nStarting Trial of length " + length + "\n");
    int[] dataToSort = generateDataToSort(length);

    System.out.println("Unsorted data:\n" + Arrays.toString(dataToSort));

    long startTime = System.currentTimeMillis();
    int[] sortedData = sort(dataToSort);
    long endTime = System.currentTimeMillis();

    System.out.println("Sorted data:\n" + Arrays.toString(sortedData));
    System.out.println("Sorting took " + (endTime - startTime) + " milliseconds.\n");
  }

  private static int[] generateDataToSort(int length) {
    int[] data = new int[length];

    for (int i = 0; i < data.length; i++) {
      data[i] = (int) (Math.random() * length);
    }

    return data;
  }

  private static int[] sort(int[] data) {
    //System.out.println("Length of data:\n " + data.length);
    boolean notFinishedSorting = true;

    while (notFinishedSorting){
      notFinishedSorting = false;

      for (int currentNum = 1; currentNum < data.length ; currentNum++){
        //System.out.println("Sorting...\n");
        //System.out.println("Current Number: \n" + currentNum);
        int previousNum = currentNum -1;
        int compareThisNumber = data[previousNum];
        int againstThisNumber = data[currentNum];

        if (compareThisNumber > againstThisNumber){
          data[previousNum] = againstThisNumber;
          data[currentNum] = compareThisNumber;
          notFinishedSorting = true;
          //System.out.println("Sorted data:\n" + Arrays.toString(data));
        }
      }
    }
    return data;
  }
}
