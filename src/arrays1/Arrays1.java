/**
 * 
 */
package arrays1;

/**
 * @author jburg
 *
 */
public class Arrays1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("cambio");
		int m = 5;

		int[] a = new int[m];

		System.out.println("|" + a[0] + "|" + a[1] + "|" + a[2] + "|" + a[3] + "|" + a[4] + "|");

		a[1] = 2;

		System.out.println("|" + a[0] + "|" + a[1] + "|" + a[2] + "|" + a[3] + "|" + a[4] + "|");

		a[2] = a[1];

		System.out.println("|" + a[0] + "|" + a[1] + "|" + a[2] + "|" + a[3] + "|" + a[4] + "|");

		a[0] = a[1] + a[2] + 2;

		System.out.println("|" + a[0] + "|" + a[1] + "|" + a[2] + "|" + a[3] + "|" + a[4] + "|");

		a[0]++;

		System.out.println("|" + a[0] + "|" + a[1] + "|" + a[2] + "|" + a[3] + "|" + a[4] + "|");

		a[3] = m + 10;

		System.out.println("|" + a[0] + "|" + a[1] + "|" + a[2] + "|" + a[3] + "|" + a[4] + "|");

	}

}
