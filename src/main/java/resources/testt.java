package resources;

import java.io.IOException;
import java.util.Properties;

public class testt extends Basicbrw {

	public static void main(String[] args) throws IOException {

		System.out.println("Hello Started");

		Properties vv = fileproperty();

		String browser = vv.getProperty("Browser");

		if ((browser.equalsIgnoreCase("Chrome"))) {

			System.out.println("Hey Program is started");

		};

	}

}
