package operator;

public class conditional {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		String res=(a>b)?"a is greater than b":"a is less than b";
		System.out.println(res);
		
		
		int c = 3;
	    int d = 14;
	    int e = 8;
	    
	    int res1 = (a>b && a >c)? c:(d>e ? d:e);
	    
	    int big = (a>b)?a:b;
	    big = (big>c)? big:c;
	    System.out.println("biggest number:"+big);
	    
	    int bigone = (a>b && a >c && a>d)?a:((b>c && b>d)?b:(c>d)?c:d);
	    System.out.println("biggest one of the following:"+ bigone);
	    
	    
	    int f = 19, g = 20,h =15;
	    
	    if (f>g && f>h ){
	    	System.out.println("biggest is:" + f);
	    }if(g>h){
	    	System.out.println("biggest is:" + g);
	    	
	    }else {
	    	System.out.println("biggest is:" + h);
	    }
	    
	    
	    
	    
	    
	    
	    
	   
	}

}
