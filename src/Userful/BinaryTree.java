package Userful;


import static Userful.ValueOfString.*;

public class BinaryTree {
    BinaryTree leftN, rightN; String name;

    public BinaryTree(String nodeName) {
        leftN = null;
        rightN = null;
        name = nodeName;
    }

    public static void preOrderPrint(BinaryTree root) {
        if (root == null) return;
        System.out.print(root.name + ", ");
        preOrderPrint(root.leftN);
        preOrderPrint(root.rightN);
    }

    public static void inOrderPrint(BinaryTree root) {
        if (root == null) return;
        inOrderPrint(root.leftN);
        System.out.print(root.name + ", ");
        inOrderPrint(root.rightN);
    }

    public static void postOrderPrint(BinaryTree root) {
        if (root == null) return;
        postOrderPrint(root.leftN);
        postOrderPrint(root.rightN);
        System.out.print(root.name + ", ");
    }

    private static BinaryTree[] makeBinaryTreeArray(String[] a) {
        BinaryTree[] returnArray = new BinaryTree[a.length];
        for (int i = 0; i < a.length; i++) {
            returnArray[i] = new BinaryTree(a[i]);
        }
        return returnArray;
    }

    public static BinaryTree binaryTreeSearch(String[] words) {
        //take words and make nodes
        BinaryTree[] tree = makeBinaryTreeArray(words);

        for(int i=1;i<tree.length;i++) {

            //Store top of the tree
            BinaryTree root = tree[0];

            //true, word 2 has more value : false, word 2 has less value
            boolean leftRight = compareString(root.name,tree[i].name);
            BinaryTree checkNull = leftRight ? root.rightN : root.leftN;

            //traverse
            while (checkNull != null) {
                root = checkNull;
                leftRight = compareString(root.name,tree[i].name);
                checkNull = leftRight ? root.rightN : root.leftN;
            }

            //place after traversal
            if(leftRight) {
                root.rightN = tree[i];
            } else {
                root.leftN = tree[i];
            }
        }

        //return after tree is made
        return tree[0];
    }
}
