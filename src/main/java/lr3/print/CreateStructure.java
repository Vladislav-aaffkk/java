package lr3.print;

import lr3.controllers.*;
import lr3.models.human.Sex;
import lr3.models.university.University;

public class CreateStructure {
    private UniversityCreator universityCreator;
    private FacultyCreator facultyCreator;
    private DepartmentCreator departmentCreator;
    private GroupCreator groupCreator;

    public CreateStructure createUniversity(String universityName) {
        universityCreator = new UniversityCreator(universityName);
        return this;
    }

    public CreateStructure createFaculty(String facultyName) {
        facultyCreator = new FacultyCreator(facultyName);
        universityCreator.university.addToStructure(facultyCreator.faculty);
        return this;
    }

    public CreateStructure createDepartment(String departmentName) {
        departmentCreator = new DepartmentCreator(departmentName);
        facultyCreator.faculty.addToStructure(departmentCreator.department);
        return this;
    }

    public CreateStructure createGroup(String groupName) {
        groupCreator = new GroupCreator(groupName);
        departmentCreator.department.addToStructure(groupCreator.group);
        return this;
    }

    public CreateStructure createStudent(String firstName, String lastName, String patronymic, Sex sex) {
        StudentCreator studentCreator = new StudentCreator(firstName, lastName, patronymic, sex);
        groupCreator.group.addToStructure(studentCreator.student);
        return this;
    }

    public CreateStructure setUniversityHead(String firstName, String lastName, String patronymic, Sex sex) {
        universityCreator.university.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public CreateStructure setFacultyHead(String firstName, String lastName, String patronymic, Sex sex) {
        facultyCreator.faculty.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public CreateStructure setDepartmentHead(String firstName, String lastName, String patronymic, Sex sex) {
        departmentCreator.department.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public CreateStructure setGroupHead(String firstName, String lastName, String patronymic, Sex sex) {
        groupCreator.group.setHead(firstName, lastName, patronymic, sex);
        return this;
    }

    public University get() {
        return universityCreator.university;
    }
}
