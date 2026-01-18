package assignment_1_d_array;
public class ReverseUsingNewArray{
 public static void main(String[] args){
  int[] a={10,20,30};
  int[] b=new int[a.length];
  for(int i=0;i<a.length;i++)
   b[i]=a[a.length-1-i];
  for(int x:b) System.out.print(x+" ");
 }
}