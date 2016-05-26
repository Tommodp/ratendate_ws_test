package za.co.ratendate.geodb;

import java.io.IOException;

import com.maxmind.geoip.LookupService;

public class GeoDB {
	private static GeoDB instance = new GeoDB();
	private LookupService lookupService;
	
	private GeoDB(){
		String fileName = getClass().getResource("/GeoIP.dat").toExternalForm().substring(6);
		try {
			this.lookupService = new LookupService(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static GeoDB getInstance() {
		return instance;
	}
	
	public LookupService getLookupService() {
		return this.lookupService;
	}
}
