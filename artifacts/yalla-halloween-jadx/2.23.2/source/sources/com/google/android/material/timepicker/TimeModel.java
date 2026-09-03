package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f17724OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f17725OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f17726OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f17727OooO0oO;

    public class OooO00o implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f17726OooO0o0 == timeModel.f17726OooO0o0 && this.f17725OooO0o == timeModel.f17725OooO0o && this.f17724OooO0Oo == timeModel.f17724OooO0Oo && this.f17727OooO0oO == timeModel.f17727OooO0oO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17724OooO0Oo), Integer.valueOf(this.f17726OooO0o0), Integer.valueOf(this.f17725OooO0o), Integer.valueOf(this.f17727OooO0oO)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17726OooO0o0);
        parcel.writeInt(this.f17725OooO0o);
        parcel.writeInt(this.f17727OooO0oO);
        parcel.writeInt(this.f17724OooO0Oo);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f17726OooO0o0 = i;
        this.f17725OooO0o = i2;
        this.f17727OooO0oO = i3;
        this.f17724OooO0Oo = i4;
    }
}
