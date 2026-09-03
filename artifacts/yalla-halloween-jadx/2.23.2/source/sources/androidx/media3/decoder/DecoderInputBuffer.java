package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import o000O00.OooO;
import o000O00.OooO00o;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p046Oooooo0.o0O00o0;
import p069o0000ooO.o0000;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DecoderInputBuffer extends OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public ByteBuffer f7083OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ByteBuffer f7084OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f7086OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f7087OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f7088OooOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO f7085OooO0o0 = new OooO();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f7089OooOO0O = 0;

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
        o0000.OooO00o("media3.decoder");
    }

    public DecoderInputBuffer(int i) {
        this.f7088OooOO0 = i;
    }

    public final ByteBuffer OooO(int i) {
        int i2 = this.f7088OooOO0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f7084OooO0o;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public void OooO0oo() {
        this.f33931OooO0Oo = 0;
        ByteBuffer byteBuffer = this.f7084OooO0o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f7083OooO;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f7086OooO0oO = false;
    }

    @EnsuresNonNull({"data"})
    public final void OooOO0(int i) {
        int i2 = i + this.f7089OooOO0O;
        ByteBuffer byteBuffer = this.f7084OooO0o;
        if (byteBuffer == null) {
            this.f7084OooO0o = OooO(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f7084OooO0o = byteBuffer;
            return;
        }
        ByteBuffer byteBufferOooO = OooO(i3);
        byteBufferOooO.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferOooO.put(byteBuffer);
        }
        this.f7084OooO0o = byteBufferOooO;
    }

    public final void OooOO0O() {
        ByteBuffer byteBuffer = this.f7084OooO0o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f7083OooO;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
