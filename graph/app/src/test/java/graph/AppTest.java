/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void addVertex(){

        Graph graph = new Graph();

        graph.addVertex("Anas");
        graph.addVertex("Ansam");

        assertNotNull(graph.getVertices());
        assertEquals(2,graph.size());
    }

  /*  @Test
    public void addEdge(){

        Graph graph = new Graph();

        graph.addVertex("Anas");
        graph.addVertex("Shahid");
        graph.addEdge("Anas", "Shahid");

        assertEquals("Vertex{label='Shahid'}[Vertex{label='Anas'}]Vertex{label='Anas'}[Vertex{label='Shahid'}]", graph.printGraph());
    }
*/
    @Test
    public void vertexNeighbors(){

        Graph graph = new Graph();

        graph.addVertex("Anas");
        graph.addVertex("Shahid");
        graph.addVertex("Khaith");
        graph.addVertex("Ansam");
        graph.addEdge("Anas", "Khaith");
        graph.addEdge("Anas", "Shahid");
        graph.addEdge("Ansam", "Shahid");

        assertEquals("[Vertex{label='Khaith'}, Vertex{label='Shahid'}]",graph.getNeighbors("Anas").toString());
        assertEquals("[Vertex{label='Shahid'}]", graph.getNeighbors("Ansam").toString());

    }

    @Test
    public void emptyGraph(){

        Graph graph = new Graph();
        assertEquals(0,graph.size());
        assertEquals("[]", graph.getVertices().toString());
    }



    @Test
    public void oneVertexAndOneEdge(){
        Graph graph = new Graph();

        graph.addVertex("Anas");

        assertEquals("Vertex{label='Anas'}[]",graph.printGraph());
    }

    //   ****Code Challenge 36 ****
    @Test
    public void breadthFirst(){

        Graph graph1 = new Graph();

        graph1.addVertex("Pandora");
        graph1.addVertex("Arendelle");
        graph1.addVertex("Metroville");
        graph1.addVertex("Monstroplolis");
        graph1.addVertex("Narnia");
        graph1.addVertex("Naboo");

        graph1.addEdge("Pandora", "Arendelle");
        graph1.addEdge("Arendelle", "Metroville");
        graph1.addEdge("Arendelle", "Monstroplolis");
        graph1.addEdge("Metroville", "Narnia");
        graph1.addEdge("Metroville", "Naboo");
        graph1.addEdge("Metroville", "Monstroplolis");
        graph1.addEdge("Monstroplolis", "Naboo");
        graph1.addEdge("Narnia", "Naboo");

        assertEquals("[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]", graph1.breadthTraverse("Pandora").toString());

        
        
    }


   //   **** Code Challenge 38 ****

    @Test
    public void depthFirstTest(){

        Graph graph3 = new Graph();

        graph3.addVertex("A");
        graph3.addVertex("B");
        graph3.addVertex("C");
        graph3.addVertex("D");
        graph3.addVertex("E");
        graph3.addVertex("F");
        graph3.addVertex("G");
        graph3.addVertex("H");

        graph3.addEdge("A", "D");
        graph3.addEdge("A", "B");
        graph3.addEdge("B", "D");
        graph3.addEdge("B", "C");
        graph3.addEdge("C", "G");
        graph3.addEdge("D", "F");
        graph3.addEdge("D", "H");
        graph3.addEdge("D", "E");
        graph3.addEdge("F", "H");

        assertEquals("[A, B, C, G, D, E, H, F]", graph3.depthFirstTraverse("A").toString());
    }

    @Test
    public void depthFirstOneVertex(){

        Graph graph3 = new Graph();

        graph3.addVertex("A");

        assertEquals("[A]", graph3.depthFirstTraverse("A").toString());
    }

    //    THIS TEST FOR THREE VERTICES AND ONE OF THEM DID NOT CONNECT WITH THE OTHER TWO VERTICES

    @Test
    public void depthFirstTest2(){

        Graph graph3 = new Graph();

        graph3.addVertex("A");
        graph3.addVertex("B");
        graph3.addVertex("C");

        graph3.addEdge("A", "B");

        assertEquals("[A, B]", graph3.depthFirstTraverse("A").toString());
    }


}