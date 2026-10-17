public class TypingSpeedTestAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original.length() != typed.length()) {
            System.out.println(
                "Error: Both strings must have equal length."
            );
            return;
        }

        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy =
            (matched * 100.0) / original.length();

        System.out.println(
            "Matched: " + matched + "/" + original.length()
            + " | Accuracy: "
            + String.format("%.2f", accuracy) + "%"
        );

        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println(
                "First Mismatch at position "
                + (firstMismatch + 1)
                + " ('" + original.charAt(firstMismatch)
                + "' vs '" + typed.charAt(firstMismatch) + "')"
            );
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("\nTest Case 2:");
        checkTypingAccuracy("coding", "coding");
    }
}
