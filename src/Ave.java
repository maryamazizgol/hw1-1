/**
 * Created by MM on 9/27/2019.
 */

public class Ave {

    float scores[];
    float sum = 0;
    float avg;

    Ave(float scores[]){
        this.scores=scores;
    }

float average(){

   for(int i=0;i<scores.length;i++){
       sum+=scores[i];
   }
   avg=sum/scores.length;
    return avg;
}



}
