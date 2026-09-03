package p022Oooo00O;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Oooo0;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OooOo00;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o00O000o;
import androidx.camera.core.impl.o00O00o0;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OO00O;
import androidx.camera.core.impl.o00OOO0;
import androidx.camera.core.impl.o00OOOO0;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.o00oO0o;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo00o;
import androidx.camera.core.impl.oo0O;
import androidx.camera.core.impl.oo0o0Oo;
import androidx.camera.video.OooOOOO;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.OooOO0O;
import com.google.logging.type.LogSeverity;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o000OO.OooOOO0;
import p023Oooo00o.oO000o00;
import p023Oooo00o.oO00o000;
import p027Oooo0o0.o00O00OO;
import p028Oooo0oO.o000O0Oo;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOo;
import p033OoooO0O.o0O0O00;
import p033OoooO0O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000OO implements CameraInternal {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O000o<CameraInternal.State> f548OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOOO0 f549OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O00 f550OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oO00o000 f551OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OOO0o f552OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile OooOO0 f553OooO0oo = OooOO0.INITIALIZED;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O f554OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0Oo0oo f555OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOO0O f556OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public CameraDevice f557OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final o000 f558OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f559OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public o0o0Oo f560OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final OooO0OO f561OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final LinkedHashMap f562OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final CameraCoordinator f563OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NonNull
    public final o0O.OooO00o f564OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final HashSet f565OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final androidx.camera.core.impl.o0O0O00 f566OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o0O000Oo f567OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NonNull
    public final o00OOOOo f568OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NonNull
    public o00oO0o.OooO00o f569OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final HashSet f570OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Object f571OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f572OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public o00OO00O f573OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NonNull
    public final o0oOO f574OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NonNull
    public final Oooo0.OooO f575OooOooo;

    public final class OooO implements CameraControlInternal.OooO0O0 {
        public OooO() {
        }
    }

    public class OooO00o implements p030OoooO.OooOOO0<Void> {
        public OooO00o() {
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            final SessionConfig sessionConfig = null;
            if (th instanceof DeferrableSurface.SurfaceClosedException) {
                o000OO o000oo2 = o000OO.this;
                DeferrableSurface deferrableSurface = ((DeferrableSurface.SurfaceClosedException) th).f3538OooO0Oo;
                for (SessionConfig sessionConfig2 : o000oo2.f549OooO0Oo.OooO0O0()) {
                    if (sessionConfig2.OooO0O0().contains(deferrableSurface)) {
                        sessionConfig = sessionConfig2;
                        break;
                    }
                }
                if (sessionConfig != null) {
                    o000OO o000oo3 = o000OO.this;
                    o000oo3.getClass();
                    o0OOO0o o0ooo0oOooO0OO = p033OoooO0O.o00oO0o.OooO0OO();
                    List<SessionConfig.OooO0OO> list = sessionConfig.f3621OooO0o0;
                    if (list.isEmpty()) {
                        return;
                    }
                    final SessionConfig.OooO0OO oooO0OO = list.get(0);
                    o000oo3.OooOo00("Posting surface closed", new Throwable());
                    o0ooo0oOooO0OO.execute(new Runnable(sessionConfig) { // from class: Oooo00O.o0000Ooo
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f501OooO0Oo.onError();
                        }
                    });
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                o000OO.this.OooOo00("Unable to configure camera cancelled", null);
                return;
            }
            OooOO0 oooOO1 = o000OO.this.f553OooO0oo;
            OooOO0 oooOO2 = OooOO0.OPENED;
            if (oooOO1 == oooOO2) {
                o000OO.this.Oooo00O(oooOO2, new androidx.camera.core.OooO0OO(4, th), true);
            }
            if (th instanceof CameraAccessException) {
                o000OO.this.OooOo00("Unable to configure camera due to " + th.getMessage(), null);
                return;
            }
            if (th instanceof TimeoutException) {
                o00O0O0.OooO0O0("Camera2CameraImpl", "Unable to configure camera " + o000OO.this.f558OooOOO0.f457OooO00o + ", timeout!");
            }
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable Void r3) {
            o000OO o000oo2 = o000OO.this;
            if (((o00O00OO) o000oo2.f563OooOOoo).f1089OooO0o0 == 2 && o000oo2.f553OooO0oo == OooOO0.OPENED) {
                o000OO.this.Oooo000(OooOO0.CONFIGURED);
            }
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f578OooO00o;

        static {
            int[] iArr = new int[OooOO0.values().length];
            f578OooO00o = iArr;
            try {
                iArr[OooOO0.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f578OooO00o[OooOO0.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f578OooO00o[OooOO0.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f578OooO00o[OooOO0.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f578OooO00o[OooOO0.CONFIGURED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f578OooO00o[OooOO0.OPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f578OooO00o[OooOO0.REOPENING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f578OooO00o[OooOO0.RELEASING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f578OooO00o[OooOO0.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public final class OooO0OO extends CameraManager.AvailabilityCallback implements androidx.camera.core.impl.o0O0O00.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f579OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f580OooO0O0 = true;

        public OooO0OO(String str) {
            this.f579OooO00o = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(@NonNull String str) {
            if (this.f579OooO00o.equals(str)) {
                this.f580OooO0O0 = true;
                if (o000OO.this.f553OooO0oo == OooOO0.PENDING_OPEN) {
                    o000OO.this.Oooo0OO(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(@NonNull String str) {
            if (this.f579OooO00o.equals(str)) {
                this.f580OooO0O0 = false;
            }
        }
    }

    public final class OooO0o implements androidx.camera.core.impl.o0O0O00.OooO0O0 {
        public OooO0o() {
        }
    }

    public enum OooOO0 {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CONFIGURED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    @RequiresApi(21)
    public final class OooOO0O extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Executor f583OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ScheduledExecutorService f584OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO0O0 f585OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ScheduledFuture<?> f586OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final OooO00o f588OooO0o0 = new OooO00o();

        public class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public long f589OooO00o = -1;

            public OooO00o() {
            }

            public final int OooO00o() {
                if (!OooOO0O.this.OooO0OO()) {
                    return LogSeverity.ALERT_VALUE;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f589OooO00o == -1) {
                    this.f589OooO00o = jUptimeMillis;
                }
                long j = jUptimeMillis - this.f589OooO00o;
                if (j <= 120000) {
                    return 1000;
                }
                return j <= 300000 ? 2000 : 4000;
            }
        }

        public class OooO0O0 implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Executor f591OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public boolean f593OooO0o0 = false;

            public OooO0O0(Executor executor) {
                this.f591OooO0Oo = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f591OooO0Oo.execute(new o0000O(this, 0));
            }
        }

        public OooOO0O(@NonNull o0O0O00 o0o0o00, o0OOO0o o0ooo0o2) {
            this.f583OooO00o = o0o0o00;
            this.f584OooO0O0 = o0ooo0o2;
        }

        public final boolean OooO00o() {
            if (this.f586OooO0Oo == null) {
                return false;
            }
            o000OO.this.OooOo00("Cancelling scheduled re-open: " + this.f585OooO0OO, null);
            this.f585OooO0OO.f593OooO0o0 = true;
            this.f585OooO0OO = null;
            this.f586OooO0Oo.cancel(false);
            this.f586OooO0Oo = null;
            return true;
        }

        public final void OooO0O0() {
            boolean z = true;
            o000OO.OooOOO0.OooO0o(null, this.f585OooO0OO == null);
            o000OO.OooOOO0.OooO0o(null, this.f586OooO0Oo == null);
            OooO00o oooO00o = this.f588OooO0o0;
            oooO00o.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (oooO00o.f589OooO00o == -1) {
                oooO00o.f589OooO00o = jUptimeMillis;
            }
            long j = jUptimeMillis - oooO00o.f589OooO00o;
            OooOO0O oooOO0O = OooOO0O.this;
            boolean zOooO0OO = oooOO0O.OooO0OO();
            int i = ResponseInfo.UnknownError;
            if (j >= ((long) (!zOooO0OO ? 10000 : 1800000))) {
                oooO00o.f589OooO00o = -1L;
                z = false;
            }
            o000OO o000oo2 = o000OO.this;
            if (!z) {
                StringBuilder sb = new StringBuilder("Camera reopening attempted for ");
                if (oooOO0O.OooO0OO()) {
                    i = 1800000;
                }
                sb.append(i);
                sb.append("ms without success.");
                o00O0O0.OooO0O0("Camera2CameraImpl", sb.toString());
                o000oo2.Oooo00O(OooOO0.PENDING_OPEN, null, false);
                return;
            }
            this.f585OooO0OO = new OooO0O0(this.f583OooO00o);
            o000oo2.OooOo00("Attempting camera re-open in " + oooO00o.OooO00o() + "ms: " + this.f585OooO0OO + " activeResuming = " + o000oo2.f572OooOoo, null);
            this.f586OooO0Oo = this.f584OooO0O0.schedule(this.f585OooO0OO, (long) oooO00o.OooO00o(), TimeUnit.MILLISECONDS);
        }

        public final boolean OooO0OO() {
            int i;
            o000OO o000oo2 = o000OO.this;
            return o000oo2.f572OooOoo && ((i = o000oo2.f559OooOOOO) == 1 || i == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull CameraDevice cameraDevice) {
            o000OO.this.OooOo00("CameraDevice.onClosed()", null);
            o000OO.OooOOO0.OooO0o("Unexpected onClose callback on camera device: " + cameraDevice, o000OO.this.f557OooOOO == null);
            int i = OooO0O0.f578OooO00o[o000OO.this.f553OooO0oo.ordinal()];
            if (i != 3) {
                if (i == 7) {
                    o000OO o000oo2 = o000OO.this;
                    int i2 = o000oo2.f559OooOOOO;
                    if (i2 == 0) {
                        o000oo2.Oooo0OO(false);
                        return;
                    } else {
                        o000oo2.OooOo00("Camera closed due to error: ".concat(o000OO.OooOo0O(i2)), null);
                        OooO0O0();
                        return;
                    }
                }
                if (i != 8) {
                    throw new IllegalStateException("Camera closed while in state: " + o000OO.this.f553OooO0oo);
                }
            }
            o000OO.OooOOO0.OooO0o(null, o000OO.this.OooOoO0());
            o000OO.this.OooOo0();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            o000OO.this.OooOo00("CameraDevice.onDisconnected()", null);
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            o000OO o000oo2 = o000OO.this;
            o000oo2.f557OooOOO = cameraDevice;
            o000oo2.f559OooOOOO = i;
            int i2 = 2;
            switch (OooO0O0.f578OooO00o[o000oo2.f553OooO0oo.ordinal()]) {
                case 3:
                case 8:
                    o00O0O0.OooO0O0("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), o000OO.OooOo0O(i), o000OO.this.f553OooO0oo.name()));
                    o000OO.this.OooOOo();
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                    o00O0O0.OooO00o("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), o000OO.OooOo0O(i), o000OO.this.f553OooO0oo.name()));
                    o000OO.OooOOO0.OooO0o("Attempt to handle open error from non open state: " + o000OO.this.f553OooO0oo, o000OO.this.f553OooO0oo == OooOO0.OPENING || o000OO.this.f553OooO0oo == OooOO0.OPENED || o000OO.this.f553OooO0oo == OooOO0.CONFIGURED || o000OO.this.f553OooO0oo == OooOO0.REOPENING);
                    if (i == 1 || i == 2 || i == 4) {
                        o00O0O0.OooO00o("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), o000OO.OooOo0O(i)));
                        o000OO o000oo3 = o000OO.this;
                        o000OO.OooOOO0.OooO0o("Can only reopen camera device after error if the camera device is actually in an error state.", o000oo3.f559OooOOOO != 0);
                        if (i != 1) {
                            i2 = i != 2 ? 3 : 1;
                        }
                        o000oo3.Oooo00O(OooOO0.REOPENING, new androidx.camera.core.OooO0OO(i2, null), true);
                        o000oo3.OooOOo();
                        return;
                    }
                    o00O0O0.OooO0O0("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + o000OO.OooOo0O(i) + " closing camera.");
                    o000OO.this.Oooo00O(OooOO0.CLOSING, new androidx.camera.core.OooO0OO(i == 3 ? 5 : 6, null), true);
                    o000OO.this.OooOOo();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + o000OO.this.f553OooO0oo);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            o000OO.this.OooOo00("CameraDevice.onOpened()", null);
            o000OO o000oo2 = o000OO.this;
            o000oo2.f557OooOOO = cameraDevice;
            o000oo2.f559OooOOOO = 0;
            this.f588OooO0o0.f589OooO00o = -1L;
            int i = OooO0O0.f578OooO00o[o000oo2.f553OooO0oo.ordinal()];
            if (i != 3) {
                if (i == 6 || i == 7) {
                    o000OO.this.Oooo000(OooOO0.OPENED);
                    androidx.camera.core.impl.o0O0O00 o0o0o00 = o000OO.this.f566OooOo00;
                    String id = cameraDevice.getId();
                    o000OO o000oo3 = o000OO.this;
                    if (o0o0o00.OooO0o0(id, ((o00O00OO) o000oo3.f563OooOOoo).OooO00o(o000oo3.f557OooOOO.getId()))) {
                        o000OO.this.OooOoo0();
                        return;
                    }
                    return;
                }
                if (i != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + o000OO.this.f553OooO0oo);
                }
            }
            o000OO.OooOOO0.OooO0o(null, o000OO.this.OooOoO0());
            o000OO.this.f557OooOOO.close();
            o000OO.this.f557OooOOO = null;
        }
    }

    @AutoValue
    public static abstract class OooOOO0 {
        @NonNull
        public abstract SessionConfig OooO00o();

        @Nullable
        public abstract Size OooO0O0();

        @NonNull
        public abstract o00Oo00<?> OooO0OO();

        @NonNull
        public abstract String OooO0Oo();

        @NonNull
        public abstract Class<?> OooO0o0();
    }

    public o000OO(@NonNull oO00o000 oo00o000, @NonNull String str, @NonNull o000 o000Var, @NonNull o00O00OO o00o00oo2, @NonNull androidx.camera.core.impl.o0O0O00 o0o0o00, @NonNull Executor executor, @NonNull Handler handler, @NonNull o0oOO o0ooo2) throws CameraUnavailableException {
        o00O000o<CameraInternal.State> o00o000o2 = new o00O000o<>();
        this.f548OooO = o00o000o2;
        this.f559OooOOOO = 0;
        new AtomicInteger(0);
        this.f562OooOOo0 = new LinkedHashMap();
        this.f565OooOo0 = new HashSet();
        this.f570OooOoO0 = new HashSet();
        this.f569OooOoO = o00oO0o.f3761OooO00o;
        this.f571OooOoOO = new Object();
        this.f572OooOoo = false;
        this.f551OooO0o0 = oo00o000;
        this.f563OooOOoo = o00o00oo2;
        this.f566OooOo00 = o0o0o00;
        o0OOO0o o0ooo0o2 = new o0OOO0o(handler);
        this.f552OooO0oO = o0ooo0o2;
        o0O0O00 o0o0o01 = new o0O0O00(executor);
        this.f550OooO0o = o0o0o01;
        this.f556OooOO0o = new OooOO0O(o0o0o01, o0ooo0o2);
        this.f549OooO0Oo = new o00OOOO0(str);
        o00o000o2.f3714OooO00o.postValue(new o00O000o.OooO0O0<>(CameraInternal.State.CLOSED));
        o00O o00o2 = new o00O(o0o0o00);
        this.f554OooOO0 = o00o2;
        o00OOOOo o00ooooo2 = new o00OOOOo(o0o0o01);
        this.f568OooOo0o = o00ooooo2;
        this.f574OooOooO = o0ooo2;
        try {
            oO000o00 oo000o00OooO0O0 = oo00o000.OooO0O0(str);
            o0Oo0oo o0oo0oo2 = new o0Oo0oo(oo000o00OooO0O0, o0o0o01, new OooO(), o000Var.f456OooO);
            this.f555OooOO0O = o0oo0oo2;
            this.f558OooOOO0 = o000Var;
            o000Var.OooOOo(o0oo0oo2);
            o000Var.f463OooO0oO.OooO00o(o00o2.f605OooO0O0);
            this.f575OooOooo = Oooo0.OooO.OooO00o(oo000o00OooO0O0);
            this.f560OooOOOo = OooOoO();
            this.f564OooOo = new o0O.OooO00o(handler, o00ooooo2, o000Var.f456OooO, p024Oooo0O0.o000OO.f1020OooO00o, o0o0o01, o0ooo0o2);
            OooO0OO oooO0OO = new OooO0OO(str);
            this.f561OooOOo = oooO0OO;
            OooO0o oooO0o = new OooO0o();
            synchronized (o0o0o00.f3764OooO0O0) {
                o000OO.OooOOO0.OooO0o("Camera is already registered: " + this, o0o0o00.f3768OooO0o0.containsKey(this) ? false : true);
                o0o0o00.f3768OooO0o0.put(this, new androidx.camera.core.impl.o0O0O00.OooO00o(o0o0o01, oooO0o, oooO0OO));
            }
            oo00o000.f962OooO00o.OooO0Oo(o0o0o01, oooO0OO);
        } catch (CameraAccessExceptionCompat e) {
            throw o00OO000.OooO00o(e);
        }
    }

    @NonNull
    public static String OooOo(@NonNull Oooo0 oooo0) {
        return oooo0.OooO0oo() + oooo0.hashCode();
    }

    public static String OooOo0O(int i) {
        if (i == 0) {
            return "ERROR_NONE";
        }
        if (i == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i != 4) {
            return i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    @NonNull
    public static String OooOo0o(@NonNull o0O000Oo o0o000oo2) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        o0o000oo2.getClass();
        sb.append(o0o000oo2.hashCode());
        return sb.toString();
    }

    @NonNull
    public static ArrayList Oooo00o(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Oooo0 oooo0 = (Oooo0) it.next();
            arrayList2.add(new p022Oooo00O.OooO(OooOo(oooo0), oooo0.getClass(), oooo0.f3495OooOOO0, oooo0.f3488OooO0o, oooo0.OooO0O0()));
        }
        return arrayList2;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final o0Oo0oo OooO() {
        return this.f558OooOOO0;
    }

    @Override // androidx.camera.core.impl.CameraInternal, p028Oooo0oO.o000O0Oo
    public final CameraInfo OooO00o() {
        return OooO();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final oo00o<CameraInternal.State> OooO0O0() {
        return this.f548OooO;
    }

    @Override // p028Oooo0oO.o000O0Oo
    public final CameraControl OooO0OO() {
        return OooO0o();
    }

    @Override // androidx.camera.core.Oooo0.OooO0o
    public final void OooO0Oo(@NonNull Oooo0 oooo0) {
        oooo0.getClass();
        final String strOooOo = OooOo(oooo0);
        final SessionConfig sessionConfig = oooo0.f3495OooOOO0;
        final o00Oo00<?> o00oo00 = oooo0.f3488OooO0o;
        this.f550OooO0o.execute(new Runnable() { // from class: Oooo00O.o00000OO
            @Override // java.lang.Runnable
            public final void run() {
                o000OO o000oo2 = this.f485OooO0Oo;
                o000oo2.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = strOooOo;
                sb.append(str);
                sb.append(" ACTIVE");
                o000oo2.OooOo00(sb.toString(), null);
                o00OOOO0 o00oooo1 = o000oo2.f549OooO0Oo;
                LinkedHashMap linkedHashMap = o00oooo1.f3746OooO0O0;
                o00OOOO0.OooO00o oooO00o = (o00OOOO0.OooO00o) linkedHashMap.get(str);
                SessionConfig sessionConfig2 = sessionConfig;
                o00Oo00<?> o00oo01 = o00oo00;
                if (oooO00o == null) {
                    oooO00o = new o00OOOO0.OooO00o(sessionConfig2, o00oo01);
                    linkedHashMap.put(str, oooO00o);
                }
                oooO00o.f3750OooO0Oo = true;
                o00oooo1.OooO0o(str, sessionConfig2, o00oo01);
                o000oo2.Oooo0o0();
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final CameraControlInternal OooO0o() {
        return this.f555OooOO0O;
    }

    @Override // androidx.camera.core.Oooo0.OooO0o
    public final void OooO0o0(@NonNull OooOOOO oooOOOO) {
        final String strOooOo = OooOo(oooOOOO);
        final SessionConfig sessionConfig = oooOOOO.f3495OooOOO0;
        final o00Oo00<?> o00oo00 = oooOOOO.f3488OooO0o;
        this.f550OooO0o.execute(new Runnable() { // from class: Oooo00O.o0000O00
            @Override // java.lang.Runnable
            public final void run() {
                o000OO o000oo2 = this.f493OooO0Oo;
                o000oo2.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = strOooOo;
                sb.append(str);
                sb.append(" UPDATED");
                o000oo2.OooOo00(sb.toString(), null);
                o000oo2.f549OooO0Oo.OooO0o(str, sessionConfig, o00oo00);
                o000oo2.Oooo0o0();
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final CameraConfig OooO0oO() {
        return this.f569OooOoO;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void OooO0oo(final boolean z) {
        this.f550OooO0o.execute(new Runnable() { // from class: Oooo00O.o00000O
            @Override // java.lang.Runnable
            public final void run() {
                o000OO o000oo2 = this.f480OooO0Oo;
                boolean z2 = z;
                o000oo2.f572OooOoo = z2;
                if (z2 && o000oo2.f553OooO0oo == o000OO.OooOO0.PENDING_OPEN) {
                    o000oo2.Oooo0O0(false);
                }
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean OooOO0() {
        return ((o000) OooO00o()).OooO0o0() == 0;
    }

    @Override // androidx.camera.core.Oooo0.OooO0o
    public final void OooOO0O(@NonNull Oooo0 oooo0) {
        oooo0.getClass();
        this.f550OooO0o.execute(new o0000(this, OooOo(oooo0), oooo0.f3495OooOOO0, oooo0.f3488OooO0o));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void OooOO0o(@Nullable CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = o00oO0o.f3761OooO00o;
        }
        o00oO0o.OooO00o oooO00o = (o00oO0o.OooO00o) cameraConfig;
        o00OO00O o00oo00o = (o00OO00O) ((o00O0O00) oooO00o.getConfig()).OooOoO(CameraConfig.f3524OooO0oo, null);
        this.f569OooOoO = oooO00o;
        synchronized (this.f571OooOoOO) {
            this.f573OooOoo0 = o00oo00o;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void OooOOO(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        o0Oo0oo o0oo0oo2 = this.f555OooOO0O;
        synchronized (o0oo0oo2.f848OooO0Oo) {
            o0oo0oo2.f858OooOOOO++;
        }
        for (Oooo0 oooo0 : new ArrayList(arrayList2)) {
            String strOooOo = OooOo(oooo0);
            HashSet hashSet = this.f570OooOoO0;
            if (!hashSet.contains(strOooOo)) {
                hashSet.add(strOooOo);
                oooo0.OooOo0O();
                oooo0.OooOo00();
            }
        }
        final ArrayList arrayList3 = new ArrayList(Oooo00o(arrayList2));
        try {
            this.f550OooO0o.execute(new Runnable() { // from class: Oooo00O.o0000O0
                @Override // java.lang.Runnable
                public final void run() {
                    List list = arrayList3;
                    o000OO o000oo2 = this.f491OooO0Oo;
                    o0Oo0oo o0oo0oo3 = o000oo2.f555OooOO0O;
                    try {
                        o000oo2.Oooo0(list);
                    } finally {
                        o0oo0oo3.OooOO0O();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            OooOo00("Unable to attach use cases.", e);
            o0oo0oo2.OooOO0O();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void OooOOO0(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        final ArrayList arrayList3 = new ArrayList(Oooo00o(arrayList2));
        for (Oooo0 oooo0 : new ArrayList(arrayList2)) {
            String strOooOo = OooOo(oooo0);
            HashSet hashSet = this.f570OooOoO0;
            if (hashSet.contains(strOooOo)) {
                oooo0.OooOo0o();
                hashSet.remove(strOooOo);
            }
        }
        this.f550OooO0o.execute(new Runnable() { // from class: Oooo00O.o0000oo
            @Override // java.lang.Runnable
            public final void run() {
                o000OO o000oo2 = this.f502OooO0Oo;
                List<o000OO.OooOOO0> list = arrayList3;
                o000oo2.getClass();
                ArrayList arrayList4 = new ArrayList();
                boolean z = false;
                for (o000OO.OooOOO0 oooOOO0 : list) {
                    if (o000oo2.f549OooO0Oo.OooO0Oo(oooOOO0.OooO0Oo())) {
                        o000oo2.f549OooO0Oo.f3746OooO0O0.remove(oooOOO0.OooO0Oo());
                        arrayList4.add(oooOOO0.OooO0Oo());
                        if (oooOOO0.OooO0o0() == androidx.camera.core.OooOOOO.class) {
                            z = true;
                        }
                    }
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                o000oo2.OooOo00("Use cases [" + TextUtils.join(", ", arrayList4) + "] now DETACHED for camera", null);
                if (z) {
                    o000oo2.f555OooOO0O.f852OooO0oo.getClass();
                }
                o000oo2.OooOOo0();
                if (o000oo2.f549OooO0Oo.OooO0OO().isEmpty()) {
                    o000oo2.f555OooOO0O.f855OooOO0o.f836OooO0OO = false;
                } else {
                    o000oo2.Oooo0o();
                }
                if (!o000oo2.f549OooO0Oo.OooO0O0().isEmpty()) {
                    o000oo2.Oooo0o0();
                    o000oo2.OooOooo();
                    if (o000oo2.f553OooO0oo == o000OO.OooOO0.OPENED) {
                        o000oo2.OooOoo0();
                        return;
                    }
                    return;
                }
                o000oo2.f555OooOO0O.OooOO0O();
                o000oo2.OooOooo();
                o000oo2.f555OooOO0O.OooOOoo(false);
                o000oo2.f560OooOOOo = o000oo2.OooOoO();
                o000oo2.OooOo00("Closing camera.", null);
                int i = o000OO.OooO0O0.f578OooO00o[o000oo2.f553OooO0oo.ordinal()];
                if (i == 2) {
                    OooOOO0.OooO0o(null, o000oo2.f557OooOOO == null);
                    o000oo2.Oooo000(o000OO.OooOO0.INITIALIZED);
                    return;
                }
                if (i == 4 || i == 5) {
                    o000oo2.Oooo000(o000OO.OooOO0.CLOSING);
                    o000oo2.OooOOo();
                    return;
                }
                if (i == 6 || i == 7) {
                    boolean zOooO00o = o000oo2.f556OooOO0o.OooO00o();
                    o000oo2.Oooo000(o000OO.OooOO0.CLOSING);
                    if (zOooO00o) {
                        OooOOO0.OooO0o(null, o000oo2.OooOoO0());
                        o000oo2.OooOo0();
                    }
                } else {
                    o000oo2.OooOo00("close() ignored due to being in state: " + o000oo2.f553OooO0oo, null);
                }
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final /* synthetic */ boolean OooOOOO() {
        return true;
    }

    @Override // androidx.camera.core.Oooo0.OooO0o
    public final void OooOOOo(@NonNull Oooo0 oooo0) {
        oooo0.getClass();
        this.f550OooO0o.execute(new o00000O0(0, this, OooOo(oooo0)));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x016c  */
    /* JADX WARN: Type inference failed for: r4v2, types: [Oooo00O.o000OOo] */
    public final void OooOOo() {
        o000OO.OooOOO0.OooO0o("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f553OooO0oo + " (error: " + OooOo0O(this.f559OooOOOO) + ")", this.f553OooO0oo == OooOO0.CLOSING || this.f553OooO0oo == OooOO0.RELEASING || (this.f553OooO0oo == OooOO0.REOPENING && this.f559OooOOOO != 0));
        int i = Build.VERSION.SDK_INT;
        if (i <= 23 || i >= 29) {
            OooOooo();
        } else {
            if ((this.f558OooOOO0.OooOOo0() == 2) && this.f559OooOOOO == 0) {
                final o00OOO0 o00ooo1 = new o00OOO0(this.f575OooOooo);
                this.f565OooOo0.add(o00ooo1);
                OooOooo();
                final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                final Surface surface = new Surface(surfaceTexture);
                final ?? r4 = new Runnable() { // from class: Oooo00O.o000OOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Surface surface2 = (Surface) surface;
                        SurfaceTexture surfaceTexture2 = (SurfaceTexture) surfaceTexture;
                        surface2.release();
                        surfaceTexture2.release();
                    }
                };
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
                Range<Integer> range = oo0O.f3780OooO00o;
                ArrayList arrayList = new ArrayList();
                o00O00o0 o00o00o0OooO0OO = o00O00o0.OooO0OO();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                final o000O o000o = new o000O(surface);
                DynamicRange dynamicRange = DynamicRange.f3398OooO0Oo;
                OooOo00.OooO00o OooO00o2 = SessionConfig.OooO.OooO00o(o000o);
                OooO00o2.OooO0O0(dynamicRange);
                linkedHashSet.add(OooO00o2.OooO00o());
                OooOo00("Start configAndClose.", null);
                ArrayList arrayList6 = new ArrayList(linkedHashSet);
                ArrayList arrayList7 = new ArrayList(arrayList2);
                ArrayList arrayList8 = new ArrayList(arrayList3);
                ArrayList arrayList9 = new ArrayList(arrayList5);
                ArrayList arrayList10 = new ArrayList(arrayList4);
                ArrayList arrayList11 = new ArrayList(hashSet);
                o00O0O00 o00o0o00Oooo0O0 = o00O0O00.Oooo0O0(ooo00oOooo0OO);
                ArrayList arrayList12 = new ArrayList(arrayList);
                o00OOO0 o00ooo2 = o00OOO0.f3743OooO0O0;
                ArrayMap arrayMap = new ArrayMap();
                Iterator<String> it = o00o00o0OooO0OO.OooO0O0().iterator();
                while (it.hasNext()) {
                    ArrayList arrayList13 = arrayList12;
                    String next = it.next();
                    arrayMap.put(next, o00o00o0OooO0OO.OooO00o(next));
                    it = it;
                    arrayList12 = arrayList13;
                }
                SessionConfig sessionConfig = new SessionConfig(arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, new o000000O(arrayList11, o00o0o00Oooo0O0, 1, range, arrayList12, false, new o00OOO0(arrayMap), null), null);
                CameraDevice cameraDevice = this.f557OooOOO;
                cameraDevice.getClass();
                o00ooo1.OooO00o(sessionConfig, cameraDevice, this.f564OooOo.OooO00o()).OooO0oo(new Runnable() { // from class: Oooo00O.o000000
                    @Override // java.lang.Runnable
                    public final void run() {
                        o000OO o000oo2 = this.f475OooO0Oo;
                        HashSet hashSet2 = o000oo2.f565OooOo0;
                        o00OOO0 o00ooo3 = o00ooo1;
                        hashSet2.remove(o00ooo3);
                        OooOO0O oooOO0OOooOoo = o000oo2.OooOoo(o00ooo3);
                        DeferrableSurface deferrableSurface = o000o;
                        deferrableSurface.OooO00o();
                        OooOo.OooO0oO(Arrays.asList(oooOO0OOooOoo, deferrableSurface.OooO0Oo())).OooO0oo(r4, p033OoooO0O.o00oO0o.OooO00o());
                    }
                }, this.f550OooO0o);
            } else {
                OooOooo();
            }
        }
        this.f560OooOOOo.OooO0OO();
    }

    public final void OooOOo0() {
        o00OOOO0 o00oooo1 = this.f549OooO0Oo;
        SessionConfig sessionConfigOooO0O0 = o00oooo1.OooO00o().OooO0O0();
        o000000O o000000o2 = sessionConfigOooO0O0.f3620OooO0o;
        int size = o000000o2.OooO00o().size();
        int size2 = sessionConfigOooO0O0.OooO0O0().size();
        if (sessionConfigOooO0O0.OooO0O0().isEmpty()) {
            return;
        }
        if (!o000000o2.OooO00o().isEmpty()) {
            if (size2 == 1 && size == 1) {
                OooOooO();
                return;
            }
            if (size >= 2) {
                OooOooO();
                return;
            }
            o00O0O0.OooO00o("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            return;
        }
        if (this.f567OooOo0O == null) {
            this.f567OooOo0O = new o0O000Oo(this.f558OooOOO0.f458OooO0O0, this.f574OooOooO, new o000000O(this));
        }
        o0O000Oo o0o000oo2 = this.f567OooOo0O;
        if (o0o000oo2 != null) {
            String strOooOo0o = OooOo0o(o0o000oo2);
            o0O000Oo o0o000oo3 = this.f567OooOo0O;
            SessionConfig sessionConfig = o0o000oo3.f697OooO0O0;
            LinkedHashMap linkedHashMap = o00oooo1.f3746OooO0O0;
            o00OOOO0.OooO00o oooO00o = (o00OOOO0.OooO00o) linkedHashMap.get(strOooOo0o);
            if (oooO00o == null) {
                oooO00o = new o00OOOO0.OooO00o(sessionConfig, o0o000oo3.f698OooO0OO);
                linkedHashMap.put(strOooOo0o, oooO00o);
            }
            oooO00o.f3749OooO0OO = true;
            o0O000Oo o0o000oo4 = this.f567OooOo0O;
            SessionConfig sessionConfig2 = o0o000oo4.f697OooO0O0;
            o00OOOO0.OooO00o oooO00o2 = (o00OOOO0.OooO00o) linkedHashMap.get(strOooOo0o);
            if (oooO00o2 == null) {
                oooO00o2 = new o00OOOO0.OooO00o(sessionConfig2, o0o000oo4.f698OooO0OO);
                linkedHashMap.put(strOooOo0o, oooO00o2);
            }
            oooO00o2.f3750OooO0Oo = true;
        }
    }

    public final CameraDevice.StateCallback OooOOoo() {
        ArrayList arrayList = new ArrayList(this.f549OooO0Oo.OooO00o().OooO0O0().f3617OooO0O0);
        arrayList.add(this.f568OooOo0o.f655OooO0o);
        arrayList.add(this.f556OooOO0o);
        if (arrayList.isEmpty()) {
            return new o00O0OOO();
        }
        return arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new o00O0OO(arrayList);
    }

    public final void OooOo0() {
        o000OO.OooOOO0.OooO0o(null, this.f553OooO0oo == OooOO0.RELEASING || this.f553OooO0oo == OooOO0.CLOSING);
        o000OO.OooOOO0.OooO0o(null, this.f562OooOOo0.isEmpty());
        this.f557OooOOO = null;
        if (this.f553OooO0oo == OooOO0.CLOSING) {
            Oooo000(OooOO0.INITIALIZED);
            return;
        }
        this.f551OooO0o0.f962OooO00o.OooO00o(this.f561OooOOo);
        Oooo000(OooOO0.RELEASED);
    }

    public final void OooOo00(@NonNull String str, @Nullable Throwable th) {
        String str2 = String.format("{%s} %s", toString(), str);
        String strOooO0oO = o00O0O0.OooO0oO("Camera2CameraImpl");
        if (o00O0O0.OooO0o(3, strOooO0oO)) {
            Log.d(strOooO0oO, str2, th);
        }
    }

    @NonNull
    public final o0o0Oo OooOoO() {
        synchronized (this.f571OooOoOO) {
            if (this.f573OooOoo0 == null) {
                return new o00OOO0(this.f575OooOooo);
            }
            return new o0O00OO(this.f573OooOoo0, this.f558OooOOO0, this.f575OooOooo, this.f550OooO0o, this.f552OooO0oO);
        }
    }

    public final boolean OooOoO0() {
        return this.f562OooOOo0.isEmpty() && this.f565OooOo0.isEmpty();
    }

    @SuppressLint({"MissingPermission"})
    public final void OooOoOO(boolean z) {
        OooOO0O oooOO0O = this.f556OooOO0o;
        if (!z) {
            oooOO0O.f588OooO0o0.f589OooO00o = -1L;
        }
        oooOO0O.OooO00o();
        OooOo00("Opening camera.", null);
        Oooo000(OooOO0.OPENING);
        try {
            this.f551OooO0o0.f962OooO00o.OooO0o0(this.f558OooOOO0.f457OooO00o, this.f550OooO0o, OooOOoo());
        } catch (CameraAccessExceptionCompat e) {
            OooOo00("Unable to open camera due to " + e.getMessage(), null);
            if (e.f3383OooO0Oo != 10001) {
                return;
            }
            Oooo00O(OooOO0.INITIALIZED, new androidx.camera.core.OooO0OO(7, e), true);
        } catch (SecurityException e2) {
            OooOo00("Unable to open camera due to " + e2.getMessage(), null);
            Oooo000(OooOO0.REOPENING);
            oooOO0O.OooO0O0();
        }
    }

    public final com.google.common.util.concurrent.OooOO0O OooOoo(@NonNull o0o0Oo o0o0oo) {
        o0o0oo.close();
        com.google.common.util.concurrent.OooOO0O oooOO0ORelease = o0o0oo.release();
        OooOo00("Releasing session in state " + this.f553OooO0oo.name(), null);
        this.f562OooOOo0.put(o0o0oo, oooOO0ORelease);
        oooOO0ORelease.OooO0oo(new OooOo.OooO0O0(oooOO0ORelease, new o0000O0O(this, o0o0oo)), p033OoooO0O.o00oO0o.OooO00o());
        return oooOO0ORelease;
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public final void OooOoo0() {
        androidx.camera.core.impl.OooO0o oooO0o;
        SessionConfig next;
        boolean z = true;
        o000OO.OooOOO0.OooO0o(null, this.f553OooO0oo == OooOO0.OPENED);
        SessionConfig.OooOO0 oooOO0OooO00o = this.f549OooO0Oo.OooO00o();
        if (!(oooOO0OooO00o.f3633OooOO0 && oooOO0OooO00o.f3631OooO)) {
            OooOo00("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.f566OooOo00.OooO0o0(this.f557OooOOO.getId(), ((o00O00OO) this.f563OooOOoo).OooO00o(this.f557OooOOO.getId()))) {
            OooOo00("Unable to create capture session in camera operating mode = " + ((o00O00OO) this.f563OooOOoo).f1089OooO0o0, null);
            return;
        }
        HashMap map = new HashMap();
        Collection<SessionConfig> collectionOooO0O0 = this.f549OooO0Oo.OooO0O0();
        Collection<o00Oo00<?>> collectionOooO0OO = this.f549OooO0Oo.OooO0OO();
        androidx.camera.core.impl.OooO0o oooO0o2 = o0oO0Ooo.f874OooO00o;
        ArrayList arrayList = new ArrayList(collectionOooO0OO);
        Iterator<SessionConfig> it = collectionOooO0O0.iterator();
        do {
            boolean zHasNext = it.hasNext();
            oooO0o = o0oO0Ooo.f874OooO00o;
            if (!zHasNext) {
                z = false;
                break;
            }
            next = it.next();
            if (next.f3620OooO0o.f3647OooO0O0.OooO0o0(oooO0o) && next.OooO0O0().size() != 1) {
                o00O0O0.OooO0O0("Camera2CameraImpl", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(next.OooO0O0().size())));
            }
            this.f560OooOOOo.OooO0Oo(map);
            o0o0Oo o0o0oo = this.f560OooOOOo;
            SessionConfig sessionConfigOooO0O0 = oooOO0OooO00o.OooO0O0();
            CameraDevice cameraDevice = this.f557OooOOO;
            cameraDevice.getClass();
            com.google.common.util.concurrent.OooOO0O<Void> oooOO0OOooO00o = o0o0oo.OooO00o(sessionConfigOooO0O0, cameraDevice, this.f564OooOo.OooO00o());
            oooOO0OOooO00o.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO00o, new OooO00o()), this.f550OooO0o);
        } while (!next.f3620OooO0o.f3647OooO0O0.OooO0o0(oooO0o));
        if (z) {
            int i = 0;
            for (SessionConfig sessionConfig : collectionOooO0O0) {
                if (((o00Oo00) arrayList.get(i)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                    map.put(sessionConfig.OooO0O0().get(0), 1L);
                } else if (sessionConfig.f3620OooO0o.f3647OooO0O0.OooO0o0(oooO0o)) {
                    map.put(sessionConfig.OooO0O0().get(0), (Long) sessionConfig.f3620OooO0o.f3647OooO0O0.OooO0O0(oooO0o));
                }
                i++;
            }
        }
        this.f560OooOOOo.OooO0Oo(map);
        o0o0Oo o0o0oo2 = this.f560OooOOOo;
        SessionConfig sessionConfigOooO0O1 = oooOO0OooO00o.OooO0O0();
        CameraDevice cameraDevice2 = this.f557OooOOO;
        cameraDevice2.getClass();
        com.google.common.util.concurrent.OooOO0O<Void> oooOO0OOooO00o2 = o0o0oo2.OooO00o(sessionConfigOooO0O1, cameraDevice2, this.f564OooOo.OooO00o());
        oooOO0OOooO00o2.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO00o2, new OooO00o()), this.f550OooO0o);
    }

    public final void OooOooO() {
        if (this.f567OooOo0O != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.f567OooOo0O.getClass();
            sb.append(this.f567OooOo0O.hashCode());
            String string = sb.toString();
            o00OOOO0 o00oooo1 = this.f549OooO0Oo;
            LinkedHashMap linkedHashMap = o00oooo1.f3746OooO0O0;
            if (linkedHashMap.containsKey(string)) {
                o00OOOO0.OooO00o oooO00o = (o00OOOO0.OooO00o) linkedHashMap.get(string);
                oooO00o.f3749OooO0OO = false;
                if (!oooO00o.f3750OooO0Oo) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.f567OooOo0O.getClass();
            sb2.append(this.f567OooOo0O.hashCode());
            o00oooo1.OooO0o0(sb2.toString());
            o0O000Oo o0o000oo2 = this.f567OooOo0O;
            o0o000oo2.getClass();
            o00O0O0.OooO00o("MeteringRepeating", "MeteringRepeating clear!");
            o000O o000o = o0o000oo2.f696OooO00o;
            if (o000o != null) {
                o000o.OooO00o();
            }
            o0o000oo2.f696OooO00o = null;
            this.f567OooOo0O = null;
        }
    }

    public final void OooOooo() {
        o000OO.OooOOO0.OooO0o(null, this.f560OooOOOo != null);
        OooOo00("Resetting Capture Session", null);
        o0o0Oo o0o0oo = this.f560OooOOOo;
        SessionConfig sessionConfigOooO0o = o0o0oo.OooO0o();
        List<o000000O> listOooO0o0 = o0o0oo.OooO0o0();
        o0o0Oo o0o0ooOooOoO = OooOoO();
        this.f560OooOOOo = o0o0ooOooOoO;
        o0o0ooOooOoO.OooO0oO(sessionConfigOooO0o);
        this.f560OooOOOo.OooO0O0(listOooO0o0);
        OooOoo(o0o0oo);
    }

    public final void Oooo0(@NonNull List list) {
        Size sizeOooO0O0;
        boolean zIsEmpty = this.f549OooO0Oo.OooO0O0().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OooOOO0 oooOOO0 = (OooOOO0) it.next();
            if (!this.f549OooO0Oo.OooO0Oo(oooOOO0.OooO0Oo())) {
                o00OOOO0 o00oooo1 = this.f549OooO0Oo;
                String strOooO0Oo = oooOOO0.OooO0Oo();
                SessionConfig sessionConfigOooO00o = oooOOO0.OooO00o();
                o00Oo00<?> o00oo00OooO0OO = oooOOO0.OooO0OO();
                LinkedHashMap linkedHashMap = o00oooo1.f3746OooO0O0;
                o00OOOO0.OooO00o oooO00o = (o00OOOO0.OooO00o) linkedHashMap.get(strOooO0Oo);
                if (oooO00o == null) {
                    oooO00o = new o00OOOO0.OooO00o(sessionConfigOooO00o, o00oo00OooO0OO);
                    linkedHashMap.put(strOooO0Oo, oooO00o);
                }
                oooO00o.f3749OooO0OO = true;
                arrayList.add(oooOOO0.OooO0Oo());
                if (oooOOO0.OooO0o0() == androidx.camera.core.OooOOOO.class && (sizeOooO0O0 = oooOOO0.OooO0O0()) != null) {
                    rational = new Rational(sizeOooO0O0.getWidth(), sizeOooO0O0.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        OooOo00("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED", null);
        if (zIsEmpty) {
            this.f555OooOO0O.OooOOoo(true);
            o0Oo0oo o0oo0oo2 = this.f555OooOO0O;
            synchronized (o0oo0oo2.f848OooO0Oo) {
                o0oo0oo2.f858OooOOOO++;
            }
        }
        OooOOo0();
        Oooo0o();
        Oooo0o0();
        OooOooo();
        OooOO0 oooOO1 = this.f553OooO0oo;
        OooOO0 oooOO2 = OooOO0.OPENED;
        if (oooOO1 == oooOO2) {
            OooOoo0();
        } else {
            int i = OooO0O0.f578OooO00o[this.f553OooO0oo.ordinal()];
            if (i == 1 || i == 2) {
                Oooo0O0(false);
            } else if (i != 3) {
                OooOo00("open() ignored due to being in state: " + this.f553OooO0oo, null);
            } else {
                Oooo000(OooOO0.REOPENING);
                if (!OooOoO0() && this.f559OooOOOO == 0) {
                    o000OO.OooOOO0.OooO0o("Camera Device should be open if session close is not complete", this.f557OooOOO != null);
                    Oooo000(oooOO2);
                    OooOoo0();
                }
            }
        }
        if (rational != null) {
            this.f555OooOO0O.f852OooO0oo.getClass();
        }
    }

    public final void Oooo000(@NonNull OooOO0 oooOO1) {
        Oooo00O(oooOO1, null, true);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    public final void Oooo00O(@NonNull OooOO0 oooOO1, @Nullable androidx.camera.core.OooO0OO oooO0OO, boolean z) {
        CameraInternal.State state;
        CameraInternal.State state2;
        androidx.camera.core.impl.o0O0O00.OooO00o oooO00oOooO0O0;
        HashMap map = null;
        OooOo00("Transitioning camera internal state: " + this.f553OooO0oo + " --> " + oooOO1, null);
        this.f553OooO0oo = oooOO1;
        switch (OooO0O0.f578OooO00o[oooOO1.ordinal()]) {
            case 1:
                state = CameraInternal.State.CLOSED;
                break;
            case 2:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 3:
                state = CameraInternal.State.CLOSING;
                break;
            case 4:
                state = CameraInternal.State.OPEN;
                break;
            case 5:
                state = CameraInternal.State.CONFIGURED;
                break;
            case 6:
            case 7:
                state = CameraInternal.State.OPENING;
                break;
            case 8:
                state = CameraInternal.State.RELEASING;
                break;
            case 9:
                state = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + oooOO1);
        }
        androidx.camera.core.impl.o0O0O00 o0o0o00 = this.f566OooOo00;
        synchronized (o0o0o00.f3764OooO0O0) {
            try {
                int i = o0o0o00.f3767OooO0o;
                int i2 = 1;
                int i3 = 0;
                if (state == CameraInternal.State.RELEASED) {
                    androidx.camera.core.impl.o0O0O00.OooO00o oooO00o = (androidx.camera.core.impl.o0O0O00.OooO00o) o0o0o00.f3768OooO0o0.remove(this);
                    if (oooO00o != null) {
                        o0o0o00.OooO0OO();
                        state2 = oooO00o.f3769OooO00o;
                    } else {
                        state2 = null;
                    }
                } else {
                    androidx.camera.core.impl.o0O0O00.OooO00o oooO00o2 = (androidx.camera.core.impl.o0O0O00.OooO00o) o0o0o00.f3768OooO0o0.get(this);
                    o000OO.OooOOO0.OooO0o0(oooO00o2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    CameraInternal.State state3 = oooO00o2.f3769OooO00o;
                    oooO00o2.f3769OooO00o = state;
                    CameraInternal.State state4 = CameraInternal.State.OPENING;
                    if (state == state4) {
                        o000OO.OooOOO0.OooO0o("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", (state != null && state.OooO00o()) || state3 == state4);
                    }
                    if (state3 != state) {
                        o0o0o00.OooO0OO();
                    }
                    state2 = state3;
                }
                if (state2 != state) {
                    if (((o00O00OO) o0o0o00.f3766OooO0Oo).f1089OooO0o0 == 2 && state == CameraInternal.State.CONFIGURED) {
                        String strOooO00o = ((o00O00OO) o0o0o00.f3766OooO0Oo).OooO00o(OooO().OooO0Oo());
                        if (strOooO00o != null) {
                            oooO00oOooO0O0 = o0o0o00.OooO0O0(strOooO00o);
                        } else {
                            oooO00oOooO0O0 = null;
                        }
                    } else {
                        oooO00oOooO0O0 = null;
                    }
                    if (i < 1 && o0o0o00.f3767OooO0o > 0) {
                        map = new HashMap();
                        for (Map.Entry entry : o0o0o00.f3768OooO0o0.entrySet()) {
                            if (((androidx.camera.core.impl.o0O0O00.OooO00o) entry.getValue()).f3769OooO00o == CameraInternal.State.PENDING_OPEN) {
                                map.put((o000O0Oo) entry.getKey(), (androidx.camera.core.impl.o0O0O00.OooO00o) entry.getValue());
                            }
                        }
                    } else if (state == CameraInternal.State.PENDING_OPEN && o0o0o00.f3767OooO0o > 0) {
                        map = new HashMap();
                        map.put(this, (androidx.camera.core.impl.o0O0O00.OooO00o) o0o0o00.f3768OooO0o0.get(this));
                    }
                    if (map != null && !z) {
                        map.remove(this);
                    }
                    if (map != null) {
                        for (androidx.camera.core.impl.o0O0O00.OooO00o oooO00o3 : map.values()) {
                            oooO00o3.getClass();
                            try {
                                Executor executor = oooO00o3.f3770OooO0O0;
                                androidx.camera.core.impl.o0O0O00.OooO0OO oooO0OO2 = oooO00o3.f3772OooO0Oo;
                                Objects.requireNonNull(oooO0OO2);
                                executor.execute(new oo0o0Oo(oooO0OO2, i3));
                            } catch (RejectedExecutionException e) {
                                o00O0O0.OooO0OO("CameraStateRegistry", "Unable to notify camera to open.", e);
                            }
                        }
                    }
                    if (oooO00oOooO0O0 != null) {
                        try {
                            Executor executor2 = oooO00oOooO0O0.f3770OooO0O0;
                            androidx.camera.core.impl.o0O0O00.OooO0O0 oooO0O0 = oooO00oOooO0O0.f3771OooO0OO;
                            Objects.requireNonNull(oooO0O0);
                            executor2.execute(new o0000O(oooO0O0, i2));
                        } catch (RejectedExecutionException e2) {
                            o00O0O0.OooO0OO("CameraStateRegistry", "Unable to notify camera to configure.", e2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f548OooO.f3714OooO00o.postValue(new o00O000o.OooO0O0<>(state));
        this.f554OooOO0.OooO00o(state, oooO0OO);
    }

    public final void Oooo0O0(boolean z) {
        OooOo00("Attempting to force open the camera.", null);
        if (this.f566OooOo00.OooO0Oo(this)) {
            OooOoOO(z);
        } else {
            OooOo00("No cameras available. Waiting for available camera before opening camera.", null);
            Oooo000(OooOO0.PENDING_OPEN);
        }
    }

    public final void Oooo0OO(boolean z) {
        OooOo00("Attempting to open the camera.", null);
        if (this.f561OooOOo.f580OooO0O0 && this.f566OooOo00.OooO0Oo(this)) {
            OooOoOO(z);
        } else {
            OooOo00("No cameras available. Waiting for available camera before opening camera.", null);
            Oooo000(OooOO0.PENDING_OPEN);
        }
    }

    public final void Oooo0o() {
        Iterator<o00Oo00<?>> it = this.f549OooO0Oo.OooO0OO().iterator();
        boolean zOooOOoo = false;
        while (it.hasNext()) {
            zOooOOoo |= it.next().OooOOoo();
        }
        this.f555OooOO0O.f855OooOO0o.f836OooO0OO = zOooOOoo;
    }

    public final void Oooo0o0() {
        o00OOOO0 o00oooo1 = this.f549OooO0Oo;
        o00oooo1.getClass();
        SessionConfig.OooOO0 oooOO1 = new SessionConfig.OooOO0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : o00oooo1.f3746OooO0O0.entrySet()) {
            o00OOOO0.OooO00o oooO00o = (o00OOOO0.OooO00o) entry.getValue();
            if (oooO00o.f3750OooO0Oo && oooO00o.f3749OooO0OO) {
                String str = (String) entry.getKey();
                oooOO1.OooO00o(oooO00o.f3747OooO00o);
                arrayList.add(str);
            }
        }
        o00O0O0.OooO00o("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + o00oooo1.f3745OooO00o);
        boolean z = oooOO1.f3633OooOO0 && oooOO1.f3631OooO;
        o0Oo0oo o0oo0oo2 = this.f555OooOO0O;
        if (!z) {
            o0oo0oo2.f866OooOo0O = 1;
            o0oo0oo2.f852OooO0oo.f689OooO0OO = 1;
            o0oo0oo2.f856OooOOO.f520OooO0oO = 1;
            this.f560OooOOOo.OooO0oO(o0oo0oo2.OooOOO0());
            return;
        }
        int i = oooOO1.OooO0O0().f3620OooO0o.f3648OooO0OO;
        o0oo0oo2.f866OooOo0O = i;
        o0oo0oo2.f852OooO0oo.f689OooO0OO = i;
        o0oo0oo2.f856OooOOO.f520OooO0oO = i;
        oooOO1.OooO00o(o0oo0oo2.OooOOO0());
        this.f560OooOOOo.OooO0oO(oooOO1.OooO0O0());
    }

    @NonNull
    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f558OooOOO0.f457OooO00o);
    }
}
