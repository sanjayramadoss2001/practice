import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class crtfil {
	public static void main(String[] args) throws IOException {
		File fil = new File("sunnobc.txt");
		fil.createNewFile();
		try {
			FileWriter wr = new FileWriter(fil);
			wr.write("hey fuck you");
			wr.close();
		}catch (Exception e) {
			
		}
	}
}
