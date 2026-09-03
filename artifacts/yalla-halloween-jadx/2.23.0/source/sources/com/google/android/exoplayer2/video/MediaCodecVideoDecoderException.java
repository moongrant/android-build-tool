package com.google.android.exoplayer2.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(IllegalStateException illegalStateException, @Nullable OooO0o oooO0o, @Nullable Surface surface) {
        super(illegalStateException, oooO0o);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
