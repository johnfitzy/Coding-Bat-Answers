public int scoresAverage(int[] scores) {
    
    int half = scores.length / 2;
    
    int firstHalf = average(scores, 0, half);
    int secondHalf = average(scores, half, scores.length);
    
    if(firstHalf > secondHalf){
      
	return firstHalf; 
    }
    return secondHalf;
}
  
public int average(int[] scores, int start, int end){
    
    int total = 0;
    
    for(int i = start; i < end; i++){
	total += scores[i];
    }
    
    return total / (end - start);
}
  
