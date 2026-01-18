package assignment_1_d_array;
public class OddIndexElements{
 public static void main(String[] args){
  int[] a={10,20,30,40,50};
  for(int i=0;i<a.length;i++)
   if(i%2!=0) System.out.print(a[i]+" ");
 }
}