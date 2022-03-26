package com.syntax.JavaProject02;

public interface CodingTask2 {
     /*
We have to calculate the average of marks obtained
in three subjects by student A and by student B.
Create   class   'Marks'   with   an   abstract   method
'getPercentage' that will be returning the average
percentage   of   marks.   Provide   implementation   of
abstract   method   in   classes   'A'   and   'B'.   The
constructor of student A takes the marks in three
subjects as its parameters and the marks in four
subjects as its parameters for student B. Test your
code
     */
}
abstract class Marks{
    abstract double getPercentage();
}
class StudentA extends Marks{
    double historyScore;
    double chemistryScore;
    double javaScore;

    public StudentA(double historyScore,double chemistryScore,double javaScore){
        this.chemistryScore=chemistryScore;
        this.historyScore=historyScore;
        this.javaScore=javaScore;
    }

    @Override
    double getPercentage() {
        return (chemistryScore+historyScore+javaScore)/3;
    }
}
class StudentB extends Marks{
    double historyScore;
    double chemistryScore;
    double javaScore;
    double gymScore;

    public StudentB(double historyScore,double chemistryScore, double javaScore, double gymScore){
        this.chemistryScore=chemistryScore;
        this.historyScore=historyScore;
        this.javaScore=javaScore;
        this.gymScore=gymScore;

    }

    @Override
    double getPercentage() {
        return ( historyScore+chemistryScore+javaScore+gymScore)/4;
    }
}
class MarksTester{
    public static void main(String[] args) {
        System.out.println("The average percentage of Student A is "+new StudentA(80,78,97).getPercentage());
        System.out.println("The average percentage of Student B is "+new StudentB(72,87,97,87).getPercentage());
    }
}
