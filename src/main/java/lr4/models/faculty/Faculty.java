package lr4.models.faculty;

import lr4.models.department.Department;
import lr4.models.structure.Structure;

public class Faculty extends Structure<Department> {

    public Faculty(String name) {
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
