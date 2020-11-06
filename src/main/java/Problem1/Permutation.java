package Problem1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public Permutation(ArrayList<Object> objects, boolean[] booleans, List<List<Integer>> res, int[] letters) {
    }

    public static List<List<Integer>> permute(int[] letters) {
        List<List<Integer>> res = new ArrayList<>();
        permuation(new ArrayList<>(), new boolean[letters.length], res, letters);
        return res;
    }

    private static void permuation(List<Integer> path, boolean[] used, List<List<Integer>> res, int[] letters) {
        if (path.size() == used.length) {
            // make a deep copy since otherwise we'd be append the same list over and over
            res.add(new ArrayList<Integer>(path));
            return;
        }

        for (int i = 0; i < used.length; i++) {
            // skip used letters
            if (used[i]) continue;
            // add letter to permutation, mark letter as used
            path.add(letters[i]);
            used[i] = true;
            permuation(path, used, res, letters);
            // remove letter from permutation, mark letter as unused
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}