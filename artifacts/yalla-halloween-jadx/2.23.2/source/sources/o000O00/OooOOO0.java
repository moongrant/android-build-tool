package o000O00;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import o000O00.OooOO0O;
import p080o000OoO.o00Oo0;
import p092o000o0O0.o000OOo;
import p092o000o0O0.o0OOO0o;
import p092o000o0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class OooOOO0<I extends DecoderInputBuffer, O extends OooOO0O, E extends DecoderException> implements OooOO0<I, O, E> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public I f33933OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f33934OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f33935OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque<I> f33936OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque<O> f33937OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final O[] f33938OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final I[] f33939OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f33940OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33941OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public SubtitleDecoderException f33942OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f33943OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f33944OooOO0o;

    public class OooO00o extends Thread {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f33945OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0Oo0oo o0oo0oo2) {
            super("ExoPlayer:SimpleDecoder");
            this.f33945OooO0Oo = o0oo0oo2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            OooOOO0 oooOOO0 = this.f33945OooO0Oo;
            oooOOO0.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (oooOOO0.OooO0o());
        }
    }

    public OooOOO0(I[] iArr, O[] oArr) {
        this.f33939OooO0o0 = iArr;
        this.f33940OooO0oO = iArr.length;
        for (int i = 0; i < this.f33940OooO0oO; i++) {
            this.f33939OooO0o0[i] = new o000OOo();
        }
        this.f33938OooO0o = oArr;
        this.f33941OooO0oo = oArr.length;
        for (int i2 = 0; i2 < this.f33941OooO0oo; i2++) {
            this.f33938OooO0o[i2] = new o0OOO0o((o0Oo0oo) this);
        }
        OooO00o oooO00o = new OooO00o((o0Oo0oo) this);
        this.f33934OooO00o = oooO00o;
        oooO00o.start();
    }

    @Override // o000O00.OooOO0
    @Nullable
    public final Object OooO0O0() throws DecoderException {
        synchronized (this.f33935OooO0O0) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f33942OooOO0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                if (this.f33937OooO0Oo.isEmpty()) {
                    return null;
                }
                return this.f33937OooO0Oo.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o000O00.OooOO0
    public final void OooO0OO(o000OOo o000ooo2) throws DecoderException {
        synchronized (this.f33935OooO0O0) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f33942OooOO0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                boolean z = true;
                o00Oo0.OooO00o(o000ooo2 == this.f33933OooO);
                this.f33936OooO0OO.addLast(o000ooo2);
                if (this.f33936OooO0OO.isEmpty() || this.f33941OooO0oo <= 0) {
                    z = false;
                }
                if (z) {
                    this.f33935OooO0O0.notify();
                }
                this.f33933OooO = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o000O00.OooOO0
    @Nullable
    public final Object OooO0Oo() throws DecoderException {
        I i;
        synchronized (this.f33935OooO0O0) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f33942OooOO0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                o00Oo0.OooO0Oo(this.f33933OooO == null);
                int i2 = this.f33940OooO0oO;
                if (i2 == 0) {
                    i = null;
                } else {
                    I[] iArr = this.f33939OooO0o0;
                    int i3 = i2 - 1;
                    this.f33940OooO0oO = i3;
                    i = iArr[i3];
                }
                this.f33933OooO = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final boolean OooO0o() throws InterruptedException {
        SubtitleDecoderException subtitleDecoderException;
        SubtitleDecoderException subtitleDecoderExceptionOooO0o0;
        synchronized (this.f33935OooO0O0) {
            while (!this.f33944OooOO0o) {
                try {
                    if (!this.f33936OooO0OO.isEmpty() && this.f33941OooO0oo > 0) {
                        break;
                    }
                    this.f33935OooO0O0.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f33944OooOO0o) {
                return false;
            }
            I iRemoveFirst = this.f33936OooO0OO.removeFirst();
            O[] oArr = this.f33938OooO0o;
            int i = this.f33941OooO0oo - 1;
            this.f33941OooO0oo = i;
            O o = oArr[i];
            boolean z = this.f33943OooOO0O;
            this.f33943OooOO0O = false;
            if (iRemoveFirst.OooO0o(4)) {
                o.OooO0o0(4);
            } else {
                if (iRemoveFirst.OooO0oO()) {
                    o.OooO0o0(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.OooO0o(134217728)) {
                    o.OooO0o0(134217728);
                }
                try {
                    subtitleDecoderExceptionOooO0o0 = OooO0o0(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e);
                    subtitleDecoderExceptionOooO0o0 = subtitleDecoderException;
                } catch (RuntimeException e2) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e2);
                    subtitleDecoderExceptionOooO0o0 = subtitleDecoderException;
                }
                if (subtitleDecoderExceptionOooO0o0 != null) {
                    synchronized (this.f33935OooO0O0) {
                        this.f33942OooOO0 = subtitleDecoderExceptionOooO0o0;
                    }
                    return false;
                }
            }
            synchronized (this.f33935OooO0O0) {
                if (this.f33943OooOO0O || o.OooO0oO()) {
                    o.OooO0oo();
                } else {
                    this.f33937OooO0Oo.addLast(o);
                }
                iRemoveFirst.OooO0oo();
                int i2 = this.f33940OooO0oO;
                this.f33940OooO0oO = i2 + 1;
                this.f33939OooO0o0[i2] = iRemoveFirst;
            }
            return true;
        }
    }

    @Nullable
    public abstract SubtitleDecoderException OooO0o0(DecoderInputBuffer decoderInputBuffer, OooOO0O oooOO0O, boolean z);

    @Override // o000O00.OooOO0
    public final void flush() {
        synchronized (this.f33935OooO0O0) {
            this.f33943OooOO0O = true;
            I i = this.f33933OooO;
            if (i != null) {
                i.OooO0oo();
                int i2 = this.f33940OooO0oO;
                this.f33940OooO0oO = i2 + 1;
                this.f33939OooO0o0[i2] = i;
                this.f33933OooO = null;
            }
            while (!this.f33936OooO0OO.isEmpty()) {
                I iRemoveFirst = this.f33936OooO0OO.removeFirst();
                iRemoveFirst.OooO0oo();
                int i3 = this.f33940OooO0oO;
                this.f33940OooO0oO = i3 + 1;
                this.f33939OooO0o0[i3] = iRemoveFirst;
            }
            while (!this.f33937OooO0Oo.isEmpty()) {
                this.f33937OooO0Oo.removeFirst().OooO0oo();
            }
        }
    }

    @Override // o000O00.OooOO0
    @CallSuper
    public final void release() {
        synchronized (this.f33935OooO0O0) {
            this.f33944OooOO0o = true;
            this.f33935OooO0O0.notify();
        }
        try {
            this.f33934OooO00o.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
