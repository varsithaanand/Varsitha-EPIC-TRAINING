package binarytree;

import java.util.Scanner;

public class Tree1 
{
	int data;
    Tree1 left, right;
    Tree1 root = null;

    Tree1(Tree1 left, int data, Tree1 right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    Tree1()
    {
    	
    }

    public void insertData(Scanner in) {
        System.out.print("Enter the value: ");
        int val = in.nextInt();

        Tree1 obj = new Tree1(null, val, null);

        if (root == null) {
            root = obj;
        } else {
            Tree1 temp = root;

            while (true) {
                if (val > temp.data) {
                    if (temp.right == null) {
                        temp.right = obj;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = obj;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }

        System.out.println(val + " inserted successfully.");
    }

    
    public void displayPreorder(Tree1 node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        displayPreorder(node.left);
        displayPreorder(node.right);
    }
    
    public Tree1 searchNode(int val)
    {
    	     Tree1 temp=root;
    	      while(temp.data!=val){
    	    	  
            if(val>temp.data){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
    	     return temp;

    }
    public void noChild(Tree1 temp,Tree1 parent)
    {
    	System.out.println(parent.data);
	     
    if(temp==parent.left)
    {
	parent.left=null;
    }
    else
    {
    	parent.right=null;
    }
	       
	System.out.println("Value deleted as one child successfully...");
    }
    
    
    public void rightLeftTemplate(Tree1 temp,Tree1 parent) {
    	Tree1 deleteNode=temp;
    	temp=temp.right;
    	if(temp.left==null) {
    		temp.left=deleteNode.left;
    		parent.left=temp;
    	}
    	else {
    		Tree1 tempParent=null;
    		while(temp.left!=null) {
    			tempParent = temp;
    			temp=temp.left;
    		}
    		if(temp.right!=null) {
    			deleteNode.data = temp.data;
    			tempParent.left = temp.right; 
    		}
    		else {
    			deleteNode.data = temp.data;
    			tempParent.left = null;
    		}
    	}
    	
    	System.out.println("Value deleted as two child sucessfully ....");
    }
    
    public void oneChild(Tree1 temp,Tree1 parent)
    {
    	Tree1 deleteNode=temp;
    	if(temp.left!=null)
    	{
    		deleteNode=temp.left;
    		parent.left=deleteNode;
    	}
    	else
    	{
    	    deleteNode=temp.right;
    	    parent.left=deleteNode;
    	}
    	System.out.println("Value deleted as one child sucessfully ....");
    }
    public void deleteNode(Scanner in)
    {
    	System.out.println("Enter the value to delete: ");
    	int val = in.nextInt();
    	Tree1 temp = root;
    	Tree1 parent = null;
    	while(val!=temp.data) 
    	{
    		parent=temp;
    		if(val>temp.data) {
    			temp=temp.right;
    		}
    		else {
    			temp=temp.left;
    		}
    	}
        
       if(temp.right==null && temp.left==null)
        {
        	  // no child leaf node
    	      noChild(temp,parent);
        	  
        }
        else if(temp.right!=null && temp.left!=null)
        {
        	     //two child
        	    rightLeftTemplate(temp,parent);
        }
        else
        {
        	   //either one child
        	   oneChild(temp,parent);
        }
    }
}
