package graph;
import java.util.*;

public class No1_DFS_IceArray_2 {

    class Graph{
        ArrayList<Node> nodes;
        ArrayList<Node> searched;
        Graph(){
            this.nodes = new ArrayList<Node>();
            this.searched = new ArrayList<Node>();
        }
        class Node{
            int x;
            int y;
            boolean checked;
            LinkedList<Node> adjacent;
            Node(int x, int y){
                this.x = x;
                this.y = y;
                this.checked = false;
                this.adjacent = new LinkedList<Node>();
            }
            @Override
            public boolean equals(Object obj) {
                Node node = (Node)obj;
                return (this.x == node.x && this.y == node.y);
            }
        }

        void addNode(int x, int y){
            addNode(new Node(x, y));
        }
        void addNode(Node node){
            nodes.add(node);
        }

        void setRelation(int n1x, int n1y, int n2x, int n2y){
            setRelation(getNode(n1x, n1y), getNode(n2x, n2y));
        }
        void setRelation(Node n1, Node n2){
            if(!n1.adjacent.contains(n2))
                n1.adjacent.add(n2);
            if(!n2.adjacent.contains(n1))
                n2.adjacent.add(n1);
        }

        Node getNode(int x, int y){
            for(Node n : nodes){
                if(n.x == x && n.y == y)
                    return n;
            }
            return null;
        }

        int[][] dfs(int x, int y, int[][] res, int mark){
            this.searched = new ArrayList<Node>();
            Node root = getNode(x, y);
            dfs(root);
            for(Node n : searched)
                res[n.x][n.y] = mark;

            return res;
        }

        void dfs(Node root){
            if(root.checked)
                return;
            root.checked = true;
            searched.add(root);
            for(Node n : root.adjacent){
                dfs(n);
            }
        }

    }

    private int solution(int[][] arr){
        int answer = 0;
        int[][] res = Arrays.copyOf(arr, arr.length);
        System.out.println("res : "+Arrays.toString(res));

        Graph graph = new Graph();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                graph.addNode(i, j);
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 0)
                    setEdge(graph, arr, i, j);
            }
        }

        int marked = 2;
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[i].length; j++){
                if(arr[i][j] == 0 && res[i][j] == 0)
                    graph.dfs(i, j, res, marked++);
            }
        }

        print(res);
        answer = marked - 2;
        return answer;
    }
    private void setEdge(Graph graph, int[][]arr, int x, int y){
        int[] dx = {-1, 0, 1,  0};
        int[] dy = { 0, 1, 0, -1};

        for(int i=0; i<dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[nx].length && arr[nx][ny] == 0){
                graph.setRelation(x, y, nx, ny);
            }
        }

    }

    public static void main(String[] args){
        int[][] arr = {
              {0, 0, 1, 1, 0}
            , {0, 0, 0, 1, 1}
            , {1, 1, 1, 1, 1}
            , {0, 0, 0, 0, 0}
        };
        System.out.println("얼음빙판배열 : ");
        print(arr);
        No1_DFS_IceArray_2 test = new No1_DFS_IceArray_2();
        int answer = test.solution(arr);
        System.out.println("얼음빙판에서 얻을 수 있는 총 얼음덩어리 수 : "+answer);

    }    
    static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("["+arr[i][j]+"]");
            }
            System.out.println();
        }
    }
}
