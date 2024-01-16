package maVersion;

import java.util.HashMap;
import java.util.Map;

public class L1TwoSumMy {


    // La somme de deux elements dun tab de int donne le target,
    // on assume que chaque element ne peut que utiliser une fois
    // et exactement une solution
    // on veut return l index des elements ou la somme est egale a target
    public int[] twoSum(int[] nums, int target) {

        // cas dun tableau vide (fourni)
        int[] vide = new int[0];

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



    public int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> unHashMap = new HashMap<>();

        int[] vide = new int[0];

        // construire un hashMap
        for(int i = 0; i < nums.length; i++){
            unHashMap.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (unHashMap.containsKey(diff) && unHashMap.get(diff) != i){
                int[] res = {i,unHashMap.get(diff)};
                return res;}
            }
        return vide;
    }
}
