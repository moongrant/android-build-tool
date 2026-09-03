package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int[] f6391OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6392OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6393OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6394OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f6395OooO0oo;

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

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f6393OooO0o0 = parcel.readInt();
        this.f6392OooO0o = parcel.readInt();
        this.f6394OooO0oO = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = OooO0o.f34423OooO00o;
        this.f6395OooO0oo = iArrCreateIntArray;
        this.f6391OooO = parcel.createIntArray();
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
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
        return this.f6393OooO0o0 == mlltFrame.f6393OooO0o0 && this.f6392OooO0o == mlltFrame.f6392OooO0o && this.f6394OooO0oO == mlltFrame.f6394OooO0oO && Arrays.equals(this.f6395OooO0oo, mlltFrame.f6395OooO0oo) && Arrays.equals(this.f6391OooO, mlltFrame.f6391OooO);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6391OooO) + ((Arrays.hashCode(this.f6395OooO0oo) + ((((((527 + this.f6393OooO0o0) * 31) + this.f6392OooO0o) * 31) + this.f6394OooO0oO) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6393OooO0o0);
        parcel.writeInt(this.f6392OooO0o);
        parcel.writeInt(this.f6394OooO0oO);
        parcel.writeIntArray(this.f6395OooO0oo);
        parcel.writeIntArray(this.f6391OooO);
    }
}
