package p294o0O0Oo0o;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.Objects;
import p294o0O0Oo0o.o000OOo;
import p318o0O0oOo.o00000O0;
import p324o0O0oo0O.o0000;
import p324o0O0oo0O.o00000OO;
import p324o0O0oo0O.o0000O0O;
import p324o0O0oo0O.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000000<I extends DecoderInputBuffer, O extends o000OOo, E extends DecoderException> implements oo0o0Oo<I, O, E> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public I f35822OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f35823OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f35824OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque<I> f35825OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque<O> f35826OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final O[] f35827OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final I[] f35828OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f35829OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f35830OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public E f35831OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f35832OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f35833OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f35834OooOOO0;

    public class OooO00o extends Thread {
        public OooO00o() {
            super("ExoPlayer:SimpleDecoder");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            o000000 o000000Var = o000000.this;
            Objects.requireNonNull(o000000Var);
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (o000000Var.OooO0o());
        }
    }

    public o000000(I[] iArr, O[] oArr) {
        this.f35828OooO0o0 = iArr;
        this.f35829OooO0oO = iArr.length;
        for (int i = 0; i < this.f35829OooO0oO; i++) {
            this.f35828OooO0o0[i] = new o0000O0O();
        }
        this.f35827OooO0o = oArr;
        this.f35830OooO0oo = oArr.length;
        for (int i2 = 0; i2 < this.f35830OooO0oo; i2++) {
            this.f35827OooO0o[i2] = new o0000(new o00000OO((o0000Ooo) this));
        }
        OooO00o oooO00o = new OooO00o();
        this.f35823OooO00o = oooO00o;
        oooO00o.start();
    }

    public final void OooO(I i) {
        i.clear();
        I[] iArr = this.f35828OooO0o0;
        int i2 = this.f35829OooO0oO;
        this.f35829OooO0oO = i2 + 1;
        iArr[i2] = i;
    }

    @Override // p294o0O0Oo0o.oo0o0Oo
    @Nullable
    public final Object OooO0O0() throws DecoderException {
        O oRemoveFirst;
        synchronized (this.f35824OooO0O0) {
            OooO0oo();
            oRemoveFirst = this.f35826OooO0Oo.isEmpty() ? null : this.f35826OooO0Oo.removeFirst();
        }
        return oRemoveFirst;
    }

    @Override // p294o0O0Oo0o.oo0o0Oo
    @Nullable
    public final Object OooO0OO() throws DecoderException {
        I i;
        synchronized (this.f35824OooO0O0) {
            OooO0oo();
            o00000O0.OooO0Oo(this.f35822OooO == null);
            int i2 = this.f35829OooO0oO;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f35828OooO0o0;
                int i3 = i2 - 1;
                this.f35829OooO0oO = i3;
                i = iArr[i3];
            }
            this.f35822OooO = i;
        }
        return i;
    }

    @Override // p294o0O0Oo0o.oo0o0Oo
    public final void OooO0Oo(Object obj) throws DecoderException {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) obj;
        synchronized (this.f35824OooO0O0) {
            OooO0oo();
            o00000O0.OooO00o(decoderInputBuffer == this.f35822OooO);
            this.f35825OooO0OO.addLast((I) decoderInputBuffer);
            OooO0oO();
            this.f35822OooO = null;
        }
    }

    public final boolean OooO0o() throws InterruptedException {
        SubtitleDecoderException subtitleDecoderException;
        DecoderException decoderExceptionOooO0o0;
        synchronized (this.f35824OooO0O0) {
            while (!this.f35833OooOO0o) {
                if (!this.f35825OooO0OO.isEmpty() && this.f35830OooO0oo > 0) {
                    break;
                }
                this.f35824OooO0O0.wait();
            }
            if (this.f35833OooOO0o) {
                return false;
            }
            I iRemoveFirst = this.f35825OooO0OO.removeFirst();
            O[] oArr = this.f35827OooO0o;
            int i = this.f35830OooO0oo - 1;
            this.f35830OooO0oo = i;
            O o2 = oArr[i];
            boolean z = this.f35832OooOO0O;
            this.f35832OooOO0O = false;
            if (iRemoveFirst.isEndOfStream()) {
                o2.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o2.addFlag(Integer.MIN_VALUE);
                }
                try {
                    decoderExceptionOooO0o0 = OooO0o0(iRemoveFirst, o2, z);
                } catch (OutOfMemoryError e) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e);
                    decoderExceptionOooO0o0 = subtitleDecoderException;
                } catch (RuntimeException e2) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e2);
                    decoderExceptionOooO0o0 = subtitleDecoderException;
                }
                if (decoderExceptionOooO0o0 != null) {
                    synchronized (this.f35824OooO0O0) {
                        this.f35831OooOO0 = (SubtitleDecoderException) decoderExceptionOooO0o0;
                    }
                    return false;
                }
            }
            synchronized (this.f35824OooO0O0) {
                if (this.f35832OooOO0O) {
                    o2.release();
                } else if (o2.isDecodeOnly()) {
                    this.f35834OooOOO0++;
                    o2.release();
                } else {
                    o2.skippedOutputBufferCount = this.f35834OooOOO0;
                    this.f35834OooOOO0 = 0;
                    this.f35826OooO0Oo.addLast(o2);
                }
                OooO(iRemoveFirst);
            }
            return true;
        }
    }

    @Nullable
    public abstract E OooO0o0(I i, O o2, boolean z);

    public final void OooO0oO() {
        if (!this.f35825OooO0OO.isEmpty() && this.f35830OooO0oo > 0) {
            this.f35824OooO0O0.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    public final void OooO0oo() throws E, DecoderException {
        E e = this.f35831OooOO0;
        if (e != null) {
            throw e;
        }
    }

    @Override // p294o0O0Oo0o.oo0o0Oo
    public final void flush() {
        synchronized (this.f35824OooO0O0) {
            this.f35832OooOO0O = true;
            this.f35834OooOOO0 = 0;
            I i = this.f35822OooO;
            if (i != null) {
                OooO(i);
                this.f35822OooO = null;
            }
            while (!this.f35825OooO0OO.isEmpty()) {
                OooO(this.f35825OooO0OO.removeFirst());
            }
            while (!this.f35826OooO0Oo.isEmpty()) {
                this.f35826OooO0Oo.removeFirst().release();
            }
        }
    }

    @Override // p294o0O0Oo0o.oo0o0Oo
    @CallSuper
    public final void release() {
        synchronized (this.f35824OooO0O0) {
            this.f35833OooOO0o = true;
            this.f35824OooO0O0.notify();
        }
        try {
            this.f35823OooO00o.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
