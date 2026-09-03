package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f14510Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f14511Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f14512Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int[] f14513OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int[] f14514OoooO00;

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

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f14511Oooo0oO = i;
        this.f14512Oooo0oo = i2;
        this.f14510Oooo = i3;
        this.f14514OoooO00 = iArr;
        this.f14513OoooO0 = iArr2;
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
        return this.f14511Oooo0oO == mlltFrame.f14511Oooo0oO && this.f14512Oooo0oo == mlltFrame.f14512Oooo0oo && this.f14510Oooo == mlltFrame.f14510Oooo && Arrays.equals(this.f14514OoooO00, mlltFrame.f14514OoooO00) && Arrays.equals(this.f14513OoooO0, mlltFrame.f14513OoooO0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14513OoooO0) + ((Arrays.hashCode(this.f14514OoooO00) + ((((((527 + this.f14511Oooo0oO) * 31) + this.f14512Oooo0oo) * 31) + this.f14510Oooo) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14511Oooo0oO);
        parcel.writeInt(this.f14512Oooo0oo);
        parcel.writeInt(this.f14510Oooo);
        parcel.writeIntArray(this.f14514OoooO00);
        parcel.writeIntArray(this.f14513OoooO0);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f14511Oooo0oO = parcel.readInt();
        this.f14512Oooo0oo = parcel.readInt();
        this.f14510Oooo = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = o000OOo0.f36740OooO00o;
        this.f14514OoooO00 = iArrCreateIntArray;
        this.f14513OoooO0 = parcel.createIntArray();
    }
}
