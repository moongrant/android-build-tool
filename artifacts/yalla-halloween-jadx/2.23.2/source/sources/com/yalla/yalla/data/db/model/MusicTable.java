package com.yalla.yalla.data.db.model;

import androidx.annotation.Nullable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes4.dex */
@Entity
public class MusicTable {

    @PrimaryKey(autoGenerate = true)
    public Integer id;
    public String initialLetter = "";

    @Ignore
    public boolean isExist;

    @Ignore
    public MutableState<Boolean> isPlaying;
    public boolean isSelect;

    @Ignore
    public MutableState<Boolean> isSelected;

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

    public MusicTable() {
        Boolean bool = Boolean.FALSE;
        this.isSelected = SnapshotStateKt.mutableStateOf(bool, SnapshotStateKt.structuralEqualityPolicy());
        this.isPlaying = SnapshotStateKt.mutableStateOf(bool, SnapshotStateKt.structuralEqualityPolicy());
        this.isExist = false;
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof MusicTable ? ((MusicTable) obj).mPath.equals(this.mPath) : super.equals(obj);
    }
}
