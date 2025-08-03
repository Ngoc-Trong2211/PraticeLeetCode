package tu_tim_hieu;
public class test {
    private static int max = -1;
    public static void main(String[] args) {
        // System.out.println(fibo(4));
        int a[] = {0,1,2,3,4,5,6,7,8,9};
        findMax(a, 0);
        System.out.println(max);
    }

    public static int giaiThua(int n){
        if (n==0) return 1;
        return n*giaiThua(n-1);
    }

    public static int fibo(int n){
        if (n==0) return 0;
        if (n==1 || n==2) return 1;
        return fibo(n-1) + fibo(n-2);
    }

    public static void inSoGiamDan(int n){
        if (n<0) return;
        System.out.println(n);
        inSoGiamDan(n-1);
    }

    public static void inSoTangDan(int a[] ,int i){
        if (i<0 || i>=a.length) return;
        inSoTangDan(a, i+1);
        System.out.println(i);
    }

    public static void findMax(int a[], int i){
        if (i<a.length){
            if (a[i] > max) max= a[i];
            findMax(a, i+1);
        }
    }
}
