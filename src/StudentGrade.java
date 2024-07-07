import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int scores = 100;
        double passMark = 50;
        int numberOfStudent;
        int coursesNumber = 0;
        int total;
        double average;
        int position;
        String student;

        ArrayList<int[]> listOfScores = new ArrayList<>();

        System.out.println("How many students do you have: ");
        numberOfStudent = scanner.nextInt();

        System.out.println("How many subjects do they offer: ");
        coursesNumber = scanner.nextInt();
        System.out.println("");
        System.out.println("Saving  " + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully");
        System.out.println("");
        int[] arrayOfStudent = new int[numberOfStudent];
        int[] arrayOfCourses = new int[coursesNumber];

        for (int i = 0; i < arrayOfStudent.length; i++) {
            int[] arrayOfScores = new int[coursesNumber];

            for (int j = 0; j < arrayOfCourses.length;) {

                System.out.println("Entering score for student " + (i + 1) );
                System.out.println("Enter score for subject " + ( j+ 1) );
                score = scanner.nextInt();
                if (score >= 0 && score <= 100) {
                    arrayOfScores[j] = score;
                    j++;
                    System.out.println("");
                    System.out.println("Saving  " + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("Saved Successfully");
                    System.out.println("");
                    System.out.println("");
                }
            }
            listOfScores.add(arrayOfScores);
        }

        ArrayList<double[]> listPerStudent = new ArrayList<>();
        for (int[] listScore : listOfScores) {
            double[] newScoresArray = new double[listScore.length + 3];
            for (int j = 0; j < listScore.length; j++) {
                newScoresArray[j] = listScore[j];
            }
            newScoresArray[listScore.length] = StudentGrade.totalNumber(listScore);
            newScoresArray[listScore.length + 1] = StudentGrade.averageScore(listScore);
            newScoresArray[listScore.length + 2] = 0;
            listPerStudent.add(newScoresArray);
        }

        String tableHeader = "Student   ";
        for (int i = 0; i < arrayOfCourses.length; i++) {
            String studentHeader = "SUB" + (i + 1);
            tableHeader += "   " + studentHeader;
        }
        String finalHeader = "  TOT   AVE   POS";
        tableHeader += finalHeader;


        double[] averageScores = new double[arrayOfStudent.length];
        int averageCount = 0;
        for (double[] listScore : listPerStudent) {
            averageScores[averageCount] = listScore[listScore.length - 2];
            averageCount++;
        }
        Arrays.sort(averageScores);
        for (int i = 0; i < averageScores.length; i++) {
            for (double[] listScore : listPerStudent) {
                if (listScore[listScore.length - 2] == averageScores[i]) {

                    listScore[listScore.length - 1] = averageScores.length - i - 1;
                    listScore[listScore.length - 1] += 1;
                }
            }
        }


        System.out.println("=================================================================================");
        System.out.println(tableHeader);
        System.out.println("=================================================================================");
        int listCount = 0;
        for (double[] listScore : listPerStudent) {
            String formatStudent = "Student " +(listCount+1)+"  ";
            for(int i = 0; i < listScore.length; i++){
                formatStudent += "  "+String.valueOf(listScore[i]);
            }
            listCount++;
            System.out.println("");
            System.out.println(formatStudent);
        }
        System.out.println("================================================================================");
        System.out.println("================================================================================");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < arrayOfCourses.length; i++) {
            System.out.println("SUBJECT SUMMARY");
            System.out.println("Subject " + (i + 1));
            double highestScoring = Double.MIN_VALUE;
            double lowestScoring = Double.MAX_VALUE;
            double totalScore = 0.0;
            double averageOva = 0.0;
            double noOfPasses = 0.0;
            double noOfFailures = 0.0;
            int passStudent = 0;
            int failStudent = 0;
            int scoreCount = 0;
            for (double[] listScore : listPerStudent) {


                if (listScore[i] > highestScoring) {
                    highestScoring = listScore[i];
                    passStudent = scoreCount + 1;

                }

                if (listScore[i] < lowestScoring) {
                    lowestScoring = listScore[i];
                    failStudent = scoreCount + 1;

                }

                if (listScore[i] >= passMark) {
                    noOfPasses += 1;
                } else {
                    noOfFailures += 1;
                }

                totalScore += listScore[i];
                scoreCount++;
            }

            averageOva = totalScore / listPerStudent.size();
            System.out.println("");
            System.out.println("Highest scoring student is: Student " + passStudent + " Scoring " + highestScoring);
            System.out.println("");
            System.out.println("Lowest scoring student is: Student " + failStudent + " Scoring " + lowestScoring);
            System.out.println("");
            System.out.println("Total Score is: " + totalScore);
            System.out.println("");
            System.out.println("Average Score is: " + averageOva);
            System.out.println("");
            System.out.println("Number of passes: " + noOfPasses);
            System.out.println("");
            System.out.println("Number of failures: " + noOfFailures);
            System.out.println("");
            System.out.println("");
        }
        double totalScore = 0.0;
        double totalScore2 = 0.0;
        double worstGradScore= 0.0;
        double worstGrad = 0.0;
        double temp = 0.0;
        double scoreCount1 = 0.0;
        int easiestSubject= 0;
        int hardestSubject = 0;
        double noOfPasses = 0.0;
        double noOfFailures = 0.0;
        double highestScoring = Double.MIN_VALUE;
        double lowestScoring = Double.MAX_VALUE;
        int passStudent = 0;
        int failStudent = 0;
        int passSubject = 0;
        int failSubject = 0;
        int scoreCount = 0;
        int scoreCount2 = 0;
        for (int i = 0; i < arrayOfCourses.length; i++) {
            int tempNoOfPasses = 0;
            int tempNoOfFailures = 0;
            int tempHardestSub = 0;
            int tempEasiestSub = 0;
            for (double[] listScore : listPerStudent) {


                if (listScore[i] > highestScoring) {
                    highestScoring = listScore[i];
                    passStudent = scoreCount + 1;
                    passSubject = scoreCount + 1;
                }

                if (listScore[i] < lowestScoring) {
                    lowestScoring = listScore[i];
                    failStudent = scoreCount + 1;
                    failSubject = scoreCount +1;
                }
                if (listScore[i] >= passMark) {
                    tempNoOfPasses += 1;
                    tempEasiestSub = i+1;
                } else {
                    tempNoOfFailures += 1;
                    tempHardestSub=i+1;
                }

            }	if(tempNoOfPasses > noOfPasses){
                noOfPasses = tempNoOfPasses;
                easiestSubject = tempEasiestSub;
            }

            if(tempNoOfFailures > noOfFailures){
                noOfFailures = tempNoOfFailures;
                hardestSubject = tempHardestSub;
            }


            scoreCount++;

        }

        System.out.println("");
        System.out.println("The hardest subject is : Subject " + hardestSubject + " with " + noOfFailures + " failures");
        System.out.println("");
        System.out.println("The easiest subject is : Subject " + easiestSubject + " with " + noOfPasses + " Passes");
        System.out.println("");
        System.out.println("The overall highest Score is Scored by Student " + passStudent + " in Subject " + passSubject + " Scoring "+ highestScoring);
        System.out.println("");
        System.out.println("The overall lowest Score is Scored by Student " + failStudent + " in Subject " + failSubject + " Scoring "+ lowestScoring);
        System.out.println("");
        for (double[] listOfScore : listPerStudent) {
            temp = 0;
            for (int k = 0; k < listOfScore.length - 3; k++) {
                temp += listOfScore[k];
                totalScore2 += listOfScore[k];
            }
            if (temp > totalScore) {

                scoreCount1 = scoreCount2 + 1;
                totalScore = temp;
            }

            else {
                worstGradScore = temp;
                worstGrad = scoreCount2 + 1;
            }
            scoreCount2++;
        }

        System.out.println("");
        System.out.println("CLASS SUMMARY");
        System.out.println("========================================================");
        System.out.println("Best Graduating Student is  Student " +scoreCount1 + " scoring " + totalScore);
        System.out.println("========================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("worst Graduating Student is  Student " +worstGrad + " scoring " + worstGradScore);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("");
        System.out.println("========================================================");
        System.out.println("Class Total Score is : " +totalScore2);
        System.out.println("");
        System.out.println("Class Average Score is : " +totalScore2/arrayOfStudent.length);
        System.out.println("========================================================");



    }

    public static int totalNumber(int[] numbers) {

        int totalNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            totalNumber += numbers[i];
        }

        return totalNumber;
    }

    public static double averageScore(int[] numbers) {

        double averageScore = 0;

        for (int i = 0; i < numbers.length; i++) {
            averageScore += numbers[i];
        }
        averageScore = averageScore / numbers.length;
        String formatScore = String.format("%.2f", averageScore);
        averageScore = Double.valueOf(formatScore);

        return averageScore;
    }
}
