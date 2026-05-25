package model;

import java.util.Date;

public class Website {

    private String url;
    private Date lastUpdateDate;

    public Website(String url) {
        this.url = url;
        this.lastUpdateDate = new Date();
    }

    public String getURL() {
        return url;
    }
}
