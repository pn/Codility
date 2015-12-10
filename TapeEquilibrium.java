import java.lang.Math;

class Solution {
    public int solution(int[] A) {
        int P = 1;
        int N = A.length;
        int sumLeft = A[0];
        int sumRight = 0;
        for (int i = P; i < N; i++) {
            sumRight += A[i];
        }
        int minDiff = Math.abs(sumLeft - sumRight);
        for (P = 1; P < N - 1; P++) {
            sumLeft += A[P];
            sumRight -= A[P];
            int absDiff = Math.abs(sumLeft - sumRight);
            if (absDiff < minDiff) {
                minDiff = absDiff;
            }
        }
        return minDiff;
    }
}
