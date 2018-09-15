import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Kata {
    public static boolean CheckIfFlush(String[] cards){
        //Write some code here

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(cards));


        int     incrementSpades = 0,
                incrementDiamonds = 0,
                incrementClubs = 0,
                incrementHearts = 0;


        for(int i = 0; i< arrayList.size(); i++){
            if(arrayList.get(i).contains("S")) {
                incrementSpades++;
            }

            if(arrayList.get(i).contains("H")){
                incrementHearts++;
            }

            if(arrayList.get(i).contains("C")){
                incrementClubs++;
            }

            if(arrayList.get(i).contains("D")){
                incrementDiamonds++;
            }

        }


        if (incrementClubs==cards.length || incrementDiamonds==cards.length ||
         incrementHearts == cards.length || incrementSpades==cards.length) return true;
        else return false;
    }

}
