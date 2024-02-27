package Class2_22;
import java.lang.reflect.Field;
import java.util.Arrays;

public class BinaryTree {
    BinaryTree leftC, rightC; String name;
    public BinaryTree(String nodeName) {
        leftC = null;
        rightC = null;
        name = nodeName;
    }

    public void addChild(BinaryTree leftNode, BinaryTree rightNode) {
            this.leftC = leftNode;
            this.rightC = rightNode;
    }
}
