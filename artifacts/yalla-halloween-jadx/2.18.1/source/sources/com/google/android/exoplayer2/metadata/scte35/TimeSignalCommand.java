package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f14554Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f14555Oooo0oO;

    public class OooO00o implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public TimeSignalCommand(long j, long j2) {
        this.f14554Oooo0o = j;
        this.f14555Oooo0oO = j2;
    }

    public static long OooO00o(o000 o000Var, long j) {
        long jOooOOo0 = o000Var.OooOOo0();
        if ((128 & jOooOOo0) != 0) {
            return 8589934591L & ((((jOooOOo0 & 1) << 32) | o000Var.OooOOo()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f14554Oooo0o);
        parcel.writeLong(this.f14555Oooo0oO);
    }

    public TimeSignalCommand(long j, long j2, OooO00o oooO00o) {
        this.f14554Oooo0o = j;
        this.f14555Oooo0oO = j2;
    }
}
