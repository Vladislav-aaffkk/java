package lr4.models.group;

import lr4.models.structure.Structure;
import lr4.models.human.Student;

public class Group extends Structure<Student> {
    public Group(String name) {
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
