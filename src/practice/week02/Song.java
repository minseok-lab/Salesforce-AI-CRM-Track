package practice.week02;

public class Song {
    private String title;
    private String artist;
    private String album;
    private String composer;
    private int year;
    private String track;

    public Song(String title, String artist, String album, int year, String composer, String track) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.composer = composer;
        this.track = track;
    }

    public Song() {
    }

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void showInfo() {
        // 아이유, 좋은날 ( Real, 2010, 3번 트랙, 이민수 작곡)
        System.out.println(
            this.artist + ", " +
            this.title + " (" +
            this.album + ", " +
            this.year + ", " +
            this.track + "번 트랙, " +
            this.composer + " 작곡)"
        );
    }

}
