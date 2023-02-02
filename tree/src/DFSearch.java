import java.util.ArrayList;
import java.util.List;

/**
 * FileName: DFSearch
 * author: gxs
 * Date: 2021/8/14  12:41
 */
public class DFSearch {

    /**
     * 深度遍历
     * DFSearch
     * @param node
     * 			当前节点
     * @param visited
     * 			被访问过的节点列表
     */
    public static void searchTraversing(GraphNode node, List<GraphNode> visited) {
        // 判断是否遍历过
        if (visited.contains(node)) {
            return;
        }

        visited.add(node);
        System.out.println("节点：" + node.getLabel());
        for (int i = 0; i < node.edgeList.size(); i++) {
            searchTraversing(node.edgeList.get(i).getNodeRight(), visited);
        }
    }

    public static void main(String[] args) {
    List<GraphNode> nodes =  new ArrayList<GraphNode>();
    List<GraphNode> nodes1 =  new ArrayList<GraphNode>();
        GraphNode node = null;
        for (int i = 0; i < 8; i++) {
            node = new GraphNode(String.valueOf(i));
            nodes.add(node);
        }
        GraphEdge edge01 = new GraphEdge(nodes.get(0), nodes.get(1));
        GraphEdge edge02 = new GraphEdge(nodes.get(0), nodes.get(2));
        GraphEdge edge13 = new GraphEdge(nodes.get(1), nodes.get(3));
        GraphEdge edge14 = new GraphEdge(nodes.get(1), nodes.get(4));
        GraphEdge edge25 = new GraphEdge(nodes.get(2), nodes.get(5));
        GraphEdge edge26 = new GraphEdge(nodes.get(2), nodes.get(6));
        GraphEdge edge37 = new GraphEdge(nodes.get(3), nodes.get(7));
        GraphEdge edge47 = new GraphEdge(nodes.get(4), nodes.get(7));
        GraphEdge edge56 = new GraphEdge(nodes.get(5), nodes.get(6));


        nodes.get(0).addEdgeList(edge01);
        nodes.get(0).addEdgeList(edge02);
        nodes.get(1).addEdgeList(edge13);
        nodes.get(1).addEdgeList(edge14);
        nodes.get(2).addEdgeList(edge25);
        nodes.get(2).addEdgeList(edge26);
        nodes.get(3).addEdgeList(edge37);
        nodes.get(4).addEdgeList(edge47);
        nodes.get(5).addEdgeList(edge56);
        searchTraversing(nodes.get(0),nodes1);
    }
}