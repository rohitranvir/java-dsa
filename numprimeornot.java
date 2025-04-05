public class numprimeornot {
    public static boolean  primeornot( int a){
  boolean isprime=true;
  for(int i=2;i<a-1;i++){
    if(a%i==0){
        isprime=false;
        break;
    }
    
  }
  return isprime;
    }
    public static void main(String[] args) {
        boolean ornot=primeornot(5);
       if(ornot==true){
        System.out.println("Given number is a prime");
       }
       else{
 System.out.println("this number is not a prime");
       }
    }
}
