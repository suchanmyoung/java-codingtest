package main.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class NonLinearLectureZero {

    static class Node {

        String name;
        List<Node> links = new LinkedList<>();
        boolean visited = false;

        public Node(String name) {
            this.name = name;
        }

        void link(Node node) {
            links.add(node);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node node = (Node) o;
            return Objects.equals(name, node.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, links);
        }

        void visit() {
            this.visited = true;
        }

        public boolean isVisited() {
            return visited;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        dfs();
        bfs();
    }

    private static void bfs() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        a.link(b);
        a.link(d);
        b.link(a);
        b.link(c);
        b.link(e);
        c.link(b);
        c.link(d);
        d.link(a);
        d.link(c);
        d.link(e);
        e.link(b);
        e.link(d);

        Node target = e;

        //DFS
        Stack<Node> stack = new Stack<>();

        //스택에 첫 값을 넣는다
        stack.push(a);

        //스택이 빌 때까지 반복
        while (!stack.isEmpty()) {
            //값을 꺼낸다
            Node n = stack.pop();
            //방문한 것으로 처리
            n.visit();
            //해당 값이 먼지 찍는다
            System.out.println(n);

            //n이 타겟과 같으면, 반복문을 빠져나간다.
            if (n.equals(target)) {
                System.out.println("FOUND!" + n);
                break;
                //find!!
            }

            // n(처음 값에서는 A)의 링크들을 다 돈다(여기서는 B,D)
            for (Node l : n.links) {
                //B를 방문한 적이 있으면, 넘어간다
                if(l.isVisited()) continue;
                //queue 에
                if(stack.contains(l)) continue;
                //첫 값에 B가 들어감, 두 번째 값에 D가 들어감
                stack.push(l);
            }
        }
    }

    public static void dfs(){
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        a.link(b);
        a.link(d);
        b.link(a);
        b.link(c);
        b.link(e);
        c.link(b);
        c.link(d);
        d.link(a);
        d.link(c);
        d.link(e);
        e.link(b);
        e.link(d);

        Node target = e;

        //BFS
        Queue<Node> queue = new LinkedList<>();

        //큐에 첫 값을 넣는다
        queue.offer(a);

        //큐가 빌 때까지 반복한다
        while (!queue.isEmpty()) {
            //값을 꺼낸다
            Node n = queue.poll();
            //방문한 것으로 처리
            n.visit();
            //해당 값이 먼지 찍는다
            System.out.println(n);

            //n이 타겟과 같으면, 반복문을 빠져나간다.
            if (n.equals(target)) {
                System.out.println("FOUND!" + n);
                break;
                //find!!
            }

            // n(처음 값에서는 A)의 링크들을 다 돈다(여기서는 B,D)
            for (Node l : n.links) {
                //B를 방문한 적이 있으면, 넘어간다
                if(l.isVisited()) continue;
                //queue 에
                if(queue.contains(l)) continue;
                //첫 값에 B가 들어감, 두 번째 값에 D가 들어감
                queue.offer(l);
            }
        }
    }
}
