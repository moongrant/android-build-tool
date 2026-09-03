package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import kotlin.UByte;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f12609OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f12610OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f12611OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f12612OooO0oO;

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
        this.f12609OooO0Oo = str;
        this.f12611OooO0o0 = bArr;
        this.f12610OooO0o = i;
        this.f12612OooO0oO = i2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ OooOo OooOo0() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void OooooOo(MediaMetadata.OooO00o oooO00o) {
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
        return this.f12609OooO0Oo.equals(mdtaMetadataEntry.f12609OooO0Oo) && Arrays.equals(this.f12611OooO0o0, mdtaMetadataEntry.f12611OooO0o0) && this.f12610OooO0o == mdtaMetadataEntry.f12610OooO0o && this.f12612OooO0oO == mdtaMetadataEntry.f12612OooO0oO;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f12611OooO0o0) + o0OO00O.OooO00o(this.f12609OooO0Oo, 527, 31)) * 31) + this.f12610OooO0o) * 31) + this.f12612OooO0oO;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        String strOooOOO0;
        byte[] bArr = this.f12611OooO0o0;
        int i = this.f12612OooO0oO;
        if (i == 1) {
            strOooOOO0 = o0O00.OooOOO0(bArr);
        } else if (i == 23) {
            int i2 = o0O00.f40595OooO00o;
            o00O000o.OooO00o(bArr.length == 4);
            strOooOOO0 = String.valueOf(Float.intBitsToFloat(((bArr[1] & UByte.MAX_VALUE) << 16) | (bArr[0] << 24) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)));
        } else if (i != 67) {
            strOooOOO0 = o0O00.OoooO(bArr);
        } else {
            int i3 = o0O00.f40595OooO00o;
            o00O000o.OooO00o(bArr.length == 4);
            strOooOOO0 = String.valueOf((bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8) | bArr[3]);
        }
        return OooO0OO.OooO0OO(new StringBuilder("mdta: key="), this.f12609OooO0Oo, ", value=", strOooOOO0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12609OooO0Oo);
        parcel.writeByteArray(this.f12611OooO0o0);
        parcel.writeInt(this.f12610OooO0o);
        parcel.writeInt(this.f12612OooO0oO);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i = o0O00.f40595OooO00o;
        this.f12609OooO0Oo = string;
        this.f12611OooO0o0 = parcel.createByteArray();
        this.f12610OooO0o = parcel.readInt();
        this.f12612OooO0oO = parcel.readInt();
    }
}
