package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f18200OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f18201OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f18202OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f18203OooO0oO;

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
        return this.f18202OooO0o0 == timeModel.f18202OooO0o0 && this.f18201OooO0o == timeModel.f18201OooO0o && this.f18200OooO0Oo == timeModel.f18200OooO0Oo && this.f18203OooO0oO == timeModel.f18203OooO0oO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18200OooO0Oo), Integer.valueOf(this.f18202OooO0o0), Integer.valueOf(this.f18201OooO0o), Integer.valueOf(this.f18203OooO0oO)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18202OooO0o0);
        parcel.writeInt(this.f18201OooO0o);
        parcel.writeInt(this.f18203OooO0oO);
        parcel.writeInt(this.f18200OooO0Oo);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f18202OooO0o0 = i;
        this.f18201OooO0o = i2;
        this.f18203OooO0oO = i3;
        this.f18200OooO0Oo = i4;
    }
}
