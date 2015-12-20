package entities;

import org.joda.time.DateTime;

/**
 * Created by zid on 20/12/15.
 */
public class Reddit {
    //Private data members
    private String title;
    private String thumbnail;
    private DateTime created;

    //Constructur

    public Reddit(String title, String thumbnail, DateTime created) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public DateTime getDateTime() {
        return created;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setDateTime(String dateTime) {
        created = created;
    }
}
