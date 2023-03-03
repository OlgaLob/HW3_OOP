package HWs.HW3.geotree;

import java.io.IOException;
import java.util.ArrayList;

public interface Research {
    ArrayList<GeoTreeImpl> getParents(Relationships relationships) throws IOException;

    ArrayList<GeoTreeImpl> getChildrenByPerson() throws IOException;

    ArrayList<GeoTreeImpl> getGrandchildren() throws IOException;

    ArrayList<GeoTreeImpl> getGrandparents(Relationships relationships) throws IOException;

    ArrayList<GeoTreeImpl> getAunt(Relationships relationships) throws IOException;

    ArrayList<GeoTreeImpl> getNieceByPerson() throws IOException;

    ArrayList<GeoTreeImpl> getSiblings(Relationships relationships) throws IOException;

    ArrayList<GeoTreeImpl> getParents_In_Low(Relationships relationships) throws IOException;

    ArrayList<GeoTreeImpl> getDaughter_In_Low() throws IOException;
}
