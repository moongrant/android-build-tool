package p550o0oOOo;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(23)
@Deprecated
public final class o0OO000 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaFormat f55922OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HandlerThread f55924OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Handler f55925OooO0OO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaFormat f55930OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaCodec.CodecException f55931OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("lock")
    public long f55932OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public boolean f55933OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public IllegalStateException f55934OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f55923OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("lock")
    public final oo0ooO f55926OooO0Oo = new oo0ooO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("lock")
    public final oo0ooO f55928OooO0o0 = new oo0ooO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayDeque<MediaCodec.BufferInfo> f55927OooO0o = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayDeque<MediaFormat> f55929OooO0oO = new ArrayDeque<>();

    public o0OO000(HandlerThread handlerThread) {
        this.f55924OooO0O0 = handlerThread;
    }

    @GuardedBy("lock")
    public final void OooO00o() {
        ArrayDeque<MediaFormat> arrayDeque = this.f55929OooO0oO;
        if (!arrayDeque.isEmpty()) {
            this.f55922OooO = arrayDeque.getLast();
        }
        oo0ooO oo0ooo = this.f55926OooO0Oo;
        oo0ooo.f55946OooO00o = 0;
        oo0ooo.f55947OooO0O0 = -1;
        oo0ooo.f55948OooO0OO = 0;
        oo0ooO oo0ooo2 = this.f55928OooO0o0;
        oo0ooo2.f55946OooO00o = 0;
        oo0ooo2.f55947OooO0O0 = -1;
        oo0ooo2.f55948OooO0OO = 0;
        this.f55927OooO0o.clear();
        arrayDeque.clear();
    }

    public final void OooO0O0(IllegalStateException illegalStateException) {
        synchronized (this.f55923OooO00o) {
            this.f55934OooOOO0 = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f55923OooO00o) {
            this.f55931OooOO0 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f55923OooO00o) {
            this.f55926OooO0Oo.OooO00o(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f55923OooO00o) {
            MediaFormat mediaFormat = this.f55922OooO;
            if (mediaFormat != null) {
                this.f55928OooO0o0.OooO00o(-2);
                this.f55929OooO0oO.add(mediaFormat);
                this.f55922OooO = null;
            }
            this.f55928OooO0o0.OooO00o(i);
            this.f55927OooO0o.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f55923OooO00o) {
            this.f55928OooO0o0.OooO00o(-2);
            this.f55929OooO0oO.add(mediaFormat);
            this.f55922OooO = null;
        }
    }
}
