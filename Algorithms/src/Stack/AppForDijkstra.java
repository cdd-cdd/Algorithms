package Stack;

public class AppForDijkstra {

	public static void main(String[] args) {
		
		DijkstraInterpreter dijkstra = new DijkstraInterpreter();
		dijkstra.interpreExpression("( ( ( 1 + 2 ) + 3 ) * ( 1 + 2 ) )");
		dijkstra.result();

	}

}
