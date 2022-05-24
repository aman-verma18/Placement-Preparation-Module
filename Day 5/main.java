import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    s=s.toUpperCase();
	    int len=s.length();
	    int[] count=new int[26];
	    
	    for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        int index=(int)ch-65;
	       // System.out.println(index);
	        if(ch!=' ')
	        count[index]++;
	    }
	    for(int i=0;i<26;i++)
	    {
	        if(count[i]>1)
	        System.out.println((char)(i+65)+"="+count[i]);
	    }
	}
}
