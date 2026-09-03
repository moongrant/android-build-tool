package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f14521Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f14522Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final byte[] f14523Oooo0oo;

    public class OooO00o implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f14521Oooo0o = j2;
        this.f14522Oooo0oO = j;
        this.f14523Oooo0oo = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f14521Oooo0o);
        parcel.writeLong(this.f14522Oooo0oO);
        parcel.writeByteArray(this.f14523Oooo0oo);
    }

    public PrivateCommand(Parcel parcel) {
        this.f14521Oooo0o = parcel.readLong();
        this.f14522Oooo0oO = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = o000OOo0.f36740OooO00o;
        this.f14523Oooo0oo = bArrCreateByteArray;
    }
}
