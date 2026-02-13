class Node{
int data;
Node left;
Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

 class BinaryTree {
    Node root;

    Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }

        if(data<root.data){
           root.left=insert(root.left,data); 
        }else if(data>root.data){
            root.right=insert(root.right,data);
        }

        return root;
    }
    
}
