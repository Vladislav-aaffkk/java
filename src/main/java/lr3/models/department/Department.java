package lr3.models.department;

import lr3.models.structure.Structure;
import lr3.models.group.Group;

public class Department extends Structure<Group> {

    public Department(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Department { " +
                "head = " + head +
                ", department_name = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
