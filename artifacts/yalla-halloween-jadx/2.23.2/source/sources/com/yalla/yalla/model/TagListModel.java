package com.yalla.yalla.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TagListModel {
    public String code;
    public List<TagType> data;
    public List<TagInfo> data1;
    public String message;

    public static class TagInfo implements Parcelable {
        public static final Parcelable.Creator<TagInfo> CREATOR = new Parcelable.Creator<TagInfo>() { // from class: com.yalla.yalla.model.TagListModel.TagInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TagInfo createFromParcel(Parcel parcel) {
                return new TagInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TagInfo[] newArray(int i) {
                return new TagInfo[i];
            }
        };
        public int tagId;
        public String tagName;
        public int typeId;

        public TagInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.typeId);
            parcel.writeInt(this.tagId);
            parcel.writeString(this.tagName);
        }

        public TagInfo(Parcel parcel) {
            this.typeId = parcel.readInt();
            this.tagId = parcel.readInt();
            this.tagName = parcel.readString();
        }
    }

    public static class TagType {
        public int icon;
        public int tagId;
        public String tagName;
    }
}
