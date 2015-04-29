import java.util.ArrayList;
import java.util.Random;

public class TestStringUtils {
	
	int randInt;
	int vowelCount;
	char[] strBuild;

	 public void randomStrings(ArrayList<String> arrayList, int nbrOfStrings, int strSize, int vowelCnt) {
		 strBuild = new char[strSize];
		 for (int i = 0; i < nbrOfStrings; i++) {
			 vowelCount = 0;
			 for (int h = 0; h < strSize; h++) {
				 randInt = new Random().nextInt(122-97) + 97;
				 if (vowelCnt <= vowelCount) {
					 while ((char) randInt == ('a') ||  (char) randInt == ('e') || (char) randInt == ('i') || (char) randInt == ('o') || (char) randInt == ('u')) {
						 randInt = new Random().nextInt(122-97) + 97;
					 }
				 }
				 while ((h + 1 == strSize) && (vowelCount == 0)) {
					 randInt = new Random().nextInt(122-97) + 97;
					 if ((char) randInt == ('a') ||  (char) randInt == ('e') || (char) randInt == ('i') || (char) randInt == ('o') || (char) randInt == ('u')) {
						 vowelCount++;
					 }
				 }
				 strBuild[h] = (char) randInt;
				 if ((char) randInt == ('a') ||  (char) randInt == ('e') || (char) randInt == ('i') || (char) randInt == ('o') || (char) randInt == ('u')) {
					 vowelCount++;
				 }
			 }
//			 System.out.println("vowelCount " + vowelCount);
			 arrayList.add(new String(strBuild));
		 }
	 }
	
	public static void main(String[] args) {
		ArrayList<String> randString = new ArrayList<>();
		int strCnt = 10;
		int vowelCnt = 2;
		int strLength = 10;
		int stringsPerLine = 5;
		TestStringUtils utils = new TestStringUtils();
		utils.randomStrings(randString, strCnt, strLength, vowelCnt);
		for (int i = 0; i < randString.size(); i++) {
			if (i % stringsPerLine == 0) {
				System.out.print("\n" + randString.get(i) + " ");
			}
			else {
				System.out.print(randString.get(i) + " ");
			}
		}
	}
}
