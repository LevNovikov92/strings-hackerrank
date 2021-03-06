package trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestUnivaluePathTest {

    TreeNode root = new TreeNode(0);
    TreeNode node1 = new TreeNode(0);
    TreeNode node2 = new TreeNode(0);
    TreeNode node11 = new TreeNode(0);
    TreeNode node12 = new TreeNode(0);
    TreeNode node22 = new TreeNode(0);
    TreeNode node222 = new TreeNode(0);

    @Before
    public void setUp() {
        root.left = node1;
        root.right = node2;
        node1.left = node11;
        node1.right = node12;
        node2.right = node22;
    }

    @Test
    public void longestUnivaluePath_1() throws Exception {
        root.val = 1;
        node1.val = 4;
        node2.val = 5;
        node11.val = 4;
        node12.val = 4;
        node22.val = 5;

        final LongestUnivaluePath solution = new LongestUnivaluePath();
        Assert.assertEquals(1, solution.longestUnivaluePath(root));
    }

    @Test
    public void longestUnivaluePath_2() throws Exception {
        root.val = 5;
        node1.val = 4;
        node2.val = 5;
        node11.val = 1;
        node12.val = 1;
        node22.val = 5;

        final LongestUnivaluePath solution = new LongestUnivaluePath();
        Assert.assertEquals(2, solution.longestUnivaluePath(root));
    }

    @Test
    public void longestUnivaluePath_3() throws Exception {
        root.val = 1;
        node1.val = 2;
        node2.val = 3;
        node11.val = 4;
        node12.val = 5;
        node22.val = 6;

        final LongestUnivaluePath solution = new LongestUnivaluePath();
        Assert.assertEquals(0, solution.longestUnivaluePath(root));
    }

    @Test
    public void longestUnivaluePath_4() throws Exception {
        root.val = 1;
        node1.val = 4;
        node2.val = 5;
        node11.val = 4;
        node12.val = 4;
        node22.val = 5;
        node222.val = 5;
        node22.right = node222;

        final LongestUnivaluePath solution = new LongestUnivaluePath();
        Assert.assertEquals(2, solution.longestUnivaluePath(root));
    }
}