package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f18077Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f18078Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f18079Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f18080Oooo0oo;

    public class OooO00o implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this.f18079Oooo0oO = 0;
        this.f18080Oooo0oo = 0;
        this.f18077Oooo = 10;
        this.f18078Oooo0o = 0;
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
        return this.f18079Oooo0oO == timeModel.f18079Oooo0oO && this.f18080Oooo0oo == timeModel.f18080Oooo0oo && this.f18078Oooo0o == timeModel.f18078Oooo0o && this.f18077Oooo == timeModel.f18077Oooo;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18078Oooo0o), Integer.valueOf(this.f18079Oooo0oO), Integer.valueOf(this.f18080Oooo0oo), Integer.valueOf(this.f18077Oooo)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18079Oooo0oO);
        parcel.writeInt(this.f18080Oooo0oo);
        parcel.writeInt(this.f18077Oooo);
        parcel.writeInt(this.f18078Oooo0o);
    }

    public TimeModel(Parcel parcel) {
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        int i4 = parcel.readInt();
        this.f18079Oooo0oO = i;
        this.f18080Oooo0oo = i2;
        this.f18077Oooo = i3;
        this.f18078Oooo0o = i4;
    }
}
