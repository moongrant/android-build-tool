package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p294o0O0Oo0o.o0OO00O;
import p294o0O0Oo0o.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public class DecoderInputBuffer extends o0Oo0oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f13640Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public ByteBuffer f13642Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f13643Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f13644OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public ByteBuffer f13645OoooO00;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0OO00O f13641Oooo0o = new o0OO00O();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f13646OoooO0O = 0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public DecoderInputBuffer(int i) {
        this.f13644OoooO0 = i;
    }

    public final boolean OooO() {
        return getFlag(1073741824);
    }

    public final ByteBuffer OooO0o(int i) {
        int i2 = this.f13644OoooO0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f13642Oooo0oO;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(iCapacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @EnsuresNonNull({"data"})
    public final void OooO0oO(int i) {
        int i2 = i + this.f13646OoooO0O;
        ByteBuffer byteBuffer = this.f13642Oooo0oO;
        if (byteBuffer == null) {
            this.f13642Oooo0oO = OooO0o(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f13642Oooo0oO = byteBuffer;
            return;
        }
        ByteBuffer byteBufferOooO0o = OooO0o(i3);
        byteBufferOooO0o.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferOooO0o.put(byteBuffer);
        }
        this.f13642Oooo0oO = byteBufferOooO0o;
    }

    public final void OooO0oo() {
        ByteBuffer byteBuffer = this.f13642Oooo0oO;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f13645OoooO00;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // p294o0O0Oo0o.o0Oo0oo
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f13642Oooo0oO;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f13645OoooO00;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f13643Oooo0oo = false;
    }
}
