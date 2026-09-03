package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f12622OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f12623OooO0o0;

    public class OooO00o implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    public SmtaMetadataEntry(float f, int i) {
        this.f12622OooO0Oo = f;
        this.f12623OooO0o0 = i;
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
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f12622OooO0Oo == smtaMetadataEntry.f12622OooO0Oo && this.f12623OooO0o0 == smtaMetadataEntry.f12623OooO0o0;
    }

    public final int hashCode() {
        return ((OooO0OO.OooO00o(this.f12622OooO0Oo) + 527) * 31) + this.f12623OooO0o0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f12622OooO0Oo + ", svcTemporalLayerCount=" + this.f12623OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f12622OooO0Oo);
        parcel.writeInt(this.f12623OooO0o0);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f12622OooO0Oo = parcel.readFloat();
        this.f12623OooO0o0 = parcel.readInt();
    }
}
