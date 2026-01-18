package assignment_1_d_array;
public class BinarySearch{
 public static void main(String[] args){
	 
  int[] a={10,20,30,40};
  int key=30,l=0,h=a.length-1;
  while(l<=h){
   int m=(l+h)/2;
   if(a[m]==key){System.out.println("Found");break;}
   else if(key<a[m]) h=m-1;
   else l=m+1;
  }
 }
}