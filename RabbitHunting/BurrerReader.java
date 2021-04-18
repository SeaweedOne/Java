import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BurrerReader {
	public static void main(String[] args) {
		Path file = Paths.get("src/input.txt");
		try {
			BufferedReader read = Files.newBufferedReader(file);
			String line = read.readLine();
			while(line !=null) {
				System.out.println(line);
				line = read.readLine();
			}
			read.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot read the file");
		}
	}

}
