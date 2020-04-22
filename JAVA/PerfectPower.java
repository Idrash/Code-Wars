import java.util.Arrays;

/**
 * KATA : https://www.codewars.com/kata/54d4c8b08776e4ad92000835
 */
public class PerfectPower {

    /**
     * Algorithme, pour toutes les racine i(de 2 a k) de n
     * si le resulta est plus petit que 2 le seul resulta possible
     * est n**1 on arrete donc la recursion et on envoie null.
     * si le resulta de la racine (arrondi**i == n) on a notre resulta.
     */
    public static int[] isPerfectPower(int n) {
        int i = 1;
        double res=0;
        do{
            i++;
            res = Math.pow(n, 1f/(float)i);
        }while(res>2 && Math.pow(Math.round(res),i)!=n);
        //le resultat est bon on envoie le resultat
        if(res>1 && Math.pow(Math.round(res),i)==n){
            return new int[]{(int) res,i};
        }
        //on a rien trouver
        return null;
    }
}

