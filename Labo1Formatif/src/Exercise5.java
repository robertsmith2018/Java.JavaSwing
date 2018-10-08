package ca.qc.cgodin;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		final float A = 90;
		final float B = 75;
		final float C = 69;
		final float D = 50;

		double note;
		boolean reussi = true;
		String mention;

		Scanner sc = new Scanner(System.in);
		System.out.print("SVP, entrer la note obtenu : ");
		note = sc.nextDouble();

		if (note < D) {
			mention = "E";
			reussi = false;

		} else if (note < C) {
			mention = "D";
			reussi = false;

		} else if (note < B) {

			mention = "C";
		} else if (note < A) {

			mention = "B";
		}

		else {
			mention = "A";
		}

		System.out.println("Votre note est de: " + note + " avec la mention: " + mention + "\n" + "Réussi:" + reussi);

	}

}
