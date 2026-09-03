package androidx.camera.lifecycle;

import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Oooo0;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000O000;
import androidx.camera.core.impl.o00OO000;
import androidx.camera.core.impl.o0ooOOo;
import androidx.camera.core.impl.oo000o;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.LifecycleOwner;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p027Oooo0o0.o00O00OO;
import p028Oooo0oO.o000O;
import p028Oooo0oO.o000O0Oo;
import p028Oooo0oO.o0O0ooO;
import p030OoooO.OooOo;
import p030OoooO.o000oOoO;
import p031OoooO0.o0Oo0oo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOO0 f3868OooO0o = new OooOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mLock")
    public o000Oo0.OooO0o f3870OooO0O0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0O0ooO f3873OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3869OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public final o000oOoO.OooO0OO f3871OooO0OO = OooOo.OooO0Oo(null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LifecycleCameraRepository f3872OooO0Oo = new LifecycleCameraRepository();

    @NonNull
    public final o000O0Oo OooO00o(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @Nullable ViewPort viewPort, @NonNull List<CameraEffect> list, @NonNull Oooo0... oooo0Arr) {
        LifecycleCamera lifecycleCameraOooO0O0;
        o0Oo0oo.OooO00o();
        LinkedHashSet linkedHashSet = new LinkedHashSet(cameraSelector.f3395OooO00o);
        for (Oooo0 oooo0 : oooo0Arr) {
            CameraSelector cameraSelectorOooOooO = oooo0.f3488OooO0o.OooOooO();
            if (cameraSelectorOooOooO != null) {
                Iterator<o000O> it = cameraSelectorOooOooO.f3395OooO00o.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
            }
        }
        LinkedHashSet<CameraInternal> linkedHashSetOooO00o = new CameraSelector(linkedHashSet).OooO00o(this.f3873OooO0o0.f1172OooO00o.OooO00o());
        if (linkedHashSetOooO00o.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        CameraUseCaseAdapter.OooO00o oooO00o = new CameraUseCaseAdapter.OooO00o(linkedHashSetOooO00o);
        LifecycleCameraRepository lifecycleCameraRepository = this.f3872OooO0Oo;
        synchronized (lifecycleCameraRepository.f3853OooO00o) {
            lifecycleCameraOooO0O0 = (LifecycleCamera) lifecycleCameraRepository.f3854OooO0O0.get(new OooO00o(lifecycleOwner, oooO00o));
        }
        Collection<LifecycleCamera> collectionOooO0Oo = this.f3872OooO0Oo.OooO0Oo();
        for (Oooo0 oooo1 : oooo0Arr) {
            for (LifecycleCamera lifecycleCamera : collectionOooO0Oo) {
                if (lifecycleCamera.OooOOOo(oooo1) && lifecycleCamera != lifecycleCameraOooO0O0) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", oooo1));
                }
            }
        }
        if (lifecycleCameraOooO0O0 == null) {
            LifecycleCameraRepository lifecycleCameraRepository2 = this.f3872OooO0Oo;
            o00O00OO o00o00ooOooO0Oo = this.f3873OooO0o0.OooO00o().OooO0Oo();
            o0O0ooO o0o0ooo = this.f3873OooO0o0;
            o0ooOOo o0ooooo = o0o0ooo.f1178OooO0oO;
            if (o0ooooo == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            UseCaseConfigFactory useCaseConfigFactory = o0o0ooo.f1179OooO0oo;
            if (useCaseConfigFactory == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            lifecycleCameraOooO0O0 = lifecycleCameraRepository2.OooO0O0(lifecycleOwner, new CameraUseCaseAdapter(linkedHashSetOooO00o, o00o00ooOooO0Oo, o0ooooo, useCaseConfigFactory));
        }
        LifecycleCamera lifecycleCamera2 = lifecycleCameraOooO0O0;
        for (o000O o000o : cameraSelector.f3395OooO00o) {
            if (o000o.OooO00o() != o000O.f1094OooO00o) {
                oo000o oo000oVarOooO00o = o000O000.OooO00o(o000o.OooO00o());
                o00OO000 o00oo001 = lifecycleCamera2.f3850OooO0o.f3825OooOo00;
                oo000oVarOooO00o.getConfig();
            }
        }
        lifecycleCamera2.OooOO0o(null);
        if (oooo0Arr.length == 0) {
            return lifecycleCamera2;
        }
        this.f3872OooO0Oo.OooO00o(lifecycleCamera2, viewPort, list, Arrays.asList(oooo0Arr), this.f3873OooO0o0.OooO00o().OooO0Oo());
        return lifecycleCamera2;
    }

    public final boolean OooO0O0(@NonNull CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        try {
            cameraSelector.OooO0Oo(this.f3873OooO0o0.f1172OooO00o.OooO00o());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void OooO0OO(int i) {
        o0O0ooO o0o0ooo = this.f3873OooO0o0;
        if (o0o0ooo == null) {
            return;
        }
        o00O00OO o00o00ooOooO0Oo = o0o0ooo.OooO00o().OooO0Oo();
        if (i != o00o00ooOooO0Oo.f1089OooO0o0) {
            Iterator it = o00o00ooOooO0Oo.f1085OooO00o.iterator();
            while (it.hasNext()) {
                ((CameraCoordinator.OooO00o) it.next()).OooO00o(o00o00ooOooO0Oo.f1089OooO0o0, i);
            }
        }
        if (o00o00ooOooO0Oo.f1089OooO0o0 == 2 && i != 2) {
            o00o00ooOooO0Oo.f1087OooO0OO.clear();
        }
        o00o00ooOooO0Oo.f1089OooO0o0 = i;
    }

    @MainThread
    public final void OooO0Oo() {
        o0Oo0oo.OooO00o();
        OooO0OO(0);
        LifecycleCameraRepository lifecycleCameraRepository = this.f3872OooO0Oo;
        synchronized (lifecycleCameraRepository.f3853OooO00o) {
            Iterator it = lifecycleCameraRepository.f3854OooO0O0.keySet().iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f3854OooO0O0.get((LifecycleCameraRepository.OooO00o) it.next());
                lifecycleCamera.OooOOo();
                lifecycleCameraRepository.OooO0oo(lifecycleCamera.OooO0o0());
            }
        }
    }
}
