package org.kirito.process.program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("/root/log/job.log");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		while (true) {
			try {
				BufferedWriter output = new BufferedWriter(new FileWriter(f));
				output.write(new Date().toString());
				output.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000 * 5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}