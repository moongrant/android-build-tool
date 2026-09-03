package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f12419OooO0Oo;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, @Nullable OooO0o oooO0o) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(oooO0o == null ? null : oooO0o.f12519OooO00o);
        super(sb.toString(), illegalStateException);
        if (o0O00.f40595OooO00o >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f12419OooO0Oo = diagnosticInfo;
    }
}
