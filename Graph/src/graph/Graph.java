/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Graph {
    
    ArrayList<Node> EdgeList;

    public Graph(ArrayList<Node> EdgeList) {
        this.EdgeList = EdgeList;
    }
    
    public Graph() {
        this(new ArrayList());
    }
    
    public void insertNode(int data, int[] links){
        Node node = new Node();
        node.setData(data);
        for(int i=0; i<links.length; i++){
            node.addLinks(EdgeList,links[i]);
        }
        EdgeList.add(node);    
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
