package Class2_22;

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

    private static boolean isLower(int num) {
        if (num <= 122 && num >= 96) {
            return true;
        }
        return false;
    }

    public static void BinarySearchTree(BinaryTree[] a) {

        //Get first node that everything will be compared against
        String root = a[0].name;
        int rootNum = root.charAt(0);

       for(int i=1;i<a.length;i++) {

           //Put other elements on whichever side
           String node = a[i].name;
           int nodeNum = root.charAt(0);

           
           if(isLower(rootNum) && !isLower(nodeNum)) {

           }














//           if((checkNum < 123 && checkNum > 96) && (rootNum < 91 && rootNum > 64)) {
//               if (a[start].rightC == null) {
//                   start = i;
//               } else if (a[start].rightC != null) {
//                   start = i;
//               }
//           }
//
//           if((checkNum < 91 && checkNum > 64) && (rootNum < 123 && rootNum > 96)) {
//               if (a[start].leftC == null) {
//                   start = i;
//               } else if (a[start].leftC != null) {
//                   start = i;
//               }
           }
       }
    }

//    public static void binaryTreeSearch(BinaryTree a, String target, int count) {
//        int targetNum = target.charAt(0);
//        int binaryNum = a.name.charAt(0);
//
//        if(targetNum == binaryNum) {
//            System.out.println("Found | Count: " + count);
//            return;
//        }
//
//        if(a.leftC == null && a.rightC == null) {
//            System.out.println("Not Found");
//            return;
//        }
//
//        if((targetNum >= 97 && targetNum <= 122) && (binaryNum >= 97 && binaryNum <= 122)) {
//            if(targetNum > binaryNum && a.rightC != null) {
//                a = a.rightC;
//            } else {
//                System.out.println("Not found");
//                return;
//            }
//
//            if(targetNum < binaryNum && a.leftC != null) {
//                a = a.leftC;
//            } else {
//                System.out.println("Not found");
//                return;
//            }
//        }
//
//        if((targetNum >= 65 && targetNum <= 90) && (binaryNum >= 97 && binaryNum <= 122)) {
//            if(a.leftC != null) {
//                a = a.leftC;
//            } else {
//                System.out.println("Not found");
//                return;
//            }
//        }
//
//        if((targetNum >= 97 && targetNum <= 122) && (binaryNum >= 65 && binaryNum <= 90)) {
//            if(a.rightC != null) {
//                a = a.rightC;
//            } else {
//                System.out.println("Not found");
//                return;
//            }
//        }
//        count++;
//        binaryTreeSearch(a, target, count);
//    }
//}
