package Homework3P2;

import java.util.ArrayList;

public class TeacherSearch {

    final String SearchString;
    
    public TeacherSearch(String tSearch) {
        SearchString = tSearch;
    }

    public boolean SearchTName(ArrayList<Teacher> a, TeacherSearch TeacherSearch) {
        for (Teacher teacher : a) {
            if (teacher.TeacherName.equalsIgnoreCase(TeacherSearch.SearchString)) {
                return true;
            }
        }
        return false;
    }

    public boolean SearchTID(ArrayList<Teacher> a, TeacherSearch TeacherSearch) {
        for (Teacher teacher : a) {
            if (teacher.TeacherEmployeeID.equals(TeacherSearch.SearchString)) {
                return true;
            }
        }
        return false;
    }

}
