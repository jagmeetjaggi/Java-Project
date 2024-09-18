/*import java.util.Scanner;
class A{
public static void main(String[] args)
{
	int n,l=0;
	int sectag=0;
	int firsttag=0;
	String str;
	String newstr="";
	String tag1="";
	String tag2="";
	Scanner oo = new Scanner(System.in);
	//str = oo.nextLine();
	//System.out.println(str[2]);
	n = oo.nextInt();
	while(n >0)
	{
		str = oo.nextLine();
		int len = str.length();
		for(int i=0; i<len; i++)
		{
			if(str.charAt(i) == '<')
			{
			     firsttag = i;
			}else if(str.charAt(i) == '>')
			{
				 sectag = i;
				tag1 = str.substring(firsttag,sectag);
				l = tag1.length();
			}else if(str.charAt(i) == '/')
			{
				int closetag = i;
				tag2 = str.substring(closetag, closetag+l);
				break;
			}
		}
		if(tag1.equals(tag2))
		{
			newstr = str.substring(sectag,len-sectag);
		}
			
		n--;
		System.out.println(newstr);
	}
  }
}*/

/*import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer input

        while (n > 0) {
            String str = scanner.nextLine();
            String newStr = "";

            int openTagStart = str.indexOf('<');
            int openTagEnd = str.indexOf('>', openTagStart);
            int closeTagStart = str.indexOf("</", openTagEnd);
            int closeTagEnd = str.indexOf('>', closeTagStart);

            if (openTagStart != -1 && openTagEnd != -1 && closeTagStart != -1 && closeTagEnd != -1) {
                String openTag = str.substring(openTagStart, openTagEnd + 1);
                String closeTag = str.substring(closeTagStart, closeTagEnd + 1);

                if (closeTag.equals("</" + openTag.substring(1))) {
                    newStr = str.substring(openTagEnd + 1, closeTagStart);
                }
            }

            System.out.println(newStr);
            n--;
        }

        scanner.close();
    }
}

import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		String tag=null;
		String tag1=null;
		int start=0;
		int l=0;
		Scanner oo = new Scanner(System.in);
		String nm = oo.nextLine();
		for(int i=0; i<nm.length(); i++)
		{
			if(nm.charAt(i) == '<')
			{
				 start = i;
				//System.out.println(start);
			}
			else if(nm.charAt(i) == '>')
			{
				int end = i;
				tag = nm.substring(start+1,end);
				l = tag.length();
				//System.out.println(tag);
			}else if(nm.charAt(i) == '/')
			{
				//System.out.println("hello world");
				tag1 = nm.substring(start+l,(start+l)+l);
				//System.out.println(tag1);
				break;
			}
		}
		System.out.println("tag 1 is :"+tag);
		System.out.println("tag 2 is :"+tag1);
		System.out.println("length of string is :"+nm.length());
		System.out.println("length of tag is :"+l);

		if(tag.equals(tag1))
		{
			//System.out.println("hello world");
			String newstr = nm.substring(l+2,(nm.length()-l)-3);
			System.out.println(newstr);
		}
	}
}*/

import java.util.Scanner;

class A {
    public static void main(String[] args) {
        String tag = null;
        String tag1 = null;
        int start = 0;
        int l = 0;
        Scanner oo = new Scanner(System.in);
        String nm = oo.nextLine();
        oo.close();  // Close the scanner to prevent resource leaks

        for (int i = 0; i < nm.length(); i++) {
            if (nm.charAt(i) == '<') {
                start = i;
            } else if (nm.charAt(i) == '>') {
                int end = i;
                if (tag == null) {
                    tag = nm.substring(start + 1, end);
                    l = tag.length();
                } else {
                    tag1 = nm.substring(start + 2, end);
                    break;
                }
            }
        }

        System.out.println("tag 1 is: " + tag);
        System.out.println("tag 2 is: " + tag1);
        System.out.println("length of string is: " + nm.length());
        System.out.println("length of tag is: " + l);

        if (tag != null && tag.equals(tag1)) {
            String newstr = nm.substring(tag.length() + 2, nm.length() - tag.length() - 3);
            System.out.println(newstr);
        }
    }
}
