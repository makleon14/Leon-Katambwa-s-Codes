

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;

public class binarytree
{
	public static void main(String[]args)throws Exception
	{PrintWriter outpt;
	
	outpt=new PrintWriter(new File("JavaAbsOut6.txt"));
	MyBinaryTreeMgr<Integer>BtreeInt=new MyBinaryTreeMgr<Integer>();
	
	BtreeInt.insertnode(78);
	BtreeInt.insertnode(39);
	BtreeInt.insertnode(52);
	BtreeInt.insertnode(28);
	BtreeInt.insertnode(33);
	BtreeInt.insertnode(14);
	BtreeInt.insertnode(16);
	BtreeInt.insertnode(4);
	BtreeInt.insertnode(35);
	BtreeInt.insertnode(105);
	BtreeInt.insertnode(85);
	BtreeInt.insertnode(92);
	BtreeInt.insertnode(80);
	BtreeInt.insertnode(97);
	BtreeInt.insertnode(110);
	BtreeInt.insertnode(99);
	System.out.println("this is the binary tree test there are"+BtreeInt.getnumber());
	outpt.println("this is the binary tree test there are"+BtreeInt.getnumber());
	System.out.println("printing this tree inorde left-middle-right");
	outpt.println("printing this tree inorde left-middle-right");

		//
	
	
	/////////////////////////////before deleting any node
	BtreeInt.inorder(outpt);
	System.out.println("");
	System.out.println("Preoder");
	BtreeInt.preorder(outpt);
	System.out.println(" ");
	System.out.println("PostOrder ");
	BtreeInt.postorder(outpt);
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("/////////////////////////////Delenode 28 ");
	System.out.println("printing this tree inorde left-middle-right");
	BtreeInt.deleteNode(BtreeInt.root, BtreeInt.search(28));
	BtreeInt.inorder(outpt);
	System.out.println("");
	System.out.println("Preoder");
	BtreeInt.preorder(outpt);
	System.out.println(" ");
	System.out.println("PostOrder ");
	BtreeInt.postorder(outpt);
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("/////////////////////////////Delenode 105 ");
	System.out.println("printing this tree inorde left-middle-right");
	BtreeInt.deleteNode(BtreeInt.root, BtreeInt.search(105));
	BtreeInt.inorder(outpt);
	System.out.println("");
	System.out.println("Preoder");
	BtreeInt.preorder(outpt);
	System.out.println(" ");
	System.out.println("PostOrder ");
	BtreeInt.postorder(outpt);
	
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("/////////////////////////////Delenode 110 ");
	System.out.println("printing this tree inorde left-middle-right");
	BtreeInt.deleteNode(BtreeInt.root, BtreeInt.search(110));
	BtreeInt.inorder(outpt);
	System.out.println("");
	System.out.println("Preoder");
	BtreeInt.preorder(outpt);
	System.out.println(" ");
	System.out.println("PostOrder ");
	BtreeInt.postorder(outpt);
	
	

	System.out.println(" ");
	System.out.println(" ");
	System.out.println("/////////////////////////////Delenode 103 ");
	System.out.println("printing this tree inorde left-middle-right");
	BtreeInt.deleteNode(BtreeInt.root, BtreeInt.search(103));
	BtreeInt.inorder(outpt);
	System.out.println("");
	System.out.println("Preoder");
	BtreeInt.preorder(outpt);
	System.out.println(" ");
	System.out.println("PostOrder ");
	BtreeInt.postorder(outpt);
		//BtreeInt.insertnode(78);
		//System.out.println("this is the binary tree test there are"+BtreeInt.getnumber());
		//outpt.println("this is the binary tree test there are"+BtreeInt.getnumber());
		//System.out.println("printing this tree inorde left-middle-right");
	   // outpt.println("printing this tree inorde left-middle-right");
	    //BtreeInt.preorder(outpt);
	   
	    System.out.println(" ");
	    
	    MyBinaryTreeMgr<Double>BtreeDoub=new MyBinaryTreeMgr<Double>();
	    BtreeDoub.insertnode(32.9);
	    BtreeDoub.insertnode(47.3);
	    BtreeDoub.insertnode(89.4);
	    BtreeDoub.insertnode(15.3);
	    BtreeDoub.insertnode(2.5);
	    BtreeDoub.insertnode(103.2);
	    BtreeDoub.insertnode(18.1);
	    BtreeDoub.insertnode(16.2);
	    
	    //System.out.println("this is the binary tree test there are"+BtreeDoub.getnumber());
	  //outpt.println("this is the binary tree test there are"+BtreeDoub.getnumber());
		//System.out.println("printing this tree inorde left-middle-right");
		//outpt.println("printing this tree inorde left-middle-right");
		
		//BtreeDoub.search(16.2);
		//binarySearch(BtreeDoub, 0, 9,16);
		//deleteNode(BtreeDoub.root,BtreeDoub.root) ;
		//BtreeDoub.deleteNode(BtreeDoub.root, BtreeDoub.search(32.8));
		
		//BtreeDoub.inorder(outpt);
		outpt.close();
		

	}//////////////end of main method
		
}/////end of the binarytreeclass


