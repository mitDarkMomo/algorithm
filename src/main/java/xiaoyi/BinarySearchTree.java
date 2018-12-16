package xiaoyi;

public class BinarySearchTree {
    public static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int _data) {
            this.data = _data;
        }
    }

    private Node tree;

    public Node find(int data) {
        Node p = tree;

        while(p != null) {
            if(data == p.data) {
                return p;
            }else if(data < p.data) {
                p = p.left;
            }else {
                p = p.right;
            }
        }

        return null;
    }

    public void insert(int data) {
        if(tree == null) {
            tree = new Node(data);
            return;
        }

        Node p = tree;

        while(p != null) {
            if(data == p.data) {
                return;
            }else if(data < p.data) {
                if(p.left == null) {
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }else {
                if(p.right == null) {
                    p.right = new Node(data);
                    return;
                }
                p = p.right;
            }
        }
    }

    public void delete(int _data) {
        Node p = tree;  // 指向要删除的节点，初始化指向根节点
        Node pp = null; // p 的父节点

        while(p != null && p.data != _data) {
            pp = p;
            if(_data < p.data) {
                p = p.left;
            }else {
                p = p.right;
            }
        }

        if(p == null) {
            return;
        }

        // 要删除的节点有两个子节点
        if(p.left != null && p.right != null) {
            Node minP = p.right;
            Node minPP = p;
            while(minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            p.data = minP.data;
            pp = minPP;
            p = minP;
        }

        // 删除节点是叶节点或者仅有一个子节点
        Node child;
        if(p.left != null) {
            child = p.left;
        }else if(p.right != null) {
            child = p.right;
        }else {
            child = null;
        }

        if(pp == null) {
            tree = child;
        }else if(pp.left == p) {
            pp.left = child;
        }else {
            pp.right = child;
        }
    }
}
