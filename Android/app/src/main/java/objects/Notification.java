package objects;

import java.io.Serializable;

public class Notification implements Serializable {

    private int mId;
    private String mType;
    private String mText;
    private boolean mIsRead;
    private User mCreatedBy;

    /**
     * Object to store notification
     *
     * @param mId - notification id
     * @param mType - notification tyoe
     * @param mText - notification text
     * @param mIsRead - if notfication is read
     * @param mCreatedBy - user who created this notification
     */
    public Notification(int mId, String mType, String mText, boolean mIsRead, User mCreatedBy) {
        this.mId = mId;
        this.mType = mType;
        this.mText = mText;
        this.mIsRead = mIsRead;
        this.mCreatedBy = mCreatedBy;
    }

    public User getCreatedBy() {
        return mCreatedBy;
    }

    public void setCreatedBy(User createdBy) {
        this.mCreatedBy = createdBy;
    }

    public boolean isRead() {
        return mIsRead;
    }

    public void setRead(boolean mIsRead) {
        this.mIsRead = mIsRead;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public String getType() {
        return mType;
    }

    public void setType(String mType) {
        this.mType = mType;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }
}
