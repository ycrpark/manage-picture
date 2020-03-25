package src.main.model;

import src.main.util.Utils;

public class Result {
	private int readDirectoryCount;
	
	private int readPhotoCount;
	private int collectPhotoCount;
	private int completedPhotoCount;
	
	private String errorMessage;
	private String rootDirectory;
	
	public int getReadDirectoryCount() {
		return readDirectoryCount;
	}
	
	public void setReadDirectoryCount(int readDirectoryCount) {
		this.readDirectoryCount = readDirectoryCount;
	}
	
	public int getCollectPhotoCount() {
		return collectPhotoCount;
	}
	
	public void setCollectPhotoCount(int collectPhotoCount) {
		this.collectPhotoCount = collectPhotoCount;
	}
	
	public int getCompletedPhotoCount() {
		return completedPhotoCount;
	}
	
	public void setCompletedPhotoCount(int completedPhotoCount) {
		this.completedPhotoCount = completedPhotoCount;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getRootDirectory() {
		return rootDirectory;
	}
	
	public void setRootDirectory(String rootDirectory) {
		this.rootDirectory = rootDirectory;
	}
	
	public int getReadPhotoCount() {
		return readPhotoCount;
	}
	
	public void setReadPhotoCount(int readPhotoCount) {
		this.readPhotoCount = readPhotoCount;
	}
	
	public void addReadDirectoryCount() {
		readDirectoryCount++;
	}
	
	public void addReadPhotoCount() {
		readPhotoCount++;
	}
	
	public void addCollectPhotoCount() {
		collectPhotoCount++;
	}
	
	public void addCompletedPhotoCount() {
		completedPhotoCount++;
	}
	
	public String getLog(String prepend, String append) {
		StringBuilder sb = new StringBuilder();
		if(prepend != null) {
			sb.append(prepend);
			sb.append(" ");
		}
		
		sb.append("readDir: ");
		sb.append(Utils.lPad(String.valueOf(readDirectoryCount), 2, " "));
		sb.append(" / readPhoto: ");
		sb.append(Utils.lPad(String.valueOf(readPhotoCount), 4, " "));
		sb.append(" / collectPhoto: ");
		sb.append(Utils.lPad(String.valueOf(collectPhotoCount), 4, " "));
		sb.append(" / renamePhoto: ");
		sb.append(Utils.lPad(String.valueOf(completedPhotoCount), 4, " "));
		
		if(append != null) {
			sb.append(" ");
			sb.append(append);
		}
		
		return sb.toString();
	}
}