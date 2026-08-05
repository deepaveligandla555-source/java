//all methods of array list covered here and also do some questions based on array list
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
public class ArrayListPractise {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(67);
		al.add(45);
		al.add(78);
		System.out.println(al.get(1));
		al.set(2, 43);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.remove(Integer.valueOf(10));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(43));
		al.indexOf(1);
		System.out.println(al);
		al.lastIndexOf(0);
		System.out.println(al);
		
		
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(43));
		System.out.println();
		
		max();
		min();
		sum();
		avg();
		reverse();
		sortInAsc();
		sortInDesc();
		copy();
		merge();
		duplicate();
		search();
		count();
		odd();
		secondLargestElement();
		secondSmallestElement();
		removeAllEvenNumbers();
		removeAllOddNumbers();
		replace();
		countFrequency();
		check();
		rotateToLeft();
		rotateToRight();
		removeDuplicate();
		findCommon();
		findMissing();
	}

//MAX ELEMENT BY USING ARRAYLIST

	public static void max() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(8);
		int max  = al.get(0);
		for(int i=0;i<al.size();i++) {
			max = al.get(i)>max?al.get(i):max;
		}
		System.out.println("Maximum elemnet:"+max+" ");
		
		
		
	}


//MIN ELEMENT BY USING ARRAYlIST

	public static void min(){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(8);
		int min  = al.get(0);
		for(int i=0;i<al.size();i++) {
			min = al.get(i)<min?al.get(i):min;
		}
		System.out.println("Minimum element:"+min+" ");
		
		
		
	}

//FIND SUM OF ELEMENT
	public static void sum() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(8);
		int sum = 0;
		for(int i=0;i<al.size();i++) {
			sum += al.get(i);
		}
		System.out.println("Sum of elements:"+sum+" ");
		
		
		
	}


//FIND AVERAGE

	public static void avg() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(8);
		float sum = 0;
		float avg;
		for(int i=0;i<al.size();i++) {
			sum += al.get(i);
		}
		avg = sum/al.size();
		System.out.println("Average of elements:"+avg);
		
		
		
	}


//REVERSE AN ARRAYlIST
	public static void reverse() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(8);
		System.out.println("Reverse an ArrayList:");
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
		
		
		
	}


//SORT IN ASCENDING ORDER

	public static void sortInAsc() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(7);
		al.add(8);
		Collections.sort(al);
		System.out.println("Sort in ascending order:"+al);
  }

//SORT IN DESSCENDING ORDER
	public static void sortInDesc() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(7);
		al.add(8);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sort in descending order:"+al);
  }

//CPOY ONE ARRAYlIST TO ANOTHER;
	public static void copy() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(7);
		al.add(8);
		ArrayList<Integer> copy = new ArrayList<>();
		copy.addAll(al);
		System.out.println("Copy an ArryaList:"+copy);
  }


//MERGE TWO ARRAYS
	public static void merge() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(7);
		al.add(8);
		ArrayList<Integer> al1 = new ArrayList<>();
		al.add(34);
		al.add(45);
		al.add(80);
		al.addAll(al1);
		System.out.println("Merge two arrays:"+ al);
  }



//REMOVE DULPLICATE ELEMENTS
	public static void duplicate() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
    	al.add(8);
        al.add(8);
        HashSet<Integer> set = new HashSet<>(al);
        System.out.println("Remove dulpicate elements:"+set);
	}
	
	
//SEARCH FOR AN ELEMNT
	public static void search() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
    	al.add(8);
        al.add(8);
        if(al.contains(15)) {
             System.out.println("Element found");
	    }
        else {
        	 System.out.println("Element not found");	
        }
	
	}
	
//COUNT EVEN NUMBERS
	public static void count() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
    	al.add(7);
        al.add(8);
        int count=0;
        for(int i=0;i<al.size();i++) {
        	if(al.get(i)%2==0) {
        		count++;
    	    }
        	
           }
        System.out.println("count even numbers:"+count);	
   	
        }
        
  
//COUNT odd NUMBERS
	public static void odd() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
  	al.add(7);
      al.add(8);
      int count=0;
      for(int i=0;i<al.size();i++) {
      	if(al.get(i)%2!=0) {
      		count++;
  	    }
      	
         }
      System.out.println("count even numbers:"+count);	
 	
      }
      



//SECOND LARGEST ELEMENT
	public static void secondLargestElement() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
  	    al.add(7);
        al.add(8);
        al.add(6);
       // Collections.sort(al,Collections.reverseOrder());//this is also fine
        Collections.sort(al);
        
      System.out.println("Second largest element:"+al.get(al.size()-2));	
 	
      }
      
	
	//SECOND SMALLEST ELEMENT
		public static void secondSmallestElement() {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(15);
	  	    al.add(7);
	        al.add(8);
	        al.add(6);
	       // Collections.sort(al,Collections.reverseOrder());//this is also fine
	        Collections.sort(al);
	        
	      System.out.println("Second largest element:"+al.get(1));	
	 	
	      }
		
	//REMOVE ALL EVEN NUMBERS
		public static void removeAllEvenNumbers() {
		     ArrayList<Integer> al = new ArrayList<>();
			 al.add(15);
			 al.add(7);
			 al.add(8);
			 al.add(6);
			 for(int i=al.size()-1;i>=0;i--) {
//				 if(al.get(i)%2==0) {          //this is also fine
//					 al.remove(i);
//				 }
				 al.removeIf(n->n%2==0);
				 
		    }
			 System.out.println("After remove all even numbers:"+al);	
			   
     }	


			
