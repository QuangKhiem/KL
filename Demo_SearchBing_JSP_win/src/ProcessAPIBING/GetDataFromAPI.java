package ProcessAPIBING;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetDataFromAPI {
	public static String DataFromAPI(String searchText, String accountKeyEnc) {
		searchText = searchText.replaceAll(" ", "%20");
		String getdata = "";
		URL url;
		try {
			url = new URL("https://api.datamarket.azure.com/Data.ashx/Bing/Search/v1/Web?Query=%27" + searchText
					+ "%27&$top=3&$format=json");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Authorization", "Basic " + accountKeyEnc);

			conn.setRequestProperty("Accept", "application/json");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			StringBuilder sb = new StringBuilder();
			String output;
			while ((output = br.readLine()) != null) {
				sb.append(output);
			}
			conn.disconnect();
			getdata = (String) sb.toString();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return getdata;
	}

}
