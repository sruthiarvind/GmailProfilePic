package com.picUploading;

import java.io.File;

public class CleanDirectory {

	private static final String SRC_FOLDER = System.getProperty("user.dir") + "/screenShot";
	File directory;

	public CleanDirectory() {
		directory = new File(SRC_FOLDER);
		if (!directory.exists())
			createDirectory();
		else {
			cleanDirectory(directory);
		}
	}

	public void createDirectory() {
		System.out.println("creating dir");

		File dir = new File(SRC_FOLDER);
		dir.mkdir();
	}

	public void cleanDirectory(File directory) {
		System.out.println("Cleaning dir");
		if (directory.isDirectory()) {
			File[] files = directory.listFiles();
			if (files != null && files.length > 0) {
				for (File aFile : files) {
					removeDirectory(aFile);
				}
			}
		}
	}

	private void removeDirectory(File directory) {
		if (directory.isDirectory()) {
			File[] files = directory.listFiles();
			if (files != null && files.length > 0) {
				for (File aFile : files) {
					removeDirectory(aFile);
				}
			}
			directory.delete();
		} else {
			directory.delete();
		}
	}
}