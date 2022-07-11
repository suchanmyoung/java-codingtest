package main.java;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBfs {


    public static class Node{
        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt=rt=null;
        }
    }


    Node root;

    public int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        int L = 0;
        Q.offer(root);
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
                if (cur.lt == null && cur.rt == null) {
                    return L;
                }
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        ShortestPathBfs tree = new ShortestPathBfs();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
