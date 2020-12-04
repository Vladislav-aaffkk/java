package lr4.models.university;

import lr4.models.structure.Structure;
import lr4.models.faculty.Faculty;

public class University extends Structure<Faculty> {

    public University(String name) {
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
