import java.util.*;

public class degree {

    static boolean bfs(ArrayList<ArrayList<Integer>> adj, int key) {

        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();

        visited[key] = true;
        q.offer(key);

        while (!q.isEmpty()) {

            int node = q.poll();

            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }

        // Check if all vertices are visited
        for (boolean v : visited) {
            if (!v)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList<>(Arrays.asList(3)));       // 0
        adj.add(new ArrayList<>(Arrays.asList(0, 2)));    // 1
        adj.add(new ArrayList<>(Arrays.asList(2, 1, 0))); // 2
        adj.add(new ArrayList<>(Arrays.asList(1)));       // 3

        System.out.println("Key = 0 : " + bfs(adj, 0));
        System.out.println("Key = 1 : " + bfs(adj, 1));
        System.out.println("Key = 2 : " + bfs(adj, 2));
        System.out.println("Key = 3 : " + bfs(adj, 3));
    }
}
