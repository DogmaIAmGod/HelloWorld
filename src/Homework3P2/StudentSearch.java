package Homework3P2;

import java.util.ArrayList;

public class StudentSearch {
    final String SearchString;

    public StudentSearch(String tSearch) {
        SearchString = tSearch;
    }

    public boolean SearchSName(ArrayList<Student> a, StudentSearch StudentSearch) {
        for (Student student : a) {
            if (student.StudentName.equalsIgnoreCase(StudentSearch.SearchString)) {
                return true;
            }
        }
        return false;
    }

    public boolean SearchSRoleID(ArrayList<Student> a, StudentSearch StudentSearch) {
        for (Student student : a) {
            if (student.StudentRoleNum.equals(StudentSearch.SearchString)) {
                return true;
            }
        }
        return false;
    }

}
