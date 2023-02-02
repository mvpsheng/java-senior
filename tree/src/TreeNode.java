import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * FileName: Tree1
 * author: gxs
 * Date: 2021/8/13  19:14
 */
public class TreeNode {
    public int data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public static void visit(TreeNode p) {
        System.out.print(p.data+ " ");
    }


    //**********递归的先序遍历**********
    public static void recursivePreOrder(TreeNode p) {
        if (p == null) return;
        visit(p);
        recursivePreOrder(p.leftChild);
        recursivePreOrder(p.rightChild);
    }

    // 非递归前序遍历
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            res.add(current.data);

            if(current.rightChild != null) {
                stack.push(current.rightChild);
            }

            if(current.leftChild != null) {
                stack.push(current.leftChild);
            }
        }

        return res;
    }

    //**********递归的中序遍历**********
    public static void recursiveInOrder(TreeNode p) {
        if (p == null) return;
        recursiveInOrder(p.leftChild);
        visit(p);
        recursiveInOrder(p.rightChild);
    }

    //**********递归的后序遍历**********
    public static void recursivePostOrder(TreeNode p) {
        if (p == null) return;
        recursivePostOrder(p.leftChild);
        recursivePostOrder(p.rightChild);
        visit(p);
    }
    // 非递归中序遍历
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode p = root;
        while(p != null || !stack.isEmpty()) {
            if(p != null) {
                stack.push(p);
                p = p.leftChild;
            } else {
                p = stack.pop();
                res.add(p.data);
                p = p.rightChild;
            }
        }

        return res;
    }

    // 非递归后序遍历
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode p = root;

        // 标记最近出栈的节点，用于判断是否是p节点的右孩子，如果是的话，就可以访问p节点
        TreeNode pre = p;

        while(p != null || !stack.isEmpty()) {
            if(p != null) {

                stack.push(p);
                p = p.leftChild;

            } else {
                p = stack.pop();

                if(p.rightChild == null || p.rightChild == pre) {
                    res.add(p.data);
                    pre = p;
                    p = null;
                } else {
                    stack.push(p);
                    p = p.rightChild;
                    stack.push(p);
                    p = p.leftChild;
                }
            }
        }

        return res;
    }
    //层次遍历
    public static void LaywerTraversal(TreeNode root){
        if(root==null) return;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        TreeNode currentNode;
        while(!list.isEmpty()){
            currentNode=list.poll();
            System.out.print(currentNode.data+" ");
            if(currentNode.leftChild!=null){
                list.add(currentNode.leftChild);
            }
            if(currentNode.rightChild!=null){
                list.add(currentNode.rightChild);
            }
        }
    }
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
        System.out.println("前序遍历");
        recursivePreOrder(a);
        System.out.println("前序非递归");
        System.out.println(preorderTraversal(a).toString());
        System.out.println("中序遍历");
        recursiveInOrder(a);
        System.out.println("中序非递归");
        System.out.println(inorderTraversal(a).toString());
        System.out.println("后序遍历");
        recursivePostOrder(a);
        System.out.println("后序非递归");
        System.out.println(postorderTraversal(a).toString());
        System.out.println("层次遍历");
        LaywerTraversal(a);
    }
}

