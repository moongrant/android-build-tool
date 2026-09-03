package p038OoooOoO;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Oooo0;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o00O00o0;
import androidx.camera.core.impl.o00oO0o;
import androidx.camera.video.OooOOOO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o000OO.OooOOO0;
import p031OoooO0.o0Oo0oo;
import p037OoooOo0.o00O000;
import p037OoooOo0.o00O0000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o000O0o implements CameraInternal {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Set<Oooo0> f1634OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UseCaseConfigFactory f1637OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final CameraInternal f1638OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final o000O00 f1639OooOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final HashMap f1636OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final HashMap f1635OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final o000O000 f1633OooO = new o000O000(this);

    public o000O0o(@NonNull CameraInternal cameraInternal, @NonNull HashSet hashSet, @NonNull UseCaseConfigFactory useCaseConfigFactory, @NonNull o000OO o000oo2) {
        this.f1638OooO0oo = cameraInternal;
        this.f1637OooO0oO = useCaseConfigFactory;
        this.f1634OooO0Oo = hashSet;
        this.f1639OooOO0 = new o000O00(cameraInternal.OooO0o(), o000oo2);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f1635OooO0o.put((Oooo0) it.next(), Boolean.FALSE);
        }
    }

    @Nullable
    @VisibleForTesting
    public static DeferrableSurface OooOOo(@NonNull Oooo0 oooo0) {
        List<DeferrableSurface> listOooO0O0 = oooo0 instanceof ImageCapture ? oooo0.f3497OooOOO0.OooO0O0() : oooo0.f3497OooOOO0.f3622OooO0o.OooO00o();
        OooOOO0.OooO0o(null, listOooO0O0.size() <= 1);
        if (listOooO0O0.size() == 1) {
            return listOooO0O0.get(0);
        }
        return null;
    }

    public static void OooOOo0(@NonNull o00O0000 o00o0001, @NonNull DeferrableSurface deferrableSurface, @NonNull SessionConfig sessionConfig) {
        o00o0001.OooO0Oo();
        try {
            o0Oo0oo.OooO00o();
            o00o0001.OooO0O0();
            o00o0001.f1603OooOOO0.OooO0oo(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            Iterator<SessionConfig.OooO0OO> it = sessionConfig.f3623OooO0o0.iterator();
            while (it.hasNext()) {
                it.next().onError();
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final androidx.camera.core.impl.o0Oo0oo OooO() {
        return this.f1638OooO0oo.OooO();
    }

    @Override // androidx.camera.core.impl.CameraInternal, p028Oooo0oO.o000O0Oo
    public final CameraInfo OooO00o() {
        return OooO();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final o00O00o0<CameraInternal.State> OooO0O0() {
        return this.f1638OooO0oo.OooO0O0();
    }

    @Override // p028Oooo0oO.o000O0Oo
    public final CameraControl OooO0OO() {
        return OooO0o();
    }

    @Override // androidx.camera.core.Oooo0.OooO0o
    @MainThread
    public final void OooO0Oo(@NonNull Oooo0 oooo0) {
        o0Oo0oo.OooO00o();
        if (OooOo00(oooo0)) {
            return;
        }
        this.f1635OooO0o.put(oooo0, Boolean.TRUE);
        DeferrableSurface deferrableSurfaceOooOOo = OooOOo(oooo0);
        if (deferrableSurfaceOooOOo != null) {
            OooOOo0(OooOOoo(oooo0), deferrableSurfaceOooOOo, oooo0.f3497OooOOO0);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public final CameraControlInternal OooO0o() {
        return this.f1639OooOO0;
    }

    @Override // androidx.camera.core.Oooo0.OooO0o
    @MainThread
    public final void OooO0o0(@NonNull OooOOOO oooOOOO) {
        o0Oo0oo.OooO00o();
        if (OooOo00(oooOOOO)) {
            o00O0000 o00o0000OooOOoo = OooOOoo(oooOOOO);
            DeferrableSurface deferrableSurfaceOooOOo = OooOOo(oooOOOO);
            if (deferrableSurfaceOooOOo != null) {
                OooOOo0(o00o0000OooOOoo, deferrableSurfaceOooOOo, oooOOOO.f3497OooOOO0);
                return;
            }
            o0Oo0oo.OooO00o();
            o00o0000OooOOoo.OooO0O0();
            o00o0000OooOOoo.f1603OooOOO0.OooO00o();
            o00O000 o00o001 = o00o0000OooOOoo.f1599OooOO0;
            if (o00o001 != null) {
                o00o001.OooO00o();
                o00o0000OooOOoo.f1599OooOO0 = null;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraConfig OooO0oO() {
        return o00oO0o.f3751OooO00o;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final /* synthetic */ void OooO0oo(boolean z) {
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean OooOO0() {
        return OooO00o().OooO0o0() == 0;
    }

    @Override // androidx.camera.core.Oooo0.OooO0o
    @MainThread
    public final void OooOO0O(@NonNull Oooo0 oooo0) {
        DeferrableSurface deferrableSurfaceOooOOo;
        o0Oo0oo.OooO00o();
        o00O0000 o00o0000OooOOoo = OooOOoo(oooo0);
        o00o0000OooOOoo.OooO0Oo();
        if (OooOo00(oooo0) && (deferrableSurfaceOooOOo = OooOOo(oooo0)) != null) {
            OooOOo0(o00o0000OooOOoo, deferrableSurfaceOooOOo, oooo0.f3497OooOOO0);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final /* synthetic */ void OooOO0o(CameraConfig cameraConfig) {
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void OooOOO(@NonNull ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void OooOOO0(@NonNull ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean OooOOOO() {
        return false;
    }

    @Override // androidx.camera.core.Oooo0.OooO0o
    @MainThread
    public final void OooOOOo(@NonNull Oooo0 oooo0) {
        o0Oo0oo.OooO00o();
        if (OooOo00(oooo0)) {
            this.f1635OooO0o.put(oooo0, Boolean.FALSE);
            o00O0000 o00o0000OooOOoo = OooOOoo(oooo0);
            o0Oo0oo.OooO00o();
            o00o0000OooOOoo.OooO0O0();
            o00o0000OooOOoo.f1603OooOOO0.OooO00o();
            o00O000 o00o001 = o00o0000OooOOoo.f1599OooOO0;
            if (o00o001 != null) {
                o00o001.OooO00o();
                o00o0000OooOOoo.f1599OooOO0 = null;
            }
        }
    }

    @NonNull
    public final o00O0000 OooOOoo(@NonNull Oooo0 oooo0) {
        o00O0000 o00o0001 = (o00O0000) this.f1636OooO0o0.get(oooo0);
        Objects.requireNonNull(o00o0001);
        return o00o0001;
    }

    public final boolean OooOo00(@NonNull Oooo0 oooo0) {
        Boolean bool = (Boolean) this.f1635OooO0o.get(oooo0);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }
}
