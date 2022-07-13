package controller;

public class Rotator {
	private String[] images = {
			"https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Books-aj.svg_aj_ashton_01f.svg/2310px-Books-aj.svg_aj_ashton_01f.svg.png",
			"https://data.europa.eu/sites/default/files/news/2020-08-06-edp_book_club.png",
			"https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Open_book_nae_02.svg/1280px-Open_book_nae_02.svg.png"
	};
	
	private String[] links = {
		"https://github.com/",
		"https://www.google.it/",
		"https://www.develhope.co/"
	};
	
	private int selectedIndex = 0;
	
	public String getImage() {
		return images[selectedIndex];
	}
	
	public String getLink() {
		return links[selectedIndex];
	}
	
	public void nextAd() {
		selectedIndex = (selectedIndex + 1) % images.length;
	}
}
