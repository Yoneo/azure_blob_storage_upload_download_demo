package src;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

public class Azure_sample_helper {

	public void samplemethods(String connectStr, String filename, String fileName, String localPath,
			String downloadPath, String containerName) {

		// Create a BlobServiceClient object
		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();

		//Initializes the reference to the container
		BlobContainerClient blobContainer = blobServiceClient
				.getBlobContainerClient(containerName);

		//creates the blobClient
		BlobClient blobClient = blobContainer.getBlobClient(filename);

		System.out.println("\nUploading to Blob storage as blob:\n\t" + blobClient.getBlobUrl());

		// Upload the blob, overwrites existing blob
		blobClient.uploadFromFile("./data/MOCK_DATA.csv", true);

		// Download the blob to a local file
		System.out.println("\nDownloading blob to\n\t " + downloadPath);
		
		// Download File
		blobClient.downloadToFile(downloadPath);

		System.out.println("Download done");

	}

}