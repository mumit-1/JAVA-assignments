import java.util.Scanner;

class Sample {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = obj.nextLine();
        String a = ""; // For reversed second half
        String b = ""; // For first half

        int length = word.length();

        // Reverse the second half
        for (int i = length - 1; i >= (length + 1) / 2; i--) {
            int ascii = (int) word.charAt(i);
            if (ascii >= 65 && ascii <= 90) { // Convert uppercase to lowercase
                ascii += 32;
            }
            a += (char) ascii;
        }

        // Process the first half
        for (int i = 0; i < length / 2; i++) {
            int ascii = (int) word.charAt(i);
            if (ascii >= 65 && ascii <= 90) { // Convert uppercase to lowercase
                ascii += 32;
            }
            b += (char) ascii;
        }

        // Compare both halves
        if (a.equals(b)) {
            System.out.println("The word is a palindrome: true");
        } else {
            System.out.println("The word is a palindrome: false");
        }
    }
}
