import lr4.json.manager.MyManager;
import lr4.models.human.Sex;
import lr4.models.university.University;
import lr4.print.CreateStructure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ConsoleTests {
    private static final MyManager MY_MANAGER = MyManager.getInstance();;

    @Test
    public void checkUniversityEquals() throws IOException {
        CreateStructure createStructure = new CreateStructure();
        MY_MANAGER.setSerializable(
                        createStructure
                                .createUniversity("NewUnic")
                                .setUniversityHead("Vlad", "Trool", "Vidj", lr4.models.human.Sex.MALE)
                                .createFaculty("Menagment")
                                .setFacultyHead("Sasha", "Ron", "Doc", lr4.models.human.Sex.MALE)
                                .createDepartment("Menagment")
                                .setDepartmentHead("Rin", "Ran", "Run", lr4.models.human.Sex.MALE)
                                .createGroup("10s")
                                .setGroupHead("Li", "Trilz", "Kris", lr4.models.human.Sex.MALE)
                                .createStudent("Miz", "Fix", "Pis", lr4.models.human.Sex.MALE)
                                .createStudent("Rik", "Ruk", "Bok", lr4.models.human.Sex.MALE)
                                .createStudent("Terj", "Kverj", "Merj", Sex.FEMALE)
                                .get());

        String path = "./src/test/my_organization.json";
        MY_MANAGER.to_Jason(path);

        Assertions.assertEquals(MY_MANAGER.getJason(path, University.class), createStructure.get());
    }
}
