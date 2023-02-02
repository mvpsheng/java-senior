import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: InOrder
 * author: gxs
 * Date: 2021/8/16  13:52
 */
public class InOrder {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inOrder();
        return res;
    }
//    public static void inOrder(TreeNode root,List<Integer> ans){
//        if (root == null) return;
//        inOrder(root.leftChild,ans);
//        ans.add(root.data);
//        inOrder(root.rightChild,ans);
//    }
//
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(22);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(33);
        TreeNode f = new TreeNode(333);
        TreeNode g = new TreeNode(3333);
        a.leftChild = b;
        a.rightChild = c;
        b.leftChild = d;
        b.rightChild = e;
        c.leftChild = f;
        c.rightChild = g;
        List<Integer> res =inorderTraversal(a);
        System.out.println(res.toString());
    }
public static void inOrder(){
       TreeNode current = new TreeNode(6);
    LinkedList<TreeNode> s = new LinkedList<>();
    while(current != null || !s.isEmpty()){
        while (current != null){
            s.addFirst(current);
            current = current.leftChild;
        }
        if (!s.isEmpty()){
            current = s.removeFirst();
            System.out.println(current.data+" ->");
            current = current.rightChild;
        }
    }
    }
}
