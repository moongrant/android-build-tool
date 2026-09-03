package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.extractor.Extractor;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p310o0O0o0oo.o000O0;
import p310o0O0o0oo.o00O0OO0;
import p310o0O0o0oo.o00O0OOO;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Loader {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0O0 f14819OooO0Oo = new OooO0O0(2, -9223372036854775807L);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0 f14820OooO0o0 = new OooO0O0(3, -9223372036854775807L);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f14821OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO0OO<? extends OooO0o> f14822OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public IOException f14823OooO0OO;

    public interface OooO {
    }

    public interface OooO00o<T extends OooO0o> {
        void OooO0o0(T t, long j, long j2, boolean z);

        void OooO0oO(T t, long j, long j2);

        OooO0O0 OooOOOo(T t, long j, long j2, IOException iOException, int i);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14824OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f14825OooO0O0;

        public OooO0O0(int i, long j) {
            this.f14824OooO00o = i;
            this.f14825OooO0O0 = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class OooO0OO<T extends OooO0o> extends Handler implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @Nullable
        public OooO00o<T> f14826Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f14827Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final T f14828Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final long f14829Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public boolean f14830OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f14831OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @Nullable
        public IOException f14832OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @Nullable
        public Thread f14833OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public volatile boolean f14834OoooOO0;

        public OooO0OO(Looper looper, T t, OooO00o<T> oooO00o, int i, long j) {
            super(looper);
            this.f14828Oooo0oO = t;
            this.f14826Oooo = oooO00o;
            this.f14827Oooo0o = i;
            this.f14829Oooo0oo = j;
        }

        public final void OooO00o(boolean z) {
            this.f14834OoooOO0 = z;
            this.f14832OoooO00 = null;
            if (hasMessages(0)) {
                this.f14830OoooO = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f14830OoooO = true;
                    ((o00O0OO0.OooO00o) this.f14828Oooo0oO).f36415OooO0oo = true;
                    Thread thread = this.f14833OoooO0O;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.f14822OooO0O0 = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                OooO00o<T> oooO00o = this.f14826Oooo;
                Objects.requireNonNull(oooO00o);
                oooO00o.OooO0o0(this.f14828Oooo0oO, jElapsedRealtime, jElapsedRealtime - this.f14829Oooo0oo, true);
                this.f14826Oooo = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0O0(long j) {
            o00000O0.OooO0Oo(Loader.this.f14822OooO0O0 == null);
            Loader loader = Loader.this;
            loader.f14822OooO0O0 = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f14832OoooO00 = null;
            ExecutorService executorService = loader.f14821OooO00o;
            Objects.requireNonNull(this);
            executorService.execute(this);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f14834OoooOO0) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f14832OoooO00 = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f14821OooO00o;
                OooO0OO<? extends OooO0o> oooO0OO = loader.f14822OooO0O0;
                Objects.requireNonNull(oooO0OO);
                executorService.execute(oooO0OO);
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f14822OooO0O0 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f14829Oooo0oo;
            OooO00o<T> oooO00o = this.f14826Oooo;
            Objects.requireNonNull(oooO00o);
            if (this.f14830OoooO) {
                oooO00o.OooO0o0(this.f14828Oooo0oO, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    oooO00o.OooO0oO(this.f14828Oooo0oO, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    o0000oo.OooO0O0("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.f14823OooO0OO = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f14832OoooO00 = iOException;
            int i3 = this.f14831OoooO0 + 1;
            this.f14831OoooO0 = i3;
            OooO0O0 oooO0O0OooOOOo = oooO00o.OooOOOo(this.f14828Oooo0oO, jElapsedRealtime, j, iOException, i3);
            int i4 = oooO0O0OooOOOo.f14824OooO00o;
            if (i4 == 3) {
                Loader.this.f14823OooO0OO = this.f14832OoooO00;
            } else if (i4 != 2) {
                if (i4 == 1) {
                    this.f14831OoooO0 = 1;
                }
                long jMin = oooO0O0OooOOOo.f14825OooO0O0;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f14831OoooO0 - 1) * 1000, 5000);
                }
                OooO0O0(jMin);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f14830OoooO;
                    this.f14833OoooO0O = Thread.currentThread();
                }
                if (z) {
                    String simpleName = this.f14828Oooo0oO.getClass().getSimpleName();
                    o000O.OooO00o(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        ((o00O0OO0.OooO00o) this.f14828Oooo0oO).OooO0O0();
                        o000O.OooO0O0();
                    } catch (Throwable th) {
                        o000O.OooO0O0();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f14833OoooO0O = null;
                    Thread.interrupted();
                }
                if (this.f14834OoooOO0) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f14834OoooOO0) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (OutOfMemoryError e2) {
                o0000oo.OooO0O0("LoadTask", "OutOfMemory error loading stream", e2);
                if (this.f14834OoooOO0) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (Error e3) {
                o0000oo.OooO0O0("LoadTask", "Unexpected error loading stream", e3);
                if (!this.f14834OoooOO0) {
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                o0000oo.OooO0O0("LoadTask", "Unexpected exception loading stream", e4);
                if (this.f14834OoooOO0) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            }
        }
    }

    public interface OooO0o {
    }

    public static final class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final OooO f14836Oooo0o;

        public OooOO0(OooO oooO) {
            this.f14836Oooo0o = oooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00O0OO0 o00o0oo1 = (o00O0OO0) this.f14836Oooo0o;
            for (o00O0OOO o00o0ooo2 : o00o0oo1.f36382OooooOO) {
                o00o0ooo2.OooOOOO(true);
                DrmSession drmSession = o00o0ooo2.f36434OooO0oo;
                if (drmSession != null) {
                    drmSession.OooO0O0(o00o0ooo2.f36432OooO0o0);
                    o00o0ooo2.f36434OooO0oo = null;
                    o00o0ooo2.f36433OooO0oO = null;
                }
            }
            o000O0 o000o0 = o00o0oo1.f36375OoooOOo;
            Extractor extractor = o000o0.f36266OooO0O0;
            if (extractor != null) {
                extractor.release();
                o000o0.f36266OooO0O0 = null;
            }
            o000o0.f36267OooO0OO = null;
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String simpleName = th.getClass().getSimpleName();
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(message, simpleName.length() + 13));
            sb.append("Unexpected ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            super(sb.toString(), th);
        }
    }

    public Loader() {
        int i = o000OOo0.f36740OooO00o;
        this.f14821OooO00o = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o0O0oOo.o000OO00

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ String f36734OooO00o = "Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.f36734OooO00o);
            }
        });
    }

    public final boolean OooO00o() {
        return this.f14822OooO0O0 != null;
    }
}
