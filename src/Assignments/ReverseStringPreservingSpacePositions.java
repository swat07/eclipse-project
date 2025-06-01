package Assignments;

public class ReverseStringPreservingSpacePositions {

    public static void main(String[] args) {
        String input = "Swati Malviya";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // Mark space positions
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Reverse the characters (skip spaces)
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != ' ') {
                while (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArr[i];
                j--;
            }
        }

        System.out.println(new String(result));  // Output: "aivlya itawS"
    }
}
