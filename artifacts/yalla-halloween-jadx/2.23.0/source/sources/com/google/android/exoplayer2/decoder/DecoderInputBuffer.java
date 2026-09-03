package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p046Oooooo0.o0O00o0;
import p203o00o0o0o.o00OOO0;
import p206o00o0oOO.o00OOOOo;
import p206o00o0oOO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DecoderInputBuffer extends o00OOOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public ByteBuffer f11673OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ByteBuffer f11674OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f11676OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f11677OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f11678OooOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0oOOo f11675OooO0o0 = new o0oOOo();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f11679OooOO0O = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
        public InsufficientCapacityException(int i, int i2) {
            super(o0O00o0.OooO00o("Buffer too small (", i, " < ", i2, ")"));
        }
    }

    static {
        o00OOO0.OooO00o("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i) {
        this.f11678OooOO0 = i;
    }

    public final ByteBuffer OooO(int i) {
        int i2 = this.f11678OooOO0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f11674OooO0o;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public void OooO0oo() {
        this.f39410OooO0Oo = 0;
        ByteBuffer byteBuffer = this.f11674OooO0o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f11673OooO;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f11676OooO0oO = false;
    }

    @EnsuresNonNull({"data"})
    public final void OooOO0(int i) {
        int i2 = i + this.f11679OooOO0O;
        ByteBuffer byteBuffer = this.f11674OooO0o;
        if (byteBuffer == null) {
            this.f11674OooO0o = OooO(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f11674OooO0o = byteBuffer;
            return;
        }
        ByteBuffer byteBufferOooO = OooO(i3);
        byteBufferOooO.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferOooO.put(byteBuffer);
        }
        this.f11674OooO0o = byteBufferOooO;
    }

    public final void OooOO0O() {
        ByteBuffer byteBuffer = this.f11674OooO0o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f11673OooO;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
