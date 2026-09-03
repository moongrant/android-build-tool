package com.yalla.yalla.data.db.model;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index(unique = true, value = {"mTitleKey"})})
public class MusicTable {

    @PrimaryKey(autoGenerate = true)
    public Integer id;
    public String initialLetter = "";
    public boolean isSelect;

    @ColumnInfo(name = "mAlbum")
    public String mAlbum;

    @ColumnInfo(name = "mAlbumKey")
    public String mAlbumKey;

    @ColumnInfo(name = "mArtist")
    public String mArtist;

    @ColumnInfo(name = "mArtistKey")
    public String mArtistKey;

    @ColumnInfo(name = "mComposer")
    public String mComposer;

    @ColumnInfo(name = "mDisplayName")
    public String mDisplayName;

    @ColumnInfo(name = "mDuration")
    public int mDuration;

    @ColumnInfo(name = "mMimeType")
    public String mMimeType;

    @ColumnInfo(name = "mPath")
    public String mPath;

    @ColumnInfo(name = "mTitle")
    public String mTitle;

    @ColumnInfo(name = "mTitleKey")
    public String mTitleKey;

    @ColumnInfo(name = "user")
    public String user;

    public boolean equals(@Nullable Object obj) {
        return obj instanceof MusicTable ? ((MusicTable) obj).mTitleKey.equals(this.mTitleKey) : super.equals(obj);
    }
}
