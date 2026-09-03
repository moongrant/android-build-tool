package p022Oooo00O;

import Oooo0.OooO;
import Oooo00O.o0O00OO.OooO00o;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.OooOOOO;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000OO;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00OO000;
import com.google.common.util.concurrent.OooO00o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p026Oooo0o.OooOo00;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOO0;
import p030OoooO.OooOOO;
import p030OoooO.OooOOO0;
import p030OoooO.Oooo0;
import p033OoooO0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
public final class o0O00OO implements o0o0Oo {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final ArrayList f703OooOOO = new ArrayList();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static int f704OooOOOO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O f706OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f707OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScheduledExecutorService f708OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOO0 f709OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public SessionConfig f710OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o00O0 f712OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public SessionConfig f713OooO0oo;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f717OooOOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<DeferrableSurface> f711OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public volatile List<o000000O> f714OooOO0 = null;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOo00 f715OooOO0O = new OooOo00(o00O0.Oooo0O0(o00O00O.Oooo0OO()));

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooOo00 f716OooOO0o = new OooOo00(o00O0.Oooo0O0(o00O00O.Oooo0OO()));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0OO f705OooO = OooO0OO.UNINITIALIZED;

    public class OooO00o implements OooOOO0<Void> {
        public OooO00o() {
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            o00O0O0.OooO0OO("ProcessingCaptureSession", "open session failed ", th);
            o0O00OO o0o00oo2 = o0O00OO.this;
            o0o00oo2.close();
            o0o00oo2.release();
        }

        @Override // p030OoooO.OooOOO0
        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f719OooO00o;

