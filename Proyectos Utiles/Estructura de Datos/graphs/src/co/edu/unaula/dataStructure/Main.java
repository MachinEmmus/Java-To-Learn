package co.edu.unaula.dataStructure;

import co.edu.unaula.dataStructure.edges.Edges;
import co.edu.unaula.dataStructure.graphs.Graphs;
import co.edu.unaula.dataStructure.nodes.Nodes;

public class Main {

    private static final String MEDELLIN = "Medellín";
    private static final String CUCUTA = "Cucuta";
    private static final String BUCARAMANGA = "Bucaramanga";
    private static final String MANIZALEZ = "Manizales";
    private static final String CALI = "Cali";
    public static final int DISTMEDCUC = 586;
    private static final double DISTMEDBUCA = 391;
    private static final double DISTCUCUBUCA = 204;
    private static final double DISTCUCUMANI = 703;
    private static final double DISTCUCUCALI = 539;
    private static final double DISTBUCAMANI = 507;
    private static final double DISTMANICALI = 862;
    private static final double DISTCALIMED = 400;
    private static Nodes medellin;
    private static Nodes cucuta;
    private static Nodes bucaramanga;
    private static Nodes manizales;
    private static Nodes cali;
    private static Edges medCucu;
    private static Edges medBuca;
    private static Edges cucBuca;
    private static Edges cucuMani;
    private static Edges cucuCali;
    private static Edges bucaMani;
    private static Edges maniCali;
    private static Graphs graph = new Graphs();;
    private static Edges caliMed;




    private static void createCities(){
        medellin = new Nodes(MEDELLIN);
        cucuta = new Nodes(CUCUTA);
        bucaramanga = new Nodes(BUCARAMANGA);
        manizales = new Nodes(MANIZALEZ);
        cali = new Nodes(CALI);
    }

    private static void createRoutes(){
        medCucu = new Edges(medellin,cucuta, DISTMEDCUC);
        medBuca = new Edges(medellin,bucaramanga,DISTMEDBUCA);
        cucBuca = new Edges(cucuta,bucaramanga,DISTCUCUBUCA);
        cucuMani = new Edges(cucuta,manizales,DISTCUCUMANI);
        cucuCali = new Edges(cucuta,cali,DISTCUCUCALI);
        bucaMani = new Edges(bucaramanga,manizales,DISTBUCAMANI);
        maniCali = new Edges(manizales,cali,DISTMANICALI);
        caliMed = new Edges(cali,medellin,DISTCALIMED);
    }

    private static void addCityOriDest(){
        medellin.addEdges(medCucu);
        medellin.addEdges(medBuca);
        cucuta.addEdges(cucBuca);
        cucuta.addEdges(cucuMani);
        cucuta.addEdges(cucuCali);
        bucaramanga.addEdges(bucaMani);
        manizales.addEdges(maniCali);
        cali.addEdges(caliMed);
    }

    private static boolean validar(Nodes node){
        if(node == null){
            System.out.println("El nodo no puede estar nulo");
            return false;
        }
        return true;
    }

    private static void createGraph(Nodes node){

        if(!validar(node)){
            return;
        }

        graph.addNodes(node);
    }

    public static void main(String[] args) {

        createCities();
        createRoutes();
        addCityOriDest();
        createGraph(cali);
        createGraph(medellin);
        createGraph(cucuta);
        createGraph(bucaramanga);
        createGraph(manizales);

        System.out.println(graph);





    }
}
