package Class2_22;

import java.lang.reflect.Field;
import java.util.Arrays;

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
        BinaryTree b = new BinaryTree("b");
        BinaryTree c = new BinaryTree("c");
        BinaryTree d = new BinaryTree("d");
        BinaryTree e = new BinaryTree("e");
        BinaryTree f = new BinaryTree("f");
        BinaryTree g = new BinaryTree("g");
        BinaryTree h = new BinaryTree("h");
        BinaryTree i = new BinaryTree("i");
        BinaryTree j = new BinaryTree("j");
        BinaryTree k = new BinaryTree("k");
        BinaryTree l = new BinaryTree("l");

        a.addChild(b,c);
        b.addChild(d,e);
        d.addChild(g,null);
        e.addChild(h,i);
        i.addChild(l,null);
        c.addChild(null, f);
        f.addChild(j,k);

        for(Field p : a.getClass().getFields()) {
            System.out.println(p.getName());
        }

//        System.out.println("\nPre");
//        preOrderPrint(a);
//        System.out.println("\nIn");
//        inOrderPrint(a);
//        System.out.println("\nPost");
//        postOrderPrint(a);

    }
}
