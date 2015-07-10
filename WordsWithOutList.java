public List wordsWithoutList(String[] words, int len) {

    ArrayList a = new ArrayList();
  
    for(String str : words){
	if(str.length() != len){
	    a.add(str);
	}
    }
    return a;  
  
}
