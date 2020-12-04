package lr4.models.department;

import lr4.models.structure.Structure;
import lr4.models.group.Group;

public class Department extends Structure<Group> {

    public Department(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "{head="+head+
                ", name="+name+
                ", structure="+structure+
                "}";
    }
}
