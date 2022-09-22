public class Main {
    public static void main(String[] args) {
        System.out.println("HW2");
        //Zadaniye 4
        var friend = 9;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Zadaniye 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("HW3");

        // Zadaniye 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Total weight of the boxers is " + totalWeight + " kg.");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Weight difference is " + weightDifference + " kg. (1st way)" );
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Weight difference is " + weightDifference + " kg. (2 way)");

        System.out.println();

       //Zadaniye 7

        var totalTime = 640;
        var hoursPerDay = 8;
        var numEmployees = totalTime / hoursPerDay;
        System.out.println("The total number of employees is " + numEmployees + ".");

        System.out.println();
        //Zadaniye 8

        numEmployees = numEmployees + 94;
        totalTime = numEmployees * hoursPerDay;
        System.out.println("If there are " + numEmployees + " employees, the total working hours that can be divided among all employees is " + totalTime + ".");


    }
}