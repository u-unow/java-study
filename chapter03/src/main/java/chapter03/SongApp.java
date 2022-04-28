package chapter03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Song song = new Song();
//		song.setTitle("GoodDay");
//		song.setArtist("IU");
//		song.setAlbum("Real");
//		song.setComopser("이민수");
//		song.setYear(2010);
//		song.setTrack(3);
//		song.Show();	
		
		Song song1 = new Song("좋은날", "IU", "이민수", "REAL", 2010,3);
	
		song1.Show();
		
		Song song2 = new Song("BIGBANG", "LIE");
		song2.Show();
	}

}
