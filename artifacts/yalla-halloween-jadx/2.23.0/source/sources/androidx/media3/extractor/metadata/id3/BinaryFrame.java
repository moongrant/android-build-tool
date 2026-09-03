package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f6368OooO0o0;

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

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        super(string);
        this.f6368OooO0o0 = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f6387OooO0Oo.equals(binaryFrame.f6387OooO0Oo) && Arrays.equals(this.f6368OooO0o0, binaryFrame.f6368OooO0o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6368OooO0o0) + o0OO00O.OooO00o(this.f6387OooO0Oo, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6387OooO0Oo);
        parcel.writeByteArray(this.f6368OooO0o0);
    }
}
