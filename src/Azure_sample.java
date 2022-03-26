package src;

import java.io.IOException;

public class Azure_sample {
	public static void main(String[] args) throws IOException {
		System.out.println("Azure Blob Storage v12 - Java sample\nProject: LucaNet_HTW_WiSe21_22");

		//set connection string
		String connectStr = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

		//set container name
		String containerName = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
		
		//set name for blob
		String blobname = "mockdata";
		
		// Set variables for the file
		String fileName = "MOCK_DATA.csv";
		String localPath = "./data/";
				
		// Append the string "DOWNLOAD" before the .csv extension so that you can see both files.
		String downloadFileName = fileName.replace(".csv", "-DOWNLOAD.csv");

		//Creates the full download path
		String downloadPath = localPath + downloadFileName;
		
		//create object
		Azure_sample_helper helper = new Azure_sample_helper();
		
		//launch sample
		helper.samplemethods(connectStr, blobname, fileName, localPath, downloadPath, containerName);
		
	}
}