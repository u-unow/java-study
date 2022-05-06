package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String comopser;
	private int year;
	private int track;
	
	public Song(String title, String artist, String album, String comopser, int year, int track) {
		System.out.println("some code;;;");
		this.title = title;
		this.artist = artist;
		this.album  = album;
		this.comopser = comopser;
		this.year = year;
		this.track = track;
	}
	public Song(String title, String artist) {
//		this.title = title;
//		this.artist = artist;
		this(title, artist, null, null, 0, 0);
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComopser() {
		return comopser;
	}
	public void setComopser(String comopser) {
		this.comopser = comopser;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void Show() {
		System.out.println(artist+" "+title+" ( "+album+", "+year+", "+track+"번 track, "+comopser+" 작곡 )");
	}
}
