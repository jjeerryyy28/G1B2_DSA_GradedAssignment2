package mnc.driver;

import mnc.node.Node;

import java.util.Scanner;

import static mnc.bstImplementation.BSTtoSkewedTree.displayNodesInAscendingOrder;
import static mnc.bstImplementation.BSTtoSkewedTree.insertNode;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the BST:");
        int n = scan.nextInt();

        System.out.println("Enter the nodes in the BST:");
        Node root = new Node(scan.nextInt());
        for (int i = 1; i < n; i++) {
            root = insertNode(root, scan.nextInt());
        }
        scan.close();

        displayNodesInAscendingOrder(root);
    }
}





