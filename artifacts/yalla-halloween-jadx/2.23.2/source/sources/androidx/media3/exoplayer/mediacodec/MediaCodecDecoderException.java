package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f7654OooO0Oo;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, @Nullable OooO0o oooO0o) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(oooO0o == null ? null : oooO0o.f7754OooO00o);
        super(sb.toString(), illegalStateException);
        if (o00.f34910OooO00o >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f7654OooO0Oo = diagnosticInfo;
    }
}
