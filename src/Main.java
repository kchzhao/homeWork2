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

        var totalTime = 640;
        var totalTimeSpent = 8;
        var numEmployees = totalTime / totalTimeSpent;
        System.out.println("The total number of employees is " + numEmployees + ".");


    }
}