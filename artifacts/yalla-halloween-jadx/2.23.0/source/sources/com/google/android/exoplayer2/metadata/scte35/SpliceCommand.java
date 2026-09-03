package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class SpliceCommand implements Metadata.Entry {
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

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
