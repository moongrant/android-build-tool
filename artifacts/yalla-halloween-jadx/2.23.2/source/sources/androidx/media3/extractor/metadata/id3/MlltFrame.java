package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int[] f8477OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f8478OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f8479OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f8480OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f8481OooO0oo;

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
        this.f8479OooO0o0 = i;
        this.f8478OooO0o = i2;
        this.f8480OooO0oO = i3;
        this.f8481OooO0oo = iArr;
        this.f8477OooO = iArr2;
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
        return this.f8479OooO0o0 == mlltFrame.f8479OooO0o0 && this.f8478OooO0o == mlltFrame.f8478OooO0o && this.f8480OooO0oO == mlltFrame.f8480OooO0oO && Arrays.equals(this.f8481OooO0oo, mlltFrame.f8481OooO0oo) && Arrays.equals(this.f8477OooO, mlltFrame.f8477OooO);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8477OooO) + ((Arrays.hashCode(this.f8481OooO0oo) + ((((((527 + this.f8479OooO0o0) * 31) + this.f8478OooO0o) * 31) + this.f8480OooO0oO) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8479OooO0o0);
        parcel.writeInt(this.f8478OooO0o);
        parcel.writeInt(this.f8480OooO0oO);
        parcel.writeIntArray(this.f8481OooO0oo);
        parcel.writeIntArray(this.f8477OooO);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f8479OooO0o0 = parcel.readInt();
        this.f8478OooO0o = parcel.readInt();
        this.f8480OooO0oO = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = o00.f34910OooO00o;
        this.f8481OooO0oo = iArrCreateIntArray;
        this.f8477OooO = parcel.createIntArray();
    }
}
