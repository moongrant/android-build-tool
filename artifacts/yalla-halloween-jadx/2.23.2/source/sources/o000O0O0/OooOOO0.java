package o000O0O0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public final class OooOOO0 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaFormat f34211OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HandlerThread f34213OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Handler f34214OooO0OO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaFormat f34219OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaCodec.CodecException f34220OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("lock")
    public long f34221OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public boolean f34222OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public IllegalStateException f34223OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f34212OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("lock")
    public final OooOo00 f34215OooO0Oo = new OooOo00();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("lock")
    public final OooOo00 f34217OooO0o0 = new OooOo00();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayDeque<MediaCodec.BufferInfo> f34216OooO0o = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayDeque<MediaFormat> f34218OooO0oO = new ArrayDeque<>();

    public OooOOO0(HandlerThread handlerThread) {
        this.f34213OooO0O0 = handlerThread;
    }

    @GuardedBy("lock")
    public final void OooO00o() {
        ArrayDeque<MediaFormat> arrayDeque = this.f34218OooO0oO;
        if (!arrayDeque.isEmpty()) {
            this.f34211OooO = arrayDeque.getLast();
        }
        OooOo00 oooOo00 = this.f34215OooO0Oo;
        oooOo00.f34227OooO00o = 0;
        oooOo00.f34228OooO0O0 = -1;
        oooOo00.f34229OooO0OO = 0;
        OooOo00 oooOo01 = this.f34217OooO0o0;
        oooOo01.f34227OooO00o = 0;
        oooOo01.f34228OooO0O0 = -1;
        oooOo01.f34229OooO0OO = 0;
        this.f34216OooO0o.clear();
        arrayDeque.clear();
    }

    public final void OooO0O0(IllegalStateException illegalStateException) {
        synchronized (this.f34212OooO00o) {
            this.f34223OooOOO0 = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f34212OooO00o) {
            this.f34220OooOO0 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f34212OooO00o) {
            this.f34215OooO0Oo.OooO00o(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f34212OooO00o) {
            MediaFormat mediaFormat = this.f34211OooO;
            if (mediaFormat != null) {
                this.f34217OooO0o0.OooO00o(-2);
                this.f34218OooO0oO.add(mediaFormat);
                this.f34211OooO = null;
            }
            this.f34217OooO0o0.OooO00o(i);
            this.f34216OooO0o.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f34212OooO00o) {
            this.f34217OooO0o0.OooO00o(-2);
            this.f34218OooO0oO.add(mediaFormat);
            this.f34211OooO = null;
        }
    }
}
