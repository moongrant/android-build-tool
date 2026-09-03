package com.app.base.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class RoomLoginModel implements Parcelable {
    public static final Parcelable.Creator<RoomLoginModel> CREATOR = new Parcelable.Creator<RoomLoginModel>() { // from class: com.app.base.model.RoomLoginModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RoomLoginModel createFromParcel(Parcel parcel) {
            return new RoomLoginModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RoomLoginModel[] newArray(int i) {
            return new RoomLoginModel[i];
        }
    };
    public int apptype;
    public long barid;
    public String password;
    public String sessionid;
    public String token;
    public long userid;
    public int version;

    public RoomLoginModel() {
        this.barid = 0L;
        this.userid = 0L;
        this.token = "";
        this.password = "";
        this.version = 27;
        this.apptype = 0;
        this.sessionid = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.barid);
        parcel.writeLong(this.userid);
        parcel.writeString(this.token);
        parcel.writeString(this.password);
        parcel.writeString(this.sessionid);
    }

    public RoomLoginModel(Parcel parcel) {
        this.barid = 0L;
        this.userid = 0L;
        this.token = "";
        this.password = "";
        this.version = 27;
        this.apptype = 0;
        this.sessionid = "";
        this.barid = parcel.readLong();
        this.userid = parcel.readLong();
        this.token = parcel.readString();
        this.password = parcel.readString();
        this.sessionid = parcel.readString();
    }
}
