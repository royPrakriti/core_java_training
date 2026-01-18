package assignment_1_d_array;
public class SecondLargest{
 public static void main(String[] args){
  int[] a={10,40,20,30};
  int max=a[0],sec=a[0];
  for(int x:a){
   if(x>max){sec=max;max=x;}
   else if(x>sec && x!=max) sec=x;
  }
  System.out.println(sec);
 }
}