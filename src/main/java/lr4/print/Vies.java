package lr4.print;

import lr4.models.human.Sex;
import lr4.models.university.University;

class Vies implements Console {

    @Override
    public void createTypicalUniversity() {
        CreateStructure createStructure = new CreateStructure();
        createStructure
                .createUniversity("NewUnic")
                .setUniversityHead("Vlad", "Trool", "Vidj", Sex.MALE)
                .createFaculty("Menagment")
                .setFacultyHead("Sasha", "Ron", "Doc", Sex.MALE)
                .createDepartment("Menagment")
                .setDepartmentHead("Rin", "Ran", "Run", Sex.MALE)
                .createGroup("10s")
                .setGroupHead("Li", "Trilz", "Kris", Sex.MALE)
                .createStudent("Miz", "Fix", "Pis", Sex.MALE)
                .createStudent("Rik", "Ruk", "Bok", Sex.MALE)
                .createStudent("Terj", "Kverj", "Merj", Sex.FEMALE);
        showUniversity(createStructure.get());
    }

    @Override
    public void showUniversity(University university) {
        System.out.println(university);
    }
}
