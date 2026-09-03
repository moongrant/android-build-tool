package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.animation.OooO0O0;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import kotlin.UByte;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f6948OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6949OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f6950OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6951OooO0oO;

    public class OooO00o implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public MdtaMetadataEntry(byte[] bArr, int i, int i2, String str) {
        this.f6948OooO0Oo = str;
        this.f6950OooO0o0 = bArr;
        this.f6949OooO0o = i;
        this.f6951OooO0oO = i2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ OooOO0 OooOo0() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f6948OooO0Oo.equals(mdtaMetadataEntry.f6948OooO0Oo) && Arrays.equals(this.f6950OooO0o0, mdtaMetadataEntry.f6950OooO0o0) && this.f6949OooO0o == mdtaMetadataEntry.f6949OooO0o && this.f6951OooO0oO == mdtaMetadataEntry.f6951OooO0oO;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f6950OooO0o0) + OooO0O0.OooO00o(this.f6948OooO0Oo, 527, 31)) * 31) + this.f6949OooO0o) * 31) + this.f6951OooO0oO;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
    }

    public final String toString() {
        String strOooOOOO;
        byte[] bArr = this.f6950OooO0o0;
        int i = this.f6951OooO0oO;
        if (i == 1) {
            strOooOOOO = o00.OooOOOO(bArr);
        } else if (i == 23) {
            int i2 = o00.f34910OooO00o;
            o00Oo0.OooO00o(bArr.length == 4);
            strOooOOOO = String.valueOf(Float.intBitsToFloat(((bArr[1] & UByte.MAX_VALUE) << 16) | (bArr[0] << 24) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)));
        } else if (i != 67) {
            strOooOOOO = o00.OoooOO0(bArr);
        } else {
            int i3 = o00.f34910OooO00o;
            o00Oo0.OooO00o(bArr.length == 4);
            strOooOOOO = String.valueOf((bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8) | bArr[3]);
        }
        return androidx.compose.compiler.plugins.kotlin.OooO0O0.OooO00o(new StringBuilder("mdta: key="), this.f6948OooO0Oo, ", value=", strOooOOOO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6948OooO0Oo);
        parcel.writeByteArray(this.f6950OooO0o0);
        parcel.writeInt(this.f6949OooO0o);
        parcel.writeInt(this.f6951OooO0oO);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f6948OooO0Oo = string;
        this.f6950OooO0o0 = parcel.createByteArray();
        this.f6949OooO0o = parcel.readInt();
        this.f6951OooO0oO = parcel.readInt();
    }
}
