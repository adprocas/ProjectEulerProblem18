package projecteulerproblem18;

import java.util.*;

/**
 *
 * @author Adam Leathorn
 */
public class ProjectEulerProblem18 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProjectEulerProblem18 solution = new ProjectEulerProblem18();
        
        solution.populateNumbers();

        solution.workUp();
    }
    
    private List<List<Integer>> numbers;

    public ProjectEulerProblem18() {
    }

    private void populateNumbers() {
        numbers = new ArrayList<>();

        numbers.add(Arrays.asList(75));
        numbers.add(Arrays.asList(95, 64));
        numbers.add(Arrays.asList(17, 47, 82));
        numbers.add(Arrays.asList(18, 35, 87, 10));
        numbers.add(Arrays.asList(20, 4, 82, 47, 65));
        numbers.add(Arrays.asList(19, 1, 23, 75, 3, 34));
        numbers.add(Arrays.asList(88, 2, 77, 73, 7, 63, 67));
        numbers.add(Arrays.asList(99, 65, 4, 28, 6, 16, 70, 92));
        numbers.add(Arrays.asList(41, 41, 26, 56, 83, 40, 80, 70, 33));
        numbers.add(Arrays.asList(41, 48, 72, 33, 47, 32, 37, 16, 94, 29));
        numbers.add(Arrays.asList(53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14));
        numbers.add(Arrays.asList(70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57));
        numbers.add(Arrays.asList(91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48));
        numbers.add(Arrays.asList(63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31));
        numbers.add(Arrays.asList(4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23));
    }

    private void workUp() {

        for (int i = numbers.size() - 1; i > 0; i--) {
            int xHolder = 0;
            int iHolder = i - 1;

            for (int x = 0; x < numbers.get(i).size() - 1; x++) {
                Integer a = numbers.get(iHolder).get(xHolder);
                Integer b = numbers.get(i).get(x);
                Integer c = numbers.get(i).get(x + 1);

                numbers.get(iHolder).set(xHolder, Math.max(a + b, a + c));

                xHolder++;
            }
        }

        System.out.println("The largest sum path is " + numbers.get(0).get(0));
    }
}
