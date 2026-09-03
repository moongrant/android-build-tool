package p045Oooooo;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OoOo0 implements Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000Oo0.OooO00o<Void> f1986OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MediaCodec f1987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1988OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final MediaCodec.BufferInfo f1989OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ByteBuffer f1990OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000Oo0.OooO0o f1991OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final AtomicBoolean f1992OooOO0 = new AtomicBoolean(false);

    public o0OoOo0(@NonNull MediaCodec mediaCodec, int i, @NonNull MediaCodec.BufferInfo bufferInfo) throws MediaCodec.CodecException {
        mediaCodec.getClass();
        this.f1987OooO0Oo = mediaCodec;
        this.f1988OooO0o = i;
        this.f1990OooO0oO = mediaCodec.getOutputBuffer(i);
        this.f1989OooO0o0 = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f1991OooO0oo = o000Oo0.OooO00o(new o000oOoO(atomicReference));
        o000Oo0.OooO00o<Void> oooO00o = (o000Oo0.OooO00o) atomicReference.get();
        oooO00o.getClass();
        this.f1986OooO = oooO00o;
    }

    public final boolean OooO00o() {
        return (this.f1989OooO0o0.flags & 1) != 0;
    }

    @Override // p045Oooooo.Oooo0
    @NonNull
    public final ByteBuffer OooO0o() {
        if (this.f1992OooOO0.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f1989OooO0o0;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f1990OooO0oO;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // p045Oooooo.Oooo0
    @NonNull
    public final MediaCodec.BufferInfo OooOoo() {
        return this.f1989OooO0o0;
    }

    @Override // p045Oooooo.Oooo0
    public final long OoooO() {
        return this.f1989OooO0o0.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        o000Oo0.OooO00o<Void> oooO00o = this.f1986OooO;
        if (this.f1992OooOO0.getAndSet(true)) {
            return;
        }
        try {
            this.f1987OooO0Oo.releaseOutputBuffer(this.f1988OooO0o, false);
            oooO00o.OooO0O0(null);
        } catch (IllegalStateException e) {
            oooO00o.OooO0OO(e);
        }
    }

    @Override // p045Oooooo.Oooo0
    public final long size() {
        return this.f1989OooO0o0.size;
    }
}
