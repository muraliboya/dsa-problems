class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class binarysearchtree {
    Node root;

    public binarysearchtree() {
        root = null;
    }

    void insert(int data) {
        root = insertRecursive(root, data);
    }

    Node insertRecursive(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    void delete(int data) {
        root = deleteRecursive(root, data);
    }

    Node deleteRecursive(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRecursive(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = rightSuccessor(root.right);
            root.right = deleteRecursive(root.right, root.data);
        }

        return root;
    }

    int rightSuccessor(Node root) {
        int minimumValue = root.data;
        while (root.left != null) {
            minimumValue = root.left.data;
            root = root.left;
        }
        return minimumValue;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        binarysearchtree obj = new binarysearchtree();
        obj.insert(7);
        obj.insert(9);
        obj.insert(8);
        obj.insert(10);
        obj.insert(1);
        obj.insert(33);

        System.out.print("Inorder: ");
        obj.inorder(obj.root);
        System.out.println();

        System.out.print("Postorder: ");
        obj.postorder(obj.root);
        System.out.println();

        System.out.print("Preorder: ");
        obj.preorder(obj.root);
        System.out.println();

        obj.delete(7);

        System.out.print("Inorder after deletion: ");
        obj.inorder(obj.root);
    }
}
