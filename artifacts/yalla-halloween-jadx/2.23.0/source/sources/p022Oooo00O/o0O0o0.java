package p022Oooo00O;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.o00O0OO0;
import com.google.common.util.concurrent.OooO00o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p025Oooo0OO.o00000;
import p025Oooo0OO.o00000O0;
import p025Oooo0OO.o000O0o;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO;
import p030OoooO.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O0o0 extends o0O0OOOo {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Object f776OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    @GuardedBy("mObjectLock")
    public List<DeferrableSurface> f777OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o00000O0 f778OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mObjectLock")
    public OooOOO f779OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o000O0o f780OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o00000 f781OooOo00;

    public o0O0o0(@NonNull Handler handler, @NonNull o00OOOOo o00ooooo2, @NonNull o00O0OO0 o00o0oo1, @NonNull o00O0OO0 o00o0oo2, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        super(o00ooooo2, executor, scheduledExecutorService, handler);
        this.f776OooOOOO = new Object();
        this.f778OooOOo = new o00000O0(o00o0oo1, o00o0oo2);
        this.f780OooOOoo = new o000O0o(o00o0oo1);
        this.f781OooOo00 = new o00000(o00o0oo2);
    }

    public static /* synthetic */ void OooOo0O(o0O0o0 o0o0o0) {
        o0o0o0.OooOo("Session call super.close()");
        super.close();
    }

    @Override // p022Oooo00O.o0O0OOOo, p022Oooo00O.o0oO0O0o
    @NonNull
    public final OooO00o<Void> OooO() {
        return OooOo00.OooO0o0(this.f780OooOOoo.f1062OooO0OO);
    }

    @Override // p022Oooo00O.o0O0OOOo, Oooo00O.o0oOo0O0.OooO0O0
    @NonNull
    public final OooO00o<Void> OooO00o(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat, @NonNull List<DeferrableSurface> list) {
        OooO00o<Void> oooO00oOooO0o0;
        synchronized (this.f776OooOOOO) {
            o000O0o o000o0o2 = this.f780OooOOoo;
            ArrayList arrayListOooO0OO = this.f760OooO0O0.OooO0OO();
            o0O0o00O o0o0o00o = new o0O0o00O(this);
            o000o0o2.getClass();
            OooOOO oooOOOOooO00o = o000O0o.OooO00o(cameraDevice, sessionConfigurationCompat, o0o0o00o, list, arrayListOooO0OO);
            this.f779OooOOo0 = oooOOOOooO00o;
            oooO00oOooO0o0 = OooOo00.OooO0o0(oooOOOOooO00o);
        }
        return oooO00oOooO0o0;
    }

    @Override // p022Oooo00O.o0O0OOOo, Oooo00O.o0oOo0O0.OooO0O0
    @NonNull
    public final OooO00o OooO0o(@NonNull ArrayList arrayList) {
        OooO00o oooO00oOooO0o;
        synchronized (this.f776OooOOOO) {
            this.f777OooOOOo = arrayList;
            oooO00oOooO0o = super.OooO0o(arrayList);
        }
        return oooO00oOooO0o;
    }

    @Override // p022Oooo00O.o0O0OOOo, p022Oooo00O.o0oO0O0o
    public final int OooO0o0(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        int iOooO0o0;
        o000O0o o000o0o2 = this.f780OooOOoo;
        synchronized (o000o0o2.f1061OooO0O0) {
            if (o000o0o2.f1060OooO00o) {
                o000O000 o000o001 = new o000O000(Arrays.asList(o000o0o2.f1064OooO0o, captureCallback));
                o000o0o2.f1065OooO0o0 = true;
                captureCallback = o000o001;
            }
            iOooO0o0 = super.OooO0o0(captureRequest, captureCallback);
        }
        return iOooO0o0;
    }

    @Override // p022Oooo00O.o0O0OOOo, Oooo00O.o0oO0O0o.OooO00o
    public final void OooOO0o(@NonNull o0oO0O0o o0oo0o0o2) {
        synchronized (this.f776OooOOOO) {
            this.f778OooOOo.OooO00o(this.f777OooOOOo);
        }
        OooOo("onClosed()");
        super.OooOO0o(o0oo0o0o2);
    }

    @Override // p022Oooo00O.o0O0OOOo, Oooo00O.o0oO0O0o.OooO00o
    public final void OooOOO(@NonNull o0O0OOOo o0o0oooo) {
        o0oO0O0o o0oo0o0o2;
        o0oO0O0o o0oo0o0o3;
        OooOo("Session onConfigured()");
        o00OOOOo o00ooooo2 = this.f760OooO0O0;
        ArrayList arrayListOooO0Oo = o00ooooo2.OooO0Oo();
        ArrayList arrayListOooO0O0 = o00ooooo2.OooO0O0();
        o00000 o00000Var = this.f781OooOo00;
        if (o00000Var.f1043OooO00o != null) {
            LinkedHashSet<o0oO0O0o> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayListOooO0Oo.iterator();
            while (it.hasNext() && (o0oo0o0o3 = (o0oO0O0o) it.next()) != o0o0oooo) {
                linkedHashSet.add(o0oo0o0o3);
            }
            for (o0oO0O0o o0oo0o0o4 : linkedHashSet) {
                o0oo0o0o4.OooO0O0().OooOOO0(o0oo0o0o4);
            }
        }
        super.OooOOO(o0o0oooo);
        if (o00000Var.f1043OooO00o != null) {
            LinkedHashSet<o0oO0O0o> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = arrayListOooO0O0.iterator();
            while (it2.hasNext() && (o0oo0o0o2 = (o0oO0O0o) it2.next()) != o0o0oooo) {
                linkedHashSet2.add(o0oo0o0o2);
            }
            for (o0oO0O0o o0oo0o0o5 : linkedHashSet2) {
                o0oo0o0o5.OooO0O0().OooOO0o(o0oo0o0o5);
            }
        }
    }

    public final void OooOo(String str) {
        o00O0O0.OooO00o("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // p022Oooo00O.o0O0OOOo, p022Oooo00O.o0oO0O0o
    public final void close() {
        OooOo("Session call close()");
        o000O0o o000o0o2 = this.f780OooOOoo;
        synchronized (o000o0o2.f1061OooO0O0) {
            if (o000o0o2.f1060OooO00o && !o000o0o2.f1065OooO0o0) {
                o000o0o2.f1062OooO0OO.cancel(true);
            }
        }
        OooOo00.OooO0o0(this.f780OooOOoo.f1062OooO0OO).OooO(new o0O0o000(this, 0), this.f762OooO0Oo);
    }

    @Override // p022Oooo00O.o0O0OOOo, Oooo00O.o0oOo0O0.OooO0O0
    public final boolean stop() {
        boolean zStop;
        synchronized (this.f776OooOOOO) {
            if (OooOo00()) {
                this.f778OooOOo.OooO00o(this.f777OooOOOo);
            } else {
                OooOOO oooOOO = this.f779OooOOo0;
                if (oooOOO != null) {
                    oooOOO.cancel(true);
                }
            }
            zStop = super.stop();
        }
        return zStop;
    }
}
