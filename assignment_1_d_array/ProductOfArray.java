package assignment_1_d_array;
public class ProductOfArray{
 public static void main(String[] args){
  int[] a={1,2,3,4};
  int p=1;
  for(int x:a) p*=x;
  System.out.println(p);
 }
}