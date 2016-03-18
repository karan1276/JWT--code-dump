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
public class Node {
    private int data;
    private ArrayList<Node> links;

    public Node(int data, ArrayList links) {
        this.data = data;
        this.links = links;
    }

    public Node(){
        this(0,new ArrayList());
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public Node getLink(int link){
        return this.links.get(link);
    }
    
    private void setLink(Node current){
        this.links.add(current);
    }
    void addLinks(ArrayList<Node> EdgeList, int link) {
        Node otherNode = EdgeList.get(link);
        
        otherNode.setLink(this);
        this.setLink(EdgeList.get(link));
    }
    
    
}
