package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f8447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f8448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f8449OooO0o0;

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
        this.f8447OooO0Oo = bArr;
        this.f8449OooO0o0 = str;
        this.f8448OooO0o = str2;
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
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8447OooO0Oo, ((IcyInfo) obj).f8447OooO0Oo);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8447OooO0Oo);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void o0ooOoO(MediaMetadata.OooO00o oooO00o) {
        String str = this.f8449OooO0o0;
        if (str != null) {
            oooO00o.f6304OooO00o = str;
        }
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f8449OooO0o0, this.f8448OooO0o, Integer.valueOf(this.f8447OooO0Oo.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f8447OooO0Oo);
        parcel.writeString(this.f8449OooO0o0);
        parcel.writeString(this.f8448OooO0o);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f8447OooO0Oo = bArrCreateByteArray;
        this.f8449OooO0o0 = parcel.readString();
        this.f8448OooO0o = parcel.readString();
    }
}
