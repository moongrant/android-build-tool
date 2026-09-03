package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f14506Oooo0o;

    public Id3Frame(String str) {
        this.f14506Oooo0o = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ Format Oooo0OO() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] o0000() {
        return null;
    }

    public String toString() {
        return this.f14506Oooo0o;
    }
}
