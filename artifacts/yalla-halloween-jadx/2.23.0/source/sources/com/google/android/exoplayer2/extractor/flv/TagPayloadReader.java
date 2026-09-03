package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TrackOutput f11840OooO00o;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(TrackOutput trackOutput) {
        this.f11840OooO00o = trackOutput;
    }
}
