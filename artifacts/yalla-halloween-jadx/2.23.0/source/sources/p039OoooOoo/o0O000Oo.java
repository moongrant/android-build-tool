package p039OoooOoo;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.SurfaceRequest;
import java.util.Objects;
import java.util.concurrent.Executor;
import p028Oooo0oO.o00O0O0;
import p030OoooO.Oooo0;
import p033OoooO0O.o0O0O00;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o00O0O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f1729OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f1730OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O00 f1731OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000Ooo f1732OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Surface f1734OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public SurfaceRequest f1733OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Executor f1735OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00O0O.OooO0OO.OooO00o f1736OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0O0 f1728OooO = OooO0O0.NOT_INITIALIZED;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public com.google.common.util.concurrent.OooO00o<Void> f1737OooOO0 = new Oooo0.OooO00o(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00O000.OooO00o<Void> f1738OooOO0O = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public com.google.common.util.concurrent.OooO00o<o00O0O> f1739OooOO0o = new Oooo0.OooO00o(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o00O000.OooO00o<o00O0O> f1740OooOOO0 = null;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f1741OooO00o;

        static {
            int[] iArr = new int[OooO0O0.values().length];
            f1741OooO00o = iArr;
            try {
                iArr[OooO0O0.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1741OooO00o[OooO0O0.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1741OooO00o[OooO0O0.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1741OooO00o[OooO0O0.PENDING_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1741OooO00o[OooO0O0.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum OooO0O0 {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public o0O000Oo(@NonNull o00O0O00 o00o0o01, @NonNull o0O0O00 o0o0o00, @NonNull Executor executor) {
        this.f1729OooO00o = executor;
        this.f1730OooO0O0 = o0o0o00;
        this.f1731OooO0OO = o00o0o01;
    }

    public final void OooO00o() {
        int i = OooO00o.f1741OooO00o[this.f1728OooO.ordinal()];
        if (i == 1 || i == 2) {
            OooO0O0();
            return;
        }
        if (i == 3 || i == 4) {
            o00O0O0.OooO00o("VideoEncoderSession", "closeInternal in " + this.f1728OooO + " state");
            this.f1728OooO = OooO0O0.PENDING_RELEASE;
            return;
        }
        if (i == 5) {
            o00O0O0.OooO00o("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f1728OooO + " is not handled");
    }

    public final void OooO0O0() {
        int i = OooO00o.f1741OooO00o[this.f1728OooO.ordinal()];
        if (i == 1) {
            this.f1728OooO = OooO0O0.RELEASED;
            return;
        }
        if (i != 2 && i != 3 && i != 4) {
            if (i != 5) {
                throw new IllegalStateException("State " + this.f1728OooO + " is not handled");
            }
            o00O0O0.OooO00o("VideoEncoderSession", "terminateNow in " + this.f1728OooO + ", No-op");
            return;
        }
        this.f1728OooO = OooO0O0.RELEASED;
        this.f1740OooOOO0.OooO0O0(this.f1732OooO0Oo);
        this.f1733OooO0o = null;
        if (this.f1732OooO0Oo == null) {
            o00O0O0.OooO0oo("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f1738OooOO0O.OooO0O0(null);
            return;
        }
        o00O0O0.OooO00o("VideoEncoderSession", "VideoEncoder is releasing: " + this.f1732OooO0Oo);
        this.f1732OooO0Oo.OooO0oO();
        this.f1732OooO0Oo.f1897OooO.OooO(new Runnable() { // from class: OoooOoo.o0O0o
            @Override // java.lang.Runnable
            public final void run() {
                this.f1745OooO0Oo.f1738OooOO0O.OooO0O0(null);
            }
        }, this.f1730OooO0O0);
        this.f1732OooO0Oo = null;
    }

    @NonNull
    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f1733OooO0o, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
