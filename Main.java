import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


void main() {
    Scanner input = new Scanner(System.in);

/*1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user"*/

    System.out.println("Enter your role : " +
            "\n 1- admin " +
            "\n 2- superuser " +
            "\n 3- user \n");
    int numberRole = input.nextInt();
    if (numberRole == 1) {
        System.out.println("welcome admin");
    } else if (numberRole == 2) {
        System.out.println("welcome superuser");
    } else if (numberRole == 3) {
        System.out.println("welcome user");
    } else {
        System.out.println("Not fond role");
    }
    System.out.println("----------------------------------------------------");
//.........................................................................

/*2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87*/

    System.out.println("Input the 1st number:");
    int num1 = input.nextInt();
    System.out.println("Input the 2nd number:");
    int num2 = input.nextInt();
    System.out.println("Input the 3rd number:");
    int num3 = input.nextInt();
    if (num1 > num2 && num1 > num3) {
        System.out.println("The greatest:"+num1);
    } else if (num2 > num1 && num2 > num3) {
        System.out.println("The greatest:"+num2);
    } else {
        System.out.println("The greatest:"+num3);
    }
    System.out.println("----------------------------------------------------");
//.................................................................
//
/*3.Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday*/

    System.out.print("number: ");
    int num = input.nextInt();
    switch (num) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday ");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Nothing");
}
    System.out.println("----------------------------------------------------");
    //...........................................................

    /*4. Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69 F:
    0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B */

    System.out.print("Enter your numeric score:");
    int grade = input.nextInt();
    if (grade < 100 && grade > 90) {
        System.out.println("Numeric Score:" + grade);
        System.out.println("Letter Grade: A");
    } else if (grade < 89 && grade > 80) {
        System.out.println("Numeric Score:" + grade);
        System.out.println("Letter Grade: B");
    } else if (grade < 79 && grade > 70) {
        System.out.println("Numeric Score:" + grade);
        System.out.println("Letter Grade: C");
    } else if (grade < 69 && grade > 60) {
        System.out.println("Numeric Score:" + grade);
        System.out.println("Letter Grade: D");
    } else if (grade < 59 && grade > 0) {
        System.out.println("Numeric Score:" + grade);
        System.out.println("Letter Grade: F");
    } else {
        System.out.println("Not found");
    }
        System.out.println("----------------------------------------------------");

//.............................................................
/*5. Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
        "Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
        • If the age is less than 13, categorize them as a "Child."
        • If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
        • If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult.*/

    System.out.print("Enter your age:");
    int age=input.nextInt();

    if (age < 13 && age > 0) {
        System.out.println("You are an Child.");
    } else if (age < 19 && age > 13) {
        System.out.println("You are an Teenager.");
    } else if (age > 20) {
        System.out.println("You are an Adult.");
    } else {
        System.out.println("Invalid");
    }
        System.out.println("----------------------------------------------------");
    //..........................................................
}




