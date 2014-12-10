package jiawei.kuang.common.datastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TreeNode<T> {
    
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    
    public TreeNode(T data) {
        this.data = data;
    }
    
    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    public List<T> inorderTraversal() {
        List<T> inorder = new ArrayList<T>();
        TreeNode<T> cur = this;
        while (cur != null) {
            if (cur.left == null) {
                inorder.add(cur.data);
                cur = cur.right;
            } else {
                TreeNode<T> pre = cur.left;
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    inorder.add(cur.data);
                    pre.right = null;
                    cur = cur.right;
                }
            }
        }
        return inorder;
    }
    
    public List<T> preorderTraversal() {
        List<T> preorder = new ArrayList<T>();
        TreeNode<T> cur = this;
        while (cur != null) {
            if (cur.left == null) {
                preorder.add(cur.data);
                cur = cur.right;
            } else {
                TreeNode<T> pre = cur.left;
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    preorder.add(cur.data);
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    pre.right = null;
                    cur = cur.right;
                }
            }
        }
        return preorder;
    }
    
    public List<T> postorderTraversal() {
        List<T> postorder = new ArrayList<T>();
        TreeNode<T> cur = new TreeNode<T>(null);
        cur.left = this;
        while (cur != null) {
            if (cur.left == null) {
                cur = cur.right;
            } else {
                TreeNode<T> pre = cur.left;
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    reverseVisit(cur.left, pre, postorder);
                    pre.right = null;
                    cur = cur.right;
                }
            }
        }
        return postorder;
    }
    private void reverseVisit(TreeNode<T> from, TreeNode<T> to, List<T> elements) {
        reverse(from, to);
        TreeNode<T> p = to;
        while (true) {
            elements.add(p.data);
            if (p == from) break;
            p = p.right;
        }
        reverse(to, from);
    }
    private void reverse(TreeNode<T> from, TreeNode<T> to) {
        if (from == to) return;
        TreeNode<T> pre = from, cur = from.right, next = null;
        while (pre != to) {
            next = cur.right;
            cur.right = pre;
            pre = cur;
            cur = next;
        }
    }
}