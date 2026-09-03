package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f12624OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f12625OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f12626OooO0o0;

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
        this.f12624OooO0Oo = j2;
        this.f12626OooO0o0 = j;
        this.f12625OooO0o = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12624OooO0Oo);
        parcel.writeLong(this.f12626OooO0o0);
        parcel.writeByteArray(this.f12625OooO0o);
    }

    public PrivateCommand(Parcel parcel) {
        this.f12624OooO0Oo = parcel.readLong();
        this.f12626OooO0o0 = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = o0O00.f40595OooO00o;
        this.f12625OooO0o = bArrCreateByteArray;
    }
}
