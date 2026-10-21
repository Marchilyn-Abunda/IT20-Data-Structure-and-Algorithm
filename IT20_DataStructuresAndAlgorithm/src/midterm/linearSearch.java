package midterm;

public class linearSearch {

//    Method
    public static int search(int[] arr, int values) {
        for (int i = 0; i < arr.length; i++) {
//            Condition
            if (arr[i] == values) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int result = search(arr, 4);
//        

        if (result >= 0) {
            System.out.print("Found at index:" + result + " = " + arr[result]);
        } else {
            System.out.print("Element not Found");
        }

    }
}
