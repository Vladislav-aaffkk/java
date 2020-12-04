package lr3.print;

import lr3.models.human.Sex;
import lr3.models.university.University;

class Vies implements Console {

    @Override
    public void createTypicalUniversity() {
        CreateStructure createStructure = new CreateStructure();
        createStructure
                .createUniversity("NewUnic")
                .setUniversityHead("Vlad", "Trool", "Vidj", lr3.models.human.Sex.MALE)
                .createFaculty("Menagment")
                .setFacultyHead("Sasha", "Ron", "Doc", lr3.models.human.Sex.MALE)
                .createDepartment("Menagment")
                .setDepartmentHead("Rin", "Ran", "Run", lr3.models.human.Sex.MALE)
                .createGroup("10s")
                .setGroupHead("Li", "Trilz", "Kris", lr3.models.human.Sex.MALE)
                .createStudent("Miz", "Fix", "Pis", lr3.models.human.Sex.MALE)
                .createStudent("Rik", "Ruk", "Bok", lr3.models.human.Sex.MALE)
                .createStudent("Terj", "Kverj", "Merj", Sex.FEMALE);
        showUniversity(createStructure.get());
    }

    @Override
    public void showUniversity(University university) {
        System.out.println(university);
    }
}