package com.app.selectPicture.model;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public class ImageModel implements Parcelable {
    public static final Parcelable.Creator<ImageModel> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f12317Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f12318Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f12319Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f12320Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f12321OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f12322OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f12323OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public String f12324OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f12325OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Uri f12326o000oOoO;

    public class OooO00o implements Parcelable.Creator<ImageModel> {
        @Override // android.os.Parcelable.Creator
        public final ImageModel createFromParcel(Parcel parcel) {
            return new ImageModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageModel[] newArray(int i) {
            return new ImageModel[i];
        }
    }

    public ImageModel() {
        this.f12321OoooO = false;
        this.f12325OoooOO0 = -1;
        this.f12326o000oOoO = null;
    }

    public final double OooO00o() {
        return new BigDecimal((this.f12317Oooo / 1024.0d) / 1024.0d).setScale(2, RoundingMode.UP).doubleValue();
    }

    public final boolean OooO0O0() {
        return "image/gif".equals(this.f12320Oooo0oo);
    }

    public final boolean OooO0OO() {
        return OooO00o() > 2.0d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ImageModel{id=");
        sbOooO0o0.append(this.f12318Oooo0o);
        sbOooO0o0.append(", dateModified=");
        sbOooO0o0.append(this.f12319Oooo0oO);
        sbOooO0o0.append(", imageType='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f12320Oooo0oo, '\'', ", size=");
        sbOooO0o0.append(this.f12317Oooo);
        sbOooO0o0.append(", title='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f12323OoooO00, '\'', ", bucketId=");
        sbOooO0o0.append(this.f12322OoooO0);
        sbOooO0o0.append(", bucketName='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f12324OoooO0O, '\'', ", select=");
        sbOooO0o0.append(this.f12321OoooO);
        sbOooO0o0.append(", selectPosition=");
        sbOooO0o0.append(this.f12325OoooOO0);
        sbOooO0o0.append(", uri=");
        sbOooO0o0.append(this.f12326o000oOoO);
        sbOooO0o0.append(", getSizeBM='");
        sbOooO0o0.append(OooO00o());
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", isSizeGreater2MB='");
        sbOooO0o0.append(OooO0OO());
        sbOooO0o0.append('\'');
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12318Oooo0o);
        parcel.writeLong(this.f12319Oooo0oO);
        parcel.writeString(this.f12320Oooo0oo);
        parcel.writeLong(this.f12317Oooo);
        parcel.writeString(this.f12323OoooO00);
        parcel.writeLong(this.f12322OoooO0);
        parcel.writeString(this.f12324OoooO0O);
        parcel.writeByte(this.f12321OoooO ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12325OoooOO0);
        parcel.writeParcelable(this.f12326o000oOoO, i);
    }

    public ImageModel(Parcel parcel) {
        this.f12321OoooO = false;
        this.f12325OoooOO0 = -1;
        this.f12326o000oOoO = null;
        this.f12318Oooo0o = parcel.readLong();
        this.f12319Oooo0oO = parcel.readLong();
        this.f12320Oooo0oo = parcel.readString();
        this.f12317Oooo = parcel.readLong();
        this.f12323OoooO00 = parcel.readString();
        this.f12322OoooO0 = parcel.readLong();
        this.f12324OoooO0O = parcel.readString();
        this.f12321OoooO = parcel.readByte() != 0;
        this.f12325OoooOO0 = parcel.readInt();
        this.f12326o000oOoO = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
