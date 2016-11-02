package org.kirito.process;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
	public static void main(String args[]) {
		try {
			List<String> list = new ArrayList<String>();
			ProcessBuilder pb = null;
			Process p = null;
			// list the files and directorys under C:\
			list.add("CMD.EXE");
			list.add("/C");
			list.add("dir1");
			pb = new ProcessBuilder(list);
			pb.directory(new File("C:\\"));
			p = pb.start();

			// process error and output message
			StreamWatch errorWatch = new StreamWatch(p.getErrorStream(), "ERROR");
			StreamWatch outputWatch = new StreamWatch(p.getInputStream(), "OUTPUT");
			// start to watch
			errorWatch.start();
			outputWatch.start();
			// wait for exit
			int exitVal = p.waitFor();
			// print the content from ERROR and OUTPUT
			System.out.println("ERROR: " + errorWatch.getOutput());
			System.out.println("OUTPUT: " + outputWatch.getOutput());
			System.out.println("the return code is " + exitVal);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}