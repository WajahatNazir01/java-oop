public class Artwork{
	private String artworkTitle;
	private int yearOfCreation;
	private Artist artist;
	
	//getters
	public String getArtworkTitle(){
	return artworkTitle;
	}
	public int getYearOfCreation(){
	return yearOfCreation;
	}
	public Artist getArtist(){
	return artist;
	}
	//setters
	public void setArtworkTitle(String artworkTitle){
	this.artworkTitle=artworkTitle;
	}
	public void setYearOfCreation(String yearOfCreation){
	this.yearOfCreation=yearOfCreation;
	}
	
	//constructor no 1
	Artwork(String artworkTitle, int yearOfCreation, Artist artist){
	this.artworkTitle=artworkTitle;
	this.yearOfCreation=yearOfCreation;
	this.artist=artist;
	}	

	//constructor no 2
	Artwork(String artworkTitle, int yearOfCreation){
	this.artworkTitle=artworkTitle;
	this.yearOfCreation=yearOfCreation;
	}

	
	//for crearting a new artwork object that shares same artist object as orignal
	Artwork(Artwork artwork){
	this.artworkTitle=artwork.getArtworkTitle();
	this.yearOfCreation=artwork.getYearOfCreation();
	//creating shallow copy
	this.artist=artwork.getArtist();
	}

	//for creating artwork having independent copy of artist object
	Artwork(Artwork artwork){
	this.artworkTitle=artwork.getArtworkTitle();
	this.yearOfCreation=artwork.getYearOfCreation();
	//creating deep copy
	this.artist=new Artist(artwork.getArtist());
	}



	Artwork artwork1=new Artwork();



	//method to display information
	public void displayArtwork(){
	artist.display();
	System.out.println("Title of Artwork :"+artworkTitle);
	System.out.println("Year of Creation :"+yearOfCreation);

	}
	


}