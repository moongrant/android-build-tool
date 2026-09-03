package p022Oooo00O;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.o000OO;
import com.google.common.util.concurrent.OooO00o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p023Oooo00o.oO00000;
import p023Oooo00o.oO00O0o;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOO0;
import p030OoooO.OooOOO;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo00;
import p030OoooO.Oooo0;
import p033OoooO0O.o00oO0o;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o0O0OOOo extends o0oO0O0o.OooO00o implements o0oO0O0o, o0oOo0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public o00O000.OooO00o<Void> f758OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o00OOOOo f760OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Handler f761OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Executor f762OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0oO0O0o.OooO00o f763OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ScheduledExecutorService f764OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public oO00000 f765OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public o00O000.OooO0o f766OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooOOO f767OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f759OooO00o = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public List<DeferrableSurface> f768OooOO0O = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f769OooOO0o = false;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f771OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f770OooOOO = false;

    public class OooO00o implements OooOOO0<Void> {
        public OooO00o() {
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            o0O0OOOo o0o0oooo = o0O0OOOo.this;
            o0o0oooo.OooOo0();
            o00OOOOo o00ooooo2 = o0o0oooo.f760OooO0O0;
            o00ooooo2.OooO00o(o0o0oooo);
            synchronized (o00ooooo2.f653OooO0O0) {
                o00ooooo2.f657OooO0o0.remove(o0o0oooo);
            }
        }

        @Override // p030OoooO.OooOOO0
        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
        }
    }

    public o0O0OOOo(@NonNull o00OOOOo o00ooooo2, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler handler) {
        this.f760OooO0O0 = o00ooooo2;
        this.f761OooO0OO = handler;
        this.f762OooO0Oo = executor;
        this.f764OooO0o0 = scheduledExecutorService;
    }

    @Override // p022Oooo00O.o0oO0O0o
    @NonNull
    public com.google.common.util.concurrent.OooO00o<Void> OooO() {
        return OooOo00.OooO0Oo(null);
    }

    @Override // Oooo00O.o0oOo0O0.OooO0O0
    @NonNull
    public com.google.common.util.concurrent.OooO00o<Void> OooO00o(@NonNull CameraDevice cameraDevice, @NonNull final SessionConfigurationCompat sessionConfigurationCompat, @NonNull final List<DeferrableSurface> list) {
        synchronized (this.f759OooO00o) {
            if (this.f771OooOOO0) {
                return new Oooo0.OooO00o(new CancellationException("Opener is disabled"));
            }
            this.f760OooO0O0.OooO0o(this);
            final oO00O0o oo00o0o = new oO00O0o(cameraDevice, this.f761OooO0OO);
            o00O000.OooO0o oooO0oOooO00o = o00O000.OooO00o(new o00O000.OooO0OO() { // from class: Oooo00O.o0O0O0Oo
                @Override // o0ooOO0.o00O000.OooO0OO
                public final Object OooO0o0(o00O000.OooO00o oooO00o) {
                    String str;
                    o0O0OOOo o0o0oooo = this.f746OooO0Oo;
                    List<DeferrableSurface> list2 = list;
                    oO00O0o oo00o0o2 = oo00o0o;
                    SessionConfigurationCompat sessionConfigurationCompat2 = sessionConfigurationCompat;
                    synchronized (o0o0oooo.f759OooO00o) {
                        o0o0oooo.OooOOoo(list2);
                        o000OO.OooOOO0.OooO0o("The openCaptureSessionCompleter can only set once!", o0o0oooo.f758OooO == null);
                        o0o0oooo.f758OooO = oooO00o;
                        oo00o0o2.f956OooO00o.OooO00o(sessionConfigurationCompat2);
                        str = "openCaptureSession[session=" + o0o0oooo + "]";
                    }
                    return str;
                }
            });
            this.f766OooO0oo = oooO0oOooO00o;
            OooO00o oooO00o = new OooO00o();
            oooO0oOooO00o.OooO(new OooOo00.OooO0O0(oooO0oOooO00o, oooO00o), o00oO0o.OooO00o());
            return OooOo00.OooO0o0(this.f766OooO0oo);
        }
    }

    @Override // p022Oooo00O.o0oO0O0o
    @NonNull
    public final o0O0OOOo OooO0O0() {
        return this;
    }

    @Override // p022Oooo00O.o0oO0O0o
    public final void OooO0OO() throws CameraAccessException {
        o000OO.OooOOO0.OooO0o0(this.f765OooO0oO, "Need to call openCaptureSession before using this API.");
        this.f765OooO0oO.f921OooO00o.f953OooO00o.stopRepeating();
    }

    @Override // p022Oooo00O.o0oO0O0o
    public final void OooO0Oo() {
        OooOo0();
    }

    @Override // Oooo00O.o0oOo0O0.OooO0O0
    @NonNull
    public com.google.common.util.concurrent.OooO00o OooO0o(@NonNull final ArrayList arrayList) {
        synchronized (this.f759OooO00o) {
            if (this.f771OooOOO0) {
                return new Oooo0.OooO00o(new CancellationException("Opener is disabled"));
            }
            OooOOO oooOOOOooO0OO = OooOOO.OooO00o(o000OO.OooO0OO(arrayList, this.f762OooO0Oo, this.f764OooO0o0)).OooO0OO(new OooOO0() { // from class: Oooo00O.o0O0oo0o
                @Override // p030OoooO.OooOO0
                public final OooO00o apply(Object obj) {
                    List list = (List) obj;
                    o0O0OOOo o0o0oooo = this.f787OooO00o;
                    o0o0oooo.getClass();
                    o00O0O0.OooO00o("SyncCaptureSessionBase", "[" + o0o0oooo + "] getSurface...done");
                    if (list.contains(null)) {
                        return new Oooo0.OooO00o(new DeferrableSurface.SurfaceClosedException((DeferrableSurface) arrayList.get(list.indexOf(null)), "Surface closed"));
                    }
                    return list.isEmpty() ? new Oooo0.OooO00o(new IllegalArgumentException("Unable to open capture session without surfaces")) : OooOo00.OooO0Oo(list);
                }
            }, this.f762OooO0Oo);
            this.f767OooOO0 = oooOOOOooO0OO;
            return OooOo00.OooO0o0(oooOOOOooO0OO);
        }
    }

    @Override // p022Oooo00O.o0oO0O0o
    public int OooO0o0(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        o000OO.OooOOO0.OooO0o0(this.f765OooO0oO, "Need to call openCaptureSession before using this API.");
        return this.f765OooO0oO.f921OooO00o.OooO0O0(captureRequest, this.f762OooO0Oo, captureCallback);
    }

    @Override // p022Oooo00O.o0oO0O0o
    @NonNull
    public final oO00000 OooO0oO() {
        this.f765OooO0oO.getClass();
        return this.f765OooO0oO;
    }

    @Override // p022Oooo00O.o0oO0O0o
    public final int OooO0oo(@NonNull ArrayList arrayList, @NonNull o00O0O0O o00o0o0o2) throws CameraAccessException {
        o000OO.OooOOO0.OooO0o0(this.f765OooO0oO, "Need to call openCaptureSession before using this API.");
        return this.f765OooO0oO.f921OooO00o.OooO00o(arrayList, this.f762OooO0Oo, o00o0o0o2);
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOO0(@NonNull o0O0OOOo o0o0oooo) {
        Objects.requireNonNull(this.f763OooO0o);
        this.f763OooO0o.OooOO0(o0o0oooo);
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    @RequiresApi(api = 26)
    public final void OooOO0O(@NonNull o0O0OOOo o0o0oooo) {
        Objects.requireNonNull(this.f763OooO0o);
        this.f763OooO0o.OooOO0O(o0o0oooo);
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public void OooOO0o(@NonNull o0oO0O0o o0oo0o0o2) {
        o00O000.OooO0o oooO0o;
        synchronized (this.f759OooO00o) {
            try {
                if (this.f769OooOO0o) {
                    oooO0o = null;
                } else {
                    this.f769OooOO0o = true;
                    o000OO.OooOOO0.OooO0o0(this.f766OooO0oo, "Need to call openCaptureSession before using this API.");
                    oooO0o = this.f766OooO0oo;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        OooOo0();
        if (oooO0o != null) {
            oooO0o.f57402OooO0o0.OooO(new o0O0O0o0(0, this, o0oo0o0o2), o00oO0o.OooO00o());
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public void OooOOO(@NonNull o0O0OOOo o0o0oooo) {
        Objects.requireNonNull(this.f763OooO0o);
        o00OOOOo o00ooooo2 = this.f760OooO0O0;
        synchronized (o00ooooo2.f653OooO0O0) {
            o00ooooo2.f654OooO0OO.add(this);
            o00ooooo2.f657OooO0o0.remove(this);
        }
        o00ooooo2.OooO00o(this);
        this.f763OooO0o.OooOOO(o0o0oooo);
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOOO0(@NonNull o0oO0O0o o0oo0o0o2) {
        Objects.requireNonNull(this.f763OooO0o);
        OooOo0();
        o00OOOOo o00ooooo2 = this.f760OooO0O0;
        o00ooooo2.OooO00o(this);
        synchronized (o00ooooo2.f653OooO0O0) {
            o00ooooo2.f657OooO0o0.remove(this);
        }
        this.f763OooO0o.OooOOO0(o0oo0o0o2);
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOOOO(@NonNull o0O0OOOo o0o0oooo) {
        Objects.requireNonNull(this.f763OooO0o);
        this.f763OooO0o.OooOOOO(o0o0oooo);
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOOOo(@NonNull o0oO0O0o o0oo0o0o2) {
        o00O000.OooO0o oooO0o;
        synchronized (this.f759OooO00o) {
            try {
                if (this.f770OooOOO) {
                    oooO0o = null;
                } else {
                    this.f770OooOOO = true;
                    o000OO.OooOOO0.OooO0o0(this.f766OooO0oo, "Need to call openCaptureSession before using this API.");
                    oooO0o = this.f766OooO0oo;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oooO0o != null) {
            oooO0o.f57402OooO0o0.OooO(new o0O0OOO0(0, this, o0oo0o0o2), o00oO0o.OooO00o());
        }
    }

    public final void OooOOo(@NonNull CameraCaptureSession cameraCaptureSession) {
        if (this.f765OooO0oO == null) {
            this.f765OooO0oO = new oO00000(cameraCaptureSession, this.f761OooO0OO);
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    @RequiresApi(api = 23)
    public final void OooOOo0(@NonNull o0O0OOOo o0o0oooo, @NonNull Surface surface) {
        Objects.requireNonNull(this.f763OooO0o);
        this.f763OooO0o.OooOOo0(o0o0oooo, surface);
    }

    public final void OooOOoo(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        synchronized (this.f759OooO00o) {
            OooOo0();
            o000OO.OooO0O0(list);
            this.f768OooOO0O = list;
        }
    }

    public final void OooOo0() {
        synchronized (this.f759OooO00o) {
            List<DeferrableSurface> list = this.f768OooOO0O;
            if (list != null) {
                o000OO.OooO00o(list);
                this.f768OooOO0O = null;
            }
        }
    }

    public final boolean OooOo00() {
        boolean z;
        synchronized (this.f759OooO00o) {
            z = this.f766OooO0oo != null;
        }
        return z;
    }

    @Override // p022Oooo00O.o0oO0O0o
    public void close() {
        o000OO.OooOOO0.OooO0o0(this.f765OooO0oO, "Need to call openCaptureSession before using this API.");
        o00OOOOo o00ooooo2 = this.f760OooO0O0;
        synchronized (o00ooooo2.f653OooO0O0) {
            o00ooooo2.f655OooO0Oo.add(this);
        }
        this.f765OooO0oO.f921OooO00o.f953OooO00o.close();
        this.f762OooO0Oo.execute(new o0O0OO0(this, 0));
    }

    @Override // p022Oooo00O.o0oO0O0o
    @NonNull
    public final CameraDevice getDevice() {
        this.f765OooO0oO.getClass();
        return this.f765OooO0oO.OooO00o().getDevice();
    }

    @Override // Oooo00O.o0oOo0O0.OooO0O0
    public boolean stop() {
        boolean z;
        OooOOO oooOOO = null;
        try {
            synchronized (this.f759OooO00o) {
                if (!this.f771OooOOO0) {
                    OooOOO oooOOO2 = this.f767OooOO0;
                    oooOOO = oooOOO2 != null ? oooOOO2 : null;
                    this.f771OooOOO0 = true;
                }
                z = !OooOo00();
            }
            if (oooOOO != null) {
                oooOOO.cancel(true);
            }
            return z;
        } catch (Throwable th) {
            if (oooOOO != null) {
                oooOOO.cancel(true);
            }
            throw th;
        }
    }
}
