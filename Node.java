import javafx.util.Pair;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Node {
    int ID;
    String NodeName;
    /*
    int tramvayTravel = 2;
    int metroTravel = 3;
    int busTravel = 4;
    int izbanTravel = 5;

     */

    public Node(int id,String node){
        this.ID =id ;
        this.NodeName= node;

    }

    public int getID(){ return ID;  }
    public void setID(){ this.ID = ID;  }

    public String getNodeName(){  return NodeName;  }


}