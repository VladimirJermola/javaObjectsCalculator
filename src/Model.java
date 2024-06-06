public class Model {
    private String filename;

    public Model() {
        filename = ""; //Mudeli loomisel on failinimi tühi/puudu
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

}
