package ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NetworkUtil {
	public String get(String address) {
		StringBuffer result = new StringBuffer();
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();

			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader reader = new BufferedReader(isr);

			String separator = "";

			while (true) {
				String data = reader.readLine();
				if (data == null) {
					break;
				}
				result.append(separator + data);
				separator = "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}