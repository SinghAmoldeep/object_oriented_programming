package java_classes_and_objects.Level_2.Palindrome_checker;

class palindrome {
    String text;

    palindrome(String text) {
        this.text = text;
    }

    // Check if string is palindrome
    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    // Display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("'" + text + "' is a palindrome.");
        } else {
            System.out.println("'" + text + "' is not a palindrome.");
        }
    }
}