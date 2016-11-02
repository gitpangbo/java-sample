package org.kirito.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<String>();
			ProcessBuilder pb = null;
			Process p = null;
			String line = null;
			BufferedReader stdout = null;
			// list the files and directorys under C:\
			list.add("CMD.EXE");
			list.add("/C");
			list.add("dir1");
			pb = new ProcessBuilder(list);
			pb.directory(new File("C:\\"));
			// merge the error output with the standard output
			pb.redirectErrorStream(true);
			p = pb.start();
			// read the standard output
			stdout = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = stdout.readLine()) != null) {
				System.out.println(line);
			}
			int ret = p.waitFor();
			System.out.println("the return code is " + ret);
			stdout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}