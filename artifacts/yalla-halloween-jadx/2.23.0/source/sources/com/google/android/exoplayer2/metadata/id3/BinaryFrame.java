package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f12575OooO0o0;

    public class OooO00o implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public final BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f12575OooO0o0 = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f12594OooO0Oo.equals(binaryFrame.f12594OooO0Oo) && Arrays.equals(this.f12575OooO0o0, binaryFrame.f12575OooO0o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12575OooO0o0) + o0OO00O.OooO00o(this.f12594OooO0Oo, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12594OooO0Oo);
        parcel.writeByteArray(this.f12575OooO0o0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        super(string);
        this.f12575OooO0o0 = parcel.createByteArray();
    }
}
