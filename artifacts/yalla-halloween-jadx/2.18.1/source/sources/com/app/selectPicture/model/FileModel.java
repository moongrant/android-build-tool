package com.app.selectPicture.model;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public class FileModel implements Parcelable {
    public static final Parcelable.Creator<FileModel> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12306Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f12307Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f12308Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f12309Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Uri f12310OoooO00;

    public class OooO00o implements Parcelable.Creator<FileModel> {
        @Override // android.os.Parcelable.Creator
        public final FileModel createFromParcel(Parcel parcel) {
            return new FileModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FileModel[] newArray(int i) {
            return new FileModel[i];
        }
    }

    public FileModel() {
        this.f12306Oooo = 0;
        this.f12310OoooO00 = null;
    }

    public final FileModel OooO00o(ImageModel imageModel) {
        this.f12307Oooo0o = 0L;
        this.f12308Oooo0oO = 0L;
        this.f12309Oooo0oo = "";
        if (imageModel != null) {
            this.f12307Oooo0o = imageModel.f12318Oooo0o;
            this.f12308Oooo0oO = imageModel.f12322OoooO0;
            this.f12309Oooo0oo = imageModel.f12324OoooO0O;
            this.f12310OoooO00 = imageModel.f12326o000oOoO;
        }
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ImageModel{ size=");
        sbOooO0o0.append(this.f12306Oooo);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", id=");
        sbOooO0o0.append(this.f12307Oooo0o);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", bucketId=");
        sbOooO0o0.append(this.f12308Oooo0oO);
        sbOooO0o0.append(", bucketName='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.f12309Oooo0oo, '\'', '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12307Oooo0o);
        parcel.writeLong(this.f12308Oooo0oO);
        parcel.writeString(this.f12309Oooo0oo);
        parcel.writeInt(this.f12306Oooo);
        parcel.writeParcelable(this.f12310OoooO00, i);
    }

    public FileModel(Parcel parcel) {
        this.f12306Oooo = 0;
        this.f12310OoooO00 = null;
        this.f12307Oooo0o = parcel.readLong();
        this.f12308Oooo0oO = parcel.readLong();
        this.f12309Oooo0oo = parcel.readString();
        this.f12306Oooo = parcel.readInt();
        this.f12310OoooO00 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
