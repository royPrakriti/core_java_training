package assignment_1_d_array;
public class NthLargest{
 public static void main(String[] args){
  int[] a={4,1,3,2};
  int n=2;
  for(int i=0;i<a.length;i++)
   for(int j=i+1;j<a.length;j++)
    if(a[i]<a[j]){int t=a[i];a[i]=a[j];a[j]=t;}
  System.out.println(a[n-1]);
 }
}