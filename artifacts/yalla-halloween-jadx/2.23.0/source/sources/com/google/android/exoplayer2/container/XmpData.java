package com.google.android.exoplayer2.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class XmpData implements Metadata.Entry {
    public static final Parcelable.Creator<XmpData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f11672OooO0Oo;

    public class OooO00o implements Parcelable.Creator<XmpData> {
        @Override // android.os.Parcelable.Creator
        public final XmpData createFromParcel(Parcel parcel) {
            return new XmpData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final XmpData[] newArray(int i) {
            return new XmpData[i];
        }
    }

    public XmpData(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = o0O00.f40595OooO00o;
        this.f11672OooO0Oo = bArrCreateByteArray;
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
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11672OooO0Oo, ((XmpData) obj).f11672OooO0Oo);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11672OooO0Oo);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        return "XMP: " + o0O00.OoooO(this.f11672OooO0Oo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f11672OooO0Oo);
    }
}
