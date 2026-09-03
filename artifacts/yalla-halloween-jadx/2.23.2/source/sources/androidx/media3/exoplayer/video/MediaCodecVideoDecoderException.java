package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(IllegalStateException illegalStateException, @Nullable OooO0o oooO0o, @Nullable Surface surface) {
        super(illegalStateException, oooO0o);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
