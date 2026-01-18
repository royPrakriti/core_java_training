package assignment_1_d_array;
public class RemoveDuplicates{
 public static void main(String[] args){
  int[] a={1,2,2,3};
  for(int i=0;i<a.length;i++){
   boolean u=true;
   for(int j=0;j<i;j++)
    if(a[i]==a[j]) u=false;
   if(u) System.out.print(a[i]+" ");
  }
 }
}