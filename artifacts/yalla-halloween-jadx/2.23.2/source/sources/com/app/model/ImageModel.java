package com.app.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ParcelCreator"})
public class ImageModel implements Parcelable {
    public static final Parcelable.Creator<ImageModel> CREATOR = new Parcelable.Creator<ImageModel>() { // from class: com.app.model.ImageModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageModel createFromParcel(Parcel parcel) {
            ImageModel imageModel = new ImageModel();
            imageModel.id = parcel.readLong();
            imageModel.path = parcel.readString();
            imageModel.thumbnailPath = parcel.readString();
            imageModel.bucketId = parcel.readLong();
            imageModel.bucketName = parcel.readString();
            imageModel.select = parcel.readInt() == 1;
            return imageModel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageModel[] newArray(int i) {
            return new ImageModel[i];
        }
    };
    private long bucketId;
    private String bucketName;
    private long dateModified;
    private long id;
    private String imageType;
    private String path;
    private boolean select = false;
    private int selectPosition = -1;
    private long size;
    private String thumbnailPath;
    private String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getBucketId() {
        return this.bucketId;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public long getDateModified() {
        return this.dateModified;
    }

    public long getId() {
        return this.id;
    }

    public String getImageType() {
        return this.imageType;
    }

    public String getPath() {
        if (this.path == null) {
            this.path = "";
        }
        return this.path;
    }

    public int getSelectPosition() {
        return this.selectPosition;
    }

    public long getSize() {
        return this.size;
    }

    public double getSizeBM() {
        return new BigDecimal((this.size / 1024.0d) / 1024.0d).setScale(2, RoundingMode.UP).doubleValue();
    }

    public String getThumbnailPath() {
        if (this.thumbnailPath == null) {
            this.thumbnailPath = "";
        }
        return this.thumbnailPath;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isGif() {
        return MediaUtils.IMAGE_GIF.equals(this.imageType);
    }

    public boolean isSelect() {
        return this.select;
    }

    public boolean isSizeGreater2MB() {
        return getSizeBM() > 2.0d;
    }

    public void setBucketId(long j) {
        this.bucketId = j;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setDateModified(long j) {
        this.dateModified = j;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSelect(boolean z) {
        this.select = z;
    }

    public void setSelectPosition(int i) {
        this.selectPosition = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setThumbnailPath(String str) {
        this.thumbnailPath = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "ImageModel{，id=" + this.id + ", dateModified='" + this.dateModified + "', path='" + this.path + "', thumbnailPath='" + this.thumbnailPath + "', bucketId=" + this.bucketId + ", bucketName='" + this.bucketName + "', select=" + this.select + "\n imageType='" + this.imageType + "', title='" + this.title + "', size='" + this.size + "', getSizeBM='" + getSizeBM() + "', isSizeGreater2MB='" + isSizeGreater2MB() + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.path);
        parcel.writeString(this.thumbnailPath);
        parcel.writeLong(this.bucketId);
        parcel.writeString(this.bucketName);
        parcel.writeInt(this.select ? 1 : 0);
    }
}
