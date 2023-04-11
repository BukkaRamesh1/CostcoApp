package com.sample;
import java.util.Scanner;

public class DecisionMaking1 {
	
	public static int[] countvowels(String name){
		int[] result = new int[3];
		char[] ch = name.toCharArray();
		int v=0,c=0,s=0;
		System.out.print("The vowels in the name are : ");
		for(int i=0;i<ch.length;i++) {
			
			if((ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U')||(ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')){

				v=v+1;
				System.out.print(ch[i]+" ");
				
			}
			else if((ch[i]==' ')||(ch[i]=='.')) {
					s=s+1;
				}
					else c=c+1;
		}
		System.out.println("\n");
		result[0]=v;
		result[1]=c;
		result[2]=s;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name= sc.nextLine();
		System.out.println();
		System.out.println("The name is: "+name+"\n");
		int[] res= countvowels(name);
		System.out.println("The no of vowels in the name is: "+res[0]+"\n");
		System.out.println("The no of consonants in the name is: "+res[1]+"\n");
		sc.close();

	}

}
