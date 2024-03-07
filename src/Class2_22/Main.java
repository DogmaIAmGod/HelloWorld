package Class2_22;

public class Main {

    public static void preOrderPrint(BinaryTree root) {
        if (root == null) return;
        System.out.print(root.name + ", ");
        preOrderPrint(root.leftC);
        preOrderPrint(root.rightC);
    }

    public static void inOrderPrint(BinaryTree root) {
        if (root == null) return;
        inOrderPrint(root.leftC);
        System.out.print(root.name + ", ");
        inOrderPrint(root.rightC);
    }

    public static void postOrderPrint(BinaryTree root) {
        if (root == null) return;
        postOrderPrint(root.leftC);
        postOrderPrint(root.rightC);
        System.out.print(root.name + ", ");
    }
    public static void main(String[] args) {

        BinaryTree a = new BinaryTree("a");
        BinaryTree b = new BinaryTree("B");
        BinaryTree c = new BinaryTree("C");
        BinaryTree d = new BinaryTree("d");
        BinaryTree e = new BinaryTree("e");
        BinaryTree f = new BinaryTree("F");
        BinaryTree g = new BinaryTree("g");

        BinaryTree[] bt = {a,b,c,d,e,f,g};
        BinaryTree.BinarySearchTree(bt);
//        BinaryTree.binaryTreeSearch(a,"B",0);



//        a.addChild(b,c);
//        c.addChild(d,e);
//        d.addChild(f,g);

//        System.out.println("\nPre");
//        preOrderPrint(a);
//        System.out.println("\nIn");
//        inOrderPrint(a);
//        System.out.println("\nPost");
//        postOrderPrint(a);

    }
}
