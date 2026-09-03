package com.yalla.yalla.util.Player;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.compose.animation.OooO0o;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class Audio extends AbsJavaBean implements Parcelable {
    public static final Parcelable.Creator<Audio> CREATOR = new OooO00o();
    private boolean isAlarm;
    private boolean isMusic;
    private boolean isNotification;
    private boolean isPodcast;
    private boolean isRingtone;
    public boolean isSelected;
    private String mAlbum;
    private int mAlbumId;
    private String mAlbumKey;
    private String mArtist;
    private int mArtistId;
    private String mArtistKey;
    private String mComposer;
    private String mDisplayName;
    private int mDuration;
    private int mId;
    private String mMimeType;
    private String mPath;
    private int mSize;
    private String mTitle;
    private String mTitleKey;
    private int mTrack;
    private int mYear;
    private String nameArtist;

    public class OooO00o implements Parcelable.Creator<Audio> {
        @Override // android.os.Parcelable.Creator
        public final Audio createFromParcel(Parcel parcel) {
            return new Audio(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Audio[] newArray(int i) {
            return new Audio[i];
        }
    }

    public Audio(Parcel parcel) {
        this.mDuration = 0;
        this.mSize = 0;
        this.isRingtone = false;
        this.isPodcast = false;
        this.isAlarm = false;
        this.isMusic = false;
        this.isNotification = false;
        this.mTitle = parcel.readString();
        this.mTitleKey = parcel.readString();
        this.mArtist = parcel.readString();
        this.mArtistKey = parcel.readString();
        this.mComposer = parcel.readString();
        this.mAlbum = parcel.readString();
        this.mAlbumKey = parcel.readString();
        this.mDisplayName = parcel.readString();
        this.mMimeType = parcel.readString();
        this.mPath = parcel.readString();
        this.isSelected = parcel.readByte() != 0;
        this.nameArtist = parcel.readString();
        this.mId = parcel.readInt();
        this.mArtistId = parcel.readInt();
        this.mAlbumId = parcel.readInt();
        this.mYear = parcel.readInt();
        this.mTrack = parcel.readInt();
        this.mDuration = parcel.readInt();
        this.mSize = parcel.readInt();
        this.isRingtone = parcel.readByte() != 0;
        this.isPodcast = parcel.readByte() != 0;
        this.isAlarm = parcel.readByte() != 0;
        this.isMusic = parcel.readByte() != 0;
        this.isNotification = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlbum() {
        return this.mAlbum;
    }

    public int getAlbumId() {
        return this.mAlbumId;
    }

    public String getAlbumKey() {
        return this.mAlbumKey;
    }

    public String getArtist() {
        return this.mArtist;
    }

    public int getArtistId() {
        return this.mArtistId;
    }

    public String getArtistKey() {
        return this.mArtistKey;
    }

    public String getComposer() {
        return this.mComposer;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public int getId() {
        return this.mId;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    public String getNameArtist() {
        return this.nameArtist;
    }

    public String getPath() {
        return this.mPath;
    }

    public int getSize() {
        return this.mSize;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getTitleKey() {
        return this.mTitleKey;
    }

    public int getTrack() {
        return this.mTrack;
    }

    public int getYear() {
        return this.mYear;
    }

    public boolean isAlarm() {
        return this.isAlarm;
    }

    public boolean isMusic() {
        return this.isMusic;
    }

    public boolean isNotification() {
        return this.isNotification;
    }

    public boolean isPodcast() {
        return this.isPodcast;
    }

    public boolean isRingtone() {
        return this.isRingtone;
    }

    public void setNameArtist(String str) {
        this.nameArtist = str;
    }

    public void setmArtist(String str) {
        this.mArtist = str;
    }

    public void setmDisplayName(String str) {
        this.mDisplayName = str;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("Audio{mTitle='");
        sb.append(this.mTitle);
        sb.append("', mTitleKey='");
        sb.append(this.mTitleKey);
        sb.append("', mArtist='");
        sb.append(this.mArtist);
        sb.append("', mArtistKey='");
        sb.append(this.mArtistKey);
        sb.append("', mComposer='");
        sb.append(this.mComposer);
        sb.append("', mAlbum='");
        sb.append(this.mAlbum);
        sb.append("', mAlbumKey='");
        sb.append(this.mAlbumKey);
        sb.append("', mDisplayName='");
        sb.append(this.mDisplayName);
        sb.append("', mMimeType='");
        sb.append(this.mMimeType);
        sb.append("', mPath='");
        sb.append(this.mPath);
        sb.append("', mId=");
        sb.append(this.mId);
        sb.append(", mArtistId=");
        sb.append(this.mArtistId);
        sb.append(", mAlbumId=");
        sb.append(this.mAlbumId);
        sb.append(", mYear=");
        sb.append(this.mYear);
        sb.append(", mTrack=");
        sb.append(this.mTrack);
        sb.append(", mDuration=");
        sb.append(this.mDuration);
        sb.append(", mSize=");
        sb.append(this.mSize);
        sb.append(", isRingtone=");
        sb.append(this.isRingtone);
        sb.append(", isPodcast=");
        sb.append(this.isPodcast);
        sb.append(", isAlarm=");
        sb.append(this.isAlarm);
        sb.append(", isMusic=");
        sb.append(this.isMusic);
        sb.append(", isNotification=");
        return OooO0o.OooO00o(sb, this.isNotification, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mTitleKey);
        parcel.writeString(this.mArtist);
        parcel.writeString(this.mArtistKey);
        parcel.writeString(this.mComposer);
        parcel.writeString(this.mAlbum);
        parcel.writeString(this.mAlbumKey);
        parcel.writeString(this.mDisplayName);
        parcel.writeString(this.mMimeType);
        parcel.writeString(this.mPath);
        parcel.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
        parcel.writeString(this.nameArtist);
        parcel.writeInt(this.mId);
        parcel.writeInt(this.mArtistId);
        parcel.writeInt(this.mAlbumId);
        parcel.writeInt(this.mYear);
        parcel.writeInt(this.mTrack);
        parcel.writeInt(this.mDuration);
        parcel.writeInt(this.mSize);
        parcel.writeByte(this.isRingtone ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isPodcast ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAlarm ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMusic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isNotification ? (byte) 1 : (byte) 0);
    }

    public Audio(Bundle bundle) {
        this.mDuration = 0;
        this.mSize = 0;
        this.isRingtone = false;
        this.isPodcast = false;
        this.isAlarm = false;
        this.isMusic = false;
        this.isNotification = false;
        this.mId = bundle.getInt("_id");
        this.mTitle = bundle.getString(ShareConstants.WEB_DIALOG_PARAM_TITLE);
        this.mTitleKey = bundle.getString("title_key");
        this.mArtist = bundle.getString("artist");
        this.mArtistKey = bundle.getString("artist_key");
        this.mComposer = bundle.getString("composer");
        this.mAlbum = bundle.getString("album");
        this.mAlbumKey = bundle.getString("album_key");
        this.mDisplayName = bundle.getString("_display_name");
        this.mYear = bundle.getInt("year");
        this.mMimeType = bundle.getString("mime_type");
        this.mPath = bundle.getString("_data");
        this.mArtistId = bundle.getInt("artist_id");
        this.mAlbumId = bundle.getInt("album_id");
        this.mTrack = bundle.getInt("track");
        this.mDuration = bundle.getInt("duration");
        this.mSize = bundle.getInt("_size");
        this.isRingtone = bundle.getInt("is_ringtone") == 1;
        this.isPodcast = bundle.getInt("is_podcast") == 1;
        this.isAlarm = bundle.getInt("is_alarm") == 1;
        this.isMusic = bundle.getInt("is_music") == 1;
        this.isNotification = bundle.getInt("is_notification") == 1;
    }
}
