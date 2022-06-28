package mavenjdbc;

public class City {

	int id;
	String cityName;
	String countryCode;
	String district;
	long population;
	
	public City() {}

	public City(int iD, String cityName, String countryCode, String district, long population) {
		super();
		this.id = iD;
		this.cityName = cityName;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	
	
	
}


