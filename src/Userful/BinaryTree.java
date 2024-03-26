package Userful;

import Search.Binary;

public class BinaryTree {
    BinaryTree leftN, rightN; String name; int value;

    public BinaryTree(String nodeName, int val) {
        leftN = null;
        rightN = null;
        name = nodeName;
        value = val;
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

    private static BinaryTree[] arrayofNodes(Object[][] objs) {
        BinaryTree[] bt = new BinaryTree[objs.length];
        for(int i = 0; i < objs.length; i++) {
            bt[i] = new BinaryTree((String) objs[i][0], (Integer) objs[i][1]);
        }
        return bt;
    }

    public static BinaryTree binaryTreeSearch(String[] words) {
        Object[][] wordPairs = ValueOfString.stringValuePair(words);
        BinaryTree[] bt = arrayofNodes(wordPairs);
        BinaryTree root = bt[0];
        System.out.println("Root: " + root.name + " Root Value: " + root.value);
        for (int i = 1; i < bt.length; i++) {
            //Start at the root
            BinaryTree node = root;
            BinaryTree parentNode = root;
            //Check value of current node vs the "root"
            //and get the node of where this is supposed to go
            boolean bigOrSmall = node.value < bt[i].value;
            BinaryTree tempNode = bigOrSmall ? node.leftN : node.rightN;

            while (tempNode != null) {
                parentNode = node;
                if(bigOrSmall) {
                    node = node.leftN;
                } else {
                    node = node.rightN;
                }
                bigOrSmall = node.value < bt[i].value;
                tempNode = bigOrSmall ? node.leftN : node.rightN;
            }

            System.out.println("Name: " + bt[i].name  + " Value: " + bt[i].value);
//            System.out.println(bigOrSmall);
            if(bigOrSmall) {
                parentNode.leftN = bt[i];
                System.out.println("Left Node Name: " + node.name  + " Node Value: " + node.value);
            } else {
                parentNode.rightN = bt[i];
                System.out.println("Right Node Name: " + node.name  + " Node Value: " + node.value);
            }
        }
        return root;
    }
}
