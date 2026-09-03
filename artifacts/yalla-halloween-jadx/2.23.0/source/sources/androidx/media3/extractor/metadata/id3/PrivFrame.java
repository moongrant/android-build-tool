package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f6396OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f6397OooO0o0;

    public class OooO00o implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6397OooO0o0 = string;
        this.f6396OooO0o = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return OooO0o.OooO00o(this.f6397OooO0o0, privFrame.f6397OooO0o0) && Arrays.equals(this.f6396OooO0o, privFrame.f6396OooO0o);
    }

    public final int hashCode() {
        String str = this.f6397OooO0o0;
        return Arrays.hashCode(this.f6396OooO0o) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f6387OooO0Oo + ": owner=" + this.f6397OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6397OooO0o0);
        parcel.writeByteArray(this.f6396OooO0o);
    }
}
