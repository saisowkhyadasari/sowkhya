package deloittecore1;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("my name is abcdef");
		while(st.hasMoreTokens())
		{System.out.println(st.nextToken());

	}
	}
}

