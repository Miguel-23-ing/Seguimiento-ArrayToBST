import java.util.ArrayList;

public class BST {
    private Node root;

    public void add(String entry){
        if(root == null){
            root = new Node (entry);
            //System.out.println(root.getKey());
        }else{
            add(root, new Node (entry));
        }
    }
    private void add(Node current, Node node){
        if(node.getKey().compareTo(current.getKey()) < 0){
            //Meter a la izquierda
            if(current.getLeft() == null){
                current.setLeft(node);
            }else{
                add(current.getLeft(), node);
            }
        }else if(node.getKey().compareTo(current.getKey()) > 0){
            //Meter a la derecha
            if(current.getRight() == null){
                current.setRight(node);
            }else{
                add(current.getRight(), node);
            }

        }
    }
    private void arrayTo(String[] a, String[] b){
        if(b.length != 0){
            arrayTo(b);
        }
        if(a.length != 0){
            arrayTo(a);
        }
        return;
    }

    public void arrayTo(String[] alist){
        int temporal;
        int n;
        temporal = alist.length;
        if(alist.length % 2 == 0){
            n = (alist.length/2)-1;
            add(alist[n]);
            if(alist.length > 1){
                String[] a = new String[(temporal-1)/2];
                String[] b = new String[(temporal)/2];
                System.arraycopy(alist, 0, a, 0, a.length);
                System.arraycopy(alist, a.length+1, b, 0, b.length);
                arrayTo(a,b);
            }

        }else{
            n = alist.length/2;
            add(alist[n]);
            if(alist.length > 1){
                String[] a = new String[(temporal)/2];
                String[] b = new String[(temporal)/2];
                System.arraycopy(alist, 0, a, 0, a.length);
                System.arraycopy(alist, a.length+1, b, 0, b.length);
                arrayTo(a,b);
            }
        }
    }

    public void inOrderReverse(){
        inOrderReverse(root);
    }

    private void inOrderReverse(Node current){
        if(current == null){
            return;
        }
        inOrderReverse(current.getRight());
        System.out.println(current.getKey());
        inOrderReverse(current.getLeft());
    }

}
