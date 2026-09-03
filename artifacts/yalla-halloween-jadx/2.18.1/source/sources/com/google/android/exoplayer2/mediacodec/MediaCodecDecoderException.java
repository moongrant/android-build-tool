package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecDecoderException extends DecoderException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecDecoderException(Throwable th, @Nullable OooO00o oooO00o) {
        String strValueOf = String.valueOf(oooO00o == null ? null : oooO00o.f14435OooO00o);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), th);
        if (o000OOo0.f36740OooO00o < 21 || !(th instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) th).getDiagnosticInfo();
    }
}
