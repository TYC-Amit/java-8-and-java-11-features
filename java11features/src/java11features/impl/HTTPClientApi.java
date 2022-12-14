package java11features.impl;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HTTPClientApi {

	public static void main(String[] args) {
		
		String uri="https://postman-echo.com/get?username=java11&password=123akm";
		
		HttpRequest req=HttpRequest.newBuilder()
				                    .uri(URI.create(uri))
				                    .GET().version(Version.HTTP_2)
				                    .build();
		
		HttpClient client=HttpClient.newBuilder()
				                    .build();
		
		try {
			HttpResponse<String> resp= client.send(req, BodyHandlers.ofString());
			System.out.println(resp.statusCode());
			System.out.println(resp.body());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
