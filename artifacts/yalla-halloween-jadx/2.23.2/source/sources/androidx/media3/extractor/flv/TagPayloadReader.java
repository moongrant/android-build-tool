package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TrackOutput f8420OooO00o;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(TrackOutput trackOutput) {
        this.f8420OooO00o = trackOutput;
    }
}
