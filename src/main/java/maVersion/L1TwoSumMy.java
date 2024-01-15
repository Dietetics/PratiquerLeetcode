package maVersion;

public class L1TwoSumMy {


    // La somme de deux elements dun tab de int donne le target,
    // on assume que chaque element ne peut que utiliser une fois
    // et exactement une solution
    // on veut return l index des elements ou la somme est egale a target
    public int[] twoSum(int[] nums, int target) {

        // cas dun tableau vide (fourni)
        int[] vide = new int[0];

        System.out.println(nums.length);

        // i < nums.length - 1, car si i est le derniere chiffre, alors on na pas besoin d evaluer le prob, car aucun j
        for (int i=0; i < nums.length - 1; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    int[] nouveauTableau = {i, j};
                    return nouveauTableau;
                }
            }
        }
        return vide;
    }
}