//REMOVE ALL ODD NUMBERS
		public static void removeAllOddNumbers() {
		     ArrayList<Integer> al = new ArrayList<>();
			 al.add(15);
			 al.add(7);
			 al.add(8);
			 al.add(6);
			 for(int i=al.size()-1;i>=0;i--) {
//				 if(al.get(i)%2!=0) {          //this is also fine
//					 al.remove(i);
//				 }
				 al.removeIf(n->n%2!=0);
				 
		    }
			 System.out.println("After remove all odd numbers:"+al);	
			   
   }	


//REPLACE ONE VALUE WITH ANOTHER
		public static void replace() {
		     ArrayList<Integer> al = new ArrayList<>();
			 al.add(15);
			 al.add(7);
			 al.add(8);
			 al.add(6);
			 for(int i=0;i<al.size();i++) {
				 if(al.get(i)==15) {
					 al.set(i,5);
				 }
			 }
		   
			 System.out.println("After replace one value with another:"+al);	
			   
   }
//COUNT FREQUENCY OF AN ELEMENT
		public static void countFrequency() {
		     ArrayList<Integer> al = new ArrayList<>();
			 al.add(5);
			 al.add(7);
			 al.add(8);
			 al.add(5);
			 int count=0;
			 for(int i=0;i<al.size();i++) {
				 if(al.get(i)==8) {
					 count++;
				 }
				 //System.out.println("Count frequency of an element:"+count);	//here we can print for all elements frequency
				   
			 }
		   
			System.out.println("Count frequency of an element:"+count);	//for one  element
			   
  }	
		

//CHECK WHETHER TWO ARRAY LISTS ARE EQUAL ARE NOT
public static void check() {
    ArrayList<Integer> al = new ArrayList<>();
	 al.add(5);
	 al.add(7);
	 al.add(8);
	 al.add(5);
ArrayList<Integer> al1 = new ArrayList<>();		
     al1.add(5);
     al1.add(7);
     al1.add(8);
     al1.add(5);
     System.out.println("Check whether two array lists are equal or not:"+al.equals(al1));
}

//ROTATE AN ARRAYLIST TO LEFT

public static void rotateToLeft() {
    ArrayList<Integer> al = new ArrayList<>();
	 al.add(15);
	 al.add(7);
	 al.add(8);
	 al.add(5);
//	 for(int i=al.size()-1;i>=0;i--) {
//		 System.out.println(al.get(i));           //THIS IS ALSO VALID
//	 }
	 int first = al.remove(0);
	 al.add(first);
	 System.out.println("Rotate an array list to left:"+al);
	 
}
//ROTATE AN ARRAYLIST TO RIGHT

public static void rotateToRight() {
  ArrayList<Integer> al = new ArrayList<>();
	 al.add(15);
	 al.add(7);
	 al.add(8);
	 al.add(5);
//	 for(int i=al.size()-1;i>=0;i--) {
//		 System.out.println(al.get(i));           //THIS IS ALSO VALID
//	 }
	 int last = al.remove(al.size()-1);
	 al.add(0,last);
	 System.out.println("Rotate an array list to right:"+al);
	 
}
//REMOVE DULIPCATE ELEMENTS (WITHOUT HASHSET)
public static void removeDuplicate() {
	  ArrayList<Integer> al = new ArrayList<>();
		 al.add(5);
		 al.add(7);
		 al.add(8);
		 al.add(5);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}
		}
         System.out.println("After removing duplicate elements:"+al);


}
//Find common elements
public static void findCommon () {
	  ArrayList<Integer> al = new ArrayList<>();
		 al.add(5);
		 al.add(7);
		 al.add(8);
		 al.add(5);
		 ArrayList<Integer> al1 = new ArrayList<>();
		 al1.add(5);
		 al1.add(17);
		 al1.add(8);
		 al1.add(15);
		 System.out.print("after findind common elements:");
		for(int i=0;i<al.size();i++) {
			if(al.contains(al1.get(i))) {

			       System.out.print(al1.get(i)+" ");
			}
			
		}
		System.out.println();
		
 }
//Find missing element
public static void findMissing() {
	  ArrayList<Integer> al = new ArrayList<>();
		 al.add(1);
		 al.add(2);
		 al.add(7);
		 al.add(5);
		 int n=5;
		 int sum=0;
		 int total=n*(n+1)/2;
		for(int i=0;i<al.size();i++) {
			sum += al.get(i);
			
			}
		System.out.print("Missing number:"+(total-sum));
		}
		
}

	 
     

			



















			
			      		
		
		
		
		
	      
































		
		
	







































































































