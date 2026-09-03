package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p244o00oo0Oo.oo00o;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O000;
import p245o00oo0o.o0O000o0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Loader implements oo00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0O0 f14192OooO0Oo = new OooO0O0(2, -9223372036854775807L);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0 f14193OooO0o0 = new OooO0O0(3, -9223372036854775807L);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f14194OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO0OO<? extends OooO0o> f14195OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public IOException f14196OooO0OO;

    public interface OooO {
        void OooOOO0();
    }

    public interface OooO00o<T extends OooO0o> {
        void OooO0Oo(T t, long j, long j2, boolean z);

        void OooO0o(T t, long j, long j2);

        OooO0O0 OooOO0o(T t, long j, long j2, IOException iOException, int i);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14197OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f14198OooO0O0;

        public OooO0O0(int i, long j) {
            this.f14197OooO00o = i;
            this.f14198OooO0O0 = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class OooO0OO<T extends OooO0o> extends Handler implements Runnable {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f14199OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f14200OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f14201OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final T f14202OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public OooO00o<T> f14203OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public IOException f14204OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public Thread f14205OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f14206OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public volatile boolean f14207OooOO0o;

        public OooO0OO(Looper looper, T t, OooO00o<T> oooO00o, int i, long j) {
            super(looper);
            this.f14202OooO0o0 = t;
            this.f14203OooO0oO = oooO00o;
            this.f14200OooO0Oo = i;
            this.f14201OooO0o = j;
        }

        public final void OooO00o(boolean z) {
            this.f14207OooOO0o = z;
            this.f14204OooO0oo = null;
            if (hasMessages(0)) {
                this.f14206OooOO0O = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f14206OooOO0O = true;
                    this.f14202OooO0o0.OooO0O0();
                    Thread thread = this.f14205OooOO0;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.f14195OooO0O0 = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                OooO00o<T> oooO00o = this.f14203OooO0oO;
                oooO00o.getClass();
                oooO00o.OooO0Oo(this.f14202OooO0o0, jElapsedRealtime, jElapsedRealtime - this.f14201OooO0o, true);
                this.f14203OooO0oO = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0O0(long j) {
            Loader loader = Loader.this;
            o00O000o.OooO0Oo(loader.f14195OooO0O0 == null);
            loader.f14195OooO0O0 = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f14204OooO0oo = null;
            ExecutorService executorService = loader.f14194OooO00o;
            OooO0OO<? extends OooO0o> oooO0OO = loader.f14195OooO0O0;
            oooO0OO.getClass();
            executorService.execute(oooO0OO);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f14207OooOO0o) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f14204OooO0oo = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f14194OooO00o;
                OooO0OO<? extends OooO0o> oooO0OO = loader.f14195OooO0O0;
                oooO0OO.getClass();
                executorService.execute(oooO0OO);
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f14195OooO0O0 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f14201OooO0o;
            OooO00o<T> oooO00o = this.f14203OooO0oO;
            oooO00o.getClass();
            if (this.f14206OooOO0O) {
                oooO00o.OooO0Oo(this.f14202OooO0o0, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    oooO00o.OooO0o(this.f14202OooO0o0, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    Log.OooO0Oo("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.f14196OooO0OO = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f14204OooO0oo = iOException;
            int i3 = this.f14199OooO + 1;
            this.f14199OooO = i3;
            OooO0O0 oooO0O0OooOO0o = oooO00o.OooOO0o(this.f14202OooO0o0, jElapsedRealtime, j, iOException, i3);
            int i4 = oooO0O0OooOO0o.f14197OooO00o;
            if (i4 == 3) {
                Loader.this.f14196OooO0OO = this.f14204OooO0oo;
            } else if (i4 != 2) {
                if (i4 == 1) {
                    this.f14199OooO = 1;
                }
                long jMin = oooO0O0OooOO0o.f14198OooO0O0;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f14199OooO - 1) * 1000, 5000);
                }
                OooO0O0(jMin);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f14206OooOO0O;
                    this.f14205OooOO0 = Thread.currentThread();
                }
                if (z) {
                    o0O000.OooO00o("load:".concat(this.f14202OooO0o0.getClass().getSimpleName()));
                    try {
                        this.f14202OooO0o0.OooO00o();
                        o0O000.OooO0O0();
                    } catch (Throwable th) {
                        o0O000.OooO0O0();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f14205OooOO0 = null;
                    Thread.interrupted();
                }
                if (this.f14207OooOO0o) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f14207OooOO0o) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (OutOfMemoryError e2) {
                if (this.f14207OooOO0o) {
                    return;
                }
                Log.OooO0Oo("LoadTask", "OutOfMemory error loading stream", e2);
                obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (Error e3) {
                if (!this.f14207OooOO0o) {
                    Log.OooO0Oo("LoadTask", "Unexpected error loading stream", e3);
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (this.f14207OooOO0o) {
                    return;
                }
                Log.OooO0Oo("LoadTask", "Unexpected exception loading stream", e4);
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            }
        }
    }

    public interface OooO0o {
        void OooO00o() throws IOException;

        void OooO0O0();
    }

    public static final class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO f14209OooO0Oo;

        public OooOO0(OooO oooO) {
            this.f14209OooO0Oo = oooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f14209OooO0Oo.OooOOO0();
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i = o0O00.f40595OooO00o;
        this.f14194OooO00o = Executors.newSingleThreadExecutor(new o0O000o0(strConcat));
    }

    @Override // p244o00oo0Oo.oo00o
    public final void OooO00o() throws IOException {
        IOException iOException;
        IOException iOException2 = this.f14196OooO0OO;
        if (iOException2 != null) {
            throw iOException2;
        }
        OooO0OO<? extends OooO0o> oooO0OO = this.f14195OooO0O0;
        if (oooO0OO != null && (iOException = oooO0OO.f14204OooO0oo) != null && oooO0OO.f14199OooO > oooO0OO.f14200OooO0Oo) {
            throw iOException;
        }
    }

    public final boolean OooO0O0() {
        return this.f14195OooO0O0 != null;
    }

    public final void OooO0OO(@Nullable OooO oooO) {
        OooO0OO<? extends OooO0o> oooO0OO = this.f14195OooO0O0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(true);
        }
        ExecutorService executorService = this.f14194OooO00o;
        if (oooO != null) {
            executorService.execute(new OooOO0(oooO));
        }
        executorService.shutdown();
    }

    public final <T extends OooO0o> long OooO0Oo(T t, OooO00o<T> oooO00o, int i) {
        Looper looperMyLooper = Looper.myLooper();
        o00O000o.OooO0o0(looperMyLooper);
        this.f14196OooO0OO = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new OooO0OO(looperMyLooper, t, oooO00o, i, jElapsedRealtime).OooO0O0(0L);
        return jElapsedRealtime;
    }
}
