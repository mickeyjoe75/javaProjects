public class Magic {
	public static void main(String[] args) {
		//this little program will pring the numbe 3 irrespective of the number input by the user!

		int myNumber;
		myNumber  = 100;
		//myNumber will be referred to as original number in the code snippet from now on
		int stepOne;
		stepOne = myNumber * myNumber;

		int stepTwo;
		stepTwo = stepOne + myNumber;

		int stepThree;
		stepThree = stepTwo/myNumber;

		int stepFour;
		stepFour = stepThree + 17;

		int stepFive;
		stepFive = stepFour - myNumber;

		int stepSix;
		stepSix = stepFive/6;

		System.out.println(stepSix);
	}
}
