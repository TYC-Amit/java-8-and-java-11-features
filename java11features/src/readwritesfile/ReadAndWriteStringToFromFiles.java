package readwritesfile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReadAndWriteStringToFromFiles {

	public static void main(String[] args) {
		
		var path="C:\\Users\\manda\\OneDrive\\Desktop\\datatechno.txt";
		
		try {
			
			Files.writeString(Path.of(path),"Testing read write string methods  ", StandardOpenOption.APPEND);
			
			String data = Files.readString(Path.of(path));
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
