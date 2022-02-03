public class GradeCalc{
  public static int gradeMean(int[] gradeList){
    int numGrades = gradeList.length;
    int sum = 0;
    for (int i = 0; i <numGrades; i++){
      sum += gradeList[i];
    }
    return sum / numGrades;
  }

  public static int getPassing(int[] gradeList, int passingGrade){
    int numPassing, index;
    numPassing = 0;
    index = 0;
    while (index < gradeList.length){
      int grade = gradeList[index];
      if (grade >= passingGrade){
        numPassing++;
      }
      index++;
    }

    return numPassing;
  }

  public static void printGrades(int[] grades){

    for (int i =0; i<grades.length; i++){
      System.out.println(grades[i]);
    }
  }
  public static void main(String[] args){



    int[] grades = {80, 92, 91, 68, 88, 54};

    System.out.println("Mean Grade: " + gradeMean(grades));

    System.out.println("# of students' passing: " + getPassing(grades, 65));

    printGrades(grades);
    for (int i=0; i<grades.length; i++) {
      grades[i]+= 5;
    }
    printGrades(grades);
  }
}
