public class studentGradeManager {
    public static String[] reverseStudentNames(String[] names) {
        String[] reversed = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String original = names[i];
            String reverse = "";


            for (int j = original.length() - 1; j >= 0; j--) {
                reverse += original.charAt(j);
            }

            reversed[i] = reverse;
        }

        return reversed;
    }


    public static char getLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }


    public static String[] findFailingStudents(String[] names, int[] scores) {
        int count = 0;


        for (int score : scores) {
            if (score < 60) {
                count++;
            }
        }

        String[] failed = new String[count];
        int index = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failed[index] = names[i];
                index++;
            }
        }

        return failed;
    }

    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};


        String[] reversed = reverseStudentNames(students);
        System.out.println("Reversed Names:");
        for (String name : reversed) {
            System.out.println(name);
        }


        System.out.println("Letter Grades:");
        for (int i = 0; i < scores.length; i++) {
            char grade = getLetterGrade(scores[i]);
            System.out.println(students[i] + ": " + grade);
        }


        String[] failing = findFailingStudents(students, scores);
        System.out.println("Failing Students:");
        for (String name : failing) {
            System.out.println(name);
        }
    }
}
