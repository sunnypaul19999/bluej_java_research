class Solution {
    private Long[][][] memo;
    private static final int MOD = (int) Math.pow(10, 9) + 7;

    private int mod(long v) {
        return (int) (v % MOD);
    }

    private long func(int a, int l, int n) {
        if (memo[a][l][n] != null) {
            //return memo[a][l][n];
        }
        if (n == 0) {
            return 1;
        }
        long c = 0;
        if (a > 0 && a < 2) {
            c = func(a - 1, l, n - 1);
        }
        if (l > 0 && l < 3) {
            c += func(a, l - 1, n - 1);
        }
        c += func(a, 2, n - 1);
        return c;
    }

    public long checkRecord(int n) {
        memo = new Long[2][3][n + 1];
        return func(1, 2, n);
    }
}
