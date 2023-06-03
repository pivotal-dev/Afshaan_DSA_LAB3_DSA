package com.afshaan.balancingbrackets;
import java.util.*;

public class BalancingBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.next();
		boolean isBalanced = isStringBalaced(input);
		if(isBalanced == true)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not have Balanced Brackets");
		

	}

	private static boolean isStringBalaced(String s) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Stack<Character> st = new Stack<Character>();
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i)== '[' )
				st.push(s.charAt(i));
			else {//closing brace encountered
				
				if(st.empty())
					return false;
				
				if(!st.empty()) {
					char c =st.pop();
					
					if(		(c=='('	&&	s.charAt(i)==')') || 
							(c=='{' &&	s.charAt(i)=='}') || 
							(c=='[' &&	s.charAt(i)==']')	){
						flag = true;
					}
					else {
						flag = false;
						return flag;
					}
				}
				
			}
			
		}
		if(!st.empty())
			return false;
		
		
		return flag;
	}

}
