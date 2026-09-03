package p320o0O0oOoO;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f36770OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final WindowManager f36771OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f36772OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final OooO00o f36773OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f36774OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f36775OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f36776OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f36777OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f36778OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f36779OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f36780OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f36781OooOO0o;

    @RequiresApi(17)
    public final class OooO00o implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DisplayManager f36782OooO00o;

        public OooO00o(DisplayManager displayManager) {
            this.f36782OooO00o = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                o00O.this.OooO0O0();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public static final class OooO0O0 implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public static final OooO0O0 f36784OoooO00 = new OooO0O0();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f36785Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public volatile long f36786Oooo0o = -9223372036854775807L;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Handler f36787Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Choreographer f36788Oooo0oo;

        public OooO0O0() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = o000OOo0.f36740OooO00o;
            Handler handler = new Handler(looper, this);
            this.f36787Oooo0oO = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.f36786Oooo0o = j;
            this.f36788Oooo0oo.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f36788Oooo0oo = Choreographer.getInstance();
                return true;
            }
            if (i == 1) {
                int i2 = this.f36785Oooo + 1;
                this.f36785Oooo = i2;
                if (i2 == 1) {
                    this.f36788Oooo0oo.postFrameCallback(this);
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            int i3 = this.f36785Oooo - 1;
            this.f36785Oooo = i3;
            if (i3 == 0) {
                this.f36788Oooo0oo.removeFrameCallback(this);
                this.f36786Oooo0o = -9223372036854775807L;
            }
            return true;
        }
    }

    public o00O(@Nullable Context context) {
        DisplayManager displayManager;
        OooO00o oooO00o = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f36771OooO00o = (WindowManager) context.getSystemService("window");
        } else {
            this.f36771OooO00o = null;
        }
        if (this.f36771OooO00o != null) {
            if (o000OOo0.f36740OooO00o >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                oooO00o = new OooO00o(displayManager);
            }
            this.f36773OooO0OO = oooO00o;
            this.f36772OooO0O0 = OooO0O0.f36784OoooO00;
        } else {
            this.f36773OooO0OO = null;
            this.f36772OooO0O0 = null;
        }
        this.f36774OooO0Oo = -9223372036854775807L;
        this.f36776OooO0o0 = -9223372036854775807L;
    }

    public final boolean OooO00o(long j, long j2) {
        return Math.abs((j2 - this.f36779OooOO0) - (j - this.f36780OooOO0O)) > 20000000;
    }

    public final void OooO0O0() {
        Display defaultDisplay = this.f36771OooO00o.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f36774OooO0Oo = refreshRate;
            this.f36776OooO0o0 = (refreshRate * 80) / 100;
        }
    }
}
