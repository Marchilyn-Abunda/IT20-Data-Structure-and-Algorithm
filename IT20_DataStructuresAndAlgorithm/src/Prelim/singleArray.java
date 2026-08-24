package Prelim;

public class singleArray {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5};

//        Print specific element
        System.out.println(numbers[4]);

        //        Print all elements using for loop
        System.out.println("\nPrint all element:");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

//        Change element
        numbers[4] = 6;

//        Print all elements using for loop
        System.out.println("\n\nPrint after changing element:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print( numbers[i] + " ");
        }
    }

}
