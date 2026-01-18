package assignment_1_d_array;
public class InsertElement{
 public static void main(String[] args){
  int[] a={10,20,30};
  int pos=1,val=99;
  int[] b=new int[a.length+1];
  for(int i=0;i<pos;i++) b[i]=a[i];
  b[pos]=val;
  for(int i=pos;i<a.length;i++) b[i+1]=a[i];
  for(int x:b) System.out.print(x+" ");
 }
}