
public class Merge extends Thread{
	
	int[] sortArrInit;
	int[] temp;
	boolean recurs;
	int tempShift;
	int startPoint;
	int endPoint;

	public Merge(int[] sortArrRec, int first, int second, boolean recur, int[] tempRec) {
		sortArrInit = sortArrRec;
		startPoint = first;
		endPoint = second;
		temp = tempRec;
		recurs = recur;
	}
	
	@Override
	public void run(){
		if (recurs) {
			mergeR(sortArrInit, startPoint, endPoint);
		}
		else {
			combine(sortArrInit, startPoint, endPoint);
		}
	}
	
	public void mergeR(int[] sortArr, int one, int two) {
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
			if (sortArr[last] < sortArr[first]) {
				tempShift = sortArr[last];
				sortArr[last] = sortArr[first];
				sortArr[first] = tempShift;
			}
		}
	}

	public void combine(int[] sortArr, int first, int last) {
		//		System.out.println("Combine with first "+first+" and last "+last+" and array "+Arrays.toString(sortList));
		int firstStart = first;
		int secondStart = 1 + first + (last - first)/2;
		int origSec = secondStart;
		//		System.out.println("Secondstart is "+secondStart);
		int i = first;
		while (firstStart < origSec) {
			//			System.out.println("Compared pos "+firstStart+" val "+sortList[firstStart]+" and pos "+secondStart+" val "+sortList[secondStart]);
			if (sortArr[firstStart] < sortArr[secondStart]) {
				//				System.out.println("first wins");
				temp[i] = sortArr[firstStart];
				firstStart++;
				i++;
			}
			else if (sortArr[firstStart] > sortArr[secondStart]) {
				//				System.out.println("second wins");
				temp[i] = sortArr[secondStart];
				secondStart++;
				i++;
			}
			else {
				//				System.out.println("tie");
				temp[i] = sortArr[secondStart];
				secondStart++;
				i++;
				temp[i] = sortArr[firstStart];
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
			temp[i] = sortArr[firstStart];
			firstStart++;
			i++;
			//			System.out.println("Current temp array "+Arrays.toString(temp));
		}

		while (secondStart < last + 1) {
			//			System.out.println("Finishing second");
			temp[i] = sortArr[secondStart];
			secondStart++;
			i++;
			//			System.out.println("Current temp array "+Arrays.toString(temp));
		}
		System.arraycopy(temp, first, sortArr, first, (last-first) + 1);
	}
	
}
