import java.util.ArrayList;
import java.util.Random;

/*
 * Alex Pavel Matrix Project
 */


public class Matrix {

	ArrayList<ArrayList<Double>> myMatrix;
	ArrayList<ArrayList<Double>> myResultMatrix;
	boolean checkPass;
	int myMatrixRow;
	int myMatrixColumn;
	public static final String ADD = "+"; 
	public static final String MULTIPLY = "*";
	Op status;

	public enum Op {ADD,MULTIPLY};

	public Matrix(int row, int column, int min, int max) {
		initMyMatrix(row, column, min, max);
		checkPass = false;
	}

	public void multMatrix(Matrix change) {
		status = Op.MULTIPLY;
		if (canMultiply(change)) {
			myResultMatrix = new ArrayList<ArrayList<Double>>();
			for (int i = 0; i < myMatrixRow; i++) {
				myResultMatrix.add(new ArrayList<Double>());
			}
			double results = 0;
			for (int r = 0; r < myMatrixRow; r++) {
				for (int col = 0; col < change.getArray().get(0).size(); col++){
					for (int g = 0; g < myMatrixColumn; g++) {
						results += myMatrix.get(r).get(g) * change.getArray().get(g).get(col);
					}
					myResultMatrix.get(r).add(results);
					results = 0;
				}
			}
		}
		else{
			System.out.println("The product does not exist!");
		}
	}

	public void divMatrix() {

	}

	public boolean canMultiply(Matrix change) {
		int changeRow = change.getArray().size();
		if (changeRow == myMatrixColumn) {
			checkPass = true;
			return true;
		}
		else{
			checkPass = false;
			return false;
		}

	}

	public void invMatrix() {

	}
	public void addMatrix(Matrix change) {
		status = Op.ADD;
		myResultMatrix = new ArrayList<ArrayList<Double>>();
		for (int i = 0; i < myMatrixRow; i++) {
			myResultMatrix.add(new ArrayList<Double>());
		}
		int changeRow = change.getArray().size();
		int changeCol = change.getArray().get(0).size();
		if (changeCol == myMatrixColumn && changeRow == myMatrixRow) {
			checkPass = true;
			for (int i = 0; i < myMatrixRow; i++) {
				for (int h = 0; h < myMatrixColumn; h++) {
					myResultMatrix.get(i).add(myMatrix.get(i).get(h) + change.getArray().get(i).get(h));
				}
			}
		}
		else{
			checkPass = false;
		}

	}

	public void resetMyMatrix() {
		myMatrix = new ArrayList<>();
		for (int i = 0; i < myMatrixRow; i++) {
			myMatrix.add(new ArrayList<Double>());
			for (int h = 0; h < myMatrixColumn; h++) {
				myMatrix.get(i).add(h, (double) 0);
			}
		}
		System.out.println("\n\nReset myMatrix to ");
		for (int i = 0; i < myMatrixRow; i++) {
			System.out.print(myMatrix.get(i).toString());
			System.out.println();
		}
		System.out.println();
	}

	public ArrayList<ArrayList<Double>> getArray() {
		return myMatrix;
	}

	public void initMyMatrix(int row, int column, int min, int max) {
		myMatrixRow = row;
		myMatrixColumn = column;
		myResultMatrix = new ArrayList<>();
		myMatrix = new ArrayList<>();
		for (int i = 0; i < myMatrixRow; i++) {
			myMatrix.add(new ArrayList<Double>());
			for (int h = 0; h < myMatrixColumn; h++) {
				myMatrix.get(i).add(h, (double) new Random().nextInt(max - min) + min);
			}
		}
		//		for (int i = 0; i < myMatrixRow; i++) {
		//			System.out.println();
		//			System.out.print(myMatrix.get(i).toString());
		//		}
	}

	public void printResultDetail(Matrix change) {
		int size = myMatrixRow;
		if (myMatrixColumn > size) {
			size = myMatrixColumn;
		}
		for (int i = 0; i < size; i++) {
			//			System.out.println(myMatrix.size());
			//			System.out.println(size);
			System.out.println();
			if (myMatrix.size() > i) {
				System.out.print(myMatrix.get(i).toString() + " ");
			}
			else {
				double spaces = myMatrix.get(0).toString().length() + 1;
				for (int h = 0; h < spaces; h++) {
					System.out.print(" ");
				}
			}
			if (i == 0) {
				switch (status) {
				case ADD:
					System.out.print("+ ");
					break;
				case MULTIPLY:
					System.out.print("* ");
					break;
				}
			}
			else {
				System.out.print("  ");
			}
			if (change.getArray().size() > i) {
				System.out.print(change.getArray().get(i).toString() + " ");
			}
			else {
				double spaces = change.getArray().get(0).toString().length() + 1;
				for (int h = 0; h < spaces; h++) {
					System.out.print(" ");
				}
			}
			if (i == 0) {
				System.out.print("= ");
			}
			else {
				System.out.print("  ");
			}

			if (checkPass) {
				if (myResultMatrix.size() > i) {
					System.out.print(myResultMatrix.get(i).toString() + " ");
				}
			}
			else if (i == 0) {
				System.out.print("[INVALID]");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//		Make Matrix Object
		Matrix m1 = new Matrix(2, 8, 1, 9);
		Matrix m2 = new Matrix(8, 3, 1, 9);
		//		Output Matrix 1
		System.out.print("Matrix 1 is:");
		for (int i = 0; i < m1.getArray().size(); i++) {
			System.out.println();
			System.out.print(m1.getArray().get(i).toString());
		}
		System.out.println("\n");
		//		Output Matrix 2
		System.out.print("Matrix 2 is: ");
		for (int i = 0; i < m2.getArray().size(); i++) {
			System.out.println();
			System.out.print(m2.getArray().get(i).toString());
		}
		System.out.println("\n");
		//		Add Matrices
		m1.addMatrix(m2);
		m1.printResultDetail(m2);
		//		Multiply Matrices
		m1.multMatrix(m2);
		m1.printResultDetail(m2);
	}

}
