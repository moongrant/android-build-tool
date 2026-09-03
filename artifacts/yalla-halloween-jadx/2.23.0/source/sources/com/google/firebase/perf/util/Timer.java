package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f20477OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f20478OooO0o0;

    public class OooO00o implements Parcelable.Creator<Timer> {
        @Override // android.os.Parcelable.Creator
        public final Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long OooO00o() {
        return new Timer().f20478OooO0o0 - this.f20478OooO0o0;
    }

    public final long OooO0O0() {
        return this.f20477OooO0Oo;
    }

    public final void OooO0OO() {
        this.f20477OooO0Oo = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f20478OooO0o0 = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f20477OooO0Oo);
        parcel.writeLong(this.f20478OooO0o0);
    }

    @VisibleForTesting
    public Timer(long j, long j2) {
        this.f20477OooO0Oo = j;
        this.f20478OooO0o0 = j2;
    }
}
