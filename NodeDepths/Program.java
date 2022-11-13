import java.util.*;

class Program {

  
  //O(n) - time 
  //O(h) - space
  public static int nodeDepths(BinaryTree root) {
    return nodeDepthhelper(root, 0);
  }

  public static int nodeDepthhelper(BinaryTree root, int depth){

    if (root == null) return 0;
    return depth + nodeDepthhelper(root.left, depth + 1) + nodeDepthhelper(root.right, depth+1);
  
  }

  
  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
