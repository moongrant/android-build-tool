package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.animation.OooO0O0;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f8454OooO0o0;

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
        this.f8454OooO0o0 = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f8473OooO0Oo.equals(binaryFrame.f8473OooO0Oo) && Arrays.equals(this.f8454OooO0o0, binaryFrame.f8454OooO0o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8454OooO0o0) + OooO0O0.OooO00o(this.f8473OooO0Oo, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8473OooO0Oo);
        parcel.writeByteArray(this.f8454OooO0o0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        super(string);
        this.f8454OooO0o0 = parcel.createByteArray();
    }
}
