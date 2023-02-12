package mnc.bstImplementation;

import mnc.node.Node;

import java.util.Scanner;
import java.util.TreeSet;

public class BSTtoSkewedTree {
    public static Node insertNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        curr.right = new Node(data);

        return root;
    }

    public static void displayNodesInAscendingOrder(Node root) {
        TreeSet<Integer> sortedNodes = new TreeSet<>();
        while (root != null) {
            sortedNodes.add(root.data);
            root = root.right;
        }

        for (Integer node : sortedNodes) {
            System.out.print(node + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the BST:");
        int n = scan.nextInt();

        System.out.println("Enter the nodes in the BST:");
        Node root = new Node(scan.nextInt());
        for (int i = 1; i < n; i++) {
            root = insertNode(root, scan.nextInt());
        }

        displayNodesInAscendingOrder(root);
    }
}
