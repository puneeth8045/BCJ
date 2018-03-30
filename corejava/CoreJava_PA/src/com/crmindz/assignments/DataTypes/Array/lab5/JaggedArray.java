package com.crmindz.assignments.DataTypes.Array.lab5;

/**
 * @author Puneeth This class will initialize a 2D array and prints the
 *         tutorials details of the students.
 */
public class JaggedArray {

	/**
	 * @param name
	 * This method will initialize a 2D array and
	 * prints the tutorials data of the student given as a parameter.
	 */
	public static void array2D(String name) {

		String[][] tutorialArray = { { "Student Name", "Tutorial1", "Tutorial 2", "Tutorial 3" },
				{ "Tony", "JAVA", "C", "C++" }, { "Thomas", "JAVA", "UNIX" }, { "Dinil", "Linux", "Oracle" },
				{ "Delvin", "RDBMS", "C#", "ORACLE" } };

		for (int i = 0; i < tutorialArray.length; i++) {
			for (int j = 0; j < tutorialArray[i].length; j++) {
				if (i == 0)
					System.out.print(tutorialArray[i][j] + "\t");
			}
		}

		System.out.println();

		for (int i = 0; i < tutorialArray.length; i++) {
			for (int j = 0; j < tutorialArray[i].length; j++) {
				if (tutorialArray[i][0].equals(name)) {
					System.out.print(tutorialArray[i][j] + " \t\t");
				}
			}
		}

	}

	public static void main(String[] args) {

		array2D("Delvin");
	}
}