        static {
            int[] iArr = new int[OooO0OO.values().length];
            f719OooO00o = iArr;
            try {
                iArr[OooO0OO.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f719OooO00o[OooO0OO.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f719OooO00o[OooO0OO.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f719OooO00o[OooO0OO.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f719OooO00o[OooO0OO.DE_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum OooO0OO {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    public static class OooO0o {
    }

    public o0O00OO(@NonNull o00O o00o2, @NonNull o000 o000Var, @NonNull OooO oooO, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f717OooOOO0 = 0;
        this.f709OooO0Oo = new o00OOO0(oooO);
        this.f706OooO00o = o00o2;
        this.f707OooO0O0 = executor;
        this.f708OooO0OO = scheduledExecutorService;
        new OooO0o();
        int i = f704OooOOOO;
        f704OooOOOO = i + 1;
        this.f717OooOOO0 = i;
        o00O0O0.OooO00o("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + i + ")");
    }

    public static void OooO0oo(@NonNull List<o000000O> list) {
        Iterator<o000000O> it = list.iterator();
        while (it.hasNext()) {
            Iterator<o000oOoO> it2 = it.next().f3652OooO0o0.iterator();
            while (it2.hasNext()) {
                it2.next().OooO00o();
            }
        }
    }

    public final void OooO(@NonNull OooOo00 oooOo00, @NonNull OooOo00 oooOo01) {
        o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
        for (Config.OooO00o oooO00o : oooOo00.OooO0oo()) {
            o00o00oOooo0OO.Oooo0oO(oooO00o, oooOo00.OooO0O0(oooO00o));
        }
        for (Config.OooO00o oooO00o2 : oooOo01.OooO0oo()) {
            o00o00oOooo0OO.Oooo0oO(oooO00o2, oooOo01.OooO0O0(oooO00o2));
        }
        o00O0.Oooo0O0(o00o00oOooo0OO);
        this.f706OooO00o.OooO0oo();
    }

    @Override // p022Oooo00O.o0o0Oo
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<Void> OooO00o(@NonNull final SessionConfig sessionConfig, @NonNull final CameraDevice cameraDevice, @NonNull final o0oOo0O0 o0ooo0o1) {
        o000OO.OooOOO0.OooO0O0(this.f705OooO == OooO0OO.UNINITIALIZED, "Invalid state state:" + this.f705OooO);
        o000OO.OooOOO0.OooO0O0(sessionConfig.OooO0O0().isEmpty() ^ true, "SessionConfig contains no surfaces");
        o00O0O0.OooO00o("ProcessingCaptureSession", "open (id=" + this.f717OooOOO0 + ")");
        List<DeferrableSurface> listOooO0O0 = sessionConfig.OooO0O0();
        this.f711OooO0o0 = listOooO0O0;
        ScheduledExecutorService scheduledExecutorService = this.f708OooO0OO;
        Executor executor = this.f707OooO0O0;
        return p030OoooO.OooOo00.OooO0oo(OooOOO.OooO00o(o000OO.OooO0OO(listOooO0O0, executor, scheduledExecutorService)).OooO0OO(new OooOO0() { // from class: Oooo00O.o0O00
            @Override // p030OoooO.OooOO0
            public final OooO00o apply(Object obj) {
                Executor executor2;
                OooO00o<Void> OooO00o2;
                List list = (List) obj;
                StringBuilder sb = new StringBuilder("-- getSurfaces done, start init (id=");
                final o0O00OO o0o00oo2 = this.f673OooO00o;
                int i = o0o00oo2.f717OooOOO0;
                sb.append(i);
                sb.append(")");
                o00O0O0.OooO00o("ProcessingCaptureSession", sb.toString());
                if (o0o00oo2.f705OooO == o0O00OO.OooO0OO.DE_INITIALIZED) {
                    return new Oooo0.OooO00o(new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                boolean zContains = list.contains(null);
                SessionConfig sessionConfig2 = sessionConfig;
                if (zContains) {
                    OooO00o2 = new Oooo0.OooO00o<>(new DeferrableSurface.SurfaceClosedException(sessionConfig2.OooO0O0().get(list.indexOf(null)), "Surface closed"));
                } else {
                    boolean z = false;
                    z = false;
                    for (int i2 = 0; i2 < sessionConfig2.OooO0O0().size(); i2++) {
                        DeferrableSurface deferrableSurface = sessionConfig2.OooO0O0().get(i2);
                        boolean zEquals = Objects.equals(deferrableSurface.f3539OooO0oo, OooOOOO.class);
                        int i3 = deferrableSurface.f3538OooO0oO;
                        Size size = deferrableSurface.f3536OooO0o;
                        if (zEquals) {
                            new androidx.camera.core.impl.OooOOO(deferrableSurface.OooO0OO().get(), new Size(size.getWidth(), size.getHeight()), i3);
                        } else if (Objects.equals(deferrableSurface.f3539OooO0oo, ImageCapture.class)) {
                            new androidx.camera.core.impl.OooOOO(deferrableSurface.OooO0OO().get(), new Size(size.getWidth(), size.getHeight()), i3);
                        } else if (Objects.equals(deferrableSurface.f3539OooO0oo, ImageAnalysis.class)) {
                            new androidx.camera.core.impl.OooOOO(deferrableSurface.OooO0OO().get(), new Size(size.getWidth(), size.getHeight()), i3);
                        }
                    }
                    o0o00oo2.f705OooO = o0O00OO.OooO0OO.SESSION_INITIALIZED;
                    try {
                        o000OO.OooO0O0(o0o00oo2.f711OooO0o0);
                        o00O0O0.OooO0oo("ProcessingCaptureSession", "== initSession (id=" + i + ")");
                        try {
                            SessionConfig sessionConfigOooO0o = o0o00oo2.f706OooO00o.OooO0o();
                            o0o00oo2.f713OooO0oo = sessionConfigOooO0o;
                            sessionConfigOooO0o.OooO0O0().get(0).OooO0Oo().OooO(new Runnable() { // from class: Oooo00O.o0O00O0o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    o000OO.OooO00o(o0o00oo2.f711OooO0o0);
                                }
                            }, o00oO0o.OooO00o());
                            Iterator<DeferrableSurface> it = o0o00oo2.f713OooO0oo.OooO0O0().iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                executor2 = o0o00oo2.f707OooO0O0;
                                if (!zHasNext) {
                                    break;
                                }
                                DeferrableSurface next = it.next();
                                o0O00OO.f703OooOOO.add(next);
                                next.OooO0Oo().OooO(new o0O00O(next, z ? 1 : 0), executor2);
                            }
                            SessionConfig.OooOO0 oooOO1 = new SessionConfig.OooOO0();
                            oooOO1.OooO00o(sessionConfig2);
                            oooOO1.f3625OooO00o.clear();
                            oooOO1.f3626OooO0O0.f3655OooO00o.clear();
                            oooOO1.OooO00o(o0o00oo2.f713OooO0oo);
                            if (oooOO1.f3635OooOO0 && oooOO1.f3633OooO) {
                                z = true;
                            }
                            o000OO.OooOOO0.OooO0O0(z, "Cannot transform the SessionConfig");
                            SessionConfig sessionConfigOooO0O0 = oooOO1.OooO0O0();
                            CameraDevice cameraDevice2 = cameraDevice;
                            cameraDevice2.getClass();
                            OooO00o2 = o0o00oo2.f709OooO0Oo.OooO00o(sessionConfigOooO0O0, cameraDevice2, o0ooo0o1);
                            OooO00o2.OooO(new OoooO.OooOo00.OooO0O0(OooO00o2, o0o00oo2.new OooO00o()), executor2);
                        } catch (Throwable th) {
                            o000OO.OooO00o(o0o00oo2.f711OooO0o0);
                            throw th;
                        }
                    } catch (DeferrableSurface.SurfaceClosedException e) {
                        return new Oooo0.OooO00o(e);
                    }
                }
                return OooO00o2;
            }
        }, executor), new Function() { // from class: Oooo00O.o0OoO00O
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                o0O00OO o0o00oo2 = this.f865OooO00o;
                o00OOO0 o00ooo1 = o0o00oo2.f709OooO0Oo;
                o000OO.OooOOO0.OooO0O0(o0o00oo2.f705OooO == o0O00OO.OooO0OO.SESSION_INITIALIZED, "Invalid state state:" + o0o00oo2.f705OooO);
                List<DeferrableSurface> listOooO0O1 = o0o00oo2.f713OooO0oo.OooO0O0();
                ArrayList arrayList = new ArrayList();
                for (DeferrableSurface deferrableSurface : listOooO0O1) {
                    o000OO.OooOOO0.OooO0O0(deferrableSurface instanceof o00OO000, "Surface must be SessionProcessorSurface");
                    arrayList.add((o00OO000) deferrableSurface);
                }
                o0o00oo2.f712OooO0oO = new o00O0(o00ooo1, arrayList);
                o0o00oo2.f706OooO00o.OooO0oO();
                o0o00oo2.f705OooO = o0O00OO.OooO0OO.ON_CAPTURE_SESSION_STARTED;
                SessionConfig sessionConfig2 = o0o00oo2.f710OooO0o;
                if (sessionConfig2 != null) {
                    o0o00oo2.OooO0oO(sessionConfig2);
                }
                if (o0o00oo2.f714OooOO0 != null) {
                    o0o00oo2.OooO0O0(o0o00oo2.f714OooOO0);
                    o0o00oo2.f714OooOO0 = null;
                }
                return null;
            }
        }, executor);
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void OooO0O0(@NonNull List<o000000O> list) {
        boolean z;
        if (list.isEmpty()) {
            return;
        }
        o00O0O0.OooO00o("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f717OooOOO0 + ") + state =" + this.f705OooO);
        int i = OooO0O0.f719OooO00o[this.f705OooO.ordinal()];
        if (i == 1 || i == 2) {
            this.f714OooOO0 = list;
            return;
        }
        if (i != 3) {
            if (i == 4 || i == 5) {
                o00O0O0.OooO00o("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f705OooO);
                OooO0oo(list);
                return;
            }
            return;
        }
        for (o000000O o000000o2 : list) {
            if (o000000o2.f3649OooO0OO == 2) {
                OooOo00.OooO00o oooO00oOooO0Oo = OooOo00.OooO00o.OooO0Oo(o000000o2.f3648OooO0O0);
                androidx.camera.core.impl.OooO0o oooO0o = o000000O.f3645OooO;
                Config config = o000000o2.f3648OooO0O0;
                if (config.OooO0o0(oooO0o)) {
                    oooO00oOooO0Oo.f1098OooO00o.Oooo0oO(Oooo000.OooO00o.Oooo0O0(CaptureRequest.JPEG_ORIENTATION), (Integer) config.OooO0O0(oooO0o));
                }
                androidx.camera.core.impl.OooO0o oooO0o2 = o000000O.f3646OooOO0;
                if (config.OooO0o0(oooO0o2)) {
                    oooO00oOooO0Oo.f1098OooO00o.Oooo0oO(Oooo000.OooO00o.Oooo0O0(CaptureRequest.JPEG_QUALITY), Byte.valueOf(((Integer) config.OooO0O0(oooO0o2)).byteValue()));
                }
                OooOo00 oooOo00OooO0OO = oooO00oOooO0Oo.OooO0OO();
                this.f716OooOO0o = oooOo00OooO0OO;
                OooO(this.f715OooOO0O, oooOo00OooO0OO);
                this.f706OooO00o.OooO00o();
            } else {
                o00O0O0.OooO00o("ProcessingCaptureSession", "issueTriggerRequest");
                Iterator<Config.OooO00o<?>> it = OooOo00.OooO00o.OooO0Oo(o000000o2.f3648OooO0O0).OooO0OO().getConfig().OooO0oo().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    CaptureRequest.Key key = (CaptureRequest.Key) it.next().OooO0OO();
                    if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    this.f706OooO00o.OooOO0();
                } else {
                    OooO0oo(Arrays.asList(o000000o2));
                }
            }
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void OooO0OO() {
        o00O0O0.OooO00o("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f717OooOOO0 + ")");
        if (this.f714OooOO0 != null) {
            Iterator<o000000O> it = this.f714OooOO0.iterator();
            while (it.hasNext()) {
                Iterator<o000oOoO> it2 = it.next().f3652OooO0o0.iterator();
                while (it2.hasNext()) {
                    it2.next().OooO00o();
                }
            }
            this.f714OooOO0 = null;
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void OooO0Oo(@NonNull HashMap map) {
    }

    @Override // p022Oooo00O.o0o0Oo
    @Nullable
    public final SessionConfig OooO0o() {
        return this.f710OooO0o;
    }

    @Override // p022Oooo00O.o0o0Oo
    @NonNull
    public final List<o000000O> OooO0o0() {
        return this.f714OooOO0 != null ? this.f714OooOO0 : Collections.emptyList();
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void OooO0oO(@Nullable SessionConfig sessionConfig) {
        boolean z;
        o00O0O0.OooO00o("ProcessingCaptureSession", "setSessionConfig (id=" + this.f717OooOOO0 + ")");
        this.f710OooO0o = sessionConfig;
        if (sessionConfig != null && this.f705OooO == OooO0OO.ON_CAPTURE_SESSION_STARTED) {
            o000000O o000000o2 = sessionConfig.f3622OooO0o;
            OooOo00 oooOo00OooO0OO = OooOo00.OooO00o.OooO0Oo(o000000o2.f3648OooO0O0).OooO0OO();
            this.f715OooOO0O = oooOo00OooO0OO;
            OooO(oooOo00OooO0OO, this.f716OooOO0o);
            Iterator<DeferrableSurface> it = o000000o2.OooO00o().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (Objects.equals(it.next().f3539OooO0oo, OooOOOO.class)) {
                    z = true;
                    break;
                }
            }
            o00O o00o2 = this.f706OooO00o;
            if (z) {
                o00o2.OooO();
            } else {
                o00o2.OooO0OO();
            }
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void close() {
        o00O0O0.OooO00o("ProcessingCaptureSession", "close (id=" + this.f717OooOOO0 + ") state=" + this.f705OooO);
        if (this.f705OooO == OooO0OO.ON_CAPTURE_SESSION_STARTED) {
            this.f706OooO00o.OooO0O0();
            o00O0 o00o1 = this.f712OooO0oO;
            if (o00o1 != null) {
                o00o1.getClass();
            }
            this.f705OooO = OooO0OO.ON_CAPTURE_SESSION_ENDED;
        }
        this.f709OooO0Oo.close();
    }

    @Override // p022Oooo00O.o0o0Oo
    @NonNull
    public final com.google.common.util.concurrent.OooO00o release() {
        o00O0O0.OooO00o("ProcessingCaptureSession", "release (id=" + this.f717OooOOO0 + ") mProcessorState=" + this.f705OooO);
        com.google.common.util.concurrent.OooO00o oooO00oRelease = this.f709OooO0Oo.release();
        int i = OooO0O0.f719OooO00o[this.f705OooO.ordinal()];
        if (i == 2 || i == 4) {
            oooO00oRelease.OooO(new o0O000o0(this, 0), this.f707OooO0O0);
        }
        this.f705OooO = OooO0OO.DE_INITIALIZED;
        return oooO00oRelease;
    }
}
