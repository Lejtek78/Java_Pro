package java_io.utility.compressing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipExample {

	static String FILE_TO_COMPRESS = "./src/main/java/java_io/video.mov";
	static String FILE_TO_WRITE = "./src/main/java/java_io/video.gz";
	static String FILE_TO_DECOMPRESS = "./src/main/java/java_io/video2.mov";
	
	public static void main(String[] args) throws IOException {
		System.out.println("Original Size: " + Files.size(Paths.get(FILE_TO_COMPRESS)));
		
		compress();
		decompress();
	}

	static void compress() {
		
		int size;
		byte[] buffer = new byte[1024];
		
		try {
			FileInputStream fis = new FileInputStream(FILE_TO_COMPRESS);
			FileOutputStream fos = new FileOutputStream(FILE_TO_WRITE);
			GZIPOutputStream gzipOs = new GZIPOutputStream(fos);
			
			while((size = fis.read(buffer)) != -1) {
				gzipOs.write(buffer, 0, size);
			}
			
			gzipOs.finish();
			gzipOs.close();
			fos.close();
			fis.close();
			
			System.out.println("File is compressed to the size: " + Files.size(Paths.get(FILE_TO_WRITE)));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void decompress() {
		
		int size;
		byte[] buffer = new byte[1024];
		
		try {
			FileInputStream fis = new FileInputStream(FILE_TO_WRITE);
			FileOutputStream fos = new FileOutputStream(FILE_TO_DECOMPRESS);
			GZIPInputStream gzipIs = new GZIPInputStream(fis);
			
			while ((size = gzipIs.read(buffer)) != -1) {
				fos.write(buffer, 0, size);
			}
			
			gzipIs.close();
			fos.close();
			fis.close();
			
			System.out.println("File is decompressed with size: " + Files.size(Paths.get(FILE_TO_DECOMPRESS)));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
