import java.util.Arrays;

/**
 * Kata : https://www.codewars.com/kata/534e01fbbb17187c7e0000c6
 */
public class Spiralizor {

    /**
     * Permet de créer une spirale taille >= 4
     * @param size la taille
     * @return la spirale
     */
    public static int[][] spiralize(int size) {
        if(size<5) return new int[0][0]; //n'est pas une spirale
        int[][] spiral = init(size);
        int[] pos = new int[]{0,size};
        int angle = 270; //vers le haut
        int[] var = direction(angle);

        boolean finish = false;
        short samePos = 0;
        while(!finish){
            if(spiral[pos[1]+2*var[1]][pos[0]+2*var[0]]==1){
                if(samePos<2){ //si on a pas pue avancer de 2 case avant de tourner c'est fini
                    finish = true;
                }
                else { //on tourne
                    angle = (angle + 90) % 360;
                    var = direction(angle);
                    //si on doit tourner une deusieme fois consecutive c'est que c'est finit
                    samePos = 0;
                }
            }
            else {
                //on a reussi a avancer sans croiser d'obstacle on augmente le compteur
                samePos += 1;
                //on avance de 1:
                pos[0]+=var[0];
                pos[1]+=var[1];

                spiral[pos[1]][pos[0]] = 1; //la spirale passe par cette case

            }
        }
        return spiral;

    }

    /**
     * Permet d'initialiser la spirale en fonction de la taille
     * @param n la taille
     * @return la spirale initialiser
     */
    public static int[][] init(int n){
        int[][] spiral = new int[n][n];
        //remplisage premiere et derniere ligne
        for(int i = 0; i<n;i++){
            spiral[0][i] = 1;
            spiral[n-1][i] = 1;
        }
        //init derniere colonne
        for(int i = 0;i<n;i++){
            spiral[i][n-1] = 1;
        }

        return spiral;
    }

    /**
     * Permet de calculer la variation x et y en fonction de l'angle
     * @param angle angle vers le quel le spirale avance
     * @return la variation de position
     */
    public static int[] direction(int angle) {
        return new int[]{(int) Math.round(Math.cos(angle*Math.PI/180)), (int) Math.round(Math.sin(angle*Math.PI/180))};
    }

    public static void main(String[] arg){
        int[][] test = spiralize(10);
        for(int[] line : test){
            System.out.println(Arrays.toString(line));
        }
    }
}