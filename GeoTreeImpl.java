package HWs.HW3.geotree;

import java.io.IOException;
import java.util.ArrayList;

public class GeoTreeImpl extends Person implements GeoTree, Research, Printer {
    public GeoTreeImpl(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void appendParents(GeoTreeImpl children) {
        getTree().add(new Node(this, Relationships.PARENT, children));
        getTree().add(new Node(children, Relationships.CHILD, this));
    }

    @Override
    public void appendGrandparent(GeoTreeImpl grandChildren) {
        getTree().add(new Node(this, Relationships.GRANDPARENT, grandChildren));
        getTree().add(new Node(grandChildren, Relationships.GRANDCHILD, this));
    }

    @Override
    public void appendAunt(GeoTreeImpl niece) {
        getTree().add(new Node(this, Relationships.AUNT, niece));
        getTree().add(new Node(niece, Relationships.NIECE, this));
    }

    @Override
    public void appendSiblings(GeoTreeImpl sibling) {
        getTree().add(new Node(this, Relationships.SIBLING,
                sibling));
    }

    @Override
    public void appendParents_In_Low(GeoTreeImpl daughter_in_low) {
        getTree().add(new Node(this, Relationships.PARENT_IN_LAW, daughter_in_low));
        getTree().add(new Node(daughter_in_low, Relationships.DAUGHTER_IN_LOW, this));
    }

    @Override
    public ArrayList<GeoTreeImpl> getParents(Relationships relationships) throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(Relationships.
                    CHILD)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }


    @Override
    public ArrayList<GeoTreeImpl> getChildrenByPerson() throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.PARENT)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<GeoTreeImpl> getGrandparents(Relationships relationships) throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(Relationships.GRANDCHILD)) {
                result.add(node.anotherPerson);
            }
            result.add(node.anotherPerson);
        }
        print(result);
        return result;
    }
    @Override
    public ArrayList<GeoTreeImpl> getGrandchildren() throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.GRANDPARENT)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }
    @Override
    public ArrayList<GeoTreeImpl> getAunt(Relationships relationships) throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.NIECE)) {
                result.add(node.anotherPerson);
            }
            result.add(node.anotherPerson);
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<GeoTreeImpl> getNieceByPerson() throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.AUNT)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }
    @Override
    public ArrayList<GeoTreeImpl> getSiblings(Relationships relationships) throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(Relationships.SIBLING)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }
    @Override
    public ArrayList<GeoTreeImpl> getParents_In_Low(Relationships relationships) throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(Relationships.DAUGHTER_IN_LOW)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<GeoTreeImpl> getDaughter_In_Low() throws IOException {
        ArrayList<GeoTreeImpl> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.PARENT_IN_LAW)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

}
