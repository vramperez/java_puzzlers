package examples;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class UrlSet {

	private static final String[] URL_NAMES = {
			"http://www.etsiinf.upm.es/",
			"https://population.io/", 
			"http://www.fi.upm.es/",
			"http://www.catsthatlooklikehitler.com/",
			"https://apolloinrealtime.org/"};

	public static void main(String[] args) throws MalformedURLException {

		Set<URL> favorites = new HashSet<URL>();
		
		for (String urlName : URL_NAMES) {
			favorites.add(new URL(urlName));
		}
		
		System.out.println(favorites.size());
	}
}