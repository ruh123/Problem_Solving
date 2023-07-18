public class Main {

    static final int MOD = 1000000007;

    public static int findNumberOfWays(int n_intervals, int n_processes) {
        if (n_intervals == 1) {
            return n_processes;
        }

        // Initialize a DP array to store the number of ways for each time interval
        int[] dp = new int[n_intervals + 1];

        // Base cases
        dp[1] = n_processes;
        dp[2] = (int) ((long) n_processes * (n_processes - 1) % MOD);

        // Calculate the number of ways for each time interval using the previous values
        for (int i = 3; i <= n_intervals; i++) {
            dp[i] = (int) ((long) (dp[i - 1] + dp[i - 2]) * (n_processes - 1) % MOD);
        }

        // Return the number of ways for n_intervals
        return dp[n_intervals];
    }

    public static void main(String[] args) {
        int n_intervals = 2;
        int n_processes = 1;
        int result = findNumberOfWays(n_intervals, n_processes);
        System.out.println("Number of ways processes can be scheduled: " + result);
    }
}
