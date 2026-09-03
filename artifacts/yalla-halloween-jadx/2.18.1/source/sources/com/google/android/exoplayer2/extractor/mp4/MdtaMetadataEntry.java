package com.google.android.exoplayer2.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p086o000OooO.o0O0O00;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f13966Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f13967Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final byte[] f13968Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f13969Oooo0oo;

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

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f13967Oooo0o = str;
        this.f13968Oooo0oO = bArr;
        this.f13969Oooo0oo = i;
        this.f13966Oooo = i2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ Format Oooo0OO() {
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
        return this.f13967Oooo0o.equals(mdtaMetadataEntry.f13967Oooo0o) && Arrays.equals(this.f13968Oooo0oO, mdtaMetadataEntry.f13968Oooo0oO) && this.f13969Oooo0oo == mdtaMetadataEntry.f13969Oooo0oo && this.f13966Oooo == mdtaMetadataEntry.f13966Oooo;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f13968Oooo0oO) + o0O0O00.OooO00o(this.f13967Oooo0o, 527, 31)) * 31) + this.f13969Oooo0oo) * 31) + this.f13966Oooo;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000() {
        return null;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13967Oooo0o);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13967Oooo0o);
        parcel.writeByteArray(this.f13968Oooo0oO);
        parcel.writeInt(this.f13969Oooo0oo);
        parcel.writeInt(this.f13966Oooo);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i = o000OOo0.f36740OooO00o;
        this.f13967Oooo0o = string;
        this.f13968Oooo0oO = parcel.createByteArray();
        this.f13969Oooo0oo = parcel.readInt();
        this.f13966Oooo = parcel.readInt();
    }
}
