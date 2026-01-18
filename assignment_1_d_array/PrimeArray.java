package assignment_1_d_array;
public class PrimeArray{
 static boolean isPrime(int n){
  if(n<2) return false;
  for(int i=2;i<=n/2;i++) if(n%i==0) return false;
  return true;
 }
 public static void main(String[] args){
  int[] a={2,3,4,5};
  for(int x:a) if(isPrime(x)) System.out.print(x+" ");
 }
}