package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int[] f12598OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f12599OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f12600OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f12601OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f12602OooO0oo;

    public class OooO00o implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public final MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.f12600OooO0o0 = i;
        this.f12599OooO0o = i2;
        this.f12601OooO0oO = i3;
        this.f12602OooO0oo = iArr;
        this.f12598OooO = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f12600OooO0o0 == mlltFrame.f12600OooO0o0 && this.f12599OooO0o == mlltFrame.f12599OooO0o && this.f12601OooO0oO == mlltFrame.f12601OooO0oO && Arrays.equals(this.f12602OooO0oo, mlltFrame.f12602OooO0oo) && Arrays.equals(this.f12598OooO, mlltFrame.f12598OooO);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12598OooO) + ((Arrays.hashCode(this.f12602OooO0oo) + ((((((527 + this.f12600OooO0o0) * 31) + this.f12599OooO0o) * 31) + this.f12601OooO0oO) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12600OooO0o0);
        parcel.writeInt(this.f12599OooO0o);
        parcel.writeInt(this.f12601OooO0oO);
        parcel.writeIntArray(this.f12602OooO0oo);
        parcel.writeIntArray(this.f12598OooO);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f12600OooO0o0 = parcel.readInt();
        this.f12599OooO0o = parcel.readInt();
        this.f12601OooO0oO = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = o0O00.f40595OooO00o;
        this.f12602OooO0oo = iArrCreateIntArray;
        this.f12598OooO = parcel.createIntArray();
    }
}
