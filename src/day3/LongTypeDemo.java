/*long is a signed 64-bit type and is useful for those occasions where an int type is not large
enough to hold the desired value.*/
package day3;

public class LongTypeDemo {

	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		// approximate speed of light in miles per second
		lightspeed = 186000;
		days = 1000; // specify number of days here
		seconds = days * 24 * 60 * 60; // convert to seconds
		distance = lightspeed * seconds; // compute distance
		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");

	}

}
