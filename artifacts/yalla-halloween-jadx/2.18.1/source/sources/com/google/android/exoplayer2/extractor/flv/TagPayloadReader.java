package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TrackOutput f13780OooO00o;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public TagPayloadReader(TrackOutput trackOutput) {
        this.f13780OooO00o = trackOutput;
    }

    public final boolean OooO00o(o000 o000Var, long j) throws ParserException {
        return OooO0O0(o000Var) && OooO0OO(o000Var, j);
    }

    public abstract boolean OooO0O0(o000 o000Var) throws ParserException;

    public abstract boolean OooO0OO(o000 o000Var, long j) throws ParserException;
}
