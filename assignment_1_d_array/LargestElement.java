package assignment_1_d_array;
public class LargestElement{
 public static void main(String[] args){
  int[] a={10,50,20};
  int max=a[0];
  for(int x:a) if(x>max) max=x;
  System.out.println(max);
 }
}