package com.afshaan.findpair;
import java.util.*;
public class FindPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node root = new Node(10);
		
		//left sub tree
		Node root1 = new Node(20);
		root1.left=new Node(40);
		root1.right=new Node(50);
		
		//right sub tree
		Node root2 = new Node(30);
		root2.left=new Node(60);
		root2.right=new Node(70);
		
		//root node
		root.left=root1;
		root.right=root2;
		
		Tree bst = new Tree(root);
		System.out.println("Enter Sum:");
		int sum =sc.nextInt();
		
		//Hashset to store node data
		
		HashSet<Integer> hs = new HashSet<Integer>();
		boolean flag = isPair(sum,hs,root);
		if(!flag)
			System.out.println("nodes are not found.");

	}

	private static boolean isPair(int sum, HashSet<Integer> hs, Node root) {
		// TODO Auto-generated method stub
		
		if(root==null)
			return false;
		
		if(hs.isEmpty()==false && hs.contains((sum-root.data))) {
			System.out.println("Pair is ("+root.data+","+(sum-root.data)+")");
			return true;
		}
		else {
			hs.add(root.data);
			
		}
		
		return ( isPair(sum,hs,root.left))||(isPair(sum,hs,root.right));

	}

}
