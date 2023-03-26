package Polymorphism;

public class CompactDisk extends NewProduct{

    private String albumTitle;
    private String artist;

    public CompactDisk(int productID, String description, String maker, int price, String albumTitle, String artist) {
        super(productID, description, maker, price);
        this.albumTitle = albumTitle;
        this.artist = artist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void showInfo() {
        super.showInfo(); // to call the parent call method
        System.out.println("Album title >>  "+ this.getAlbumTitle());
        System.out.println("Artist >> " + this.getArtist());
    }
}
