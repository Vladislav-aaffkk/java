package lr3.models.faculty;

import lr3.models.structure.Structure;
import lr3.models.department.Department;

public class Faculty extends Structure<Department> {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty { " +
                "head = " + head +
                ", faculty_name = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
