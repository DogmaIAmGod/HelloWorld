package Homework3P2;

public class Student {
    final String StudentName,StudentDoB,StudentContactInfo,StudentDepartment,StudentRoleNum;
    final int StudentSSN,StudentGradYear;
    public Student(String sName,String sDoB, String sContactInfo, String sDepartment, String sRoleNum,int sSSN,int sGradYear) {
        StudentName = sName;
        StudentDoB = sDoB;
        StudentContactInfo = sContactInfo;
        StudentDepartment = sDepartment;
        StudentRoleNum = sRoleNum;
        StudentSSN = sSSN;
        StudentGradYear = sGradYear;
    }
}
