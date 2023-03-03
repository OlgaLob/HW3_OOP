package HWs.HW3.geotree;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    //public Main(String name, int age) { super(name, age);    }

    public static void main(String[] args) throws IOException {
        GeoTreeImpl firstPerson = new GeoTreeImpl("Olga", 27);
        GeoTreeImpl secondPerson = new GeoTreeImpl("Tatiana", 21);
        GeoTreeImpl thirdPerson = new GeoTreeImpl("Nick", 50);
        GeoTreeImpl fourthPerson = new GeoTreeImpl("Nadejda", 49);

        GeoTreeImpl fifthPerson = new GeoTreeImpl("Ivan", 81);
        GeoTreeImpl sixthPerson = new GeoTreeImpl("Olga_granny", 75);
        GeoTreeImpl seventhPerson = new GeoTreeImpl("Lidiya", 50);


        thirdPerson.appendParents(firstPerson);
        thirdPerson.appendParents(secondPerson);
        fourthPerson.appendParents(firstPerson);
        fourthPerson.appendParents(secondPerson);
        fifthPerson.appendParents(thirdPerson);
        fifthPerson.appendParents(seventhPerson);
        sixthPerson.appendParents(thirdPerson);
        sixthPerson.appendParents(seventhPerson);
        fifthPerson.appendGrandparent(firstPerson);
        fifthPerson.appendGrandparent(secondPerson);
        sixthPerson.appendGrandparent(firstPerson);
        sixthPerson.appendGrandparent(secondPerson);
        seventhPerson.appendAunt(firstPerson);
        seventhPerson.appendAunt(secondPerson);
        firstPerson.appendSiblings(secondPerson);
        thirdPerson.appendSiblings(seventhPerson);
        fifthPerson.appendParents_In_Low(fourthPerson);
        sixthPerson.appendParents_In_Low(fourthPerson);

        thirdPerson.getChildrenByPerson();
        thirdPerson.getParents(Relationships.CHILD);
        fifthPerson.getGrandchildren();
        firstPerson.getGrandparents(Relationships.GRANDCHILD);
        seventhPerson.getNieceByPerson();
        firstPerson.getAunt(Relationships.NIECE);
        firstPerson.getSiblings(Relationships.SIBLING);
        thirdPerson.getSiblings(Relationships.SIBLING);
        firstPerson.print();
    }

}
