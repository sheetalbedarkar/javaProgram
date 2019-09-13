package AlgorithmProg;
public class mergesort {
	     
	    private String[] array;
	    private String[] tempMergArr;
	    private int length;
	 
	   
	    public static void main(String[] args)
	    {
	       // int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	    	String[] inputArr= {"pooja","Nikita","Shital","bridgelabz"};
	    	mergesort mms = new mergesort();
	        mms.sort(inputArr);
	        for(String i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	     
	    public void sort(String[] inputArr) {
	        this.array = inputArr;
	        this.length = inputArr.length;
	        this.tempMergArr = new String[length];
	        doMergeSort(0, length - 1);
	    }
	 
	    private void doMergeSort(int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            // Below step sorts the left side of the array
	            doMergeSort(lowerIndex, middle);
	            // Below step sorts the right side of the array
	            doMergeSort(middle + 1, higherIndex);
	            // Now merge both sides
	            mergeParts(lowerIndex, middle, higherIndex);
	        }
	    }
	 
	    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	 
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr[i].compareTo(tempMergArr[j])<=0)
	            {
	                array[k] = tempMergArr[i];
	                i++;
	            } else {
	                array[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	 
	    }
	}