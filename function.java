public class function {
    // public static int multiply(int a,int b){
    //     //product of a number
    //     return a+b;
    // }
    public static void fact(int num){
        int facto=1;

      for(int i=1;i<=num;i++){
        facto=facto*i;
        // num--;
        System.out.println(facto);
      }
    }
    public static void main(String[] args) {
    fact(5);
    //     int a=3;
    //     int b=6;
    //    int  product=multiply(a,b);
    //    System.out.println(product);
    }
}
