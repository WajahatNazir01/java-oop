public class Main{
	
	public static void main(String args[]){
   	Artist a1=new Artist();
	Artwork aw1=new Artwork("natural photography",2018);
		System.out.println("Before modifications");
		aw1.displayArtwork();
	aw1.setArtworkTitle("cinematics");
	aw1.setYearOfCreation(2017);
		System.out.println("After modifications");
		aw1.displayArtwork();
	Artwork aw2=new Artwork();



	}

}