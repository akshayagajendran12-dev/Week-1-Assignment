public class TrafficSignalStreakAnalyzer {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("No signal data available.");
            return;
        }

        char currentColor = signalLog.charAt(0);
        char longestColor = currentColor;

        int currentStreak = 1;
        int longestStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char color = signalLog.charAt(i);

            if (color == currentColor) {
                currentStreak++;
            } else {
                currentColor = color;
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestColor = currentColor;
            }
        }

        System.out.println(
            "Longest Streak: '" + longestColor
            + "' repeated " + longestStreak + " times"
        );
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        findLongestStreak("RRGGGYRR");

        System.out.println("\nTest Case 2:");
        findLongestStreak("RRRRYYGG");
    }
}
