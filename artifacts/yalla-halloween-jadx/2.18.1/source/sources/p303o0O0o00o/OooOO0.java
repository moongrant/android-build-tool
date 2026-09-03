package p303o0O0o00o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import p294o0O0Oo0o.o0OO00O;
import p318o0O0oOo.o0000O00;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public final class OooOO0 extends MediaCodec.Callback implements OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public IllegalStateException f36200OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f36201OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("lock")
    public final OooOo00 f36202OooO0O0 = new OooOo00();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MediaCodec f36203OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HandlerThread f36204OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public long f36205OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Handler f36206OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f36207OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo f36208OooO0oo;

    @VisibleForTesting
    public OooOO0(MediaCodec mediaCodec, boolean z, int i, HandlerThread handlerThread) {
        this.f36203OooO0OO = mediaCodec;
        this.f36204OooO0Oo = handlerThread;
        this.f36208OooO0oo = z ? new OooOO0O(mediaCodec, i) : new o0OoOo0(mediaCodec);
        this.f36207OooO0oO = 0;
    }

    public static String OooO0oo(int i) {
        StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void OooO00o(int i, o0OO00O o0oo00o2, long j) {
        this.f36208OooO0oo.OooO00o(i, o0oo00o2, j);
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void OooO0O0(int i, int i2, long j, int i3) {
        this.f36208OooO0oo.OooO0O0(i, i2, j, i3);
    }

    @Override // p303o0O0o00o.OooOOOO
    public final MediaFormat OooO0OO() {
        MediaFormat mediaFormat;
        synchronized (this.f36201OooO00o) {
            mediaFormat = this.f36202OooO0O0.f36238OooO0o0;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void OooO0Oo(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        this.f36204OooO0Oo.start();
        Handler handler = new Handler(this.f36204OooO0Oo.getLooper());
        this.f36206OooO0o0 = handler;
        this.f36203OooO0OO.setCallback(this, handler);
        this.f36203OooO0OO.configure(mediaFormat, surface, mediaCrypto, 0);
        this.f36207OooO0oO = 1;
    }

    @Override // p303o0O0o00o.OooOOOO
    public final int OooO0o(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f36201OooO00o) {
            if (this.f36205OooO0o > 0) {
                return -1;
            }
            IllegalStateException illegalStateException = this.f36200OooO;
            if (illegalStateException != null) {
                this.f36200OooO = null;
                throw illegalStateException;
            }
            OooOo00 oooOo00 = this.f36202OooO0O0;
            IllegalStateException illegalStateException2 = oooOo00.f36239OooO0oO;
            oooOo00.f36239OooO0oO = null;
            if (illegalStateException2 == null) {
                return oooOo00.OooO00o(bufferInfo);
            }
            throw illegalStateException2;
        }
    }

    @Override // p303o0O0o00o.OooOOOO
    public final int OooO0o0() {
        synchronized (this.f36201OooO00o) {
            boolean z = true;
            int iOooO0O0 = -1;
            if (this.f36205OooO0o > 0) {
                return -1;
            }
            IllegalStateException illegalStateException = this.f36200OooO;
            if (illegalStateException != null) {
                this.f36200OooO = null;
                throw illegalStateException;
            }
            OooOo00 oooOo00 = this.f36202OooO0O0;
            IllegalStateException illegalStateException2 = oooOo00.f36239OooO0oO;
            oooOo00.f36239OooO0oO = null;
            if (illegalStateException2 != null) {
                throw illegalStateException2;
            }
            o0000O00 o0000o00 = oooOo00.f36233OooO00o;
            if (o0000o00.f36697OooO0OO != 0) {
                z = false;
            }
            if (!z) {
                iOooO0O0 = o0000o00.OooO0O0();
            }
            return iOooO0O0;
        }
    }

    @Override // p303o0O0o00o.OooOOOO
    public final MediaCodec OooO0oO() {
        return this.f36203OooO0OO;
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void flush() {
        synchronized (this.f36201OooO00o) {
            this.f36208OooO0oo.flush();
            this.f36203OooO0OO.flush();
            this.f36205OooO0o++;
            Handler handler = this.f36206OooO0o0;
            int i = o000OOo0.f36740OooO00o;
            handler.post(new OooO(this, 0));
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f36201OooO00o) {
            this.f36202OooO0O0.f36239OooO0oO = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f36201OooO00o) {
            this.f36202OooO0O0.onInputBufferAvailable(mediaCodec, i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f36201OooO00o) {
            this.f36202OooO0O0.onOutputBufferAvailable(mediaCodec, i, bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f36201OooO00o) {
            this.f36202OooO0O0.onOutputFormatChanged(mediaCodec, mediaFormat);
        }
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void shutdown() {
        synchronized (this.f36201OooO00o) {
            if (this.f36207OooO0oO == 2) {
                this.f36208OooO0oo.shutdown();
            }
            int i = this.f36207OooO0oO;
            if (i == 1 || i == 2) {
                this.f36204OooO0Oo.quit();
                this.f36202OooO0O0.OooO0O0();
                this.f36205OooO0o++;
            }
            this.f36207OooO0oO = 3;
        }
    }

    @Override // p303o0O0o00o.OooOOOO
    public final void start() {
        this.f36208OooO0oo.start();
        this.f36203OooO0OO.start();
        this.f36207OooO0oO = 2;
    }
}
