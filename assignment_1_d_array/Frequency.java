package assignment_1_d_array;
public class Frequency{
 public static void main(String[] args){
  int[] a={1,2,2,3};
  boolean[] v=new boolean[a.length];
  for(int i=0;i<a.length;i++){
   if(v[i]) continue;
   int c=1;
   for(int j=i+1;j<a.length;j++)
    if(a[i]==a[j]){c++;v[j]=true;}
   System.out.println(a[i]+" -> "+c);
  }
 }
}