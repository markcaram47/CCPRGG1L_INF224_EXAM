import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {

        typeOfnumber();
        primeOrcomposite();
        lengthOfname();
        largestNumber();
        vowelOrconsonant();
        studentNumber();
        uppercaseAndlowercase();
        courseSpecialization();
        possibleStrand();
        validEmailaddress();

    }




        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)

        static void typeOfnumber() {
        System.out.println("1. Positive, negative, zero");
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        if (number == 0) { 
        System.out.println( "ZERO" );
        } else if (number > 0) { 
        System.out.println ( "POSITIVE");
        } else if (number < 0 ) {
        System.out.println ("NEGATIVE");}
        } 
    


        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)

        static void primeOrcomposite() {
        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i<=lastDigit/2; i ++){
            if (lastDigit % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true)
        System.out.println(lastDigit + " is a prime number");
        else
        System.out.println(lastDigit + " is a composite number\n(neither)");}
    
        
        
        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        static void lengthOfname() {
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        int stringSize = firstName.length();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int stringsize = surName.length();
        
        Object sum = stringSize + stringsize;
        System.out.println("The sum of the character length of your first name and your surname " + sum);}

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest number.
        static void largestNumber(){
        System.out.println("4. Largest Number");
            int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = s.nextInt();
        System.out.print("Enter second number: ");
        y = s.nextInt();
        System.out.print("Enter third number: ");
        z = s.nextInt();
        
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);}
        }
 
    
        
        // ==============================================================================

        // 5. Create a method that will print "VOWEL" if your name starts with
        // a vowel and "CONSONANT" if your name starts with a consonant.
        static void vowelOrconsonant(){
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        if (firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U' || firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u')
        {
            System.out.println("VOWEL");
        } else {
            System.out.println("CONSONANT");}
        }

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        static void studentNumber(){
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        if(studentNumber==2022102151)
            System.out.println("valid");
        else
            System.out.println("invalid");}
        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        static void uppercaseAndlowercase(){
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();
        if (firstName==firstName.toUpperCase() && surName==surName.toLowerCase())
        System.out.println("valid");
        else
        System.out.println("invalid");}
        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
        static void courseSpecialization(){
        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();
        switch (course){
            case "BSIT":
        // If BSIT
        System.out.print("Enter your specialization (MWAA or MAA): ");
        String specialization1 = scan.next();
        switch (specialization1){
            case "MWAA":
        System.out.println("The student is taking BSIT-MWAA");
            break;
            case "MAA":
        System.out.println("The students is taking BSIT-MAA");
        break;
        }
    
        break;
        case "BSCS":
        // If BSCS
        System.out.print("Enter your specialization (DF or ML): ");
        String specialization2 = scan.next();
        switch (specialization2){
            case "ML":
        System.out.println("The student is taking BSCS-ML");
            break;
            case "DF":
        System.out.println("The student is taking BSCS-DF");}
        }
    }
        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME
        static void possibleStrand(){
        System.out.println("9. Selection");
        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");
        String strand = scan.next();

        switch (strand){
            case "STEM":
                System.out.println("valid");
                break;
            case "ICT":
                System.out.println("valid");
                break;
            case "HUMSS":
                System.out.println("valid");
                break;
            case "HOME ECONOMICS":
                System.out.println("valid");
                break;
            case "ARTS AND DESIGN":
                System.out.println("valid");
                break;
            case "TVL MARITIME":
                System.out.println("valid");
                break;
            default:
                System.out.println("invalid");}
        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the following pattern:
        // - Your surname
        // - The string "@student.national-u.edu.ph"
        //(10 pts)
        static void validEmailaddress(){
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();
        if (studentEmailAddress.contains("caram") && studentEmailAddress.contains("@students.national-u.edu.ph")){
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Think like an ATM.

        // You have an N amount of pesos in your savings account and you have decided
        // that you want to withdraw all of your money in the ATM.

        // The denomination of peso bills that the ATM could dispense are 20, 50, 100,
        // 200, 500, 1000.

        // Create a method that will return the minimum number of peso bills that the
        // ATM will dispense after withdrawing all of your money.

        // Example:
        // Elizer has 150 pesos in his bank account. If elizer withdraws 150 pesos in
        // the ATM, the ATM will dispense two peso bills (100 peso bill and 50 peso
        // bill). (Answer is 2)

        System.out.println("11. Think like an ATM");
        System.out.print("Enter the total amount of money in your bank account: ");
        int amount = scan.nextInt();

        // Close scanner
        scan.close();
    }
}
