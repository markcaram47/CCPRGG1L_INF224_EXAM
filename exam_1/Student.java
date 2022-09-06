public class Student {
    //Student Properties
    String surname;
    String firstname;
    char middleInitial;
    int dateOfbirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    //Student Class Method
    public void sayMyStudentNumber() {
        System.out.println("My Student Number is " + studentNumber);
    }    
    public void sayMyEmailAddress() {
        System.out.println("My Email Address is " + studentEmailAddress);
    }
    public void AmIAwesome() {
        System.out.println("Am I Awesome? " + iAmAwesome);
    }
}
