package assignment_1_d_array;
public class RightRotate{
 public static void main(String[] args){
  int[] a={1,2,3,4};
  int last=a[a.length-1];
  for(int i=a.length-1;i>0;i--) a[i]=a[i-1];
  a[0]=last;
  for(int x:a) System.out.print(x+" ");
 }
}