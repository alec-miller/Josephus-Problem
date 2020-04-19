/**
 * 
 */

/**
 * @author Alec Miller, 4-18-2020
 * Description: In the Josephus Problem, there are n men standing in a circle going to be captured.
 * The men decide they would rather die than be captured so, they go around in a circle killing off
 * one another. It starts with the first man killing the person to his left then the next living man
 * in the rotation does the same. This happens until there is one man left who then has to kill himself.
 * The problem here is Josephus doesn't want to die, he'd rather be captured but he doesn't want the
 * other men to know so they don't turn on him so, Josephus has to figure out where in the circle to be 
 * so that he is the last one alive and can then be captured. This program takes in a given amount of men 
 * in the circle and returns the position Josephus should remain in order to survive.
 *
 */
public class Josephus_Problem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("If there are " + args[0] + " soldiers, Josephus should be in position number " + getPosition(Integer.parseInt(args[0]))
		+ " to survive");
	}

	/**
	 * Purpose: This method is where the magic happens, one of the solutions to the Josephus problem
	 * is to get the binary of the n number of men then move the first digit of the binary sequence to
	 * the end, then there is the answer.
	 * 
	 * An example of this is: 5 men, the binary is 101, Josephus should be in position number 3 to survive
	 * and the number 3 has a binary squence of 011. 101 -> 011.
	 * 
	 * @param num this is the amount of men in the given circle
	 * @return the position Josephus should be in order to survive.
	 */
	private static int getPosition(int num) {
		String binary = Integer.toBinaryString(num);
		binary = binary.substring(1).concat(binary.substring(0, 1));
		return Integer.parseInt(binary, 2);
	}

}
