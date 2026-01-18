package assignment_1_d_array;
public class RemoveElement{
 public static void main(String[] args){
  int[] a={10,20,30,40};
  int pos=2;
  for(int i=pos;i<a.length-1;i++) a[i]=a[i+1];
  for(int i=0;i<a.length-1;i++) System.out.print(a[i]+" ");
 }
}