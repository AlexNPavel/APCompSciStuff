import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class SortSearch {

	static Integer[] myStuffR;
	static int[] myStuff;
	static int[] myStuffCopy;
	static ArrayList<Integer> myStuffList;
	static long time;
	static long time2;
	boolean reset;

	public SortSearch() {
		reset = true;
	}

	public void bubbleSort(int[] sortArr, boolean ascending) {
		if (ascending) {
			while (reset == true) {
				reset = false;
				for (int i = 1; i < sortArr.length; i++) {
					if (sortArr[i] < sortArr[i - 1]) {
//						System.out.println("Current array is " + Arrays.toString(sortArr));
//						System.out.println("Switch pos " + i + " {value " + sortArr[i] + "} with pos " + (i - 1) + " {value " + sortArr[i - 1] + "}");
						int upperVal = sortArr[i - 1];
						int lowerVal = sortArr[i];
						sortArr[i] = upperVal;
						sortArr[i - 1] = lowerVal;
						reset = true;
//						System.out.println("Changed array is " + Arrays.toString(sortArr) + "\n");
					}
				}
			}
		}
		else {
			while (reset == true) {
				reset = false;
				for (int i = 1; i < sortArr.length; i++) {
					if (sortArr[i] > sortArr[i - 1]) {
//						System.out.println("Current array is " + Arrays.toString(sortArr));
//						System.out.println("Switch pos "+ i + " {value " + sortArr[i]+ "} with pos " + (i-1) + " {value " + sortArr[i - 1]+ "}");
						int upperVal = sortArr[i - 1];
						int lowerVal = sortArr[i];
						sortArr[i] = upperVal;
						sortArr[i - 1] = lowerVal;
						reset = true;
//						System.out.println("Changed array is " + Arrays.toString(sortArr) + "\n");
					}
				}
			}
		}
	}

	public void selectionSort(int[] sortArr, boolean ascending) {
		if (ascending) {
			for (int i = 0; i < sortArr.length - 1; i++) {
//				System.out.println("Current array is " + Arrays.toString(sortArr));
				int minVal = sortArr[i];
				int pos = i;
				for (int g = i + 1; g < sortArr.length; g++) {
					if (minVal >= sortArr[g]) {
						minVal = sortArr[g];
						pos = g;
					}
				}
//				System.out.println("Moved position " + pos + " {value " + sortArr[pos] +"} to pos " + i);
				sortArr[pos] = sortArr[i];
				sortArr[i] = minVal;
//				System.out.println("Changed array is " + Arrays.toString(sortArr) + "\n");
			}
		}
		else {
			for (int i = 0; i < sortArr.length - 1; i++) {
//				System.out.println("Current array is " + Arrays.toString(sortArr));
				int minVal = sortArr[i];
				int pos = i;
				for (int g = i + 1; g < sortArr.length; g++) {
					if (minVal <= sortArr[g]) {
						minVal = sortArr[g];
						pos = g;
					}
				}
//				System.out.println("Moved position " + pos + " {value " + sortArr[pos] +"} to pos " + i);
				sortArr[pos] = sortArr[i];
				sortArr[i] = minVal;
//				System.out.println("Changed array is " + Arrays.toString(sortArr) + "\n");
			}
		}
	}

	public void insertionSort(int[] sortArr, boolean ascending) {
		if (ascending) {
			for (int i = 1; i < sortArr.length; i++) {
				for (int g = i; g > 0; g = g - 1) {
					if (sortArr[g] < sortArr[g - 1]) {
						int switched = sortArr[g - 1];
//						System.out.println("Current array is " + Arrays.toString(sortArr));
//						System.out.println("Switched pos " + (g-1) +" {value = " + sortArr[g - 1] + "} with pos " + (g) +" {value = " + sortArr[g] +"}");
						sortArr[g - 1] = sortArr[g];
						sortArr[g] = switched;
//						System.out.println("Changed array is " + Arrays.toString(sortArr) + "\n");
					}
				}
			}
		}
		else {
			for (int i = 1; i < sortArr.length; i++) {
				for (int g = i; g > 0; g = g - 1) {
					if (sortArr[g] > sortArr[g - 1]) {
						int switched = sortArr[g - 1];
//						System.out.println("Current array is " + Arrays.toString(sortArr));
//						System.out.println("Switched pos " + (g-1) +" {value = " + sortArr[g - 1] + "} with pos " + (g) +" {value = " + sortArr[g] +"}");
						sortArr[g - 1] = sortArr[g];
						sortArr[g] = switched;
//						System.out.println("Changed array is " + Arrays.toString(sortArr) + "\n");
					}
				}
			}
		}
	}

	public void unknown(int w[],int i) {
		//Prints the array in reverse.
		if (i >= w.length-1) {
//			System.out.print(w[i]+", ");
		}
		else
		{
			unknown(w,i+1);
//			System.out.print(w[i]+", ");
		}
	}

	public void selectionSortR(int[] sortArr, int first, int last) {
		for (int i = first; i < last - 1; i++) {
			//			System.out.println("Current array is " + Arrays.toString(sortArr));
			int minVal = sortArr[i];
			int pos = i;
			for (int g = i + 1; g < last + 1; g++) {
				if (minVal > sortArr[g]) {
					minVal = sortArr[g];
					pos = g;
				}
			}
			//			System.out.println("Moved position " + pos + " {value " + sortArr[pos] +"} to pos " + i);
			sortArr[pos] = sortArr[i];
			sortArr[i] = minVal;
			//			System.out.println("Changed array is " + Arrays.toString(sortArr) + "\n");
		}
	}

	public void merge(int[] sortArr) {
		int[] first;
		int[] second;
		if (sortArr.length % 2 == 0) {
			first = new int[sortArr.length/2];
			second = new int[sortArr.length/2];
		}
		else {
			first = new int[(sortArr.length/2) + 1];
			second = new int[sortArr.length/2];
		}
		first = Arrays.copyOfRange(sortArr, 0, first.length);
		second = Arrays.copyOfRange(sortArr, first.length, second.length + first.length);
		selectionSort(first, true);
		selectionSort(second, true);
		int secondPos = 0;
		int finalPos = 0;
		for (int i = 0; i < first.length; i++) {
			if (secondPos < second.length) {
				while (second[secondPos] < first[i]) {
					sortArr[finalPos] = second[secondPos];
					finalPos++;
					secondPos++;
				}
			}
			else {
				break;
			}
			sortArr[finalPos] = first[i];
			finalPos++;
		}
		for(int i = secondPos; i < second.length; i++) {
			sortArr[finalPos] = second[i];
			finalPos++;
		}
	}

	public void mergeR(Integer[] sortArr, int one, int two) {
		int first = one;
		int last = two;
		if (last - first > 1) {
			mergeR(sortArr, first, first + (last - first)/2);
//			System.out.println("Finished First with first "+first+" and last "+last+" and split "+(first + (last - first)/2));
			mergeR(sortArr, (first + (last - first)/2) + 1, last);
			combine(sortArr, first, last);
//			System.out.println("What sortArr looks like "+Arrays.toString(sortArr));
		}
		else {
			if (sortArr[last].intValue() < sortArr[first].intValue()) {
				int shift = sortArr[last];
				sortArr[last] = sortArr[first];
				sortArr[first] = shift;
			}
		}
	}

	public void combine(Integer[] sortArr, int first, int last) {
//		System.out.println("Combine with first "+first+" and last "+last+" and array "+Arrays.toString(sortArr));
		ArrayList<Integer> sortList = new ArrayList(Arrays.asList(sortArr));
		int secondStart = 1 + first + (last - first)/2;
//		System.out.println("Secondstart is "+secondStart);
		for (int i = first; i <= last; i++) {
//			System.out.println("Comparing "+sortList.get(secondStart)+" and "+sortList.get(i));
			if (sortList.get(secondStart).intValue() <= sortList.get(i).intValue()) {
//				System.out.println("Switching");
				sortList.add(i, sortList.get(secondStart));
				sortList.remove(secondStart + 1);
				secondStart++;
//				System.out.println("New sortList " + sortList.toString());
			}
			if (secondStart >= last+1) {
				break;
			}
		}
//		System.out.println("Converted arrList" + Arrays.toString(sortList.toArray(new Integer[sortArr.length])));
//		sortArr = sortList.toArray(new Integer[sortArr.length]);
		System.arraycopy(sortList.toArray(new Integer[sortArr.length]), 0, sortArr, 0, sortArr.length);
//		System.out.println("SortArr after" + Arrays.toString(sortArr));
	}
	
	public void mergeRList(ArrayList<Integer> sortArr, int one, int two) {
		int first = one;
		int last = two;
		if (last - first > 1) {
			mergeRList(sortArr, first, first + (last - first)/2);
//			System.out.println("Finished First with first "+first+" and last "+last+" and split "+(first + (last - first)/2));
			mergeRList(sortArr, (first + (last - first)/2) + 1, last);
			combineList(sortArr, first, last);
//			System.out.println("What sortArr looks like "+Arrays.toString(sortArr));
		}
		else {
			if (sortArr.get(last).intValue() < sortArr.get(first).intValue()) {
				sortArr.add(first, last);
				sortArr.remove(last+1);
			}
		}
	}

	public void combineList(ArrayList<Integer> sortList, int first, int last) {
//		System.out.println("Combine with first "+first+" and last "+last+" and array "+Arrays.toString(sortArr));
		int secondStart = 1 + first + (last - first)/2;
//		System.out.println("Secondstart is "+secondStart);
		for (int i = first; i <= last; i++) {
//			System.out.println("Comparing "+sortList.get(secondStart)+" and "+sortList.get(i));
			if (sortList.get(secondStart).intValue() <= sortList.get(i).intValue()) {
//				System.out.println("Switching");
				sortList.add(i, sortList.get(secondStart));
				sortList.remove(secondStart + 1);
				secondStart++;
//				System.out.println("New sortList " + sortList.toString());
			}
			if (secondStart >= last+1) {
				break;
			}
		}
	}
	
	public void mergeRArr(int[] sortArr, int one, int two) {
		int first = one;
		int last = two;
		if (last - first > 1) {
			mergeRArr(sortArr, first, first + (last - first)/2);
//			System.out.println("Finished First with first "+first+" and last "+last+" and split "+(first + (last - first)/2));
			mergeRArr(sortArr, (first + (last - first)/2) + 1, last);
			combineArr(sortArr, first, last);
//			System.out.println("What sortArr looks like "+Arrays.toString(sortArr));
		}
		else {
			if (sortArr[last] < sortArr[first]) {
				int shift = sortArr[last];
				sortArr[last] = sortArr[first];
				sortArr[first] = shift;
			}
		}
	}
	
	public void combineArr(int[] sortList, int first, int last) {
//		System.out.println("Combine with first "+first+" and last "+last+" and array "+Arrays.toString(sortList));
		int[] temp = new int[sortList.length];
		int firstStart = first;
		int secondStart = 1 + first + (last - first)/2;
		int origSec = secondStart;
//		System.out.println("Secondstart is "+secondStart);
		int i = first;
		while (firstStart < origSec) {
//			System.out.println("Compared pos "+firstStart+" val "+sortList[firstStart]+" and pos "+secondStart+" val "+sortList[secondStart]);
			if (sortList[firstStart] < sortList[secondStart]) {
//				System.out.println("first wins");
				temp[i] = sortList[firstStart];
				firstStart++;
				i++;
			}
			else if (sortList[firstStart] > sortList[secondStart]) {
//				System.out.println("second wins");
				temp[i] = sortList[secondStart];
				secondStart++;
				i++;
			}
			else {
//				System.out.println("tie");
				temp[i] = sortList[secondStart];
				secondStart++;
				i++;
				temp[i] = sortList[firstStart];
				firstStart++;
				i++;
			}
			if (secondStart > last) {
				break;
			}
//			System.out.println("Current temp array "+Arrays.toString(temp));
		}
		
		while (firstStart < origSec) {
//			System.out.println("Finishing first");
			temp[i] = sortList[firstStart];
			firstStart++;
			i++;
//			System.out.println("Current temp array "+Arrays.toString(temp));
		}
		
		while (secondStart < last + 1) {
//			System.out.println("Finishing second");
			temp[i] = sortList[secondStart];
			secondStart++;
			i++;
//			System.out.println("Current temp array "+Arrays.toString(temp));
		}
		
		System.arraycopy(temp, first, sortList, first, (last-first) + 1);
	}

	public static void main(String[] args) {
		myStuff = new int[200000];
		for (int i = 0; i < myStuff.length; i++) {
			myStuff[i] = new Random().nextInt(10);
		}
//		System.out.println("Initial array was " + Arrays.toString(myStuff) + "\n");
		
		SortSearch sorter = new SortSearch();
		
//		myStuffCopy = myStuff.clone();
//		time = System.nanoTime();
//		sorter.bubbleSort(myStuffCopy, true);
//		time2 = System.nanoTime();
//		System.out.println("Bubble " + (time2 - time)/1000000);
//		myStuffCopy = myStuff.clone();
//		time = System.nanoTime();
//		sorter.selectionSort(myStuffCopy, true);
//		time2 = System.nanoTime();
//		System.out.println("Select " + (time2 - time)/1000000);
//		myStuffCopy = myStuff.clone();
//		time = System.nanoTime();
//		sorter.insertionSort(myStuffCopy, true);
//		time2 = System.nanoTime();
//		System.out.println("Insert " + (time2 - time)/1000000);
		
		myStuffCopy = myStuff.clone();
		time = System.nanoTime();
		sorter.merge(myStuffCopy);
		time2 = System.nanoTime();
		System.out.println("HalfMerge " + (time2 - time)/1000000);
		
		//		System.out.println("My sorted array is " + Arrays.toString(myStuff));
//		int[] unknownArr = new int[10];
//		for(int i = 0; i < unknownArr.length; i++) {
//			unknownArr[i] = new Random().nextInt(100);
//		}
		//		System.out.println("Old Unknown: "+Arrays.toString(unknownArr));
		//		sorter.unknown(unknownArr, 0);
		//System.out.println("New Unknown: "+Arrays.toString(unknownArr));
		
		myStuffCopy = myStuff.clone();
		
//		System.out.println("My original array is " + Arrays.toString(myStuffCopy));
		
		time = System.nanoTime();
		sorter.mergeRArr(myStuffCopy, 0, myStuffCopy.length - 1);
		time2 = System.nanoTime();
		System.out.println("MergeArr " + (time2 - time)/1000000);
		
//		myStuffR = new Integer[myStuff.length];
//		for(int i = 0; i < myStuff.length; i++) {
//			myStuffR[i] = new Integer(myStuff[i]);
//		}
//		myStuffList = new ArrayList(Arrays.asList(myStuffR));
//		time = System.nanoTime();
//		sorter.mergeR(myStuffR, 0, myStuffR.length - 1);
//		time2 = System.nanoTime();
//		System.out.println("MergeConv " + (time2 - time)/1000000);
//		time = System.nanoTime();
//		sorter.mergeRList(myStuffList, 0, myStuffList.size() - 1);
//		time2 = System.nanoTime();
//		System.out.println("MergeList " + (time2 - time)/1000000);
		
//		System.out.println("My sorted array is " + Arrays.toString(myStuffCopy));
	}

}
