import java.util.HashMap;
import java.util.Map;


/**
 * KATA link : https://www.codewars.com/kata/54da5a58ea159efa38000836
 */
public class FindTheIntOdd {


	public static int findIt(int[] a) {
		//map des occurences number -> occurences
		HashMap<Integer,Integer> occurences = new HashMap<Integer,Integer>();

		for(int i=0  ;i<a.length; i++) {
			//on ajoute les occurence que l'on trouve
			occurences.put(a[i],occurences.getOrDefault(a[i], 0)+1);
		}

		//pour toutes les couple on cherche un couple ou il y a un nombre impaire
		for(Map.Entry<Integer,Integer> entry : occurences.entrySet()){
			if(entry.getValue()%2==1) return entry.getKey();
		}

		//not found
		return 0;
	}

}