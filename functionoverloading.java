public class functionoverloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(int a,int b,int c){
return a+b+c;
    }
    public static void main(String[] args) {
        

        System.out.println(sum(5,6));
        System.out.println(sum(2, 6,8));
    }
}
