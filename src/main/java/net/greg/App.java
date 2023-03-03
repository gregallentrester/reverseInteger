package net.greg;

/**
 * count occurence of each letter
 * frequencyMap
 */

public class App {

	public static void main(String ... any) {

		App app= new App();

		System.err.println(
			"\ninPlaceReverseInteger " +
			app.inPlaceReverseInteger(54321));
	}


public int inPlaceReverseInteger(int value) {

    int answer = 0;

    while (value != 0) {

			System.err.println("\n answer " + answer);
			System.err.println(" value " + value);
			System.err.println(" value % 10 " + value % 10);

      answer = answer * 10 + value % 10;

			System.err.println(" answer " + answer);
			System.err.println(" value " + value);

      value = value / 10;
    }

    return answer;
	}
}
