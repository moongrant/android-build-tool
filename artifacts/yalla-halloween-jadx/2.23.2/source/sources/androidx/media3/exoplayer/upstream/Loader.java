package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.Oooo0;
import androidx.media3.exoplayer.source.o00O0O;
import androidx.media3.extractor.Extractor;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p080o000OoO.o00;
import p080o000OoO.o000OO0O;
import p080o000OoO.o000OOo0;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Loader {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0O0 f8253OooO0Oo = new OooO0O0(2, -9223372036854775807L);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0 f8254OooO0o0 = new OooO0O0(3, -9223372036854775807L);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f8255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO0OO<? extends OooO0o> f8256OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public IOException f8257OooO0OO;

    public interface OooO {
    }

    public interface OooO00o<T extends OooO0o> {
        OooO0O0 OooO00o(T t, long j, long j2, IOException iOException, int i);

        void OooOOO(T t, long j, long j2);

        void OooOOoo(T t, long j, long j2, boolean z);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8258OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f8259OooO0O0;

        public OooO0O0(int i, long j) {
            this.f8258OooO00o = i;
            this.f8259OooO0O0 = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class OooO0OO<T extends OooO0o> extends Handler implements Runnable {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f8260OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8261OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f8262OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final T f8263OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public OooO00o<T> f8264OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public IOException f8265OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public Thread f8266OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f8267OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public volatile boolean f8268OooOO0o;

        public OooO0OO(Looper looper, T t, OooO00o<T> oooO00o, int i, long j) {
            super(looper);
            this.f8263OooO0o0 = t;
            this.f8264OooO0oO = oooO00o;
            this.f8261OooO0Oo = i;
            this.f8262OooO0o = j;
        }

        public final void OooO00o(boolean z) {
            this.f8268OooOO0o = z;
            this.f8265OooO0oo = null;
            if (hasMessages(0)) {
                this.f8267OooOO0O = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f8267OooOO0O = true;
                    this.f8263OooO0o0.OooO0O0();
                    Thread thread = this.f8266OooOO0;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.f8256OooO0O0 = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                OooO00o<T> oooO00o = this.f8264OooO0oO;
                oooO00o.getClass();
                oooO00o.OooOOoo(this.f8263OooO0o0, jElapsedRealtime, jElapsedRealtime - this.f8262OooO0o, true);
                this.f8264OooO0oO = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0O0(long j) {
            Loader loader = Loader.this;
            o00Oo0.OooO0Oo(loader.f8256OooO0O0 == null);
            loader.f8256OooO0O0 = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f8265OooO0oo = null;
            ExecutorService executorService = loader.f8255OooO00o;
            OooO0OO<? extends OooO0o> oooO0OO = loader.f8256OooO0O0;
            oooO0OO.getClass();
            executorService.execute(oooO0OO);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f8268OooOO0o) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f8265OooO0oo = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f8255OooO00o;
                OooO0OO<? extends OooO0o> oooO0OO = loader.f8256OooO0O0;
                oooO0OO.getClass();
                executorService.execute(oooO0OO);
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f8256OooO0O0 = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f8262OooO0o;
            OooO00o<T> oooO00o = this.f8264OooO0oO;
            oooO00o.getClass();
            if (this.f8267OooOO0O) {
                oooO00o.OooOOoo(this.f8263OooO0o0, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    oooO00o.OooOOO(this.f8263OooO0o0, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    Log.OooO0Oo("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.f8257OooO0OO = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f8265OooO0oo = iOException;
            int i3 = this.f8260OooO + 1;
            this.f8260OooO = i3;
            OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o(this.f8263OooO0o0, jElapsedRealtime, j, iOException, i3);
            int i4 = oooO0O0OooO00o.f8258OooO00o;
            if (i4 == 3) {
                Loader.this.f8257OooO0OO = this.f8265OooO0oo;
            } else if (i4 != 2) {
                if (i4 == 1) {
                    this.f8260OooO = 1;
                }
                long jMin = oooO0O0OooO00o.f8259OooO0O0;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f8260OooO - 1) * 1000, 5000);
                }
                OooO0O0(jMin);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f8267OooOO0O;
                    this.f8266OooOO0 = Thread.currentThread();
                }
                if (z) {
                    o000OO0O.OooO00o("load:".concat(this.f8263OooO0o0.getClass().getSimpleName()));
                    try {
                        this.f8263OooO0o0.OooO00o();
                        o000OO0O.OooO0O0();
                    } catch (Throwable th) {
                        o000OO0O.OooO0O0();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f8266OooOO0 = null;
                    Thread.interrupted();
                }
                if (this.f8268OooOO0o) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f8268OooOO0o) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (OutOfMemoryError e2) {
                if (this.f8268OooOO0o) {
                    return;
                }
                Log.OooO0Oo("LoadTask", "OutOfMemory error loading stream", e2);
                obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (Error e3) {
                if (!this.f8268OooOO0o) {
                    Log.OooO0Oo("LoadTask", "Unexpected error loading stream", e3);
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (this.f8268OooOO0o) {
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
        public final OooO f8270OooO0Oo;

        public OooOO0(OooO oooO) {
            this.f8270OooO0Oo = oooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Oooo0 oooo0 = (Oooo0) this.f8270OooO0Oo;
            for (o00O0O o00o0o2 : oooo0.f7983OooOo0O) {
                o00o0o2.OooOOOo(true);
                DrmSession drmSession = o00o0o2.f8050OooO0oo;
                if (drmSession != null) {
                    drmSession.OooO0o0(o00o0o2.f8048OooO0o0);
                    o00o0o2.f8050OooO0oo = null;
                    o00o0o2.f8049OooO0oO = null;
                }
            }
            o000O.OooO00o oooO00o = (o000O.OooO00o) oooo0.f7975OooOOOO;
            Extractor extractor = oooO00o.f33830OooO0O0;
            if (extractor != null) {
                extractor.release();
                oooO00o.f33830OooO0O0 = null;
            }
            oooO00o.f33831OooO0OO = null;
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i = o00.f34910OooO00o;
        this.f8255OooO00o = Executors.newSingleThreadExecutor(new o000OOo0(strConcat));
    }

    public final boolean OooO00o() {
        return this.f8256OooO0O0 != null;
    }

    public final <T extends OooO0o> long OooO0O0(T t, OooO00o<T> oooO00o, int i) {
        Looper looperMyLooper = Looper.myLooper();
        o00Oo0.OooO0o(looperMyLooper);
        this.f8257OooO0OO = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new OooO0OO(looperMyLooper, t, oooO00o, i, jElapsedRealtime).OooO0O0(0L);
        return jElapsedRealtime;
    }
}
