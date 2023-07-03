static int[] fibo = new int[100];

public static int F(int n) {
    if(n <= 2) {
        return 1;
    }

    if(fibo[n] == 0) {
        fibo[n] = F(n-1) + F(n-2);
    }

    return fibo[n];
}