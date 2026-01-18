package assignment_1_d_array;
public class DuplicatePrimes{
 static boolean isPrime(int n){
  if(n<2) return false;
  for(int i=2;i<=n/2;i++) if(n%i==0) return false;
  return true;
 }
 public static void main(String[] args){
  int[] a={2,3,2,5,3};
  for(int i=0;i<a.length;i++)
   for(int j=i+1;j<a.length;j++)
    if(a[i]==a[j] && isPrime(a[i]))
     System.out.print(a[i]+" ");
 }
}