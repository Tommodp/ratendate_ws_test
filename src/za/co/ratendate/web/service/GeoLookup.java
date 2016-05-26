package za.co.ratendate.web.service;

import com.maxmind.geoip.Country;
import com.maxmind.geoip.LookupService;

import za.co.ratendate.geodb.GeoDB;

public class GeoLookup {

	private LookupService lookupService = GeoDB.getInstance().getLookupService();

	public String getCountry(String ip) {
		Country country = lookupService.getCountry(ip);
		return country.getName();
	}

	public String getCountryCode(String ip) {
		Country country = lookupService.getCountry(ip);
		return country.getCode();
	}
}
