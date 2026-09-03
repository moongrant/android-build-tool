package p303o0O0o00o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;
import p294o0O0Oo0o.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f36242OooO00o;

    public o000oOoO(MediaCodec mediaCodec) {
        this.f36242OooO00o = mediaCodec;
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void OooO00o(int i, o0OO00O o0oo00o2, long j) {
        this.f36242OooO00o.queueSecureInputBuffer(i, 0, o0oo00o2.f35837OooO, j, 0);
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void OooO0O0(int i, int i2, long j, int i3) {
        this.f36242OooO00o.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p303o0O0o00o.OooOOOO
    public final MediaFormat OooO0OO() {
        return this.f36242OooO00o.getOutputFormat();
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void OooO0Oo(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        this.f36242OooO00o.configure(mediaFormat, surface, mediaCrypto, 0);
    }

    @Override // p303o0O0o00o.OooOOOO
    public final int OooO0o(MediaCodec.BufferInfo bufferInfo) {
        return this.f36242OooO00o.dequeueOutputBuffer(bufferInfo, 0L);
    }

    @Override // p303o0O0o00o.OooOOOO
    public final int OooO0o0() {
        return this.f36242OooO00o.dequeueInputBuffer(0L);
    }

    @Override // p303o0O0o00o.OooOOOO
    public final MediaCodec OooO0oO() {
        return this.f36242OooO00o;
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void flush() {
        this.f36242OooO00o.flush();
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void shutdown() {
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void start() {
        this.f36242OooO00o.start();
    }
}
