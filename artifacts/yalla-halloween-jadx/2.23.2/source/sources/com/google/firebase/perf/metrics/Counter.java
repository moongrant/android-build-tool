package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicLong f19967OooO0o0;

    public class OooO00o implements Parcelable.Creator<Counter> {
        @Override // android.os.Parcelable.Creator
        public final Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Counter[] newArray(int i) {
            return new Counter[i];
        }
    }

    public Counter(@NonNull String str) {
        this.f19966OooO0Oo = str;
        this.f19967OooO0o0 = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19966OooO0Oo);
        parcel.writeLong(this.f19967OooO0o0.get());
    }

    public Counter(Parcel parcel) {
        this.f19966OooO0Oo = parcel.readString();
        this.f19967OooO0o0 = new AtomicLong(parcel.readLong());
    }
}
