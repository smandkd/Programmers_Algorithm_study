static int[] fibo = new int[100];

public static int F(int n) {
    fibo[0] = 1;
    fibo[1] = 1;

    for(int i = 2; i <= n; i++) {
        fibo[i] = fibo[i - 1] + fibo[i - 2];
    
    }

    return fibo[n];
}