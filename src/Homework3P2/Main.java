package Homework3P2;
import java.util.*;

import static Homework3P2.Book.PublishBook;
import static Homework3P2.Borrowing.borrow;
import static Homework3P2.Borrowing.checkBorrow;
import static Homework3P2.Research.PublishResearch;

@SuppressWarnings("SpellCheckingInspection")
public class Main {
    final Scanner userInput = new Scanner(System.in);
    int numbers;
    final ArrayList<Teacher> teacher; final ArrayList<Student> student;  ArrayList<Book> book; final ArrayList<Research> research;  final ArrayList<int[]> record;
    public Main(ArrayList<Teacher> t, ArrayList<Student> s, ArrayList<Book> b,ArrayList<Research> r,ArrayList<int[]> re) {
        teacher = t;
        student = s;
        book = b;
        research = r;
        record = re;

    }

    public void whoAccessing() {
        System.out.println("Who is accessing the system?");
        System.out.println("1 | Management\n2 | Teacher\n3 | Student");
        System.out.print("Input: ");
        numbers = userInput.nextInt();
        userInput.nextLine();
        task(numbers);
    }

    public void task(int access) {
        if(access == 1) {
            System.out.println("Pick a task");
            System.out.println("1 | Lend out a book\n2 | Search Teacher: Name\n3 | Search Teacher: ID\n4 | Search Student: Name\n5 | Search Student: RoleID\n6 | Search Book: Title\n7 | Search Book: Author\n8 | Search Paper: Title\n9 | Search Paper: Author\n10 | Check Borrowed Book Status\n11 | Return to previous menu");
            System.out.print("Input: ");
            numbers = userInput.nextInt();
            userInput.nextLine();
            switch (numbers) {
                case 1:
                    borrow(student,teacher,book,research,record);
                break;
                case 2:
                    System.out.print("Input Teacher's Name to Search: ");
                    String tName = userInput.next();
                    TeacherSearch tSearchName = new TeacherSearch(tName);
                    System.out.println(tSearchName.SearchTName(teacher, tSearchName));
                    userInput.close();
                break;
                case 3:
                    System.out.print("Input Teacher's ID to Search: ");
                    String tID = userInput.next();
                    TeacherSearch tSearchID = new TeacherSearch(tID);
                    System.out.println(tSearchID.SearchTID(teacher, tSearchID));
                    userInput.close();
                break;
                case 4:
                    System.out.print("Input Students' Name to Search: ");
                    String sName = userInput.next();
                    StudentSearch sSearchName = new StudentSearch(sName);
                    System.out.println(sSearchName.SearchSName(student, sSearchName));
                    userInput.close();
                    break;
                case 5:
                    System.out.print("Input Students' RoleID to Search: ");
                    String sID = userInput.next();
                    StudentSearch sSearchID = new StudentSearch(sID);
                    System.out.println(sSearchID.SearchSRoleID(student, sSearchID));
                    userInput.close();
                    break;
                case 6:
                    System.out.print("Input Book Title to Search: ");
                    String bTitle = userInput.nextLine();
                    BookSearch bSearchTitle = new BookSearch(bTitle);
                    System.out.println(bSearchTitle.SearchBTitle(book, bSearchTitle));
                    userInput.close();
                break;
                case 7:
                    System.out.print("Input Book Author to Search: ");
                    String bAuthor = userInput.nextLine();
                    BookSearch bSearchAuthor = new BookSearch(bAuthor);
                    System.out.println(bSearchAuthor.SearchBAuthor(book, bSearchAuthor));
                    userInput.close();
                break;
                case 8:
                    System.out.print("Input Research Paper Title to Search: ");
                    String rTitle = userInput.nextLine();
                    ResearchSearch rSearchTitle = new ResearchSearch(rTitle);
                    System.out.println(rSearchTitle.SearchRTitle(research, rSearchTitle));
                    userInput.close();
                break;
                case 9:
                    System.out.print("Input Research Paper Author to Search: ");
                    String rAuthor = userInput.nextLine();
                    ResearchSearch rSearchAuthor = new ResearchSearch(rAuthor);
                    System.out.println(rSearchAuthor.SearchRAuthor(research, rSearchAuthor));
                    userInput.close();
                break;
                case 10:
                    checkBorrow(student,teacher,book,research,record);
                break;
                case 11:
                whoAccessing();
                default:
                break;
            }
        }
        if(access == 2) {
            System.out.println("Pick a task");
            System.out.println("1 | Publish Book\n2 | Publish Research\n3 | Search Book: Title\n4 | Search Book: Author\n5 | Search Paper: Title\n6 | Search Paper: Author\n7 | Return to previous menu");
            System.out.print("Input: ");
            numbers = userInput.nextInt();
            switch (numbers) {
                case 1:
                    PublishBook(student, teacher, book, research, record);
                    break;
                case 2:
                    PublishResearch(research);
                break;
                case 3:
                    System.out.print("Input Book Title to Search: ");
                    String bTitle = userInput.nextLine();
                    BookSearch bSearchTitle = new BookSearch(bTitle);
                    System.out.println(bSearchTitle.SearchBTitle(book, bSearchTitle));
                    userInput.close();
                break;
                case 4:
                    System.out.print("Input Book Author to Search: ");
                    String bAuthor = userInput.nextLine();
                    BookSearch bSearchAuthor = new BookSearch(bAuthor);
                    System.out.println(bSearchAuthor.SearchBAuthor(book, bSearchAuthor));
                    userInput.close();
                break;
                case 5:
                    System.out.print("Input Research Paper Title to Search: ");
                    String rTitle = userInput.nextLine();
                    ResearchSearch rSearchTitle = new ResearchSearch(rTitle);
                    System.out.println(rSearchTitle.SearchRTitle(research, rSearchTitle));
                    userInput.close();
                break;
                case 6:
                    System.out.print("Input Research Paper Author to Search: ");
                    String rAuthor = userInput.nextLine();
                    ResearchSearch rSearchAuthor = new ResearchSearch(rAuthor);
                    System.out.println(rSearchAuthor.SearchRAuthor(research, rSearchAuthor));
                    userInput.close();
                break;
                case 7:
                whoAccessing();
                default:
                break;
            }
        }
        if(access == 3){
            System.out.println("Pick a task");
            System.out.println("1 | Publish Research\n2 | Search Book: Title\n3 | Search Book: Author\n4 | Search Paper: Title\n5 | Search Paper: Author\n6 | Return to previous menu");
            System.out.print("Input: ");
            numbers = userInput.nextInt();
            switch(numbers) {
                case 1:
                    Publish pub = new Publish(this, access);
                    pub.publishMaterial(pub,book,research);
                break;
                case 2:
                    System.out.print("Input Book Title to Search: ");
                    String bTitle = userInput.nextLine();
                    BookSearch bSearchTitle = new BookSearch(bTitle);
                    System.out.println(bSearchTitle.SearchBTitle(book, bSearchTitle));
                    userInput.close();
                break;
                case 3:
                    System.out.print("Input Book Author to Search: ");
                    String bAuthor = userInput.nextLine();
                    BookSearch bSearchAuthor = new BookSearch(bAuthor);
                    System.out.println(bSearchAuthor.SearchBAuthor(book, bSearchAuthor));
                    userInput.close();
                break;
                case 4:
                    System.out.print("Input Research Paper Title to Search: ");
                    String rTitle = userInput.nextLine();
                    ResearchSearch rSearchTitle = new ResearchSearch(rTitle);
                    System.out.println(rSearchTitle.SearchRTitle(research, rSearchTitle));
                    userInput.close();
                break;
                case 5:
                    System.out.print("Input Research Paper Author to Search: ");
                    String rAuthor = userInput.nextLine();
                    ResearchSearch rSearchAuthor = new ResearchSearch(rAuthor);
                    System.out.println(rSearchAuthor.SearchRAuthor(research, rSearchAuthor));
                    userInput.close();
                break;
                case 6:
                whoAccessing();
                default:
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<int[]> CheckoutRecord = new ArrayList<>();
        ArrayList<Teacher> TeacherList = getTeacherList();
        ArrayList<Student> StudentList = getStudentList();
        ArrayList<Research> ResearchList = getResearch();
        ArrayList<Book> BookList = getBookList();
        Main access = new Main(TeacherList,StudentList,BookList,ResearchList,CheckoutRecord);
        access.whoAccessing();
    }

    private static ArrayList<Research> getResearch() {
        Research slugs = new Research("whole-body regeneration in photosynthetic sea slugs","Mitoh","The disembodied head would regenerate a new body, including a whole heart, within three weeks. The discarded body was left to decompose.","asdghagaksdg");
        Research sars = new Research("Exposure to SARS-CoV-2 generates T-cell memory","Natural Communications","They found that most of the recovered COVID-19 patients had developed pools of memory T-cells that could mount an immune response to SARS-CoV-2","asdfhgasdfbal");
        Research lightning = new Research("Lightning strikes as a major facilitator of prebiotic phosphorus reduction on early Earth","Hess","Bolts of lightning may have given early Earth one of its most important building blocks of life: the element phosphorus","asdfhjasdfhja");

        ArrayList<Research> ResearchList = new ArrayList<>();
        ResearchList.add(slugs);
        ResearchList.add(sars);
        ResearchList.add(lightning);
        return ResearchList;
    }
    private static ArrayList<Book> getBookList() {
        Book RingLords = new Book("Ring Lords", "Tolkien", "High Fantasy", "Why does one little ring makes all these short people go crazzzyyyy", "asfasdjkfhasdljfhk");
        Book FlyLord = new Book("Fly Lords", "William", "Realistic Fiction", "Island makes people have dumb ideas", "asdfjkasdjlkfasdbjhkl");
        Book ComedicDivinity = new Book("Comedic Divinity", "Dante", "High Fantasy", "Rings go down go brr", "asdfasdfasdfasdf");

        ArrayList<Book> BookList = new ArrayList<>();
        BookList.add(RingLords);
        BookList.add(FlyLord);
        BookList.add(ComedicDivinity);
        return BookList;
    }
    private static ArrayList<Student> getStudentList() {
        Student john = new Student("John", "10/10/01", "john@stevens.edu", "Science", "1", 1234122344, 2024);
        Student jacob = new Student("Jacob", "10/10/02", "john@stevens.edu", "English", "2", 1234122344, 2024);
        Student james = new Student("James", "10/10/03", "john@stevens.edu", "Mathematics", "3", 1234122344, 2024);

        ArrayList<Student> StudentList = new ArrayList<>();
        StudentList.add(john);
        StudentList.add(jacob);
        StudentList.add(james);
        return StudentList;
    }
    private static ArrayList<Teacher> getTeacherList() {
        Teacher charles = new Teacher("Charles","10/10/65","Barkley@Stevens.edu", "Science", "01", 823412345);
        Teacher peter = new Teacher("Peter","10/10/68","Lumens@Stevens.edu", "English", "02", 823412345);
        Teacher patrick = new Teacher("Patrick","10/10/69","Faust@Stevens.edu", "Mathematics", "03", 823412345);

        ArrayList<Teacher> TeacherList = new ArrayList<>();
        TeacherList.add(charles);
        TeacherList.add(peter);
        TeacherList.add(patrick);
        return TeacherList;
    }
}
