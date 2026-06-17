import java.util.*;

public class Main {

    static void findTeams(int[] arr, int index, int target,
                          ArrayList<Integer> team, int sum) {

        if (sum == target) {
            System.out.println(team);
            return;
        }

        if (index == arr.length || sum > target) {
            return;
        }

        team.add(arr[index]);
        findTeams(arr, index + 1, target, team, sum + arr[index]);

        team.remove(team.size() - 1);
        findTeams(arr, index + 1, target, team, sum);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7};
        int target = 10;

        findTeams(arr, 0, target, new ArrayList<>(), 0);
    }
}