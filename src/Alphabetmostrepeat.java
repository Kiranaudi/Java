
public class Alphabetmostrepeat {

	public static void main(String[] args) {
		String s1="audi";
		String s2="kiran";
		String s3="helllo";
		String s4=s1.concat(s2).concat(s3);
        System.out.println(s4);        
       char[] a=s4.toCharArray();
        int c=1,m=0;
        char maxChar=0;
        for(int i=0;i<a.length;i++) {
        	c=1;
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]==a[j]) {
            		c++;
            	}
        	}
        	if(c>m) {
        		maxChar=a[i];
        		m=c;
        	}
        	
        }
        System.out.println(maxChar+"    "+m);
        
	}

}
