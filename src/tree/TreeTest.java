package tree;

public class TreeTest {
    class Tree{
        Node root;
        Tree(int size){
            root = makeBST(0, size -1);
        }
        class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data = data;
            }
        }
        Node makeBST(int start, int end){
            if(start > end)
                return null;

            int mid = (start + end) / 2;
            Node node = new Node(mid);
            node.left = makeBST(start, mid-1);
            node.right = makeBST(mid+1, end);
            return node;
        }
    }
    public static void main(String[] args) {
        
    }
}
