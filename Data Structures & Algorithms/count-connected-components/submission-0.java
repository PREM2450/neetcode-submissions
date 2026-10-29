class Solution {

    class Graph {
        HashMap<Integer, List<Integer>> graph;
        private int numVertex;

        Graph(int numVertex) {
            this.numVertex = numVertex;
            graph = new HashMap<>();

            for (int i = 0; i < numVertex; i++) {
                graph.put(i, new ArrayList<>());
            }
        }

     
        public void AddEdge(int v1, int v2) {
            graph.get(v1).add(v2);
            graph.get(v2).add(v1); 
        }

        
        public void bfs(int start, HashSet<Integer> visited) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()) {
                int curr = queue.poll();

                for (int nei : graph.get(curr)) {
                    if (!visited.contains(nei)) {
                        visited.add(nei);
                        queue.add(nei);
                    }
                }
            }
        }
    }

    public int countComponents(int n, int[][] edges) {
        Graph g = new Graph(n);

       
        for (int[] edge : edges) {
            g.AddEdge(edge[0], edge[1]);
        }

        HashSet<Integer> visited = new HashSet<>();
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                g.bfs(i, visited);
                components++;
            }
        }

        return components;
    }
}