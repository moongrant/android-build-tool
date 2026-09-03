package androidx.camera.lifecycle;

import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Oooo0;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.o00O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00oO0o;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p028Oooo0oO.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class LifecycleCamera implements LifecycleObserver, o000O0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CameraUseCaseAdapter f3850OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final LifecycleOwner f3851OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f3849OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f3852OooO0oO = false;

    public LifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f3851OooO0o0 = lifecycleOwner;
        this.f3850OooO0o = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.OooO0o0();
        } else {
            cameraUseCaseAdapter.OooOo00();
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // p028Oooo0oO.o000O0Oo
    @NonNull
    public final CameraInfo OooO00o() {
        return this.f3850OooO0o.f3825OooOo00;
    }

    @Override // p028Oooo0oO.o000O0Oo
    @NonNull
    public final CameraControl OooO0OO() {
        return this.f3850OooO0o.f3824OooOOoo;
    }

    public final void OooO0Oo(List list) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.f3849OooO0Oo) {
            this.f3850OooO0o.OooO0Oo(list);
        }
    }

    public final LifecycleOwner OooO0o0() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f3849OooO0Oo) {
            lifecycleOwner = this.f3851OooO0o0;
        }
        return lifecycleOwner;
    }

    @NonNull
    public final List<Oooo0> OooOO0O() {
        List<Oooo0> listUnmodifiableList;
        synchronized (this.f3849OooO0Oo) {
            listUnmodifiableList = Collections.unmodifiableList(this.f3850OooO0o.OooOo0o());
        }
        return listUnmodifiableList;
    }

    public final void OooOO0o(@Nullable CameraConfig cameraConfig) {
        CameraUseCaseAdapter cameraUseCaseAdapter = this.f3850OooO0o;
        synchronized (cameraUseCaseAdapter.f3818OooOOO) {
            if (cameraConfig == null) {
                cameraConfig = o00oO0o.f3751OooO00o;
            }
            if (!cameraUseCaseAdapter.f3814OooO0oo.isEmpty() && !((o00oO0o.OooO00o) cameraUseCaseAdapter.f3819OooOOO0).f3752OooOooo.equals(((o00oO0o.OooO00o) cameraConfig).f3752OooOooo)) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            cameraUseCaseAdapter.f3819OooOOO0 = cameraConfig;
            o00O o00o2 = (o00O) ((o00O0) ((o00oO0o.OooO00o) cameraConfig).getConfig()).OooOoO(CameraConfig.f3526OooO0oo, null);
            if (o00o2 != null) {
                Set<Integer> setOooO0o0 = o00o2.OooO0o0();
                RestrictedCameraControl restrictedCameraControl = cameraUseCaseAdapter.f3824OooOOoo;
                restrictedCameraControl.f3616OooO0Oo = true;
                restrictedCameraControl.f3617OooO0o0 = setOooO0o0;
            } else {
                RestrictedCameraControl restrictedCameraControl2 = cameraUseCaseAdapter.f3824OooOOoo;
                restrictedCameraControl2.f3616OooO0Oo = false;
                restrictedCameraControl2.f3617OooO0o0 = null;
            }
            cameraUseCaseAdapter.f3810OooO0Oo.OooOO0o(cameraUseCaseAdapter.f3819OooOOO0);
        }
    }

    public final boolean OooOOOo(@NonNull Oooo0 oooo0) {
        boolean zContains;
        synchronized (this.f3849OooO0Oo) {
            zContains = ((ArrayList) this.f3850OooO0o.OooOo0o()).contains(oooo0);
        }
        return zContains;
    }

    public final void OooOOo() {
        synchronized (this.f3849OooO0Oo) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f3850OooO0o;
            cameraUseCaseAdapter.OooOoOO((ArrayList) cameraUseCaseAdapter.OooOo0o());
        }
    }

    public final void OooOOo0() {
        synchronized (this.f3849OooO0Oo) {
            if (this.f3852OooO0oO) {
                return;
            }
            onStop(this.f3851OooO0o0);
            this.f3852OooO0oO = true;
        }
    }

    public final void OooOOoo() {
        synchronized (this.f3849OooO0Oo) {
            if (this.f3852OooO0oO) {
                this.f3852OooO0oO = false;
                if (this.f3851OooO0o0.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                    onStart(this.f3851OooO0o0);
                }
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849OooO0Oo) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f3850OooO0o;
            cameraUseCaseAdapter.OooOoOO((ArrayList) cameraUseCaseAdapter.OooOo0o());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3850OooO0o.f3810OooO0Oo.OooO0oo(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3850OooO0o.f3810OooO0Oo.OooO0oo(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849OooO0Oo) {
            if (!this.f3852OooO0oO) {
                this.f3850OooO0o.OooO0o0();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3849OooO0Oo) {
            if (!this.f3852OooO0oO) {
                this.f3850OooO0o.OooOo00();
            }
        }
    }
}
