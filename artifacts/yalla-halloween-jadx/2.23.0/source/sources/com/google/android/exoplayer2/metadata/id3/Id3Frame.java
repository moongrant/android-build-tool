package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f12594OooO0Oo;

    public Id3Frame(String str) {
        this.f12594OooO0Oo = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ OooOo OooOo0() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void OooooOo(MediaMetadata.OooO00o oooO00o) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000OO() {
        return null;
    }

    public String toString() {
        return this.f12594OooO0Oo;
    }
}
