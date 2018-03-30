package com.crmindz.assignments.ExceptionHandling.lab1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Puneeth This class copies the content of a file to a new file and
 *         eliminates the empty lines and single line comments.
 */
public class TransformAndCopy {
	public void transformAndCopyFile(String fileName, String directoryName) throws IOException {

		try {

			FileReader fileRead = new FileReader(fileName);
			PrintWriter fileWriter = new PrintWriter(directoryName, "UTF-8");

			String line;

			BufferedReader bufferedReader = new BufferedReader(fileRead);

			while ((line = bufferedReader.readLine()) != null) {
				if (line.trim().isEmpty() || line.matches(".*//.*")) {

				} else {
					fileWriter.println(line);
				}

			}

			fileRead.close();
			fileWriter.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String fileName = "C:\\BootcampMay17\\Develop\\workspace\\corejava\\CoreJava_SYarram\\src\\com\\crmindz\\bcjmay2017\\exceptions\\lab1\\demo.txt";
		String directoryName = "C:\\BootcampMay17\\Develop\\workspace\\corejava\\CoreJava_SYarram\\src\\com\\crmindz\\bcjmay2017\\exceptions\\lab1\\file.txt";

		TransformAndCopy tc = new TransformAndCopy();

		try {
			tc.transformAndCopyFile(fileName, directoryName);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
