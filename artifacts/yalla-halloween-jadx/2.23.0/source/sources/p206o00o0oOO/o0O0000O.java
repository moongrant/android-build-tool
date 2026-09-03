package p206o00o0oOO;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import p206o00o0oOO.o0O00000;
import p230o00oOoO0.o0000O;
import p230o00oOoO0.o0000OO0;
import p230o00oOoO0.o000O00;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o0O0000O<I extends DecoderInputBuffer, O extends o0O00000, E extends DecoderException> implements o0O0o<I, O, E> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public I f39412OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f39413OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f39414OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque<I> f39415OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque<O> f39416OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final O[] f39417OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final I[] f39418OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f39419OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f39420OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public SubtitleDecoderException f39421OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f39422OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f39423OooOO0o;

    public class OooO00o extends Thread {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0000O f39424OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000OO0 o0000oo1) {
            super("ExoPlayer:SimpleDecoder");
            this.f39424OooO0Oo = o0000oo1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            o0O0000O o0o0000o2 = this.f39424OooO0Oo;
            o0o0000o2.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (o0o0000o2.OooO0o());
        }
    }

    public o0O0000O(I[] iArr, O[] oArr) {
        this.f39418OooO0o0 = iArr;
        this.f39419OooO0oO = iArr.length;
        for (int i = 0; i < this.f39419OooO0oO; i++) {
            this.f39418OooO0o0[i] = new o000O00();
        }
        this.f39417OooO0o = oArr;
        this.f39420OooO0oo = oArr.length;
        for (int i2 = 0; i2 < this.f39420OooO0oo; i2++) {
            this.f39417OooO0o[i2] = new o0000O((o0000OO0) this);
        }
        OooO00o oooO00o = new OooO00o((o0000OO0) this);
        this.f39413OooO00o = oooO00o;
        oooO00o.start();
    }

    @Override // p206o00o0oOO.o0O0o
    public final void OooO0O0(o000O00 o000o01) throws DecoderException {
        synchronized (this.f39414OooO0O0) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f39421OooOO0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                boolean z = true;
                o00O000o.OooO00o(o000o01 == this.f39412OooO);
                this.f39415OooO0OO.addLast(o000o01);
                if (this.f39415OooO0OO.isEmpty() || this.f39420OooO0oo <= 0) {
                    z = false;
                }
                if (z) {
                    this.f39414OooO0O0.notify();
                }
                this.f39412OooO = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p206o00o0oOO.o0O0o
    @Nullable
    public final Object OooO0OO() throws DecoderException {
        synchronized (this.f39414OooO0O0) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f39421OooOO0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                if (this.f39416OooO0Oo.isEmpty()) {
                    return null;
                }
                return this.f39416OooO0Oo.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p206o00o0oOO.o0O0o
    @Nullable
    public final Object OooO0Oo() throws DecoderException {
        I i;
        synchronized (this.f39414OooO0O0) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f39421OooOO0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                o00O000o.OooO0Oo(this.f39412OooO == null);
                int i2 = this.f39419OooO0oO;
                if (i2 == 0) {
                    i = null;
                } else {
                    I[] iArr = this.f39418OooO0o0;
                    int i3 = i2 - 1;
                    this.f39419OooO0oO = i3;
                    i = iArr[i3];
                }
                this.f39412OooO = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final boolean OooO0o() throws InterruptedException {
        SubtitleDecoderException subtitleDecoderException;
        SubtitleDecoderException subtitleDecoderExceptionOooO0o0;
        synchronized (this.f39414OooO0O0) {
            while (!this.f39423OooOO0o) {
                try {
                    if (!this.f39415OooO0OO.isEmpty() && this.f39420OooO0oo > 0) {
                        break;
                    }
                    this.f39414OooO0O0.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f39423OooOO0o) {
                return false;
            }
            I iRemoveFirst = this.f39415OooO0OO.removeFirst();
            O[] oArr = this.f39417OooO0o;
            int i = this.f39420OooO0oo - 1;
            this.f39420OooO0oo = i;
            O o = oArr[i];
            boolean z = this.f39422OooOO0O;
            this.f39422OooOO0O = false;
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
                    synchronized (this.f39414OooO0O0) {
                        this.f39421OooOO0 = subtitleDecoderExceptionOooO0o0;
                    }
                    return false;
                }
            }
            synchronized (this.f39414OooO0O0) {
                if (this.f39422OooOO0O || o.OooO0oO()) {
                    o.OooO0oo();
                } else {
                    this.f39416OooO0Oo.addLast(o);
                }
                iRemoveFirst.OooO0oo();
                int i2 = this.f39419OooO0oO;
                this.f39419OooO0oO = i2 + 1;
                this.f39418OooO0o0[i2] = iRemoveFirst;
            }
            return true;
        }
    }

    @Nullable
    public abstract SubtitleDecoderException OooO0o0(DecoderInputBuffer decoderInputBuffer, o0O00000 o0o00000, boolean z);

    @Override // p206o00o0oOO.o0O0o
    public final void flush() {
        synchronized (this.f39414OooO0O0) {
            this.f39422OooOO0O = true;
            I i = this.f39412OooO;
            if (i != null) {
                i.OooO0oo();
                int i2 = this.f39419OooO0oO;
                this.f39419OooO0oO = i2 + 1;
                this.f39418OooO0o0[i2] = i;
                this.f39412OooO = null;
            }
            while (!this.f39415OooO0OO.isEmpty()) {
                I iRemoveFirst = this.f39415OooO0OO.removeFirst();
                iRemoveFirst.OooO0oo();
                int i3 = this.f39419OooO0oO;
                this.f39419OooO0oO = i3 + 1;
                this.f39418OooO0o0[i3] = iRemoveFirst;
            }
            while (!this.f39416OooO0Oo.isEmpty()) {
                this.f39416OooO0Oo.removeFirst().OooO0oo();
            }
        }
    }

    @Override // p206o00o0oOO.o0O0o
    @CallSuper
    public final void release() {
        synchronized (this.f39414OooO0O0) {
            this.f39423OooOO0o = true;
            this.f39414OooO0O0.notify();
        }
        try {
            this.f39413OooO00o.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
