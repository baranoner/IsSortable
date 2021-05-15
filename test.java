public class Test {
     public ISortable []Sort(ISortable a[]) throws Exception {
    	 ISortable temp;
    	 boolean fixed = false;
    	 
    	 while (fixed == false) {
    		 fixed = true;
    		 
    		 for(int i = 0; i< a.length-1 ; i++) {
    			 if(a[i+1].isGreater(a[i])) {
    				 
    				 temp = a[i+1];
    				 
    				 a[i+1] = a[i];
    				 a[i] = temp;
    				 
    				 fixed = false;
    			 }
    			 
    			 
    		 }
    		 
    		 
    		 
    	 }
    	 
    	
		return a  ;
     }
     // this sort method takes an ISortable array and makes it sorted. it simply applies bubble sort algorithm with isGreater method. Then it returns the sorted array.
     
     
	public static void main(String[] args) throws Exception {
		
		VideoFile v1 = new VideoFile("a", 6, 720);
		VideoFile v2 = new VideoFile("b", 8, 1080);
		VideoFile v3 = new VideoFile("c", 1, 720);
		VideoFile v4 = new VideoFile("d", 5, 480);
		VideoFile v5 = new VideoFile("e", 9, 720);
		VideoFile av[] = {v1,v2,v3,v4,v5}; 
		
		Shirt s1 = new Shirt("blue","large" , 60);
		Shirt s2 = new Shirt("red", "small", 40);
		Shirt s3 = new Shirt("purple", "XLarge", 35);
		Shirt s4 = new Shirt("white", "large", 23);
		Shirt s5 = new Shirt("black", "medium", 70);
		Shirt as[] = {s1,s2,s3,s4,s5};
		
		// examples
	Test test = new Test();
	ISortable sorted[] = test.Sort(av);
		for(int i = 0; i<sorted.length ; i++) {
			System.out.println(sorted[i]);
		}
			
		ISortable sortedshirt[] = test.Sort(as);
		
		for (int i = 0; i < sortedshirt.length ; i++) {
			System.out.println(sortedshirt[i]);
		}
		
		
		

	}

}
