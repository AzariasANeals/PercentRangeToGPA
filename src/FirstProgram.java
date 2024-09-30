import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double grade = 0.0;
        double percent = 0.0;
        System.out.print("Please enter your percentage: ");
        percent = s.nextDouble();

        if(percent >= 95 && percent <= 101){
            grade = 4.0;
        }
        
        else if(percent >= 94 && percent < 95){
            grade = 3.9;
        }

        else if(percent >= 93 && percent < 94){
            grade = 3.8;
        }

        else if(percent >= 92 && percent < 93){
            grade = 3.7;
        }

        else if(percent >= 91 && percent < 92){
            grade = 3.6;
        }

        else if(percent >= 90 && percent < 91){
            grade = 3.5;
        }

        else if(percent >= 89 && percent < 90){
            grade = 3.4;
        }

        else if(percent >= 88 && percent < 89){
            grade = 3.3;
        }

        else if(percent >= 87 && percent < 88){
            grade = 3.2;
        }

        else if(percent >= 86 && percent < 87){
            grade = 3.1;
        }

        else if(percent >= 85 && percent < 86){
            grade = 3.0;
        }

        else if(percent >= 84 && percent < 85){
            grade = 2.9;
        }

        else if(percent >= 83 && percent < 84){
            grade = 2.8;
        }

        else if(percent >= 82 && percent < 83){
            grade = 2.7;
        }

        else if(percent >= 81 && percent < 82){
            grade = 2.6;
        }

        else if(percent >= 80 && percent < 81){
            grade = 2.5;
        }

        else if(percent >= 79 && percent < 80){
            grade = 2.4;
        }

        else if(percent >= 78 && percent < 79){
            grade = 2.3;
        }

        else if(percent >= 77 && percent < 78){
            grade = 2.2;
        }

        else if(percent >= 76 && percent < 77){
            grade = 2.1;
        }

        else if(percent >= 75 && percent < 76){
            grade = 2.0;
        }

        else if(percent >= 74 && percent < 75){
            grade = 1.9;
        }

        else if(percent >= 73 && percent < 74){
            grade = 1.8;
        }

        else if(percent >= 72 && percent < 73){
            grade = 1.7;
        }

        else if(percent >= 71 && percent < 72){
            grade = 1.6;
        }

        else if(percent >= 70 && percent < 71){
            grade = 1.5;
        }

        else if(percent >= 69 && percent < 70){
            grade = 1.4;
        }

        else if(percent >= 68 && percent < 69){
            grade = 1.3;
        }

        else if(percent >= 67 && percent < 68){
            grade = 1.2;
        }

        else if(percent >= 66 && percent < 67){
            grade = 1.1;
        }

        else if(percent >= 65 && percent < 66){
            grade = 1.0;
        }

        else if(percent < 65){
            grade = 0.0;
        }
        System.out.println("Your GPA: " + grade);
        // Debug Statements
        //System.out.print("Grade = ");
        //System.out.println(grade);
        //System.out.print("Percent = ");
        //System.out.println(percent);
    }
}
