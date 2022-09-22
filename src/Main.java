public class Main {
    public static void main(String[] args) {
        var friend = 9;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println();
        
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Total weight of the boxers is " + totalWeight + " kg.");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Weight difference is " + weightDifference + " kg.");
        var wDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Weight difference is " + wDifference + " kg.");

        System.out.println();
       //HW3
       //Zadaniye 7

        var totalTime = 640;
        var totalTimeSpent = 8;
        var numEmployees = totalTime / totalTimeSpent;
        System.out.println("The total number of employees is " + numEmployees + ".");

        System.out.println();
        //Zadaniye 8

        numEmployees = 94;
        var totalTimeNeeded = totalTime / numEmployees;
        System.out.println("Work time for each employee is " + totalTimeNeeded + ".");


    }
}