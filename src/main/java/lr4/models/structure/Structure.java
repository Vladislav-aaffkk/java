package lr4.models.structure;

import lr4.models.human.Human;
import lr4.models.human.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Structure)) return false;
        Structure<?> that = (Structure<?>) o;
        return Objects.equals(head, that.head) &&
                Objects.equals(name, that.name) &&
                Objects.equals(structure, that.structure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, name, structure);
    }

    public void addToStructure(T entity) {
        structure.add(entity);
    }
}