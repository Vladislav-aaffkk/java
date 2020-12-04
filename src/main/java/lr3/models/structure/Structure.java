package lr3.models.structure;

import lr3.models.human.Human;
import lr3.models.human.Sex;

import java.util.ArrayList;
import java.util.List;


public abstract class Structure<T> {
    protected Human head;
    protected String name;
    protected List<T> structure = new ArrayList<>();

    protected Structure(String name) {
        this.name = name;
    }

    public void setHead(String firstName, String lastName, String patronymic, Sex sex) {
        this.head = new Human(firstName, lastName, patronymic, sex);
    }

    public void addToStructure(T entity) {
        structure.add(entity);
    }
}