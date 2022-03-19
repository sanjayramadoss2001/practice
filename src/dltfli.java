import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class dltfli {
	public static void main(String[] args) throws IOException {
		deleteFile("sunnobc.txt", "C://Users//sanja//eclipse-workspace//practice//");
	}
	
	private static void deleteFile(String FileName,String Path) throws IOException {
		Files.delete(Paths.get(Path+FileName));
		
	}
}
