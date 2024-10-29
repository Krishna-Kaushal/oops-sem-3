// Custom exception class for invalid test scores
class InvalidTestScore extends Exception {
    // Constructor that takes a message as input
    public InvalidTestScore(String message) {
        super(message);
    }
}


class TestScores {
    private double[] scores;

    // Constructor that accepts an array of test scores
    public TestScores(double[] scores) throws InvalidTestScore {
        // Validate each score in the array
        for (double score : scores) {
            if (score < 0 || score > 100) {
                // Throw custom exception for invalid test score
                throw new InvalidTestScore("Invalid score: " + score + ". Scores must be between 0 and 100.");
            }
        }
        // If valid, assign the array to the instance variable
        this.scores = scores;
    }

    // Method to calculate and return the average of the test scores
    public double getAverage() {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }
}

public class q5 {
    public static void main(String[] args) {
        try {
            // Sample array of test scores
            double[] scores = {85.5, 90.0, 78.5, 92.0, 88.0};
            
            // Create a TestScores object
            TestScores testScores = new TestScores(scores);
            
            // Display the average score
            System.out.println("Average score: " + testScores.getAverage());
            
        } catch (InvalidTestScore e) {
            // Handle the custom exception for invalid scores
            System.out.println(e.getMessage());
        }

        try {
            // Sample array with an invalid score
            double[] invalidScores = {95.0, 102.0, 88.0};
            
            // This will throw a custom exception
            TestScores testScoresInvalid = new TestScores(invalidScores);
            
            // This line will not be executed because of the exception
            System.out.println("Average score: " + testScoresInvalid.getAverage());
            
        } catch (InvalidTestScore e) {
            // Handle the custom exception for invalid scores
            System.out.println(e.getMessage());
        }
    }
}
