import java.util.*;

public class HW_3 
{

public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int m = con.nextInt();
        con.close();
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
    System.out.println(dp[n-1][m-1]);
    }  
}
    


// {
//   public static void main_2(String[] args)
//     {
//         Scanner con = new Scanner(System.in);
//         int m = con.nextInt();
//         int n = con.nextInt(); 
//         con.close();
//         long dp[][] = new long [m+1][n+1];
//         for(int i = 1; i <= m; i++) dp[i][1] = 1;
//         for(int j = 1; j <= n; j++) dp[1][j] = 1;

//         for(int i = 2; i <= m; i++)
//         for(int j = 2; j <= n; j++)
//         dp[i][j] = dp[i-1][j] + dp[i][j-1];

//     System.out.println(dp[m][n]);
    
//   }
// }




// {
//     public static void main(String[] args)

//     {
//         Scanner con = new Scanner(System.in);
//         int n = con.nextInt();
//         int m = con.nextInt();
//         con.close();
//         long dp[][] = new long[n + 1][m + 1];
//         dp[0][0] = 2;
//         for (int j = 0; j < m; j++) {
//             dp[0][j] = dp[0][j - 1] + dp[0][j];
//                 for (int i = 0; i < n; i++)
//                     dp[i][0] = dp[i - 1][0] + dp[i][0];
//         }
//         for (int j = 0; j <= m; j++) {
//             for (int i = 0; i <= n; i++) {
//                 if (dp[i - 1][j] > dp[i][j - 1]) {
//                     dp[i][j] = dp[i][j] + dp[i - 1][j];
//                 } else {
//                     dp[i][j] = dp[i][j] + dp[i][j - 1];
//                 }
//             }
//         }
//         System.out.println(dp[n][m]);   
//     }
// }