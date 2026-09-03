package p045Oooooo;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class Oooo000 implements Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ByteBuffer f1859OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O000.OooO00o<Void> f1860OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final MediaCodec.BufferInfo f1861OooO0o0;

    public Oooo000(@NonNull o0OoOo0 o0oooo0) {
        MediaCodec.BufferInfo bufferInfo = o0oooo0.f1995OooO0o0;
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.f1861OooO0o0 = bufferInfo2;
        ByteBuffer byteBufferOooO0o = o0oooo0.OooO0o();
        MediaCodec.BufferInfo bufferInfo3 = o0oooo0.f1995OooO0o0;
        byteBufferOooO0o.position(bufferInfo3.offset);
        byteBufferOooO0o.limit(bufferInfo3.offset + bufferInfo3.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfo3.size);
        byteBufferAllocate.order(byteBufferOooO0o.order());
        byteBufferAllocate.put(byteBufferOooO0o);
        byteBufferAllocate.flip();
        this.f1859OooO0Oo = byteBufferAllocate;
        final AtomicReference atomicReference = new AtomicReference();
        o00O000.OooO00o(new o00O000.OooO0OO() { // from class: Oooooo.OooOo
            @Override // o0ooOO0.o00O000.OooO0OO
            public final Object OooO0o0(o00O000.OooO00o oooO00o) {
                atomicReference.set(oooO00o);
                return "Data closed";
            }
        });
        o00O000.OooO00o<Void> oooO00o = (o00O000.OooO00o) atomicReference.get();
        oooO00o.getClass();
        this.f1860OooO0o = oooO00o;
    }

    @Override // p045Oooooo.Oooo0
    @NonNull
    public final ByteBuffer OooO0o() {
        return this.f1859OooO0Oo;
    }

    @Override // p045Oooooo.Oooo0
    @NonNull
    public final MediaCodec.BufferInfo OooOoOO() {
        return this.f1861OooO0o0;
    }

    @Override // p045Oooooo.Oooo0
    public final long OoooO0O() {
        return this.f1861OooO0o0.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f1860OooO0o.OooO0O0(null);
    }

    @Override // p045Oooooo.Oooo0
    public final long size() {
        return this.f1861OooO0o0.size;
    }
}
