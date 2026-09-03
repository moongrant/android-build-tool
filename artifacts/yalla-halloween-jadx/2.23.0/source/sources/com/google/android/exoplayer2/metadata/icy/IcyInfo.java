package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f12568OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f12569OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f12570OooO0o0;

    public class OooO00o implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(@Nullable String str, @Nullable String str2, byte[] bArr) {
        this.f12568OooO0Oo = bArr;
        this.f12570OooO0o0 = str;
        this.f12569OooO0o = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ OooOo OooOo0() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void OooooOo(MediaMetadata.OooO00o oooO00o) {
        String str = this.f12570OooO0o0;
        if (str != null) {
            oooO00o.f10998OooO00o = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12568OooO0Oo, ((IcyInfo) obj).f12568OooO0Oo);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12568OooO0Oo);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f12570OooO0o0, this.f12569OooO0o, Integer.valueOf(this.f12568OooO0Oo.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f12568OooO0Oo);
        parcel.writeString(this.f12570OooO0o0);
        parcel.writeString(this.f12569OooO0o);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f12568OooO0Oo = bArrCreateByteArray;
        this.f12570OooO0o0 = parcel.readString();
        this.f12569OooO0o = parcel.readString();
    }
}
