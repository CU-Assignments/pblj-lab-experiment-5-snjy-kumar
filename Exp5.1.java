Question Explanation:

writing a Java program to calculate the sum of a list of integers using autoboxing and unboxing, along with methods to parse strings into their respective wrapper classes (e.g., Integer.parseInt()).

Steps to implement:
1. Create a List of Integers: Initialize a List<Integer> to hold the integers.
2. Autoboxing: Use autoboxing to convert primitive int values to Integer objects automatically when adding to the list.
3. Unboxing: Use unboxing to convert Integer objects back to int for sum calculation.
4. Parse Strings: Create a utility method to parse strings to integers using Integer.parseInt().
5. Calculate the Sum: Use a loop or Java 8 streams to calculate the sum of the list.

  
Java Program:

parseStringToInteger(): This method parses a string into an Integer. It catches any NumberFormatException if the string is not a valid number.
calculateSum(): This method calculates the sum of a list of integers. Java automatically performs unboxing when adding Integer values to sum (an int).

======================================================================================================================
  import java.util.ArrayList;
import java.util.List;

public class SumCalculator {

    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(parseStringToInteger("40"));
        list1.add(parseStringToInteger("50"));

        System.out.println("The sum of the list is: " + calculateSum(list1));

        List<Integer> list2 = new ArrayList<>();
        list2.add(parseStringToInteger("100"));
        list2.add(parseStringToInteger("200"));
        list2.add(parseStringToInteger("300"));

        System.out.println("The sum of the list is: " + calculateSum(list2));

        List<Integer> list3 = new ArrayList<>();
        list3.add(parseStringToInteger("50"));
        list3.add(parseStringToInteger("invalid"));
        list3.add(parseStringToInteger("70"));

        System.out.println("The sum of the list is: " + calculateSum(list3));
    }
}

======================================================================================================================
Output:
The sum of the list is: 150
The sum of the list is: 600
Invalid number format: invalid
The sum of the list is: 120

=========================================================================================================================
  

Test Cases:

Test Case 1:
Input: 10, 20, 30, "40", "50"
Expected Output: The sum of the list is: 150
Description: The list contains a mix of primitive integers and integers parsed from strings.

Test Case 2:
Input: "100", "200", "300"
Expected Output: The sum of the list is: 600
Description: All values are parsed from strings, and the sum is calculated.

Test Case 3:
Input: "50", "invalid", "70"
Expected Output:
Invalid number format: invalid
The sum of the list is: 120
Description: One of the inputs is not a valid integer, so it's skipped, and the sum of valid values is calculated.
