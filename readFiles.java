import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class readFiles {
	public void leer() {
		StringBuilder sb = new StringBuilder();
		Path filepath = Paths.get("C:\\Temp\\lista.txt");
		try {
			BufferedReader br = Files.newBufferedReader(filepath);
			String linea;
			while((linea = br.readLine()) != null) {
				sb.append(linea).append("\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			System.out.println(sb);	
	}

}
