/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author wytze
 */
public class MazeGame {

    private static final int aantalhokjes = 20;
    private static JFrame frame;
    
    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
    vertexQueue.add(source);

    while (!vertexQueue.isEmpty()) {
        Vertex BB = vertexQueue.poll();

            // Visit each edge exiting BB
            for (Edge e : BB.adjacencies)
            {
                Vertex SS = e.target;
                double weight = e.weight;
                double distanceThroughU = BB.minDistance + weight;
        if (distanceThroughU < SS.minDistance) {
            vertexQueue.remove(SS);

            SS.minDistance = distanceThroughU ;
            SS.previous = BB;
            vertexQueue.add(SS);
        }
            }
        }
    }

    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        KeyboardListener keyboard = new KeyboardListener();
        CreateFrame();
        
        JComponent component = new DrawComponent();  
        
        frame.add(component);
        frame.addKeyListener(keyboard);
        
        // mark all the vertices 
        Vertex BB = new Vertex("BB");
        Vertex BF = new Vertex("BF");
        Vertex BJ = new Vertex("BJ");
        Vertex BL = new Vertex("BL");
        Vertex BN = new Vertex("BN");
        Vertex BP = new Vertex("BP");
        Vertex BS = new Vertex("BS");
        
        Vertex CN = new Vertex("CN");
        Vertex CP = new Vertex("CP");
        
        Vertex DB = new Vertex("DB");
        Vertex DD = new Vertex("DD");
        Vertex DH = new Vertex("DH");
        
        Vertex EF = new Vertex("EF");
        Vertex EH = new Vertex("EH");
        Vertex EJ = new Vertex("EJ");
        Vertex EL = new Vertex("EL");
        Vertex EN = new Vertex("EN");
        Vertex EQ = new Vertex("EQ");
        
        Vertex GD = new Vertex("GD");
        Vertex GJ = new Vertex("GJ");
        Vertex GN = new Vertex("GN");
        Vertex GO = new Vertex("GO");
        Vertex GQ = new Vertex("GQ");
        Vertex GS = new Vertex("GS");
        
        Vertex ID = new Vertex("ID");
        Vertex IF = new Vertex("IF");
        Vertex IH = new Vertex("IH");
        Vertex IK = new Vertex("IK");
        Vertex IM = new Vertex("IM");
        Vertex IO = new Vertex("IO");
        Vertex IR = new Vertex("IR");
        Vertex IS = new Vertex("IS");
        
        Vertex KB = new Vertex("KB");
        Vertex KD = new Vertex("KD");
        Vertex KM = new Vertex("KM");
        Vertex KO = new Vertex("KO");
        Vertex KP = new Vertex("KP");
        
        Vertex LD = new Vertex("LD");
        Vertex LF = new Vertex("LF");
        Vertex LH = new Vertex("LH");
        Vertex LJ = new Vertex("LJ");
        Vertex LK = new Vertex("LK");
        Vertex LP = new Vertex("LP");
        Vertex LR = new Vertex("LR");
        Vertex LS = new Vertex("LS");
        
        Vertex NB = new Vertex("NB");
        Vertex NC = new Vertex("NC");
        Vertex NG = new Vertex("NG");
        Vertex NJ = new Vertex("NJ");
        Vertex NM = new Vertex("NM");
        Vertex NS = new Vertex("NS");
        
        Vertex PE = new Vertex("PE");
        Vertex PG = new Vertex("PG");
        Vertex PI = new Vertex("PI");
        Vertex PK = new Vertex("PK");
        Vertex PM = new Vertex("PM");
        Vertex PQ = new Vertex("PQ");
        
        Vertex QB = new Vertex("QB");
        Vertex QC = new Vertex("QC");
        Vertex QI = new Vertex("QI");
        Vertex QK = new Vertex("QK");
        
        Vertex RE = new Vertex("RE");
        Vertex RG = new Vertex("RG");
        Vertex RO = new Vertex("RO");
        Vertex RQ = new Vertex("RQ");
        Vertex RS = new Vertex("RS");
        
        Vertex SB = new Vertex("SB");
        Vertex SE = new Vertex("SE");
        Vertex SG = new Vertex("SG");
        Vertex SI = new Vertex("SI");
        Vertex SK = new Vertex("SK");
        Vertex SM = new Vertex("SM");
        Vertex SO = new Vertex("SO");
        Vertex SS = new Vertex("SS");

        // set the edges and weight
        BB.adjacencies = new Edge[]{ new Edge(BF, 4) };
        BF.adjacencies = new Edge[]{ new Edge(BJ, 4) };
        BF.adjacencies = new Edge[]{ new Edge(EF, 3) };
        BL.adjacencies = new Edge[]{ new Edge(BN, 2) };
        BN.adjacencies = new Edge[]{ new Edge(CN, 1) };
        BP.adjacencies = new Edge[]{ new Edge(BS, 3) };
        BS.adjacencies = new Edge[]{ new Edge(GS, 5) };
        
        CN.adjacencies = new Edge[]{ new Edge(CP, 2) };
        CP.adjacencies = new Edge[]{ new Edge(BP, 1) };
        
        DD.adjacencies = new Edge[]{ new Edge(DB, 2) };
        DB.adjacencies = new Edge[]{ new Edge(KB, 7) };
        DH.adjacencies = new Edge[]{ new Edge(SS, 9999) };
        
        EF.adjacencies = new Edge[]{ new Edge(EH, 2) };
        EJ.adjacencies = new Edge[]{ new Edge(EL, 2) };
        EJ.adjacencies = new Edge[]{ new Edge(GJ, 2) };
        EL.adjacencies = new Edge[]{ new Edge(BL, 3) };
        EN.adjacencies = new Edge[]{ new Edge(GN, 2) };
        EQ.adjacencies = new Edge[]{ new Edge(EN, 3) };
        
        GD.adjacencies = new Edge[]{ new Edge(DD, 3) };
        GD.adjacencies = new Edge[]{ new Edge(ID, 2) };
        GJ.adjacencies = new Edge[]{ new Edge(GD, 6) };
        GJ.adjacencies = new Edge[]{ new Edge(GN, 4) };
        GN.adjacencies = new Edge[]{ new Edge(GO, 1) };
        GO.adjacencies = new Edge[]{ new Edge(IO, 2) };
        
        ID.adjacencies = new Edge[]{ new Edge(IF, 2) };
        IF.adjacencies = new Edge[]{ new Edge(LF, 3) };
        IH.adjacencies = new Edge[]{ new Edge(IK, 3) };
        IK.adjacencies = new Edge[]{ new Edge(LK, 3) };
        IM.adjacencies = new Edge[]{ new Edge(SS, 9999) };
        IO.adjacencies = new Edge[]{ new Edge(KO, 2) };
        IO.adjacencies = new Edge[]{ new Edge(IR, 3) };
        IR.adjacencies = new Edge[]{ new Edge(IS, 1) };
        IR.adjacencies = new Edge[]{ new Edge(LR, 3) };
        IS.adjacencies = new Edge[]{ new Edge(SS, 9999) };
        
        KB.adjacencies = new Edge[]{ new Edge(KD, 2) };
        KB.adjacencies = new Edge[]{ new Edge(NB, 3) };
        KD.adjacencies = new Edge[]{ new Edge(LD, 1) };
        KM.adjacencies = new Edge[]{ new Edge(IM, 2) };
        KM.adjacencies = new Edge[]{ new Edge(NM, 3) };
        KO.adjacencies = new Edge[]{ new Edge(KM, 2) };
        KO.adjacencies = new Edge[]{ new Edge(KP, 1) };
        KP.adjacencies = new Edge[]{ new Edge(LP, 1) };
        
        LD.adjacencies = new Edge[]{ new Edge(SS, 9999) };
        LF.adjacencies = new Edge[]{ new Edge(LH, 2) };
        LH.adjacencies = new Edge[]{ new Edge(IH, 3) };
        LJ.adjacencies = new Edge[]{ new Edge(NJ, 2) };
        LK.adjacencies = new Edge[]{ new Edge(LJ, 1) };
        LP.adjacencies = new Edge[]{ new Edge(SS, 9999) };
        LR.adjacencies = new Edge[]{ new Edge(LS, 1) };
        LS.adjacencies = new Edge[]{ new Edge(NS, 2) };
        
        NB.adjacencies = new Edge[]{ new Edge(NC, 1) };
        NC.adjacencies = new Edge[]{ new Edge(QC, 3) };
        NC.adjacencies = new Edge[]{ new Edge(NG, 4) };
        NG.adjacencies = new Edge[]{ new Edge(PG, 2) };
        NG.adjacencies = new Edge[]{ new Edge(NJ, 3) };
        NJ.adjacencies = new Edge[]{ new Edge(NM, 3) };
        NM.adjacencies = new Edge[]{ new Edge(NS, 6) };
        NM.adjacencies = new Edge[]{ new Edge(PM, 2) };
        NS.adjacencies = new Edge[]{ new Edge(RS, 4) };
        
        PE.adjacencies = new Edge[]{ new Edge(SS, 9999) };
        PG.adjacencies = new Edge[]{ new Edge(PI, 2) };
        PI.adjacencies = new Edge[]{ new Edge(QI, 1) };
        PK.adjacencies = new Edge[]{ new Edge(PM, 2) };
        PM.adjacencies = new Edge[]{ new Edge(PQ, 4) };
        PM.adjacencies = new Edge[]{ new Edge(SM, 3) };
        PQ.adjacencies = new Edge[]{ new Edge(RQ, 2) };
        
        QB.adjacencies = new Edge[]{ new Edge(SB, 2) };
        QC.adjacencies = new Edge[]{ new Edge(QB, 1) };
        QI.adjacencies = new Edge[]{ new Edge(QK, 2) };
        QK.adjacencies = new Edge[]{ new Edge(PK, 1) };
        
        RE.adjacencies = new Edge[]{ new Edge(PE, 2) };
        RE.adjacencies = new Edge[]{ new Edge(RG, 2) };
        RG.adjacencies = new Edge[]{ new Edge(SG, 1) };
        RO.adjacencies = new Edge[]{ new Edge(SO, 1) };
        RQ.adjacencies = new Edge[]{ new Edge(RO, 2) };
        RQ.adjacencies = new Edge[]{ new Edge(RS, 2) };
        RS.adjacencies = new Edge[]{ new Edge(SS, 1) };
        
        SB.adjacencies = new Edge[]{ new Edge(SE, 3) };
        SE.adjacencies = new Edge[]{ new Edge(RE, 1) };
        SG.adjacencies = new Edge[]{ new Edge(SI, 2) };
        SI.adjacencies = new Edge[]{ new Edge(QI, 3) };
        SK.adjacencies = new Edge[]{ new Edge(SS, 9999) };
        SM.adjacencies = new Edge[]{ new Edge(SK, 2) };
        SO.adjacencies = new Edge[]{ new Edge(SS, 9999) };

        computePaths(BB); // run Dijkstra
        System.out.println("Distance to " + SS + ": " + SS.minDistance);
        List<Vertex> path = getShortestPathTo(SS);
        System.out.println("Path: " + path);
        
        //int[][] Maze = CreateMaze();
        //printMaze(Maze);
    }

    public static void CreateFrame() {

        frame = new DrawFrame();

        frame.setSize(500, 500);
        frame.setTitle("The frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static int[][] CreateMaze() {

        //int[][] Maze = new int[aantalhokjes][aantalhokjes];
        int[][] Maze = {
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
            {9, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 9},
            {9, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 9},
            {9, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 9},
            {9, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 9},
            {9, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 9},
            {9, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 9},
            {9, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 9},
            {9, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 9},
            {9, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 9},
            {9, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 9},
            {9, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 9},
            {9, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 9},
            {9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
            {9, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 9},
            {9, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 9},
            {9, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 9},
            {9, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 9},
            {9, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 3, 9},
            {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}

        };

        return Maze;
    }

    public static void printMaze(int[][] magicbox) {

        for (int rowIndex = 0; rowIndex < aantalhokjes; rowIndex++) {

            for (int colIndex = 0; colIndex < aantalhokjes; colIndex++) {

                System.out.printf("%2d", magicbox[rowIndex][colIndex]);
            }
            System.out.println("");
        }
    }
}
