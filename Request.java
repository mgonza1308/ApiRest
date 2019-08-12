import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Request {
	public void getRequest() {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
			try {
				HttpURLConnection conection = (HttpURLConnection) url.openConnection();
				conection.setRequestMethod("GET");
				BufferedReader br = new BufferedReader(new InputStreamReader(conection.getInputStream()));
				String linea;
				while((linea = br.readLine()) != null) {
					sb.append(linea).append("\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sb);
	}
}
