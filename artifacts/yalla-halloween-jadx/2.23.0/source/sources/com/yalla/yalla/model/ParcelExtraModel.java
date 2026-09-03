package com.yalla.yalla.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelExtraModel implements Parcelable {
    public static final Parcelable.Creator<ParcelExtraModel> CREATOR = new Parcelable.Creator<ParcelExtraModel>() { // from class: com.yalla.yalla.model.ParcelExtraModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelExtraModel createFromParcel(Parcel parcel) {
            return new ParcelExtraModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelExtraModel[] newArray(int i) {
            return new ParcelExtraModel[i];
        }
    };
    public long localTime;

    public ParcelExtraModel() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.localTime);
    }

    public ParcelExtraModel(Parcel parcel) {
        this.localTime = parcel.readLong();
    }
}
