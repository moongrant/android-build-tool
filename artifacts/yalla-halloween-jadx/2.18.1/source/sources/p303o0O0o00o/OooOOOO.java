package p303o0O0o00o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;
import p294o0O0Oo0o.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOOOO {
    void OooO00o(int i, o0OO00O o0oo00o2, long j);

    void OooO0O0(int i, int i2, long j, int i3);

    MediaFormat OooO0OO();

    void OooO0Oo(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto);

    int OooO0o(MediaCodec.BufferInfo bufferInfo);

    int OooO0o0();

    MediaCodec OooO0oO();

    void flush();

    void shutdown();

    void start();
}
