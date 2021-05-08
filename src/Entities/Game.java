package Entities;

public class Game {
	
	private int id, year;
	private String name, platform, developer;
	private double price;
	
	
	public Game() {
		
	}

	public Game(int id, int year, String name, String platform, String developer, double price) {
		this.id = id;
		this.year = year;
		this.name = name;
		this.platform = platform;
		this.developer = developer;
		this.price = price;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
