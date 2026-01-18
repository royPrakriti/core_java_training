package assignment_1_d_array;
public class UniqueElements{
 public static void main(String[] args){
  int[] a={1,2,2,3};
  for(int i=0;i<a.length;i++){
   int c=0;
   for(int j=0;j<a.length;j++)
    if(a[i]==a[j]) c++;
   if(c==1) System.out.print(a[i]+" ");
  }
 }
}