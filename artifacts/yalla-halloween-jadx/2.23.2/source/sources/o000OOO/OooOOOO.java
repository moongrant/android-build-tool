package o000OOO;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f34552OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOO.OooO00o f34553OooO00o = new o000OOO.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f34554OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final OooO f34555OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f34556OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f34557OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Surface f34558OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f34559OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f34560OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34561OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f34562OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f34563OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f34564OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f34565OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f34566OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f34567OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f34568OooOOo0;

    public static final class OooO implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO f34569OooO0oo = new OooO();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile long f34570OooO0Oo = -9223372036854775807L;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Choreographer f34571OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Handler f34572OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f34573OooO0oO;

        public OooO() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = o00.f34910OooO00o;
            Handler handler = new Handler(looper, this);
            this.f34572OooO0o0 = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.f34570OooO0Oo = j;
            Choreographer choreographer = this.f34571OooO0o;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.f34571OooO0o = Choreographer.getInstance();
                } catch (RuntimeException e) {
                    Log.OooO0oO("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.f34571OooO0o;
                if (choreographer != null) {
                    int i2 = this.f34573OooO0oO + 1;
                    this.f34573OooO0oO = i2;
                    if (i2 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f34571OooO0o;
            if (choreographer2 != null) {
                int i3 = this.f34573OooO0oO - 1;
                this.f34573OooO0oO = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f34570OooO0Oo = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    @RequiresApi(30)
    public static final class OooO00o {
        @DoNotInline
        public static void OooO00o(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                Log.OooO0Oo("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public interface OooO0O0 {

        public interface OooO00o {
        }

        void OooO00o(OooOOO0 oooOOO0);

        void unregister();
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowManager f34574OooO00o;

        public OooO0OO(WindowManager windowManager) {
            this.f34574OooO00o = windowManager;
        }

        @Override // o000OOO.OooOOOO.OooO0O0
        public final void OooO00o(OooOOO0 oooOOO0) {
            oooOOO0.OooO0O0(this.f34574OooO00o.getDefaultDisplay());
        }

        @Override // o000OOO.OooOOOO.OooO0O0
        public final void unregister() {
        }
    }

    @RequiresApi(17)
    public static final class OooO0o implements OooO0O0, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DisplayManager f34575OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public OooO0O0.OooO00o f34576OooO0O0;

        public OooO0o(DisplayManager displayManager) {
            this.f34575OooO00o = displayManager;
        }

        @Override // o000OOO.OooOOOO.OooO0O0
        public final void OooO00o(OooOOO0 oooOOO0) {
            this.f34576OooO0O0 = oooOOO0;
            Handler handlerOooOO0o = o00.OooOO0o(null);
            DisplayManager displayManager = this.f34575OooO00o;
            displayManager.registerDisplayListener(this, handlerOooOO0o);
            oooOOO0.OooO0O0(displayManager.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            OooO0O0.OooO00o oooO00o = this.f34576OooO0O0;
            if (oooO00o == null || i != 0) {
                return;
            }
            ((OooOOO0) oooO00o).OooO0O0(this.f34575OooO00o.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }

        @Override // o000OOO.OooOOOO.OooO0O0
        public final void unregister() {
            this.f34575OooO00o.unregisterDisplayListener(this);
            this.f34576OooO0O0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    public OooOOOO(@Nullable Context context) {
        OooO0O0 oooO0o;
        DisplayManager displayManager;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            oooO0o = (o00.f34910OooO00o < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new OooO0o(displayManager);
            if (oooO0o == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    oooO0o = new OooO0OO(windowManager);
                } else {
                    oooO0o = null;
                }
            }
        } else {
            oooO0o = null;
        }
        this.f34554OooO0O0 = oooO0o;
        this.f34555OooO0OO = oooO0o != null ? OooO.f34569OooO0oo : null;
        this.f34562OooOO0O = -9223372036854775807L;
        this.f34563OooOO0o = -9223372036854775807L;
        this.f34557OooO0o = -1.0f;
        this.f34552OooO = 1.0f;
        this.f34561OooOO0 = 0;
    }

    public final long OooO00o(long j) {
        long j2;
        long j3;
        long j4;
        if (this.f34567OooOOOo == -1 || !this.f34553OooO00o.OooO00o()) {
            j2 = j;
        } else {
            o000OOO.OooO00o oooO00o = this.f34553OooO00o;
            if (oooO00o.OooO00o()) {
                o000OOO.OooO00o.C0400OooO00o c0400OooO00o = oooO00o.f34538OooO00o;
                long j5 = c0400OooO00o.f34548OooO0o0;
                j4 = j5 == 0 ? 0L : c0400OooO00o.f34547OooO0o / j5;
            } else {
                j4 = -9223372036854775807L;
            }
            j2 = this.f34568OooOOo0 + ((long) (((this.f34565OooOOO0 - this.f34567OooOOOo) * j4) / this.f34552OooO));
            if (!(Math.abs(j - j2) <= 20000000)) {
                this.f34565OooOOO0 = 0L;
                this.f34567OooOOOo = -1L;
                this.f34564OooOOO = -1L;
                j2 = j;
            }
        }
        this.f34564OooOOO = this.f34565OooOOO0;
        this.f34566OooOOOO = j2;
        OooO oooO = this.f34555OooO0OO;
        if (oooO == null || this.f34562OooOO0O == -9223372036854775807L) {
            return j2;
        }
        long j6 = oooO.f34570OooO0Oo;
        if (j6 == -9223372036854775807L) {
            return j2;
        }
        long j7 = this.f34562OooOO0O;
        long j8 = (((j2 - j6) / j7) * j7) + j6;
        if (j2 <= j8) {
            j3 = j8 - j7;
        } else {
            j3 = j8;
            j8 = j7 + j8;
        }
        if (j8 - j2 >= j2 - j3) {
            j8 = j3;
        }
        return j8 - this.f34563OooOO0o;
    }

    public final void OooO0O0() {
        Surface surface;
        if (o00.f34910OooO00o < 30 || (surface = this.f34558OooO0o0) == null || this.f34561OooOO0 == Integer.MIN_VALUE || this.f34560OooO0oo == 0.0f) {
            return;
        }
        this.f34560OooO0oo = 0.0f;
        OooO00o.OooO00o(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    public final void OooO0OO(long j) {
        boolean z;
        long j2 = this.f34564OooOOO;
        if (j2 != -1) {
            this.f34567OooOOOo = j2;
            this.f34568OooOOo0 = this.f34566OooOOOO;
        }
        this.f34565OooOOO0++;
        long j3 = j * 1000;
        o000OOO.OooO00o oooO00o = this.f34553OooO00o;
        oooO00o.f34538OooO00o.OooO0O0(j3);
        if (oooO00o.f34538OooO00o.OooO00o()) {
            oooO00o.f34540OooO0OO = false;
        } else if (oooO00o.f34541OooO0Oo != -9223372036854775807L) {
            if (oooO00o.f34540OooO0OO) {
                o000OOO.OooO00o.C0400OooO00o c0400OooO00o = oooO00o.f34539OooO0O0;
                long j4 = c0400OooO00o.f34546OooO0Oo;
                if (j4 == 0) {
                    z = false;
                } else {
                    z = c0400OooO00o.f34549OooO0oO[(int) ((j4 - 1) % 15)];
                }
                if (z) {
                    oooO00o.f34539OooO0O0.OooO0OO();
                    oooO00o.f34539OooO0O0.OooO0O0(oooO00o.f34541OooO0Oo);
                }
            } else {
                oooO00o.f34539OooO0O0.OooO0OO();
                oooO00o.f34539OooO0O0.OooO0O0(oooO00o.f34541OooO0Oo);
            }
            oooO00o.f34540OooO0OO = true;
            oooO00o.f34539OooO0O0.OooO0O0(j3);
        }
        if (oooO00o.f34540OooO0OO && oooO00o.f34539OooO0O0.OooO00o()) {
            o000OOO.OooO00o.C0400OooO00o c0400OooO00o2 = oooO00o.f34538OooO00o;
            oooO00o.f34538OooO00o = oooO00o.f34539OooO0O0;
            oooO00o.f34539OooO0O0 = c0400OooO00o2;
            oooO00o.f34540OooO0OO = false;
        }
        oooO00o.f34541OooO0Oo = j3;
        oooO00o.f34542OooO0o0 = oooO00o.f34538OooO00o.OooO00o() ? 0 : oooO00o.f34542OooO0o0 + 1;
        OooO0Oo();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    public final void OooO0Oo() {
        float f;
        boolean z;
        if (o00.f34910OooO00o < 30 || this.f34558OooO0o0 == null) {
            return;
        }
        o000OOO.OooO00o oooO00o = this.f34553OooO00o;
        if (!oooO00o.OooO00o()) {
            f = this.f34557OooO0o;
        } else if (oooO00o.OooO00o()) {
            o000OOO.OooO00o.C0400OooO00o c0400OooO00o = oooO00o.f34538OooO00o;
            long j = c0400OooO00o.f34548OooO0o0;
            f = (float) (1.0E9d / (j != 0 ? c0400OooO00o.f34547OooO0o / j : 0L));
        } else {
            f = -1.0f;
        }
        float f2 = this.f34559OooO0oO;
        if (f == f2) {
            return;
        }
        boolean z2 = true;
        if (f != -1.0f && f2 != -1.0f) {
            if (oooO00o.OooO00o()) {
                if ((oooO00o.OooO00o() ? oooO00o.f34538OooO00o.f34547OooO0o : -9223372036854775807L) >= 5000000000L) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (Math.abs(f - this.f34559OooO0oO) < (z ? 0.02f : 1.0f)) {
                z2 = false;
            }
        } else if (f == -1.0f && oooO00o.f34542OooO0o0 < 30) {
            z2 = false;
        }
        if (z2) {
            this.f34559OooO0oO = f;
            OooO0o0(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void OooO0o0(boolean z) {
        Surface surface;
        float f;
        if (o00.f34910OooO00o < 30 || (surface = this.f34558OooO0o0) == null || this.f34561OooOO0 == Integer.MIN_VALUE) {
            return;
        }
        if (this.f34556OooO0Oo) {
            float f2 = this.f34559OooO0oO;
            if (f2 != -1.0f) {
                f = f2 * this.f34552OooO;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f34560OooO0oo != f) {
            this.f34560OooO0oo = f;
            OooO00o.OooO00o(surface, f);
        }
    }
}