class MyBinaryTreeMgr<T extends Comparable>{
	protected TreeNode<T> root;
	protected int number;
	
	public MyBinaryTreeMgr()
	{
		root=null;
		int number=0;
	}//////end contuctor
	
	public int getnumber(){return number;}
	
	private static class TreeNode<T extends Comparable>
	{protected T nodevalue;
	protected TreeNode<T> left;
	protected TreeNode<T> right;
	
	public TreeNode(T x)
	{nodevalue=x;
	left=null;
	right=null;
		}///end treenode constructor
	}/////////end treenode class
	
	protected TreeNode<T> CreateNode(T x)
	{
		return new TreeNode(x);
	}//end of createNode
	public int insertnode(T x)
	{
		if(root==null)
		{
			root =CreateNode(x);
			number=1;
			 return number;
		}
		else
		{
			TreeNode<T> parent=null;
			TreeNode<T> current=root;
			while(current!=null)
				
				if(x.compareTo(current.nodevalue)<0){
					parent=current;
					current=current.left;
				}
				else if(x.compareTo(current.nodevalue)>0){
					parent=current;
					current=current.right;
				}
				else return -99;
			if (x.compareTo(parent.nodevalue)<0)
				parent.left=CreateNode(x);
			else
				parent.right=CreateNode(x);
			
		}
		number++;
		return number;
	}////end of insert node
	public void inorder(PrintWriter outp)
	{
		inorder(root, outp);
	}/////end inoder helper
	
	protected void inorder(TreeNode<T>root, PrintWriter outp){
		if(root==null) return;
		inorder(root.left,outp);
		System.out.print(root.nodevalue+" ");
		outp.print(root.nodevalue+" ");
		inorder(root.right,outp);
	}
	
	public void postorder(PrintWriter outp)
	{
		postorder(root, outp);
	}/////end inoder helper
	
	protected void postorder(TreeNode<T>root, PrintWriter outp){
		if(root==null) return;
		postorder(root.left,outp);
		postorder(root.right,outp);
		System.out.print(root.nodevalue+" ");
		outp.print(root.nodevalue+" ");
		
	}
	
	public void preorder(PrintWriter outp)
	{
		preorder(root, outp);
	}/////end inoder helper
	
	protected void preorder(TreeNode<T>root, PrintWriter outp){
		if(root==null) return;
		
		System.out.print(root.nodevalue+" ");
		outp.print(root.nodevalue+" ");
		preorder(root.left,outp);
		preorder(root.right,outp);
	}
	
	/////search TAKES A VALUES AND STORES IT IN A NODE
	public TreeNode search(T element){
		TreeNode<T> current1=CreateNode(element);
		TreeNode<T> parent=null;
		current1.nodevalue=element;
/*
		while (current!=null)
			if (element.compareTo(current.nodevalue)<0){
				//parent=current;
				
				current=current.left;
			}
			else if (element.compareTo(current.nodevalue)>0){
				//parent=current;
				current=current.right;
			}
			else if (element.compareTo(current.nodevalue)==0){
				System.out.println(current.nodevalue+" found  ");
				return current;
			}
			else  {current=null;} ;*/
		
		return current1;
	}
	
	public void deleteNode(TreeNode rootptr, TreeNode value){
		TreeNode<T> parent=null;
		TreeNode<T> current= root;
		TreeNode<T> temp=null;///temporary node
		
		
	/////////////first we search for value to see if it is in the tree
		 while(current!=null){
			if(value.nodevalue.compareTo(current.nodevalue)<0){
				parent=current;
				current=current.left;	
			}///end of if
			else if (value.nodevalue.compareTo(current.nodevalue)>0){
				parent=current;
				current=current.right;
			}////end else
			else if (value.nodevalue.compareTo(current.nodevalue)==0){ break;}
			else System.out.println(" Element Not Found");
			
		}//end while loop
		
		 ////if the node to be deleted is not found 
		if (current==null){
			System.out.println(value.nodevalue+" is not in this list");}
		
		//// case where current has no left children
		
		else if (current.left==null){
			 if (parent==null){
				 root=current.right;
			 }
			 else{
				 if (value.nodevalue.compareTo(parent.nodevalue)<0)
					 parent.left=current.right;
				 else
					 parent.right=current.right;
			 }
		}
		else{/////////WHEN CURENT HAS A LEFT CHILD 
			TreeNode<T>parentOfrightmost=current;
			TreeNode<T>rightmost=current.left;
			
			while(rightmost.right !=null){
				temp=rightmost;
				parentOfrightmost=temp;
				rightmost=rightmost.right;
			}
			
			current.nodevalue=rightmost.nodevalue;
			
			if(parentOfrightmost.right==rightmost)
				parentOfrightmost.right=rightmost.left;
			else parentOfrightmost.left=rightmost.left;
		}
		number--;
	}//////////////end deletenode method
	
}//////////////End My binary tree mgr