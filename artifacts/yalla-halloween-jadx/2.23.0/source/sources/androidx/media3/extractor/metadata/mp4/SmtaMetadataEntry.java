package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f6411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6412OooO0o0;

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

    public SmtaMetadataEntry(Parcel parcel) {
        this.f6411OooO0Oo = parcel.readFloat();
        this.f6412OooO0o0 = parcel.readInt();
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
        return this.f6411OooO0Oo == smtaMetadataEntry.f6411OooO0Oo && this.f6412OooO0o0 == smtaMetadataEntry.f6412OooO0o0;
    }

    public final int hashCode() {
        return ((OooO0OO.OooO00o(this.f6411OooO0Oo) + 527) * 31) + this.f6412OooO0o0;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f6411OooO0Oo + ", svcTemporalLayerCount=" + this.f6412OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f6411OooO0Oo);
        parcel.writeInt(this.f6412OooO0o0);
    }
}
