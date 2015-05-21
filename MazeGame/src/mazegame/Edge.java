/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tiko
 */
public class Edge {
    public final Vertex target;
    public final double weight;
    public Edge(Vertex argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}
