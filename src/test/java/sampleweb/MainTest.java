package sampleweb;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class MainTest {

	@Test
	public void checkImageURL()
	{
		Main main=new Main();
		String imageURL=main.getImageURL();		
		URL u;
		try {
			u = new URL(imageURL);
			HttpURLConnection huc =  (HttpURLConnection)  u.openConnection(); 
			huc.setRequestMethod("HEAD");
			System.out.println(huc.getResponseCode());
			assertTrue(huc.getResponseCode() == HttpURLConnection.HTTP_OK);			
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		} 
	    
	}

}
