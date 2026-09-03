package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f6387OooO0Oo;

    public Id3Frame(String str) {
        this.f6387OooO0Oo = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f6387OooO0Oo;
    }
}
