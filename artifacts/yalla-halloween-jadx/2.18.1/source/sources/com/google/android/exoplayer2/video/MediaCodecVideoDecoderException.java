package com.google.android.exoplayer2.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(Throwable th, @Nullable OooO00o oooO00o, @Nullable Surface surface) {
        super(th, oooO00o);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
