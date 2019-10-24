package nl.joris.datacmns1438.model;

import java.util.ArrayList;
import java.util.List;

public class RootEntity extends DbEntity {

    private List<NestedEntity> nestedEntities = new ArrayList<>();
}