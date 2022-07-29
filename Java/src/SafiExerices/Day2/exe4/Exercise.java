package SafiExerices.Day2.exe4;

public class Exercise {
    public static double exercise_one(double x, double y, double z) {
        double answer = 0;

        double valueOfX = Math.pow( x, 2 );
        double valueOfY = Math.pow( y, 2 );
        double additionXAndYValues = valueOfX + valueOfY;
        double absoluteValue = Math.abs( z );
        double finalCube = additionXAndYValues - absoluteValue;
        answer += finalCube;

        return answer;
    }
}


