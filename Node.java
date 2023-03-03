package HWs.HW3.geotree;

public class Node {
    GeoTreeImpl person;
    Relationships relationships;
    GeoTreeImpl anotherPerson;


    public GeoTreeImpl getAnotherPerson() {
        return anotherPerson;
    }

    public GeoTreeImpl getPerson() {
        return person;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public Node(GeoTreeImpl person, Relationships relationships, GeoTreeImpl anotherPerson) {
        this.person = person;
        this.relationships = relationships;
        this.anotherPerson = anotherPerson;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person, relationships, anotherPerson);
    }

}
