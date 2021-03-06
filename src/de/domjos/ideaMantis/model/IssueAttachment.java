package de.domjos.ideaMantis.model;

public class IssueAttachment {
    private int id;
    private String filename;
    private int size;
    private String download_url;

    public IssueAttachment() {
        this.setId(0);
        this.filename = "";
        this.size = 0;
        this.download_url = "";
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
