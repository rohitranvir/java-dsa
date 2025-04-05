public class Bionomial {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int bincoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_n_minus_r=factorial(n-r);
        int bincoeff=fact_n/(fact_r*fact_n_minus_r);
return bincoeff;
    }
    public static void main(String[] args) {
        int bin=bincoeff(5,4);
        System.out.println(bin);
    }
}
