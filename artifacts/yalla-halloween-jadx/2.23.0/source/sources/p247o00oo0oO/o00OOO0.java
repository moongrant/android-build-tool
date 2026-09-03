package p247o00oo0oO;

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
import com.google.android.exoplayer2.util.Log;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f40814OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0oOO0 f40815OooO00o = new oo0oOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f40816OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final OooO f40817OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f40818OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f40819OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Surface f40820OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f40821OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f40822OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f40823OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f40824OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f40825OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f40826OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f40827OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f40828OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f40829OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f40830OooOOo0;

    public static final class OooO implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO f40831OooO0oo = new OooO();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile long f40832OooO0Oo = -9223372036854775807L;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Choreographer f40833OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Handler f40834OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f40835OooO0oO;

        public OooO() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = o0O00.f40595OooO00o;
            Handler handler = new Handler(looper, this);
            this.f40834OooO0o0 = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.f40832OooO0Oo = j;
            Choreographer choreographer = this.f40833OooO0o;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.f40833OooO0o = Choreographer.getInstance();
                } catch (RuntimeException e) {
                    Log.OooO0oO("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.f40833OooO0o;
                if (choreographer != null) {
                    int i2 = this.f40835OooO0oO + 1;
                    this.f40835OooO0oO = i2;
                    if (i2 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f40833OooO0o;
            if (choreographer2 != null) {
                int i3 = this.f40835OooO0oO - 1;
                this.f40835OooO0oO = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f40832OooO0Oo = -9223372036854775807L;
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

        void OooO00o(p026Oooo0o.OooO0OO oooO0OO);

        void unregister();
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowManager f40836OooO00o;

        public OooO0OO(WindowManager windowManager) {
            this.f40836OooO00o = windowManager;
        }

        @Override // o00oo0oO.o00OOO0.OooO0O0
        public final void OooO00o(p026Oooo0o.OooO0OO oooO0OO) {
            oooO0OO.OooO00o(this.f40836OooO00o.getDefaultDisplay());
        }

        @Override // o00oo0oO.o00OOO0.OooO0O0
        public final void unregister() {
        }
    }

    @RequiresApi(17)
    public static final class OooO0o implements OooO0O0, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DisplayManager f40837OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public OooO0O0.OooO00o f40838OooO0O0;

        public OooO0o(DisplayManager displayManager) {
            this.f40837OooO00o = displayManager;
        }

        @Override // o00oo0oO.o00OOO0.OooO0O0
        public final void OooO00o(p026Oooo0o.OooO0OO oooO0OO) {
            this.f40838OooO0O0 = oooO0OO;
            Handler handlerOooOO0O = o0O00.OooOO0O(null);
            DisplayManager displayManager = this.f40837OooO00o;
            displayManager.registerDisplayListener(this, handlerOooOO0O);
            oooO0OO.OooO00o(displayManager.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            OooO0O0.OooO00o oooO00o = this.f40838OooO0O0;
            if (oooO00o == null || i != 0) {
                return;
            }
            ((p026Oooo0o.OooO0OO) oooO00o).OooO00o(this.f40837OooO00o.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }

        @Override // o00oo0oO.o00OOO0.OooO0O0
        public final void unregister() {
            this.f40837OooO00o.unregisterDisplayListener(this);
            this.f40838OooO0O0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    public o00OOO0(@Nullable Context context) {
        OooO0O0 oooO0o;
        DisplayManager displayManager;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            oooO0o = (o0O00.f40595OooO00o < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new OooO0o(displayManager);
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
        this.f40816OooO0O0 = oooO0o;
        this.f40817OooO0OO = oooO0o != null ? OooO.f40831OooO0oo : null;
        this.f40824OooOO0O = -9223372036854775807L;
        this.f40825OooOO0o = -9223372036854775807L;
        this.f40819OooO0o = -1.0f;
        this.f40814OooO = 1.0f;
        this.f40823OooOO0 = 0;
    }

    public final long OooO00o(long j) {
        long j2;
        long j3;
        long j4;
        if (this.f40829OooOOOo == -1 || !this.f40815OooO00o.OooO00o()) {
            j2 = j;
        } else {
            oo0oOO0 oo0ooo0 = this.f40815OooO00o;
            if (oo0ooo0.OooO00o()) {
                oo0oOO0.OooO00o oooO00o = oo0ooo0.f40879OooO00o;
                long j5 = oooO00o.f40889OooO0o0;
                j4 = j5 == 0 ? 0L : oooO00o.f40888OooO0o / j5;
            } else {
                j4 = -9223372036854775807L;
            }
            j2 = this.f40830OooOOo0 + ((long) (((this.f40827OooOOO0 - this.f40829OooOOOo) * j4) / this.f40814OooO));
            if (!(Math.abs(j - j2) <= 20000000)) {
                this.f40827OooOOO0 = 0L;
                this.f40829OooOOOo = -1L;
                this.f40826OooOOO = -1L;
                j2 = j;
            }
        }
        this.f40826OooOOO = this.f40827OooOOO0;
        this.f40828OooOOOO = j2;
        OooO oooO = this.f40817OooO0OO;
        if (oooO == null || this.f40824OooOO0O == -9223372036854775807L) {
            return j2;
        }
        long j6 = oooO.f40832OooO0Oo;
        if (j6 == -9223372036854775807L) {
            return j2;
        }
        long j7 = this.f40824OooOO0O;
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
        return j8 - this.f40825OooOO0o;
    }

    public final void OooO0O0() {
        Surface surface;
        if (o0O00.f40595OooO00o < 30 || (surface = this.f40820OooO0o0) == null || this.f40823OooOO0 == Integer.MIN_VALUE || this.f40822OooO0oo == 0.0f) {
            return;
        }
        this.f40822OooO0oo = 0.0f;
        OooO00o.OooO00o(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    public final void OooO0OO(long j) {
        boolean z;
        long j2 = this.f40826OooOOO;
        if (j2 != -1) {
            this.f40829OooOOOo = j2;
            this.f40830OooOOo0 = this.f40828OooOOOO;
        }
        this.f40827OooOOO0++;
        long j3 = j * 1000;
        oo0oOO0 oo0ooo0 = this.f40815OooO00o;
        oo0ooo0.f40879OooO00o.OooO0O0(j3);
        if (oo0ooo0.f40879OooO00o.OooO00o()) {
            oo0ooo0.f40881OooO0OO = false;
        } else if (oo0ooo0.f40882OooO0Oo != -9223372036854775807L) {
            if (oo0ooo0.f40881OooO0OO) {
                oo0oOO0.OooO00o oooO00o = oo0ooo0.f40880OooO0O0;
                long j4 = oooO00o.f40887OooO0Oo;
                if (j4 == 0) {
                    z = false;
                } else {
                    z = oooO00o.f40890OooO0oO[(int) ((j4 - 1) % 15)];
                }
                if (z) {
                    oo0ooo0.f40880OooO0O0.OooO0OO();
                    oo0ooo0.f40880OooO0O0.OooO0O0(oo0ooo0.f40882OooO0Oo);
                }
            } else {
                oo0ooo0.f40880OooO0O0.OooO0OO();
                oo0ooo0.f40880OooO0O0.OooO0O0(oo0ooo0.f40882OooO0Oo);
            }
            oo0ooo0.f40881OooO0OO = true;
            oo0ooo0.f40880OooO0O0.OooO0O0(j3);
        }
        if (oo0ooo0.f40881OooO0OO && oo0ooo0.f40880OooO0O0.OooO00o()) {
            oo0oOO0.OooO00o oooO00o2 = oo0ooo0.f40879OooO00o;
            oo0ooo0.f40879OooO00o = oo0ooo0.f40880OooO0O0;
            oo0ooo0.f40880OooO0O0 = oooO00o2;
            oo0ooo0.f40881OooO0OO = false;
        }
        oo0ooo0.f40882OooO0Oo = j3;
        oo0ooo0.f40883OooO0o0 = oo0ooo0.f40879OooO00o.OooO00o() ? 0 : oo0ooo0.f40883OooO0o0 + 1;
        OooO0Oo();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    public final void OooO0Oo() {
        float f;
        boolean z;
        if (o0O00.f40595OooO00o < 30 || this.f40820OooO0o0 == null) {
            return;
        }
        oo0oOO0 oo0ooo0 = this.f40815OooO00o;
        if (!oo0ooo0.OooO00o()) {
            f = this.f40819OooO0o;
        } else if (oo0ooo0.OooO00o()) {
            oo0oOO0.OooO00o oooO00o = oo0ooo0.f40879OooO00o;
            long j = oooO00o.f40889OooO0o0;
            f = (float) (1.0E9d / (j != 0 ? oooO00o.f40888OooO0o / j : 0L));
        } else {
            f = -1.0f;
        }
        float f2 = this.f40821OooO0oO;
        if (f == f2) {
            return;
        }
        boolean z2 = true;
        if (f != -1.0f && f2 != -1.0f) {
            if (oo0ooo0.OooO00o()) {
                if ((oo0ooo0.OooO00o() ? oo0ooo0.f40879OooO00o.f40888OooO0o : -9223372036854775807L) >= 5000000000L) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (Math.abs(f - this.f40821OooO0oO) < (z ? 0.02f : 1.0f)) {
                z2 = false;
            }
        } else if (f == -1.0f && oo0ooo0.f40883OooO0o0 < 30) {
            z2 = false;
        }
        if (z2) {
            this.f40821OooO0oO = f;
            OooO0o0(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void OooO0o0(boolean z) {
        Surface surface;
        float f;
        if (o0O00.f40595OooO00o < 30 || (surface = this.f40820OooO0o0) == null || this.f40823OooOO0 == Integer.MIN_VALUE) {
            return;
        }
        if (this.f40818OooO0Oo) {
            float f2 = this.f40821OooO0oO;
            if (f2 != -1.0f) {
                f = f2 * this.f40814OooO;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f40822OooO0oo != f) {
            this.f40822OooO0oo = f;
            OooO00o.OooO00o(surface, f);
        }
    }
}
