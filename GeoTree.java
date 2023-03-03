package HWs.HW3.geotree;

import java.util.ArrayList;

public interface GeoTree {
    ArrayList<Node> tree = new ArrayList<>();

    default ArrayList<Node> getTree() {
        return tree;
    }

    void appendParents(GeoTreeImpl children);

    void appendGrandparent(GeoTreeImpl grandChildren);

    void appendAunt(GeoTreeImpl niece);

    void appendSiblings(GeoTreeImpl sibling);

    void appendParents_In_Low(GeoTreeImpl daughter_in_low);


}
