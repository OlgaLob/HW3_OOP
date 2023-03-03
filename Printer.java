package HWs.HW3.geotree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public interface Printer extends GeoTree {


    default void print() throws IOException {

        FileWriter fileWriter = new FileWriter("Research.txt", true);
        for (Node node : getTree()) {
            fileWriter.write(node.toString());
            fileWriter.write('\n');
        }
        fileWriter.write("---");
        fileWriter.write('\n');
        fileWriter.flush();
    }

    default void print(ArrayList<GeoTreeImpl> personArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter("Research.txt", true);
        for (GeoTreeImpl person: personArrayList) {
            fileWriter.write(person.getName());
            fileWriter.write('\n');
        }
        fileWriter.write("---");
        fileWriter.write(('\n'));
        fileWriter.flush();
    }



   // public  ArrayList<Node> getTree();
}
