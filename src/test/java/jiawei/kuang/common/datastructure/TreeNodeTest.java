package jiawei.kuang.common.datastructure;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class TreeNodeTest {

    private TreeNode<Integer> root;
    
    @Before
    public void setTree() {
        root = new TreeNode<Integer>(2);
        root.left = new TreeNode<Integer>(1);
        root.right = new TreeNode<Integer>(3);
    }
    
    @Test
    public void inorderTest() {
        List<Integer> inorder = new ArrayList<Integer>() {
            private static final long serialVersionUID = 2445507190755514481L;
            {
                add(1);add(2);add(3);
            }
        };
        assertEquals(inorder, root.inorderTraversal());
    }
    
    @Test
    public void preorderTest() {
        List<Integer> preorder = new ArrayList<Integer>() {
            private static final long serialVersionUID = -4516855502903625011L;
            {
                add(2);add(1);add(3);
            }
        };
        assertEquals(preorder, root.preorderTraversal());
    }
    
    @Test
    public void postorderTest() {
        List<Integer> postorder = new ArrayList<Integer>() {
            private static final long serialVersionUID = -6011498846642448449L;
            {
                add(1);add(3);add(2);
            }
        };
        assertEquals(postorder, root.postorderTraversal());
    }
}
