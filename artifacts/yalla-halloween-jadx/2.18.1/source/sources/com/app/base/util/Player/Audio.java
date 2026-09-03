package com.app.base.util.Player;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import android.os.Bundle;
import com.app.base.bean.AbsJavaBean;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.ao;

/* JADX INFO: loaded from: classes.dex */
public class Audio extends AbsJavaBean {
    private boolean isAlarm;
    private boolean isMusic;
    private boolean isNotification;
    private boolean isPodcast;
    private boolean isRingtone;
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

    public Audio(Bundle bundle) {
        this.mDuration = 0;
        this.mSize = 0;
        this.isRingtone = false;
        this.isPodcast = false;
        this.isAlarm = false;
        this.isMusic = false;
        this.isNotification = false;
        this.mId = bundle.getInt(ao.d);
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

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Audio{mTitle='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mTitle, '\'', ", mTitleKey='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mTitleKey, '\'', ", mArtist='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mArtist, '\'', ", mArtistKey='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mArtistKey, '\'', ", mComposer='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mComposer, '\'', ", mAlbum='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mAlbum, '\'', ", mAlbumKey='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mAlbumKey, '\'', ", mDisplayName='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mDisplayName, '\'', ", mMimeType='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mMimeType, '\'', ", mPath='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mPath, '\'', ", mId=");
        sbOooO0o0.append(this.mId);
        sbOooO0o0.append(", mArtistId=");
        sbOooO0o0.append(this.mArtistId);
        sbOooO0o0.append(", mAlbumId=");
        sbOooO0o0.append(this.mAlbumId);
        sbOooO0o0.append(", mYear=");
        sbOooO0o0.append(this.mYear);
        sbOooO0o0.append(", mTrack=");
        sbOooO0o0.append(this.mTrack);
        sbOooO0o0.append(", mDuration=");
        sbOooO0o0.append(this.mDuration);
        sbOooO0o0.append(", mSize=");
        sbOooO0o0.append(this.mSize);
        sbOooO0o0.append(", isRingtone=");
        sbOooO0o0.append(this.isRingtone);
        sbOooO0o0.append(", isPodcast=");
        sbOooO0o0.append(this.isPodcast);
        sbOooO0o0.append(", isAlarm=");
        sbOooO0o0.append(this.isAlarm);
        sbOooO0o0.append(", isMusic=");
        sbOooO0o0.append(this.isMusic);
        sbOooO0o0.append(", isNotification=");
        return Oooo0.OooO0O0(sbOooO0o0, this.isNotification, '}');
    }
}
