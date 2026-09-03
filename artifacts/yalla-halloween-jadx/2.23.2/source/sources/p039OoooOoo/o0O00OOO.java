package p039OoooOoo;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.SurfaceRequest;
import com.google.common.util.concurrent.OooOO0O;
import java.util.Objects;
import java.util.concurrent.Executor;
import p028Oooo0oO.o00O0O0;
import p030OoooO.o000oOoO;
import p033OoooO0O.o0O0O00;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o00O0O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O00OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f1705OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f1706OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0OO0 f1707OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000Ooo f1708OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Surface f1710OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public SurfaceRequest f1709OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Executor f1711OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00O0O.OooO0OO.OooO00o f1712OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0O0 f1704OooO = OooO0O0.NOT_INITIALIZED;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooOO0O<Void> f1713OooOO0 = new o000oOoO.OooO00o(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o000Oo0.OooO00o<Void> f1714OooOO0O = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooOO0O<o00O0O> f1715OooOO0o = new o000oOoO.OooO00o(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o000Oo0.OooO00o<o00O0O> f1716OooOOO0 = null;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f1717OooO00o;

        static {
            int[] iArr = new int[OooO0O0.values().length];
            f1717OooO00o = iArr;
            try {
                iArr[OooO0O0.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1717OooO00o[OooO0O0.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1717OooO00o[OooO0O0.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1717OooO00o[OooO0O0.PENDING_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1717OooO00o[OooO0O0.RELEASED.ordinal()] = 5;
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

    public o0O00OOO(@NonNull o00O0OO0 o00o0oo1, @NonNull o0O0O00 o0o0o00, @NonNull Executor executor) {
        this.f1705OooO00o = executor;
        this.f1706OooO0O0 = o0o0o00;
        this.f1707OooO0OO = o00o0oo1;
    }

    public final void OooO00o() {
        int i = OooO00o.f1717OooO00o[this.f1704OooO.ordinal()];
        if (i == 1 || i == 2) {
            OooO0O0();
            return;
        }
        if (i == 3 || i == 4) {
            o00O0O0.OooO00o("VideoEncoderSession", "closeInternal in " + this.f1704OooO + " state");
            this.f1704OooO = OooO0O0.PENDING_RELEASE;
            return;
        }
        if (i == 5) {
            o00O0O0.OooO00o("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f1704OooO + " is not handled");
    }

    public final void OooO0O0() {
        int i = OooO00o.f1717OooO00o[this.f1704OooO.ordinal()];
        if (i == 1) {
            this.f1704OooO = OooO0O0.RELEASED;
            return;
        }
        if (i != 2 && i != 3 && i != 4) {
            if (i != 5) {
                throw new IllegalStateException("State " + this.f1704OooO + " is not handled");
            }
            o00O0O0.OooO00o("VideoEncoderSession", "terminateNow in " + this.f1704OooO + ", No-op");
            return;
        }
        this.f1704OooO = OooO0O0.RELEASED;
        this.f1716OooOOO0.OooO0O0(this.f1708OooO0Oo);
        this.f1709OooO0o = null;
        if (this.f1708OooO0Oo == null) {
            o00O0O0.OooO0oo("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f1714OooOO0O.OooO0O0(null);
            return;
        }
        o00O0O0.OooO00o("VideoEncoderSession", "VideoEncoder is releasing: " + this.f1708OooO0Oo);
        this.f1708OooO0Oo.OooO0oO();
        this.f1708OooO0Oo.f1886OooO.OooO0oo(new Runnable() { // from class: OoooOoo.o0OoOoOo
            @Override // java.lang.Runnable
            public final void run() {
                this.f1727OooO0Oo.f1714OooOO0O.OooO0O0(null);
            }
        }, this.f1706OooO0O0);
        this.f1708OooO0Oo = null;
    }

    @NonNull
    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f1709OooO0o, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
