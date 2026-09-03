package com.app.base.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class LoginParam implements Parcelable {
    public static final Parcelable.Creator<LoginParam> CREATOR = new Parcelable.Creator<LoginParam>() { // from class: com.app.base.model.LoginParam.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LoginParam createFromParcel(Parcel parcel) {
            return new LoginParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LoginParam[] newArray(int i) {
            return new LoginParam[i];
        }
    };
    public static final int HALLVSRSION = 2;
    public long id;
    public String sign;
    public int version = 2;

    public LoginParam() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.sign);
    }

    public LoginParam(Parcel parcel) {
        this.id = parcel.readLong();
        this.sign = parcel.readString();
    }
}
