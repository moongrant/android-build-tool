package p045Oooooo;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class Oooo000 implements Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ByteBuffer f1846OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000Oo0.OooO00o<Void> f1847OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final MediaCodec.BufferInfo f1848OooO0o0;

    public Oooo000(@NonNull o0OoOo0 o0oooo1) {
        MediaCodec.BufferInfo bufferInfo = o0oooo1.f1989OooO0o0;
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.f1848OooO0o0 = bufferInfo2;
        ByteBuffer byteBufferOooO0o = o0oooo1.OooO0o();
        MediaCodec.BufferInfo bufferInfo3 = o0oooo1.f1989OooO0o0;
        byteBufferOooO0o.position(bufferInfo3.offset);
        byteBufferOooO0o.limit(bufferInfo3.offset + bufferInfo3.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfo3.size);
        byteBufferAllocate.order(byteBufferOooO0o.order());
        byteBufferAllocate.put(byteBufferOooO0o);
        byteBufferAllocate.flip();
        this.f1846OooO0Oo = byteBufferAllocate;
        AtomicReference atomicReference = new AtomicReference();
        o000Oo0.OooO00o(new OooOo(atomicReference));
        o000Oo0.OooO00o<Void> oooO00o = (o000Oo0.OooO00o) atomicReference.get();
        oooO00o.getClass();
        this.f1847OooO0o = oooO00o;
    }

    @Override // p045Oooooo.Oooo0
    @NonNull
    public final ByteBuffer OooO0o() {
        return this.f1846OooO0Oo;
    }

    @Override // p045Oooooo.Oooo0
    @NonNull
    public final MediaCodec.BufferInfo OooOoo() {
        return this.f1848OooO0o0;
    }

    @Override // p045Oooooo.Oooo0
    public final long OoooO() {
        return this.f1848OooO0o0.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f1847OooO0o.OooO0O0(null);
    }

    @Override // p045Oooooo.Oooo0
    public final long size() {
        return this.f1848OooO0o0.size;
    }
}
